package com.survey.entity;

import java.sql.Date;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "cinema_hall_observation")
public class CinemaHallObservation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(name = "participant_id", nullable = false)
    private String participantId;

    @Column(name = "location_id", nullable = false)
    private String locationId;

    @Column(name = "observer_name", nullable = false)
    private String observerName;

    @Column(name = "observation_date", nullable = false)
    private Date observationDate;

    @Column(name = "cinema_hall_type", nullable = false)
    private String cinemaHallType;

    @Column(name = "cinema_hall_address", nullable = false)
    private String cinemaHallAddress;

    @Column(name = "building_age", nullable = false)
    private String buildingAge;

    @Column(name = "floor_level")
    private String floorLevel;

    @Column(name = "other_floor_level", columnDefinition = "TEXT")
    private String otherFloorLevel;

    @Column(name = "total_area_of_hall", nullable = false)
    private String totalArea;

    @Column(name = "seating_capacity", nullable = false)
    private String seatingCapacity;

    @Column(name = "seating_type")
    private String seatingType;

    @Column(name = "other_seating_type", columnDefinition = "TEXT")
    private String otherSeatingType;

    @Column(name = "floor_type")
    private String floorType; //////////////////////////////////
    
    @Column(name = "other_floor_type")
    private String otherFloorType; //////////////////////////////////

    @Column(name = "occupants_density", nullable = false)
    private String occupantsDensity;

    @Column(name = "cooking_facilities", nullable = false)
    private String cookingFacilities;

    @Column(name = "smoking_areas", nullable = false)
    private String smokingAreas;

    @Column(name = "furnishings_decor")
    private String furnishingsDecor;

    @Column(name = "other_furnishings_decor", columnDefinition = "TEXT")
    private String otherFurnishingsDecor;

    @Column(name = "housekeeping_frequency", nullable = false)
    private String housekeepingFrequency;

    @Column(name = "chemical_based_cleaning_materials")
    private String cleaningMaterials;

    @Column(name = "other_cleaning_materials", columnDefinition = "TEXT")
    private String otherCleaningMaterials;

    @Column(name = "scents_used")
    private String scentsUsed;

    @Column(name = "other_scents_used", columnDefinition = "TEXT")
    private String otherScentsUsed;

    @Column(name = "scent_spraying_frequency")
    private String scentSprayingFrequency;

    @Column(name = "other_scent_spraying_frequency", columnDefinition = "TEXT")
    private String otherScentSprayingFrequency;

    @Column(name = "hvac_maintenance_frequency", nullable = false)
    private String hvacMaintenanceFrequency;

    @Column(name = "num_of_vents", nullable = false)
    private String numOfVents;

    @Column(name = "exhaust_fan_inlet_velocity")
    private String exhaustFanInletVelocity;

    @Column(name = "exhaust_fan_outlet_velocity")
    private String exhaustFanOutletVelocity;

    @Column(name = "pest_control_frequency")
    private String pestControlFrequency;

    @Column(name = "other_pest_control_frequency", columnDefinition = "TEXT")
    private String otherPestControlFrequency;

    @Column(name = "air_filter_replacement_frequency")
    private String airFilterReplacementFrequency;

    @Column(name = "other_air_filter_replacement_frequency", columnDefinition = "TEXT")
    private String otherAirFilterReplacementFrequency;

    @Column(name = "air_purifiers", nullable = false)
    private String airPurifiers;

   
    @Column(name = "remarks", columnDefinition = "TEXT")
    private String remarks;


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getParticipantId() {
		return participantId;
	}


	public void setParticipantId(String participantId) {
		this.participantId = participantId;
	}


	public String getLocationId() {
		return locationId;
	}


	public void setLocationId(String locationId) {
		this.locationId = locationId;
	}


	public String getObserverName() {
		return observerName;
	}


	public void setObserverName(String observerName) {
		this.observerName = observerName;
	}


	public Date getObservationDate() {
		return observationDate;
	}


	public void setObservationDate(Date observationDate) {
		this.observationDate = observationDate;
	}


	public String getCinemaHallType() {
		return cinemaHallType;
	}


	public void setCinemaHallType(String cinemaHallType) {
		this.cinemaHallType = cinemaHallType;
	}


	public String getCinemaHallAddress() {
		return cinemaHallAddress;
	}


	public void setCinemaHallAddress(String cinemaHallAddress) {
		this.cinemaHallAddress = cinemaHallAddress;
	}


	public String getBuildingAge() {
		return buildingAge;
	}


	public void setBuildingAge(String buildingAge) {
		this.buildingAge = buildingAge;
	}


	public String getFloorLevel() {
		return floorLevel;
	}


	public void setFloorLevel(String floorLevel) {
		this.floorLevel = floorLevel;
	}


	public String getOtherFloorLevel() {
		return otherFloorLevel;
	}


	public void setOtherFloorLevel(String otherFloorLevel) {
		this.otherFloorLevel = otherFloorLevel;
	}


	public String getTotalArea() {
		return totalArea;
	}


	public void setTotalArea(String totalArea) {
		this.totalArea = totalArea;
	}


	public String getSeatingCapacity() {
		return seatingCapacity;
	}


	public void setSeatingCapacity(String seatingCapacity) {
		this.seatingCapacity = seatingCapacity;
	}


	public String getSeatingType() {
		return seatingType;
	}


	public void setSeatingType(String seatingType) {
		this.seatingType = seatingType;
	}


	public String getOtherSeatingType() {
		return otherSeatingType;
	}


	public void setOtherSeatingType(String otherSeatingType) {
		this.otherSeatingType = otherSeatingType;
	}


	public String getFloorType() {
		return floorType;
	}


	public void setFloorType(String floorType) {
		this.floorType = floorType;
	}


	public String getOtherFloorType() {
		return otherFloorType;
	}


	public void setOtherFloorType(String otherFloorType) {
		this.otherFloorType = otherFloorType;
	}


	public String getOccupantsDensity() {
		return occupantsDensity;
	}


	public void setOccupantsDensity(String occupantsDensity) {
		this.occupantsDensity = occupantsDensity;
	}


	public String getCookingFacilities() {
		return cookingFacilities;
	}


	public void setCookingFacilities(String cookingFacilities) {
		this.cookingFacilities = cookingFacilities;
	}


	public String getSmokingAreas() {
		return smokingAreas;
	}


	public void setSmokingAreas(String smokingAreas) {
		this.smokingAreas = smokingAreas;
	}


	public String getFurnishingsDecor() {
		return furnishingsDecor;
	}


	public void setFurnishingsDecor(String furnishingsDecor) {
		this.furnishingsDecor = furnishingsDecor;
	}


	public String getOtherFurnishingsDecor() {
		return otherFurnishingsDecor;
	}


	public void setOtherFurnishingsDecor(String otherFurnishingsDecor) {
		this.otherFurnishingsDecor = otherFurnishingsDecor;
	}


	public String getHousekeepingFrequency() {
		return housekeepingFrequency;
	}


	public void setHousekeepingFrequency(String housekeepingFrequency) {
		this.housekeepingFrequency = housekeepingFrequency;
	}


	public String getCleaningMaterials() {
		return cleaningMaterials;
	}


	public void setCleaningMaterials(String cleaningMaterials) {
		this.cleaningMaterials = cleaningMaterials;
	}


	public String getOtherCleaningMaterials() {
		return otherCleaningMaterials;
	}


	public void setOtherCleaningMaterials(String otherCleaningMaterials) {
		this.otherCleaningMaterials = otherCleaningMaterials;
	}


	public String getScentsUsed() {
		return scentsUsed;
	}


	public void setScentsUsed(String scentsUsed) {
		this.scentsUsed = scentsUsed;
	}


	public String getOtherScentsUsed() {
		return otherScentsUsed;
	}


	public void setOtherScentsUsed(String otherScentsUsed) {
		this.otherScentsUsed = otherScentsUsed;
	}


	public String getScentSprayingFrequency() {
		return scentSprayingFrequency;
	}


	public void setScentSprayingFrequency(String scentSprayingFrequency) {
		this.scentSprayingFrequency = scentSprayingFrequency;
	}


	public String getOtherScentSprayingFrequency() {
		return otherScentSprayingFrequency;
	}


	public void setOtherScentSprayingFrequency(String otherScentSprayingFrequency) {
		this.otherScentSprayingFrequency = otherScentSprayingFrequency;
	}


	public String getHvacMaintenanceFrequency() {
		return hvacMaintenanceFrequency;
	}


	public void setHvacMaintenanceFrequency(String hvacMaintenanceFrequency) {
		this.hvacMaintenanceFrequency = hvacMaintenanceFrequency;
	}


	public String getNumOfVents() {
		return numOfVents;
	}


	public void setNumOfVents(String numOfVents) {
		this.numOfVents = numOfVents;
	}


	public String getExhaustFanInletVelocity() {
		return exhaustFanInletVelocity;
	}


	public void setExhaustFanInletVelocity(String exhaustFanInletVelocity) {
		this.exhaustFanInletVelocity = exhaustFanInletVelocity;
	}


	public String getExhaustFanOutletVelocity() {
		return exhaustFanOutletVelocity;
	}


	public void setExhaustFanOutletVelocity(String exhaustFanOutletVelocity) {
		this.exhaustFanOutletVelocity = exhaustFanOutletVelocity;
	}


	public String getPestControlFrequency() {
		return pestControlFrequency;
	}


	public void setPestControlFrequency(String pestControlFrequency) {
		this.pestControlFrequency = pestControlFrequency;
	}


	public String getOtherPestControlFrequency() {
		return otherPestControlFrequency;
	}


	public void setOtherPestControlFrequency(String otherPestControlFrequency) {
		this.otherPestControlFrequency = otherPestControlFrequency;
	}


	public String getAirFilterReplacementFrequency() {
		return airFilterReplacementFrequency;
	}


	public void setAirFilterReplacementFrequency(String airFilterReplacementFrequency) {
		this.airFilterReplacementFrequency = airFilterReplacementFrequency;
	}


	public String getOtherAirFilterReplacementFrequency() {
		return otherAirFilterReplacementFrequency;
	}


	public void setOtherAirFilterReplacementFrequency(String otherAirFilterReplacementFrequency) {
		this.otherAirFilterReplacementFrequency = otherAirFilterReplacementFrequency;
	}


	public String getAirPurifiers() {
		return airPurifiers;
	}


	public void setAirPurifiers(String airPurifiers) {
		this.airPurifiers = airPurifiers;
	}


	public String getRemarks() {
		return remarks;
	}


	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}


	public CinemaHallObservation(Long id, String participantId, String locationId, String observerName,
			Date observationDate, String cinemaHallType, String cinemaHallAddress, String buildingAge,
			String floorLevel, String otherFloorLevel, String totalArea, String seatingCapacity, String seatingType,
			String otherSeatingType, String floorType, String otherFloorType, String occupantsDensity,
			String cookingFacilities, String smokingAreas, String furnishingsDecor, String otherFurnishingsDecor,
			String housekeepingFrequency, String cleaningMaterials, String otherCleaningMaterials, String scentsUsed,
			String otherScentsUsed, String scentSprayingFrequency, String otherScentSprayingFrequency,
			String hvacMaintenanceFrequency, String numOfVents, String exhaustFanInletVelocity,
			String exhaustFanOutletVelocity, String pestControlFrequency, String otherPestControlFrequency,
			String airFilterReplacementFrequency, String otherAirFilterReplacementFrequency, String airPurifiers,
			String remarks) {
		super();
		this.id = id;
		this.participantId = participantId;
		this.locationId = locationId;
		this.observerName = observerName;
		this.observationDate = observationDate;
		this.cinemaHallType = cinemaHallType;
		this.cinemaHallAddress = cinemaHallAddress;
		this.buildingAge = buildingAge;
		this.floorLevel = floorLevel;
		this.otherFloorLevel = otherFloorLevel;
		this.totalArea = totalArea;
		this.seatingCapacity = seatingCapacity;
		this.seatingType = seatingType;
		this.otherSeatingType = otherSeatingType;
		this.floorType = floorType;
		this.otherFloorType = otherFloorType;
		this.occupantsDensity = occupantsDensity;
		this.cookingFacilities = cookingFacilities;
		this.smokingAreas = smokingAreas;
		this.furnishingsDecor = furnishingsDecor;
		this.otherFurnishingsDecor = otherFurnishingsDecor;
		this.housekeepingFrequency = housekeepingFrequency;
		this.cleaningMaterials = cleaningMaterials;
		this.otherCleaningMaterials = otherCleaningMaterials;
		this.scentsUsed = scentsUsed;
		this.otherScentsUsed = otherScentsUsed;
		this.scentSprayingFrequency = scentSprayingFrequency;
		this.otherScentSprayingFrequency = otherScentSprayingFrequency;
		this.hvacMaintenanceFrequency = hvacMaintenanceFrequency;
		this.numOfVents = numOfVents;
		this.exhaustFanInletVelocity = exhaustFanInletVelocity;
		this.exhaustFanOutletVelocity = exhaustFanOutletVelocity;
		this.pestControlFrequency = pestControlFrequency;
		this.otherPestControlFrequency = otherPestControlFrequency;
		this.airFilterReplacementFrequency = airFilterReplacementFrequency;
		this.otherAirFilterReplacementFrequency = otherAirFilterReplacementFrequency;
		this.airPurifiers = airPurifiers;
		this.remarks = remarks;
	}


	public CinemaHallObservation() {
		super();
		// TODO Auto-generated constructor stub
	}


	@Override
	public String toString() {
		return "CinemaHallObservation [id=" + id + ", participantId=" + participantId + ", locationId=" + locationId
				+ ", observerName=" + observerName + ", observationDate=" + observationDate + ", cinemaHallType="
				+ cinemaHallType + ", cinemaHallAddress=" + cinemaHallAddress + ", buildingAge=" + buildingAge
				+ ", floorLevel=" + floorLevel + ", otherFloorLevel=" + otherFloorLevel + ", totalArea=" + totalArea
				+ ", seatingCapacity=" + seatingCapacity + ", seatingType=" + seatingType + ", otherSeatingType="
				+ otherSeatingType + ", floorType=" + floorType + ", otherFloorType=" + otherFloorType
				+ ", occupantsDensity=" + occupantsDensity + ", cookingFacilities=" + cookingFacilities
				+ ", smokingAreas=" + smokingAreas + ", furnishingsDecor=" + furnishingsDecor
				+ ", otherFurnishingsDecor=" + otherFurnishingsDecor + ", housekeepingFrequency="
				+ housekeepingFrequency + ", cleaningMaterials=" + cleaningMaterials + ", otherCleaningMaterials="
				+ otherCleaningMaterials + ", scentsUsed=" + scentsUsed + ", otherScentsUsed=" + otherScentsUsed
				+ ", scentSprayingFrequency=" + scentSprayingFrequency + ", otherScentSprayingFrequency="
				+ otherScentSprayingFrequency + ", hvacMaintenanceFrequency=" + hvacMaintenanceFrequency
				+ ", numOfVents=" + numOfVents + ", exhaustFanInletVelocity=" + exhaustFanInletVelocity
				+ ", exhaustFanOutletVelocity=" + exhaustFanOutletVelocity + ", pestControlFrequency="
				+ pestControlFrequency + ", otherPestControlFrequency=" + otherPestControlFrequency
				+ ", airFilterReplacementFrequency=" + airFilterReplacementFrequency
				+ ", otherAirFilterReplacementFrequency=" + otherAirFilterReplacementFrequency + ", airPurifiers="
				+ airPurifiers + ", remarks=" + remarks + ", getId()=" + getId() + ", getParticipantId()="
				+ getParticipantId() + ", getLocationId()=" + getLocationId() + ", getObserverName()="
				+ getObserverName() + ", getObservationDate()=" + getObservationDate() + ", getCinemaHallType()="
				+ getCinemaHallType() + ", getCinemaHallAddress()=" + getCinemaHallAddress() + ", getBuildingAge()="
				+ getBuildingAge() + ", getFloorLevel()=" + getFloorLevel() + ", getOtherFloorLevel()="
				+ getOtherFloorLevel() + ", getTotalArea()=" + getTotalArea() + ", getSeatingCapacity()="
				+ getSeatingCapacity() + ", getSeatingType()=" + getSeatingType() + ", getOtherSeatingType()="
				+ getOtherSeatingType() + ", getFloorType()=" + getFloorType() + ", getOtherFloorType()="
				+ getOtherFloorType() + ", getOccupantsDensity()=" + getOccupantsDensity() + ", getCookingFacilities()="
				+ getCookingFacilities() + ", getSmokingAreas()=" + getSmokingAreas() + ", getFurnishingsDecor()="
				+ getFurnishingsDecor() + ", getOtherFurnishingsDecor()=" + getOtherFurnishingsDecor()
				+ ", getHousekeepingFrequency()=" + getHousekeepingFrequency() + ", getCleaningMaterials()="
				+ getCleaningMaterials() + ", getOtherCleaningMaterials()=" + getOtherCleaningMaterials()
				+ ", getScentsUsed()=" + getScentsUsed() + ", getOtherScentsUsed()=" + getOtherScentsUsed()
				+ ", getScentSprayingFrequency()=" + getScentSprayingFrequency() + ", getOtherScentSprayingFrequency()="
				+ getOtherScentSprayingFrequency() + ", getHvacMaintenanceFrequency()=" + getHvacMaintenanceFrequency()
				+ ", getNumOfVents()=" + getNumOfVents() + ", getExhaustFanInletVelocity()="
				+ getExhaustFanInletVelocity() + ", getExhaustFanOutletVelocity()=" + getExhaustFanOutletVelocity()
				+ ", getPestControlFrequency()=" + getPestControlFrequency() + ", getOtherPestControlFrequency()="
				+ getOtherPestControlFrequency() + ", getAirFilterReplacementFrequency()="
				+ getAirFilterReplacementFrequency() + ", getOtherAirFilterReplacementFrequency()="
				+ getOtherAirFilterReplacementFrequency() + ", getAirPurifiers()=" + getAirPurifiers()
				+ ", getRemarks()=" + getRemarks() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}

	
}
