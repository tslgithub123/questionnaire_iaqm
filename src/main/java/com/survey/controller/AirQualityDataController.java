
package com.survey.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.survey.entity.AirQualityData;
import com.survey.services.AirQualityDataService;

import java.util.List;

@RestController
@RequestMapping("/school/air-quality-data")
@CrossOrigin
public class AirQualityDataController {

    private final AirQualityDataService airQualityDataService;

    @Autowired
    public AirQualityDataController(AirQualityDataService airQualityDataService) {
        this.airQualityDataService = airQualityDataService;
    }

    @GetMapping
    public List<AirQualityData> getAllAirQualityData() {
        return airQualityDataService.getAllAirQualityData();
    }

    @PostMapping("/add")
    public AirQualityData addAirQualityData(@RequestBody AirQualityData airQualityData) {
        return airQualityDataService.addAirQualityData(airQualityData);
    }

    // Other CRUD endpoints can be added here as required
}

