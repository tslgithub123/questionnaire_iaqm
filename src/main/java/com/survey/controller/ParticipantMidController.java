package com.survey.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.survey.entity.ParticipantMid;
import com.survey.services.ParticipantMidService;

import java.util.List;

@RestController
@RequestMapping("/mid/participants")
@CrossOrigin
public class ParticipantMidController {

    @Autowired
    private ParticipantMidService participantService;

    // Endpoint to retrieve all participants
    @GetMapping
    public ResponseEntity<List<ParticipantMid>> getAllParticipants() {
        List<ParticipantMid> participants = participantService.getAllParticipants();
        return new ResponseEntity<>(participants, HttpStatus.OK);
    }

    // Endpoint to retrieve a specific participant by ID
//    @GetMapping("/{id}")
//    public ResponseEntity<Participant> getParticipantById(@PathVariable("id") Long id) {
//        Participant participant = participantService.getParticipantById(id);
//        if (participant != null) {
//            return new ResponseEntity<>(participant, HttpStatus.OK);
//        } else {
//            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
//        }
//    }

    // Endpoint to create a new participant
    @PostMapping("/add")
    public ResponseEntity<ParticipantMid> createParticipant(@RequestBody ParticipantMid participant) {
        ParticipantMid createdParticipant = participantService.createParticipant(participant);
        return new ResponseEntity<>(createdParticipant, HttpStatus.CREATED);
    }

    // Endpoint to update an existing participant
    @PutMapping("/{id}")
    public ResponseEntity<ParticipantMid> updateParticipant(@PathVariable("id") Long id, @RequestBody ParticipantMid participant) {
        ParticipantMid updatedParticipant = participantService.updateParticipant(id, participant);
        if (updatedParticipant != null) {
            return new ResponseEntity<>(updatedParticipant, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    // Endpoint to delete a participant
//    @DeleteMapping("/{id}")
//    public ResponseEntity<Void> deleteParticipant(@PathVariable("id") int id) {
//        boolean deleted = participantService.deleteParticipant(id);
//        if (deleted) {
//            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
//        } else {
//            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
//        }
//    }
}

