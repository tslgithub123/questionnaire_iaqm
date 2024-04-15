package com.survey.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.survey.entity.CinemaHallObservation;
import com.survey.repo.CinemaHallObservationRepository;

import java.util.Optional;

@Service
public class CinemaHallObservationService {

    @Autowired
    private CinemaHallObservationRepository observationRepository;

    public CinemaHallObservation saveObservation(CinemaHallObservation observation) {
        return observationRepository.save(observation);
    }

    public CinemaHallObservation getObservationById(Long id) {
        Optional<CinemaHallObservation> optionalObservation = observationRepository.findById(id);
        return optionalObservation.orElse(null);
    }

    // Add other service methods as needed for updating, deleting, or fetching observations
}