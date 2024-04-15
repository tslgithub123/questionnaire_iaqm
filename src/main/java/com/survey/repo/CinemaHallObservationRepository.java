package com.survey.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.survey.entity.CinemaHallObservation;

@Repository
public interface CinemaHallObservationRepository extends JpaRepository<CinemaHallObservation, Long> {
	
}