package com.survey.services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.survey.entity.RestaurantObservation;
import com.survey.restaurants.RestaurantObservationRepository;

import java.util.List;
import java.util.Optional;

@Service
public class RestaurantObservationService {

    private final RestaurantObservationRepository restaurantObservationRepository;

    @Autowired
    public RestaurantObservationService(RestaurantObservationRepository restaurantObservationRepository) {
        this.restaurantObservationRepository = restaurantObservationRepository;
    }

    public List<RestaurantObservation> getAllObservations() {
        return restaurantObservationRepository.findAll();
    }

    public Optional<RestaurantObservation> getObservationById(Long id) {
        return restaurantObservationRepository.findById(id);
    }

    public RestaurantObservation saveObservation(RestaurantObservation observation) {
        return restaurantObservationRepository.save(observation);
    }

    public void deleteObservation(Long id) {
        restaurantObservationRepository.deleteById(id);
    }
}
