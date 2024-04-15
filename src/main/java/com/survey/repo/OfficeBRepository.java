package com.survey.repo;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.survey.entity.OfficeB;


@Repository
public interface OfficeBRepository extends JpaRepository<OfficeB, Long> {
    // You can add custom query methods here if needed
}