package com.survey.restaurants;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.survey.entity.RestaurantObservation;

@Repository
public interface RestaurantObservationRepository extends JpaRepository<RestaurantObservation, Long> {
}

