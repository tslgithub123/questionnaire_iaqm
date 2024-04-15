package com.survey.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.survey.entity.ParticipantSmall;
import com.survey.repo.ParticipantSmallRepository;

import java.util.List;
import java.util.Optional;

@Service
public class ParticipantSmallService {

    private final ParticipantSmallRepository participantRepository;

    @Autowired
    public ParticipantSmallService(ParticipantSmallRepository participantRepository) {
        this.participantRepository = participantRepository;
    }

    public List<ParticipantSmall> getAllParticipants() {
        return participantRepository.findAll();
    }

    public Optional<ParticipantSmall> getParticipantById(Long id) {
        return participantRepository.findById(id);
    }

    public ParticipantSmall createParticipant(ParticipantSmall participant) {
        return participantRepository.save(participant);
    }

    public ParticipantSmall updateParticipant(Long id, ParticipantSmall participant) {
        if (participantRepository.existsById(id)) {
            participant.setHealthId(id);
            return participantRepository.save(participant);
        } else {
            throw new RuntimeException("Participant not found with id: " + id);
        }
    }

    public void deleteParticipant(Long id) {
        if (participantRepository.existsById(id)) {
            participantRepository.deleteById(id);
        } else {
            throw new RuntimeException("Participant not found with id: " + id);
        }
    }
}
