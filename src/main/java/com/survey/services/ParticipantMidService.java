package com.survey.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.survey.entity.ParticipantMid;
import com.survey.repo.ParticipantMidRepository;

import java.util.List;
import java.util.Optional;

@Service
public class ParticipantMidService {

    private final ParticipantMidRepository participantRepository;

    @Autowired
    public ParticipantMidService(ParticipantMidRepository participantRepository) {
        this.participantRepository = participantRepository;
    }

    public List<ParticipantMid> getAllParticipants() {
        return participantRepository.findAll();
    }

    public Optional<ParticipantMid> getParticipantById(Long id) {
        return participantRepository.findById(id);
    }

    public ParticipantMid createParticipant(ParticipantMid participant) {
        return participantRepository.save(participant);
    }

    public ParticipantMid updateParticipant(Long id, ParticipantMid participant) {
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
