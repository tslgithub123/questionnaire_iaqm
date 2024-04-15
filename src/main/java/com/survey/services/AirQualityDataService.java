package com.survey.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.survey.entity.AirQualityData;
import com.survey.school.AirQualityDataRepository;

import java.util.List;

@Service
public class AirQualityDataService {

    private final AirQualityDataRepository airQualityDataRepository;

    @Autowired
    public AirQualityDataService(AirQualityDataRepository airQualityDataRepository) {
        this.airQualityDataRepository = airQualityDataRepository;
    }

    public List<AirQualityData> getAllAirQualityData() {
        return airQualityDataRepository.findAll();
    }

    public AirQualityData addAirQualityData(AirQualityData airQualityData) {
        return airQualityDataRepository.save(airQualityData);
    }

    // Other CRUD methods can be added here as required
}

