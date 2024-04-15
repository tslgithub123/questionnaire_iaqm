package com.survey.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.survey.entity.RestaurantObservation;
import com.survey.services.RestaurantObservationService;

import java.util.List;

@RestController
@RequestMapping("/restaurant/observations")
@CrossOrigin
public class RestaurantObservationController {

    private final RestaurantObservationService restaurantObservationService;

    @Autowired
    public RestaurantObservationController(RestaurantObservationService restaurantObservationService) {
        this.restaurantObservationService = restaurantObservationService;
    }

    @GetMapping
    public ResponseEntity<List<RestaurantObservation>> getAllObservations() {
        List<RestaurantObservation> observations = restaurantObservationService.getAllObservations();
        return new ResponseEntity<>(observations, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<RestaurantObservation> getObservationById(@PathVariable("id") Long id) {
        return restaurantObservationService.getObservationById(id)
                .map(observation -> new ResponseEntity<>(observation, HttpStatus.OK))
                .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PostMapping("/add")
    public ResponseEntity<RestaurantObservation> createObservation(@RequestBody RestaurantObservation observation) {
        RestaurantObservation savedObservation = restaurantObservationService.saveObservation(observation);
        return new ResponseEntity<>(savedObservation, HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteObservation(@PathVariable("id") Long id) {
        restaurantObservationService.deleteObservation(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}

