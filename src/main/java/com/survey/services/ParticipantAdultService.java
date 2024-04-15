package com.survey.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.survey.entity.ParticipantAdult;
import com.survey.repo.ParticipantAdultRepository;

import java.util.List;
import java.util.Optional;

@Service
public class ParticipantAdultService {

    private final ParticipantAdultRepository participantRepository;

    @Autowired
    public ParticipantAdultService(ParticipantAdultRepository participantRepository) {
        this.participantRepository = participantRepository;
    }

    public List<ParticipantAdult> getAllParticipants() {
        return participantRepository.findAll();
    }

    public Optional<ParticipantAdult> getParticipantById(Long id) {
        return participantRepository.findById(id);
    }

    public ParticipantAdult createParticipant(ParticipantAdult participant) {
        return participantRepository.save(participant);
    }

    public ParticipantAdult updateParticipant(Long id, ParticipantAdult participant) {
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
