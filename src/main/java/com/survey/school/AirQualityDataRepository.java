package com.survey.school;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.survey.entity.AirQualityData;

public interface AirQualityDataRepository extends JpaRepository<AirQualityData, Long>  {

	List<AirQualityData> findAll();

	AirQualityData save(AirQualityData airQualityData);

}
