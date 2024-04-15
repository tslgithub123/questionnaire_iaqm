package com.survey.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.survey.entity.CinemaHallObservation;
import com.survey.services.CinemaHallObservationService;

@RestController
@RequestMapping("/api/cinema-hall-observations")
@CrossOrigin
public class CinemaHallObservationController {

    @Autowired
    private CinemaHallObservationService observationService;

    @PostMapping("/add")
    public CinemaHallObservation createObservation(@RequestBody CinemaHallObservation observation) {
        return observationService.saveObservation(observation);
    }

    @GetMapping("/{id}")
    public CinemaHallObservation getObservationById(@PathVariable Long id) {
        return observationService.getObservationById(id);
    }

    // Add other controller methods as needed for updating, deleting, or fetching observations
}
