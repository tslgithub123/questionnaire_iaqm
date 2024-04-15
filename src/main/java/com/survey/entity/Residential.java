package com.survey.entity;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "residential_data")
public class Residential {
	

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "observation_id")
    private Long observationId;
    
    @Column(name = "participant_id")
    private String participantId;
    
    @Column(name = "Location_id")
    private String locationId;

    @Column(name = "observer_name")
    private String observerName;

    @Column(name = "observation_date")
    private Date observationDate;

    @Column(name = "residential_address")
    private String residentialAddress;

    @Column(name = "building_age")
    private String buildingAge;

    @Column(name = "new_renovation")
    private String newRenovation;

    @Column(name = "total_area")
    private String totalArea;

    @Column(name = "total_occupants")
    private String totalOccupants;

    @Column(name = "number_of_rooms")
    private String numberOfRooms;

    @Column(name = "cooking_activity")
    private String cookingActivity;

    @Column(name = "cooking_fuel")
    private String cookingFuel;

    @Column(name = "cooking_times")
    private String cookingTimes;
    
    @Column(name = "other_cooking_times")
    private String otherCookingTimes;

    @Column(name = "kitchen_ventilation")
    private String kitchenVentilation;
    
    @Column(name = "other_kitchen_ventilation")
    private String otherKitchenVentilation;

    @Column(name = "whole_residential_indoor_ventilation")
    private String indoorVentilation;

    @Column(name = "natural_ventilation_details")
    private String naturalVentilationDetails;

    @Column(name = "ducts_maintenance")
    private String ductsMaintenance;

    @Column(name = "number_of_vents")
    private String numberOfVents;

    @Column(name = "inlet_air_velocity")
    private Float inletAirVelocity;

    @Column(name = "outlet_air_velocity")
    private Float outletAirVelocity;

    @Column(name = "cleaning_method")
    private String cleaningMethod;

    @Column(name = "manual_cleaning_frequency")
    private String manualCleaningFrequency;

    @Column(name = "equipment_cleaning_frequency")
    private String equipmentCleaningFrequency;
    
    @Column(name = "other_equipment_cleaning_frequency")
    private String otherEquipmentCleaningFrequency;

    @Column(name = "chemical_based_cleaning")   //yes or no
    private String chemicalBasedCleaning;

    @Column(name = "chemicals_used")
    private String chemicalsUsed;

    @Column(name = "residential_sampling_room_area")
    private String residentialSamplingRoomArea;

    @Column(name = "residential_sampling_room_occupants")
    private String samplingRoomOccupants;

//    @Column(name = "furniture_type")
//    private String furnitureType;

    @Column(name = "number_of_tables_chairs")
    private String numberOfTablesChairs;
    
    @Column(name = "other_number_of_tables_chairs")
    private String otherNumberOfTablesChairs;

    @Column(name = "number_of_sofas_beds")
    private String numberOfSofasBeds;
    
    @Column(name = "other_number_of_sofas_beds")
    private String otherNumberOfSofasBeds;

    @Column(name = "furniture_material")
    private String furnitureMaterial;

    @Column(name = "condition_of_wood_furniture")
    private String conditionOfWoodFurniture;

    @Column(name = "wood_damage_type")
    private String woodDamageType;           // if bad
    
    @Column(name = "other_wood_damage_type")
    private String otherWoodDamageType;  

    @Column(name = "wall_type")
    private String wallType;
    
    @Column(name = "other_wall_type")
    private String otherWallType;

    @Column(name = "floor_type")
    private String floorType;
    
    @Column(name = "other_floor_type")
    private String otherFloorType;

    @Column(name = "separate_ventilation_control")
    private String separateVentilationControl;

    @Column(name = "moisture_or_dampness")
    private String moistureOrDampness;

    @Column(name = "incense_products")
    private String incenseProducts;

    @Column(name = "incense_type")
    private String incenseType;
    
    @Column(name = "other_incense_type")
    private String otherIncenseType;

    @Column(name = "temperature_humidity_control")
    private String temperatureHumidityControl;

    @Column(name = "lack_of_maintenance")
    private String lackOfMaintenance;

    @Column(name = "room_floor_level")
    private String roomFloorLevel;
    
    @Column(name = "other_room_floor_level")
    private String otherRoomFloorLevel;

    @Column(name = "number_of_windows")
    private int numberOfWindows;

    @Column(name = "curtains_present")
    private String curtainsPresent;

    @Column(name = "distance_from_traffic_source")
    private String distanceFromTrafficSource;

    @Column(name = "distance_from_kitchen")
    private String distanceFromKitchen;
    
    @Column(name = "other_distance_from_kitchen")
    private String otherDistanceFromKitchen;

    @Column(name = "air_purifiers_used")
    private String airPurifiersUsed;

    @Column(name = "electronics_used")
    private String electronicsUsed;

    @Column(name = "pets_present")
    private String petsPresent;

    @Column(name = "smoking_activities")
    private String smokingActivities;

    @Column(name = "indoor_plants_present")
    private String indoorPlantsPresent;

    @Column(name = "number_of_plants")
    private String numberOfPlants;
    
    @Column(name = "other_number_of_plants")
    private int otherNumberOfPlants;

    @Column(name = "other_observations", columnDefinition = "TEXT")
    private String otherObservations;

	public Long getObservationId() {
		return observationId;
	}

	public void setObservationId(Long observationId) {
		this.observationId = observationId;
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

	public String getResidentialAddress() {
		return residentialAddress;
	}

	public void setResidentialAddress(String residentialAddress) {
		this.residentialAddress = residentialAddress;
	}

	public String getBuildingAge() {
		return buildingAge;
	}

	public void setBuildingAge(String buildingAge) {
		this.buildingAge = buildingAge;
	}

	public String getNewRenovation() {
		return newRenovation;
	}

	public void setNewRenovation(String newRenovation) {
		this.newRenovation = newRenovation;
	}

	public String getTotalArea() {
		return totalArea;
	}

	public void setTotalArea(String totalArea) {
		this.totalArea = totalArea;
	}

	public String getTotalOccupants() {
		return totalOccupants;
	}

	public void setTotalOccupants(String totalOccupants) {
		this.totalOccupants = totalOccupants;
	}

	public String getNumberOfRooms() {
		return numberOfRooms;
	}

	public void setNumberOfRooms(String numberOfRooms) {
		this.numberOfRooms = numberOfRooms;
	}

	public String getCookingActivity() {
		return cookingActivity;
	}

	public void setCookingActivity(String cookingActivity) {
		this.cookingActivity = cookingActivity;
	}

	public String getCookingFuel() {
		return cookingFuel;
	}

	public void setCookingFuel(String cookingFuel) {
		this.cookingFuel = cookingFuel;
	}

	public String getCookingTimes() {
		return cookingTimes;
	}

	public void setCookingTimes(String cookingTimes) {
		this.cookingTimes = cookingTimes;
	}

	public String getOtherCookingTimes() {
		return otherCookingTimes;
	}

	public void setOtherCookingTimes(String otherCookingTimes) {
		this.otherCookingTimes = otherCookingTimes;
	}

	public String getKitchenVentilation() {
		return kitchenVentilation;
	}

	public void setKitchenVentilation(String kitchenVentilation) {
		this.kitchenVentilation = kitchenVentilation;
	}

	public String getOtherKitchenVentilation() {
		return otherKitchenVentilation;
	}

	public void setOtherKitchenVentilation(String otherKitchenVentilation) {
		this.otherKitchenVentilation = otherKitchenVentilation;
	}

	public String getIndoorVentilation() {
		return indoorVentilation;
	}

	public void setIndoorVentilation(String indoorVentilation) {
		this.indoorVentilation = indoorVentilation;
	}

	public String getNaturalVentilationDetails() {
		return naturalVentilationDetails;
	}

	public void setNaturalVentilationDetails(String naturalVentilationDetails) {
		this.naturalVentilationDetails = naturalVentilationDetails;
	}

	public String getDuctsMaintenance() {
		return ductsMaintenance;
	}

	public void setDuctsMaintenance(String ductsMaintenance) {
		this.ductsMaintenance = ductsMaintenance;
	}

	public String getNumberOfVents() {
		return numberOfVents;
	}

	public void setNumberOfVents(String numberOfVents) {
		this.numberOfVents = numberOfVents;
	}

	public Float getInletAirVelocity() {
		return inletAirVelocity;
	}

	public void setInletAirVelocity(Float inletAirVelocity) {
		this.inletAirVelocity = inletAirVelocity;
	}

	public Float getOutletAirVelocity() {
		return outletAirVelocity;
	}

	public void setOutletAirVelocity(Float outletAirVelocity) {
		this.outletAirVelocity = outletAirVelocity;
	}

	public String getCleaningMethod() {
		return cleaningMethod;
	}

	public void setCleaningMethod(String cleaningMethod) {
		this.cleaningMethod = cleaningMethod;
	}

	public String getManualCleaningFrequency() {
		return manualCleaningFrequency;
	}

	public void setManualCleaningFrequency(String manualCleaningFrequency) {
		this.manualCleaningFrequency = manualCleaningFrequency;
	}

	public String getEquipmentCleaningFrequency() {
		return equipmentCleaningFrequency;
	}

	public void setEquipmentCleaningFrequency(String equipmentCleaningFrequency) {
		this.equipmentCleaningFrequency = equipmentCleaningFrequency;
	}

	public String getOtherEquipmentCleaningFrequency() {
		return otherEquipmentCleaningFrequency;
	}

	public void setOtherEquipmentCleaningFrequency(String otherEquipmentCleaningFrequency) {
		this.otherEquipmentCleaningFrequency = otherEquipmentCleaningFrequency;
	}

	public String getChemicalBasedCleaning() {
		return chemicalBasedCleaning;
	}

	public void setChemicalBasedCleaning(String chemicalBasedCleaning) {
		this.chemicalBasedCleaning = chemicalBasedCleaning;
	}

	public String getChemicalsUsed() {
		return chemicalsUsed;
	}

	public void setChemicalsUsed(String chemicalsUsed) {
		this.chemicalsUsed = chemicalsUsed;
	}

	public String getResidentialSamplingRoomArea() {
		return residentialSamplingRoomArea;
	}

	public void setResidentialSamplingRoomArea(String residentialSamplingRoomArea) {
		this.residentialSamplingRoomArea = residentialSamplingRoomArea;
	}

	public String getSamplingRoomOccupants() {
		return samplingRoomOccupants;
	}

	public void setSamplingRoomOccupants(String samplingRoomOccupants) {
		this.samplingRoomOccupants = samplingRoomOccupants;
	}

	public String getNumberOfTablesChairs() {
		return numberOfTablesChairs;
	}

	public void setNumberOfTablesChairs(String numberOfTablesChairs) {
		this.numberOfTablesChairs = numberOfTablesChairs;
	}

	public String getOtherNumberOfTablesChairs() {
		return otherNumberOfTablesChairs;
	}

	public void setOtherNumberOfTablesChairs(String otherNumberOfTablesChairs) {
		this.otherNumberOfTablesChairs = otherNumberOfTablesChairs;
	}

	public String getNumberOfSofasBeds() {
		return numberOfSofasBeds;
	}

	public void setNumberOfSofasBeds(String numberOfSofasBeds) {
		this.numberOfSofasBeds = numberOfSofasBeds;
	}

	public String getOtherNumberOfSofasBeds() {
		return otherNumberOfSofasBeds;
	}

	public void setOtherNumberOfSofasBeds(String otherNumberOfSofasBeds) {
		this.otherNumberOfSofasBeds = otherNumberOfSofasBeds;
	}

	public String getFurnitureMaterial() {
		return furnitureMaterial;
	}

	public void setFurnitureMaterial(String furnitureMaterial) {
		this.furnitureMaterial = furnitureMaterial;
	}

	public String getConditionOfWoodFurniture() {
		return conditionOfWoodFurniture;
	}

	public void setConditionOfWoodFurniture(String conditionOfWoodFurniture) {
		this.conditionOfWoodFurniture = conditionOfWoodFurniture;
	}

	public String getWoodDamageType() {
		return woodDamageType;
	}

	public void setWoodDamageType(String woodDamageType) {
		this.woodDamageType = woodDamageType;
	}

	public String getOtherWoodDamageType() {
		return otherWoodDamageType;
	}

	public void setOtherWoodDamageType(String otherWoodDamageType) {
		this.otherWoodDamageType = otherWoodDamageType;
	}

	public String getWallType() {
		return wallType;
	}

	public void setWallType(String wallType) {
		this.wallType = wallType;
	}

	public String getOtherWallType() {
		return otherWallType;
	}

	public void setOtherWallType(String otherWallType) {
		this.otherWallType = otherWallType;
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

	public String getSeparateVentilationControl() {
		return separateVentilationControl;
	}

	public void setSeparateVentilationControl(String separateVentilationControl) {
		this.separateVentilationControl = separateVentilationControl;
	}

	public String getMoistureOrDampness() {
		return moistureOrDampness;
	}

	public void setMoistureOrDampness(String moistureOrDampness) {
		this.moistureOrDampness = moistureOrDampness;
	}

	public String getIncenseProducts() {
		return incenseProducts;
	}

	public void setIncenseProducts(String incenseProducts) {
		this.incenseProducts = incenseProducts;
	}

	public String getIncenseType() {
		return incenseType;
	}

	public void setIncenseType(String incenseType) {
		this.incenseType = incenseType;
	}

	public String getOtherIncenseType() {
		return otherIncenseType;
	}

	public void setOtherIncenseType(String otherIncenseType) {
		this.otherIncenseType = otherIncenseType;
	}

	public String getTemperatureHumidityControl() {
		return temperatureHumidityControl;
	}

	public void setTemperatureHumidityControl(String temperatureHumidityControl) {
		this.temperatureHumidityControl = temperatureHumidityControl;
	}

	public String getLackOfMaintenance() {
		return lackOfMaintenance;
	}

	public void setLackOfMaintenance(String lackOfMaintenance) {
		this.lackOfMaintenance = lackOfMaintenance;
	}

	public String getRoomFloorLevel() {
		return roomFloorLevel;
	}

	public void setRoomFloorLevel(String roomFloorLevel) {
		this.roomFloorLevel = roomFloorLevel;
	}

	public String getOtherRoomFloorLevel() {
		return otherRoomFloorLevel;
	}

	public void setOtherRoomFloorLevel(String otherRoomFloorLevel) {
		this.otherRoomFloorLevel = otherRoomFloorLevel;
	}

	public int getNumberOfWindows() {
		return numberOfWindows;
	}

	public void setNumberOfWindows(int numberOfWindows) {
		this.numberOfWindows = numberOfWindows;
	}

	public String getCurtainsPresent() {
		return curtainsPresent;
	}

	public void setCurtainsPresent(String curtainsPresent) {
		this.curtainsPresent = curtainsPresent;
	}

	public String getDistanceFromTrafficSource() {
		return distanceFromTrafficSource;
	}

	public void setDistanceFromTrafficSource(String distanceFromTrafficSource) {
		this.distanceFromTrafficSource = distanceFromTrafficSource;
	}

	public String getDistanceFromKitchen() {
		return distanceFromKitchen;
	}

	public void setDistanceFromKitchen(String distanceFromKitchen) {
		this.distanceFromKitchen = distanceFromKitchen;
	}

	public String getOtherDistanceFromKitchen() {
		return otherDistanceFromKitchen;
	}

	public void setOtherDistanceFromKitchen(String otherDistanceFromKitchen) {
		this.otherDistanceFromKitchen = otherDistanceFromKitchen;
	}

	public String getAirPurifiersUsed() {
		return airPurifiersUsed;
	}

	public void setAirPurifiersUsed(String airPurifiersUsed) {
		this.airPurifiersUsed = airPurifiersUsed;
	}

	public String getElectronicsUsed() {
		return electronicsUsed;
	}

	public void setElectronicsUsed(String electronicsUsed) {
		this.electronicsUsed = electronicsUsed;
	}

	public String getPetsPresent() {
		return petsPresent;
	}

	public void setPetsPresent(String petsPresent) {
		this.petsPresent = petsPresent;
	}

	public String getSmokingActivities() {
		return smokingActivities;
	}

	public void setSmokingActivities(String smokingActivities) {
		this.smokingActivities = smokingActivities;
	}

	public String getIndoorPlantsPresent() {
		return indoorPlantsPresent;
	}

	public void setIndoorPlantsPresent(String indoorPlantsPresent) {
		this.indoorPlantsPresent = indoorPlantsPresent;
	}

	public String getNumberOfPlants() {
		return numberOfPlants;
	}

	public void setNumberOfPlants(String numberOfPlants) {
		this.numberOfPlants = numberOfPlants;
	}

	public int getOtherNumberOfPlants() {
		return otherNumberOfPlants;
	}

	public void setOtherNumberOfPlants(int otherNumberOfPlants) {
		this.otherNumberOfPlants = otherNumberOfPlants;
	}

	public String getOtherObservations() {
		return otherObservations;
	}

	public void setOtherObservations(String otherObservations) {
		this.otherObservations = otherObservations;
	}

	public Residential(Long observationId, String participantId, String locationId, String observerName,
			Date observationDate, String residentialAddress, String buildingAge, String newRenovation, String totalArea,
			String totalOccupants, String numberOfRooms, String cookingActivity, String cookingFuel,
			String cookingTimes, String otherCookingTimes, String kitchenVentilation, String otherKitchenVentilation,
			String indoorVentilation, String naturalVentilationDetails, String ductsMaintenance, String numberOfVents,
			Float inletAirVelocity, Float outletAirVelocity, String cleaningMethod, String manualCleaningFrequency,
			String equipmentCleaningFrequency, String otherEquipmentCleaningFrequency, String chemicalBasedCleaning,
			String chemicalsUsed, String residentialSamplingRoomArea, String samplingRoomOccupants,
			String numberOfTablesChairs, String otherNumberOfTablesChairs, String numberOfSofasBeds,
			String otherNumberOfSofasBeds, String furnitureMaterial, String conditionOfWoodFurniture,
			String woodDamageType, String otherWoodDamageType, String wallType, String otherWallType, String floorType,
			String otherFloorType, String separateVentilationControl, String moistureOrDampness, String incenseProducts,
			String incenseType, String otherIncenseType, String temperatureHumidityControl, String lackOfMaintenance,
			String roomFloorLevel, String otherRoomFloorLevel, int numberOfWindows, String curtainsPresent,
			String distanceFromTrafficSource, String distanceFromKitchen, String otherDistanceFromKitchen,
			String airPurifiersUsed, String electronicsUsed, String petsPresent, String smokingActivities,
			String indoorPlantsPresent, String numberOfPlants, int otherNumberOfPlants, String otherObservations) {
		super();
		this.observationId = observationId;
		this.participantId = participantId;
		this.locationId = locationId;
		this.observerName = observerName;
		this.observationDate = observationDate;
		this.residentialAddress = residentialAddress;
		this.buildingAge = buildingAge;
		this.newRenovation = newRenovation;
		this.totalArea = totalArea;
		this.totalOccupants = totalOccupants;
		this.numberOfRooms = numberOfRooms;
		this.cookingActivity = cookingActivity;
		this.cookingFuel = cookingFuel;
		this.cookingTimes = cookingTimes;
		this.otherCookingTimes = otherCookingTimes;
		this.kitchenVentilation = kitchenVentilation;
		this.otherKitchenVentilation = otherKitchenVentilation;
		this.indoorVentilation = indoorVentilation;
		this.naturalVentilationDetails = naturalVentilationDetails;
		this.ductsMaintenance = ductsMaintenance;
		this.numberOfVents = numberOfVents;
		this.inletAirVelocity = inletAirVelocity;
		this.outletAirVelocity = outletAirVelocity;
		this.cleaningMethod = cleaningMethod;
		this.manualCleaningFrequency = manualCleaningFrequency;
		this.equipmentCleaningFrequency = equipmentCleaningFrequency;
		this.otherEquipmentCleaningFrequency = otherEquipmentCleaningFrequency;
		this.chemicalBasedCleaning = chemicalBasedCleaning;
		this.chemicalsUsed = chemicalsUsed;
		this.residentialSamplingRoomArea = residentialSamplingRoomArea;
		this.samplingRoomOccupants = samplingRoomOccupants;
		this.numberOfTablesChairs = numberOfTablesChairs;
		this.otherNumberOfTablesChairs = otherNumberOfTablesChairs;
		this.numberOfSofasBeds = numberOfSofasBeds;
		this.otherNumberOfSofasBeds = otherNumberOfSofasBeds;
		this.furnitureMaterial = furnitureMaterial;
		this.conditionOfWoodFurniture = conditionOfWoodFurniture;
		this.woodDamageType = woodDamageType;
		this.otherWoodDamageType = otherWoodDamageType;
		this.wallType = wallType;
		this.otherWallType = otherWallType;
		this.floorType = floorType;
		this.otherFloorType = otherFloorType;
		this.separateVentilationControl = separateVentilationControl;
		this.moistureOrDampness = moistureOrDampness;
		this.incenseProducts = incenseProducts;
		this.incenseType = incenseType;
		this.otherIncenseType = otherIncenseType;
		this.temperatureHumidityControl = temperatureHumidityControl;
		this.lackOfMaintenance = lackOfMaintenance;
		this.roomFloorLevel = roomFloorLevel;
		this.otherRoomFloorLevel = otherRoomFloorLevel;
		this.numberOfWindows = numberOfWindows;
		this.curtainsPresent = curtainsPresent;
		this.distanceFromTrafficSource = distanceFromTrafficSource;
		this.distanceFromKitchen = distanceFromKitchen;
		this.otherDistanceFromKitchen = otherDistanceFromKitchen;
		this.airPurifiersUsed = airPurifiersUsed;
		this.electronicsUsed = electronicsUsed;
		this.petsPresent = petsPresent;
		this.smokingActivities = smokingActivities;
		this.indoorPlantsPresent = indoorPlantsPresent;
		this.numberOfPlants = numberOfPlants;
		this.otherNumberOfPlants = otherNumberOfPlants;
		this.otherObservations = otherObservations;
	}

	public Residential() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Residential [observationId=" + observationId + ", participantId=" + participantId + ", locationId="
				+ locationId + ", observerName=" + observerName + ", observationDate=" + observationDate
				+ ", residentialAddress=" + residentialAddress + ", buildingAge=" + buildingAge + ", newRenovation="
				+ newRenovation + ", totalArea=" + totalArea + ", totalOccupants=" + totalOccupants + ", numberOfRooms="
				+ numberOfRooms + ", cookingActivity=" + cookingActivity + ", cookingFuel=" + cookingFuel
				+ ", cookingTimes=" + cookingTimes + ", otherCookingTimes=" + otherCookingTimes
				+ ", kitchenVentilation=" + kitchenVentilation + ", otherKitchenVentilation=" + otherKitchenVentilation
				+ ", indoorVentilation=" + indoorVentilation + ", naturalVentilationDetails="
				+ naturalVentilationDetails + ", ductsMaintenance=" + ductsMaintenance + ", numberOfVents="
				+ numberOfVents + ", inletAirVelocity=" + inletAirVelocity + ", outletAirVelocity=" + outletAirVelocity
				+ ", cleaningMethod=" + cleaningMethod + ", manualCleaningFrequency=" + manualCleaningFrequency
				+ ", equipmentCleaningFrequency=" + equipmentCleaningFrequency + ", otherEquipmentCleaningFrequency="
				+ otherEquipmentCleaningFrequency + ", chemicalBasedCleaning=" + chemicalBasedCleaning
				+ ", chemicalsUsed=" + chemicalsUsed + ", residentialSamplingRoomArea=" + residentialSamplingRoomArea
				+ ", samplingRoomOccupants=" + samplingRoomOccupants + ", numberOfTablesChairs=" + numberOfTablesChairs
				+ ", otherNumberOfTablesChairs=" + otherNumberOfTablesChairs + ", numberOfSofasBeds="
				+ numberOfSofasBeds + ", otherNumberOfSofasBeds=" + otherNumberOfSofasBeds + ", furnitureMaterial="
				+ furnitureMaterial + ", conditionOfWoodFurniture=" + conditionOfWoodFurniture + ", woodDamageType="
				+ woodDamageType + ", otherWoodDamageType=" + otherWoodDamageType + ", wallType=" + wallType
				+ ", otherWallType=" + otherWallType + ", floorType=" + floorType + ", otherFloorType=" + otherFloorType
				+ ", separateVentilationControl=" + separateVentilationControl + ", moistureOrDampness="
				+ moistureOrDampness + ", incenseProducts=" + incenseProducts + ", incenseType=" + incenseType
				+ ", otherIncenseType=" + otherIncenseType + ", temperatureHumidityControl="
				+ temperatureHumidityControl + ", lackOfMaintenance=" + lackOfMaintenance + ", roomFloorLevel="
				+ roomFloorLevel + ", otherRoomFloorLevel=" + otherRoomFloorLevel + ", numberOfWindows="
				+ numberOfWindows + ", curtainsPresent=" + curtainsPresent + ", distanceFromTrafficSource="
				+ distanceFromTrafficSource + ", distanceFromKitchen=" + distanceFromKitchen
				+ ", otherDistanceFromKitchen=" + otherDistanceFromKitchen + ", airPurifiersUsed=" + airPurifiersUsed
				+ ", electronicsUsed=" + electronicsUsed + ", petsPresent=" + petsPresent + ", smokingActivities="
				+ smokingActivities + ", indoorPlantsPresent=" + indoorPlantsPresent + ", numberOfPlants="
				+ numberOfPlants + ", otherNumberOfPlants=" + otherNumberOfPlants + ", otherObservations="
				+ otherObservations + ", getObservationId()=" + getObservationId() + ", getParticipantId()="
				+ getParticipantId() + ", getLocationId()=" + getLocationId() + ", getObserverName()="
				+ getObserverName() + ", getObservationDate()=" + getObservationDate() + ", getResidentialAddress()="
				+ getResidentialAddress() + ", getBuildingAge()=" + getBuildingAge() + ", getNewRenovation()="
				+ getNewRenovation() + ", getTotalArea()=" + getTotalArea() + ", getTotalOccupants()="
				+ getTotalOccupants() + ", getNumberOfRooms()=" + getNumberOfRooms() + ", getCookingActivity()="
				+ getCookingActivity() + ", getCookingFuel()=" + getCookingFuel() + ", getCookingTimes()="
				+ getCookingTimes() + ", getOtherCookingTimes()=" + getOtherCookingTimes()
				+ ", getKitchenVentilation()=" + getKitchenVentilation() + ", getOtherKitchenVentilation()="
				+ getOtherKitchenVentilation() + ", getIndoorVentilation()=" + getIndoorVentilation()
				+ ", getNaturalVentilationDetails()=" + getNaturalVentilationDetails() + ", getDuctsMaintenance()="
				+ getDuctsMaintenance() + ", getNumberOfVents()=" + getNumberOfVents() + ", getInletAirVelocity()="
				+ getInletAirVelocity() + ", getOutletAirVelocity()=" + getOutletAirVelocity()
				+ ", getCleaningMethod()=" + getCleaningMethod() + ", getManualCleaningFrequency()="
				+ getManualCleaningFrequency() + ", getEquipmentCleaningFrequency()=" + getEquipmentCleaningFrequency()
				+ ", getOtherEquipmentCleaningFrequency()=" + getOtherEquipmentCleaningFrequency()
				+ ", getChemicalBasedCleaning()=" + getChemicalBasedCleaning() + ", getChemicalsUsed()="
				+ getChemicalsUsed() + ", getResidentialSamplingRoomArea()=" + getResidentialSamplingRoomArea()
				+ ", getSamplingRoomOccupants()=" + getSamplingRoomOccupants() + ", getNumberOfTablesChairs()="
				+ getNumberOfTablesChairs() + ", getOtherNumberOfTablesChairs()=" + getOtherNumberOfTablesChairs()
				+ ", getNumberOfSofasBeds()=" + getNumberOfSofasBeds() + ", getOtherNumberOfSofasBeds()="
				+ getOtherNumberOfSofasBeds() + ", getFurnitureMaterial()=" + getFurnitureMaterial()
				+ ", getConditionOfWoodFurniture()=" + getConditionOfWoodFurniture() + ", getWoodDamageType()="
				+ getWoodDamageType() + ", getOtherWoodDamageType()=" + getOtherWoodDamageType() + ", getWallType()="
				+ getWallType() + ", getOtherWallType()=" + getOtherWallType() + ", getFloorType()=" + getFloorType()
				+ ", getOtherFloorType()=" + getOtherFloorType() + ", getSeparateVentilationControl()="
				+ getSeparateVentilationControl() + ", getMoistureOrDampness()=" + getMoistureOrDampness()
				+ ", getIncenseProducts()=" + getIncenseProducts() + ", getIncenseType()=" + getIncenseType()
				+ ", getOtherIncenseType()=" + getOtherIncenseType() + ", getTemperatureHumidityControl()="
				+ getTemperatureHumidityControl() + ", getLackOfMaintenance()=" + getLackOfMaintenance()
				+ ", getRoomFloorLevel()=" + getRoomFloorLevel() + ", getOtherRoomFloorLevel()="
				+ getOtherRoomFloorLevel() + ", getNumberOfWindows()=" + getNumberOfWindows()
				+ ", getCurtainsPresent()=" + getCurtainsPresent() + ", getDistanceFromTrafficSource()="
				+ getDistanceFromTrafficSource() + ", getDistanceFromKitchen()=" + getDistanceFromKitchen()
				+ ", getOtherDistanceFromKitchen()=" + getOtherDistanceFromKitchen() + ", getAirPurifiersUsed()="
				+ getAirPurifiersUsed() + ", getElectronicsUsed()=" + getElectronicsUsed() + ", getPetsPresent()="
				+ getPetsPresent() + ", getSmokingActivities()=" + getSmokingActivities()
				+ ", getIndoorPlantsPresent()=" + getIndoorPlantsPresent() + ", getNumberOfPlants()="
				+ getNumberOfPlants() + ", getOtherNumberOfPlants()=" + getOtherNumberOfPlants()
				+ ", getOtherObservations()=" + getOtherObservations() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}

	
}
