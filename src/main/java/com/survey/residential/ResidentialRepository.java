package com.survey.residential;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.survey.entity.Residential;

@Repository
public interface ResidentialRepository extends JpaRepository<Residential, Long> {
    // Add custom query methods if needed
}

