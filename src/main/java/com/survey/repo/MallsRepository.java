package com.survey.repo;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.survey.entity.Malls;

@Repository
public interface MallsRepository extends JpaRepository<Malls, Long> {
    // You can define custom query methods here if needed
}

