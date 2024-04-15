package com.survey.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.survey.entity.Residential;
import com.survey.residential.ResidentialRepository;

@Service
public class ResidentialService {

    @Autowired
    private ResidentialRepository residentialRepository;

    public Residential createResidential(Residential residential) {
        return residentialRepository.save(residential);
    }

    // Add other business logic methods as needed
}

