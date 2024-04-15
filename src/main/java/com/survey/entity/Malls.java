package com.survey.entity;

import org.springframework.stereotype.Component;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "malls")
@Component
public class Malls {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "building_id")
    private Long buildingId;

    @Column(name = "location_id")
    private String locationId;

    @Column(name = "participant_id")
    private String participantId;

    @Column(name = "observer_name")
    private String observerName;

    @Column(name = "observation_date")
    private String observationDate;

    @Column(name = "building_address")
    private String buildingAddress;

    @Column(name = "building_age_years")
    private String buildingAgeyears; 

    @Column(name = "new_renovation")
    private String newRenovation;

    @Column(name = "mall_total_area")
    private String mallTotalArea;

    @Column(name = "total_occupants")
    private String occupantsTotal;

    @Column(name = "number_of_shops")
    private String numberOfShops;

    @Column(name = "food_court_restaurants_present")
    private String foodCourtAndRestaurantsPresent;
    
    @Column(name = "cooking_fuel")
    private String cookingFuel;

    @Column(name = "ventilation_type")
    private String ventilationType;
    
    @Column(name = "ventilation_of_whole_mall")
    private String ventilationOfWholeMall;

    @Column(name = "ducts_maintenance")
    private String ductsMaintenance;

    @Column(name = "no_of_vents_category")
    private String noOfVentsCategory;

    @Column(name = "exhaust_fan_inlet_velocity")
    private Integer exhaustFanInletVelocity;

    @Column(name = "exhaust_fan_outlet_velocity")
    private Integer exhaustFanOutletVelocity;

    @Column(name = "cleaning_method")
    private String cleaningMethod;

    @Column(name = "manual_cleaning_frequency")
    private String manualCleaningFrequency;

    @Column(name = "equipment_cleaning_frequency")
    private String equipmentCleaningFrequency;

    @Column(name = "chemical_products_present_for_cleaning")
    private String chemicalProductsPresentForCleaning;

    @Column(name = "chemical_products")
    private String chemicalProducts;
    
    @Column(name = "other_chemical_products")
    private String otherChemicalProducts;
    
    @Column(name = "employee_number_in_sampling_area")
    private String employeeNumberInSamplingArea;
    
    @Column(name = "average_football_each_hour_sampling_area")
    private String averageFootballEachHourSamplingArea;
    
    @Column(name = "other_football_each_hour_sampling_area")
    private String otherFootballEachHourSamplingArea;
    
    @Column(name = "furniture_material_sampling_area")
    private String furnitureMaterialInSamplingArea;
    
    @Column(name = "furniture_number_in_sampling_area")
    private String furnitureNumberInSamplingArea;
    
    @Column(name = "other_furniture_number_in_sampling_area")
    private String otherFurnitureNumberInSamplingArea;

    @Column(name = "wall_material_sampling_area")
    private String wallMaterialInSamplingArea;
    
    @Column(name = "floor_type")
    private String floorType;

    @Column(name = "separate_ventilation_system_mall")
    private String separateVentilationSystemMall;

    @Column(name = "moisture_or_damp_patches_marks")
    private String moistureOrDampPatchesMarks;
    
    @Column(name = "specify_moisture_or_damp_patches_marks")
    private String specifyMoistureOrDampPatchesMarks;
    
    @Column(name = "use_of_scented_products")
    private String useOfScentedProducts;
    
    @Column(name = "scented_products")
    private String scentedProducts;
    
    @Column(name = "other_scented_products")
    private String otherScentedProducts;
    
    @Column(name = "anyseperate_temp_humidity_control_system")
    private String anySeperateTempHumidityControlSystem;

    @Column(name = "ifyesanyseperate_temp_humidity_control_system")
    private String ifYesAnySeperateTempHumidityControlSystem;
    
    @Column(name = "maintenance_frequency")
    private String maintenanceFrequency;
    
    @Column(name = "other_maintenance_frequency")
    private String otherMaintenanceFrequency;
    
    @Column(name = "floor_level")
    private String floorLevel;
    
    @Column(name = "no_ofWindows_near_sampling_location")
    private String noOfWindowsNearSamplingLocation;
    
    @Column(name = "curtains_present")
    private String curtainsPresent;
    
    @Column(name = "mall_distance_from_traffic_source")
    private String mallDistanceFromTrafficSource;
    
    @Column(name = "cafeteria_distance_from_kitchen")
    private String cafeteriaDistanceFromKitchen;
    
    @Column(name = "air_purifier_used")
    private String airPurifierUsed;
    
    @Column(name = "artificial_plants_present_in_mall")
    private String artificialPlantsPresentInMall;
    
    @Column(name = "electronics_used")
    private String electronicsUsed;

    @Column(name = "esclators_or_lift_in_mall")
    private String esclatorsOrLiftInMall;
    
    @Column(name = "no_of_esclators_in_mall")
    private String noOfEsclatorsInMall;
    
    @Column(name = "no_of_lifts_in_mall")
    private String noOfLiftsInMall;

    @Column(name = "any_indoor_plant_present")
    private String anyIndoorPlantsPresent;
    
    @Column(name = "no_of_indoor_plant_present")
    private String noOfIndoorPlantsPresent;

    @Column(name = "other_observation")
    private String other_observation;

	public Long getBuildingId() {
		return buildingId;
	}

	public void setBuildingId(Long buildingId) {
		this.buildingId = buildingId;
	}

	public String getLocationId() {
		return locationId;
	}

	public void setLocationId(String locationId) {
		this.locationId = locationId;
	}

	public String getParticipantId() {
		return participantId;
	}

	public void setParticipantId(String participantId) {
		this.participantId = participantId;
	}

	public String getObserverName() {
		return observerName;
	}

	public void setObserverName(String observerName) {
		this.observerName = observerName;
	}

	public String getObservationDate() {
		return observationDate;
	}

	public void setObservationDate(String observationDate) {
		this.observationDate = observationDate;
	}

	public String getBuildingAddress() {
		return buildingAddress;
	}

	public void setBuildingAddress(String buildingAddress) {
		this.buildingAddress = buildingAddress;
	}

	public String getBuildingAgeyears() {
		return buildingAgeyears;
	}

	public void setBuildingAgeyears(String buildingAgeyears) {
		this.buildingAgeyears = buildingAgeyears;
	}

	public String getNewRenovation() {
		return newRenovation;
	}

	public void setNewRenovation(String newRenovation) {
		this.newRenovation = newRenovation;
	}

	public String getMallTotalArea() {
		return mallTotalArea;
	}

	public void setMallTotalArea(String mallTotalArea) {
		this.mallTotalArea = mallTotalArea;
	}

	public String getOccupantsTotal() {
		return occupantsTotal;
	}

	public void setOccupantsTotal(String occupantsTotal) {
		this.occupantsTotal = occupantsTotal;
	}

	public String getNumberOfShops() {
		return numberOfShops;
	}

	public void setNumberOfShops(String numberOfShops) {
		this.numberOfShops = numberOfShops;
	}

	public String getFoodCourtAndRestaurantsPresent() {
		return foodCourtAndRestaurantsPresent;
	}

	public void setFoodCourtAndRestaurantsPresent(String foodCourtAndRestaurantsPresent) {
		this.foodCourtAndRestaurantsPresent = foodCourtAndRestaurantsPresent;
	}

	public String getCookingFuel() {
		return cookingFuel;
	}

	public void setCookingFuel(String cookingFuel) {
		this.cookingFuel = cookingFuel;
	}

	public String getVentilationType() {
		return ventilationType;
	}

	public void setVentilationType(String ventilationType) {
		this.ventilationType = ventilationType;
	}

	public String getVentilationOfWholeMall() {
		return ventilationOfWholeMall;
	}

	public void setVentilationOfWholeMall(String ventilationOfWholeMall) {
		this.ventilationOfWholeMall = ventilationOfWholeMall;
	}

	public String getDuctsMaintenance() {
		return ductsMaintenance;
	}

	public void setDuctsMaintenance(String ductsMaintenance) {
		this.ductsMaintenance = ductsMaintenance;
	}

	public String getNoOfVentsCategory() {
		return noOfVentsCategory;
	}

	public void setNoOfVentsCategory(String noOfVentsCategory) {
		this.noOfVentsCategory = noOfVentsCategory;
	}

	public Integer getExhaustFanInletVelocity() {
		return exhaustFanInletVelocity;
	}

	public void setExhaustFanInletVelocity(Integer exhaustFanInletVelocity) {
		this.exhaustFanInletVelocity = exhaustFanInletVelocity;
	}

	public Integer getExhaustFanOutletVelocity() {
		return exhaustFanOutletVelocity;
	}

	public void setExhaustFanOutletVelocity(Integer exhaustFanOutletVelocity) {
		this.exhaustFanOutletVelocity = exhaustFanOutletVelocity;
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

	public String getChemicalProductsPresentForCleaning() {
		return chemicalProductsPresentForCleaning;
	}

	public void setChemicalProductsPresentForCleaning(String chemicalProductsPresentForCleaning) {
		this.chemicalProductsPresentForCleaning = chemicalProductsPresentForCleaning;
	}

	public String getChemicalProducts() {
		return chemicalProducts;
	}

	public void setChemicalProducts(String chemicalProducts) {
		this.chemicalProducts = chemicalProducts;
	}

	public String getOtherChemicalProducts() {
		return otherChemicalProducts;
	}

	public void setOtherChemicalProducts(String otherChemicalProducts) {
		this.otherChemicalProducts = otherChemicalProducts;
	}

	public String getEmployeeNumberInSamplingArea() {
		return employeeNumberInSamplingArea;
	}

	public void setEmployeeNumberInSamplingArea(String employeeNumberInSamplingArea) {
		this.employeeNumberInSamplingArea = employeeNumberInSamplingArea;
	}

	public String getAverageFootballEachHourSamplingArea() {
		return averageFootballEachHourSamplingArea;
	}

	public void setAverageFootballEachHourSamplingArea(String averageFootballEachHourSamplingArea) {
		this.averageFootballEachHourSamplingArea = averageFootballEachHourSamplingArea;
	}

	public String getOtherFootballEachHourSamplingArea() {
		return otherFootballEachHourSamplingArea;
	}

	public void setOtherFootballEachHourSamplingArea(String otherFootballEachHourSamplingArea) {
		this.otherFootballEachHourSamplingArea = otherFootballEachHourSamplingArea;
	}

	public String getFurnitureMaterialInSamplingArea() {
		return furnitureMaterialInSamplingArea;
	}

	public void setFurnitureMaterialInSamplingArea(String furnitureMaterialInSamplingArea) {
		this.furnitureMaterialInSamplingArea = furnitureMaterialInSamplingArea;
	}

	public String getFurnitureNumberInSamplingArea() {
		return furnitureNumberInSamplingArea;
	}

	public void setFurnitureNumberInSamplingArea(String furnitureNumberInSamplingArea) {
		this.furnitureNumberInSamplingArea = furnitureNumberInSamplingArea;
	}

	public String getOtherFurnitureNumberInSamplingArea() {
		return otherFurnitureNumberInSamplingArea;
	}

	public void setOtherFurnitureNumberInSamplingArea(String otherFurnitureNumberInSamplingArea) {
		this.otherFurnitureNumberInSamplingArea = otherFurnitureNumberInSamplingArea;
	}

	public String getWallMaterialInSamplingArea() {
		return wallMaterialInSamplingArea;
	}

	public void setWallMaterialInSamplingArea(String wallMaterialInSamplingArea) {
		this.wallMaterialInSamplingArea = wallMaterialInSamplingArea;
	}

	public String getFloorType() {
		return floorType;
	}

	public void setFloorType(String floorType) {
		this.floorType = floorType;
	}

	public String getSeparateVentilationSystemMall() {
		return separateVentilationSystemMall;
	}

	public void setSeparateVentilationSystemMall(String separateVentilationSystemMall) {
		this.separateVentilationSystemMall = separateVentilationSystemMall;
	}

	public String getMoistureOrDampPatchesMarks() {
		return moistureOrDampPatchesMarks;
	}

	public void setMoistureOrDampPatchesMarks(String moistureOrDampPatchesMarks) {
		this.moistureOrDampPatchesMarks = moistureOrDampPatchesMarks;
	}

	public String getSpecifyMoistureOrDampPatchesMarks() {
		return specifyMoistureOrDampPatchesMarks;
	}

	public void setSpecifyMoistureOrDampPatchesMarks(String specifyMoistureOrDampPatchesMarks) {
		this.specifyMoistureOrDampPatchesMarks = specifyMoistureOrDampPatchesMarks;
	}

	public String getUseOfScentedProducts() {
		return useOfScentedProducts;
	}

	public void setUseOfScentedProducts(String useOfScentedProducts) {
		this.useOfScentedProducts = useOfScentedProducts;
	}

	public String getScentedProducts() {
		return scentedProducts;
	}

	public void setScentedProducts(String scentedProducts) {
		this.scentedProducts = scentedProducts;
	}

	public String getOtherScentedProducts() {
		return otherScentedProducts;
	}

	public void setOtherScentedProducts(String otherScentedProducts) {
		this.otherScentedProducts = otherScentedProducts;
	}

	public String getAnySeperateTempHumidityControlSystem() {
		return anySeperateTempHumidityControlSystem;
	}

	public void setAnySeperateTempHumidityControlSystem(String anySeperateTempHumidityControlSystem) {
		this.anySeperateTempHumidityControlSystem = anySeperateTempHumidityControlSystem;
	}

	public String getIfYesAnySeperateTempHumidityControlSystem() {
		return ifYesAnySeperateTempHumidityControlSystem;
	}

	public void setIfYesAnySeperateTempHumidityControlSystem(String ifYesAnySeperateTempHumidityControlSystem) {
		this.ifYesAnySeperateTempHumidityControlSystem = ifYesAnySeperateTempHumidityControlSystem;
	}

	public String getMaintenanceFrequency() {
		return maintenanceFrequency;
	}

	public void setMaintenanceFrequency(String maintenanceFrequency) {
		this.maintenanceFrequency = maintenanceFrequency;
	}

	public String getOtherMaintenanceFrequency() {
		return otherMaintenanceFrequency;
	}

	public void setOtherMaintenanceFrequency(String otherMaintenanceFrequency) {
		this.otherMaintenanceFrequency = otherMaintenanceFrequency;
	}

	public String getFloorLevel() {
		return floorLevel;
	}

	public void setFloorLevel(String floorLevel) {
		this.floorLevel = floorLevel;
	}

	public String getNoOfWindowsNearSamplingLocation() {
		return noOfWindowsNearSamplingLocation;
	}

	public void setNoOfWindowsNearSamplingLocation(String noOfWindowsNearSamplingLocation) {
		this.noOfWindowsNearSamplingLocation = noOfWindowsNearSamplingLocation;
	}

	public String getCurtainsPresent() {
		return curtainsPresent;
	}

	public void setCurtainsPresent(String curtainsPresent) {
		this.curtainsPresent = curtainsPresent;
	}

	public String getMallDistanceFromTrafficSource() {
		return mallDistanceFromTrafficSource;
	}

	public void setMallDistanceFromTrafficSource(String mallDistanceFromTrafficSource) {
		this.mallDistanceFromTrafficSource = mallDistanceFromTrafficSource;
	}

	public String getCafeteriaDistanceFromKitchen() {
		return cafeteriaDistanceFromKitchen;
	}

	public void setCafeteriaDistanceFromKitchen(String cafeteriaDistanceFromKitchen) {
		this.cafeteriaDistanceFromKitchen = cafeteriaDistanceFromKitchen;
	}

	public String getAirPurifierUsed() {
		return airPurifierUsed;
	}

	public void setAirPurifierUsed(String airPurifierUsed) {
		this.airPurifierUsed = airPurifierUsed;
	}

	public String getArtificialPlantsPresentInMall() {
		return artificialPlantsPresentInMall;
	}

	public void setArtificialPlantsPresentInMall(String artificialPlantsPresentInMall) {
		this.artificialPlantsPresentInMall = artificialPlantsPresentInMall;
	}

	public String getElectronicsUsed() {
		return electronicsUsed;
	}

	public void setElectronicsUsed(String electronicsUsed) {
		this.electronicsUsed = electronicsUsed;
	}

	public String getEsclatorsOrLiftInMall() {
		return esclatorsOrLiftInMall;
	}

	public void setEsclatorsOrLiftInMall(String esclatorsOrLiftInMall) {
		this.esclatorsOrLiftInMall = esclatorsOrLiftInMall;
	}

	public String getNoOfEsclatorsInMall() {
		return noOfEsclatorsInMall;
	}

	public void setNoOfEsclatorsInMall(String noOfEsclatorsInMall) {
		this.noOfEsclatorsInMall = noOfEsclatorsInMall;
	}

	public String getNoOfLiftsInMall() {
		return noOfLiftsInMall;
	}

	public void setNoOfLiftsInMall(String noOfLiftsInMall) {
		this.noOfLiftsInMall = noOfLiftsInMall;
	}

	public String getAnyIndoorPlantsPresent() {
		return anyIndoorPlantsPresent;
	}

	public void setAnyIndoorPlantsPresent(String anyIndoorPlantsPresent) {
		this.anyIndoorPlantsPresent = anyIndoorPlantsPresent;
	}

	public String getNoOfIndoorPlantsPresent() {
		return noOfIndoorPlantsPresent;
	}

	public void setNoOfIndoorPlantsPresent(String noOfIndoorPlantsPresent) {
		this.noOfIndoorPlantsPresent = noOfIndoorPlantsPresent;
	}

	public String getOther_observation() {
		return other_observation;
	}

	public void setOther_observation(String other_observation) {
		this.other_observation = other_observation;
	}

	public Malls(Long buildingId, String locationId, String participantId, String observerName, String observationDate,
			String buildingAddress, String buildingAgeyears, String newRenovation, String mallTotalArea,
			String occupantsTotal, String numberOfShops, String foodCourtAndRestaurantsPresent, String cookingFuel,
			String ventilationType, String ventilationOfWholeMall, String ductsMaintenance, String noOfVentsCategory,
			Integer exhaustFanInletVelocity, Integer exhaustFanOutletVelocity, String cleaningMethod,
			String manualCleaningFrequency, String equipmentCleaningFrequency,
			String chemicalProductsPresentForCleaning, String chemicalProducts, String otherChemicalProducts,
			String employeeNumberInSamplingArea, String averageFootballEachHourSamplingArea,
			String otherFootballEachHourSamplingArea, String furnitureMaterialInSamplingArea,
			String furnitureNumberInSamplingArea, String otherFurnitureNumberInSamplingArea,
			String wallMaterialInSamplingArea, String floorType, String separateVentilationSystemMall,
			String moistureOrDampPatchesMarks, String specifyMoistureOrDampPatchesMarks, String useOfScentedProducts,
			String scentedProducts, String otherScentedProducts, String anySeperateTempHumidityControlSystem,
			String ifYesAnySeperateTempHumidityControlSystem, String maintenanceFrequency,
			String otherMaintenanceFrequency, String floorLevel, String noOfWindowsNearSamplingLocation,
			String curtainsPresent, String mallDistanceFromTrafficSource, String cafeteriaDistanceFromKitchen,
			String airPurifierUsed, String artificialPlantsPresentInMall, String electronicsUsed,
			String esclatorsOrLiftInMall, String noOfEsclatorsInMall, String noOfLiftsInMall,
			String anyIndoorPlantsPresent, String noOfIndoorPlantsPresent, String other_observation) {
		super();
		this.buildingId = buildingId;
		this.locationId = locationId;
		this.participantId = participantId;
		this.observerName = observerName;
		this.observationDate = observationDate;
		this.buildingAddress = buildingAddress;
		this.buildingAgeyears = buildingAgeyears;
		this.newRenovation = newRenovation;
		this.mallTotalArea = mallTotalArea;
		this.occupantsTotal = occupantsTotal;
		this.numberOfShops = numberOfShops;
		this.foodCourtAndRestaurantsPresent = foodCourtAndRestaurantsPresent;
		this.cookingFuel = cookingFuel;
		this.ventilationType = ventilationType;
		this.ventilationOfWholeMall = ventilationOfWholeMall;
		this.ductsMaintenance = ductsMaintenance;
		this.noOfVentsCategory = noOfVentsCategory;
		this.exhaustFanInletVelocity = exhaustFanInletVelocity;
		this.exhaustFanOutletVelocity = exhaustFanOutletVelocity;
		this.cleaningMethod = cleaningMethod;
		this.manualCleaningFrequency = manualCleaningFrequency;
		this.equipmentCleaningFrequency = equipmentCleaningFrequency;
		this.chemicalProductsPresentForCleaning = chemicalProductsPresentForCleaning;
		this.chemicalProducts = chemicalProducts;
		this.otherChemicalProducts = otherChemicalProducts;
		this.employeeNumberInSamplingArea = employeeNumberInSamplingArea;
		this.averageFootballEachHourSamplingArea = averageFootballEachHourSamplingArea;
		this.otherFootballEachHourSamplingArea = otherFootballEachHourSamplingArea;
		this.furnitureMaterialInSamplingArea = furnitureMaterialInSamplingArea;
		this.furnitureNumberInSamplingArea = furnitureNumberInSamplingArea;
		this.otherFurnitureNumberInSamplingArea = otherFurnitureNumberInSamplingArea;
		this.wallMaterialInSamplingArea = wallMaterialInSamplingArea;
		this.floorType = floorType;
		this.separateVentilationSystemMall = separateVentilationSystemMall;
		this.moistureOrDampPatchesMarks = moistureOrDampPatchesMarks;
		this.specifyMoistureOrDampPatchesMarks = specifyMoistureOrDampPatchesMarks;
		this.useOfScentedProducts = useOfScentedProducts;
		this.scentedProducts = scentedProducts;
		this.otherScentedProducts = otherScentedProducts;
		this.anySeperateTempHumidityControlSystem = anySeperateTempHumidityControlSystem;
		this.ifYesAnySeperateTempHumidityControlSystem = ifYesAnySeperateTempHumidityControlSystem;
		this.maintenanceFrequency = maintenanceFrequency;
		this.otherMaintenanceFrequency = otherMaintenanceFrequency;
		this.floorLevel = floorLevel;
		this.noOfWindowsNearSamplingLocation = noOfWindowsNearSamplingLocation;
		this.curtainsPresent = curtainsPresent;
		this.mallDistanceFromTrafficSource = mallDistanceFromTrafficSource;
		this.cafeteriaDistanceFromKitchen = cafeteriaDistanceFromKitchen;
		this.airPurifierUsed = airPurifierUsed;
		this.artificialPlantsPresentInMall = artificialPlantsPresentInMall;
		this.electronicsUsed = electronicsUsed;
		this.esclatorsOrLiftInMall = esclatorsOrLiftInMall;
		this.noOfEsclatorsInMall = noOfEsclatorsInMall;
		this.noOfLiftsInMall = noOfLiftsInMall;
		this.anyIndoorPlantsPresent = anyIndoorPlantsPresent;
		this.noOfIndoorPlantsPresent = noOfIndoorPlantsPresent;
		this.other_observation = other_observation;
	}

	public Malls() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Malls [buildingId=" + buildingId + ", locationId=" + locationId + ", participantId=" + participantId
				+ ", observerName=" + observerName + ", observationDate=" + observationDate + ", buildingAddress="
				+ buildingAddress + ", buildingAgeyears=" + buildingAgeyears + ", newRenovation=" + newRenovation
				+ ", mallTotalArea=" + mallTotalArea + ", occupantsTotal=" + occupantsTotal + ", numberOfShops="
				+ numberOfShops + ", foodCourtAndRestaurantsPresent=" + foodCourtAndRestaurantsPresent
				+ ", cookingFuel=" + cookingFuel + ", ventilationType=" + ventilationType + ", ventilationOfWholeMall="
				+ ventilationOfWholeMall + ", ductsMaintenance=" + ductsMaintenance + ", noOfVentsCategory="
				+ noOfVentsCategory + ", exhaustFanInletVelocity=" + exhaustFanInletVelocity
				+ ", exhaustFanOutletVelocity=" + exhaustFanOutletVelocity + ", cleaningMethod=" + cleaningMethod
				+ ", manualCleaningFrequency=" + manualCleaningFrequency + ", equipmentCleaningFrequency="
				+ equipmentCleaningFrequency + ", chemicalProductsPresentForCleaning="
				+ chemicalProductsPresentForCleaning + ", chemicalProducts=" + chemicalProducts
				+ ", otherChemicalProducts=" + otherChemicalProducts + ", employeeNumberInSamplingArea="
				+ employeeNumberInSamplingArea + ", averageFootballEachHourSamplingArea="
				+ averageFootballEachHourSamplingArea + ", otherFootballEachHourSamplingArea="
				+ otherFootballEachHourSamplingArea + ", furnitureMaterialInSamplingArea="
				+ furnitureMaterialInSamplingArea + ", furnitureNumberInSamplingArea=" + furnitureNumberInSamplingArea
				+ ", otherFurnitureNumberInSamplingArea=" + otherFurnitureNumberInSamplingArea
				+ ", wallMaterialInSamplingArea=" + wallMaterialInSamplingArea + ", floorType=" + floorType
				+ ", separateVentilationSystemMall=" + separateVentilationSystemMall + ", moistureOrDampPatchesMarks="
				+ moistureOrDampPatchesMarks + ", specifyMoistureOrDampPatchesMarks="
				+ specifyMoistureOrDampPatchesMarks + ", useOfScentedProducts=" + useOfScentedProducts
				+ ", scentedProducts=" + scentedProducts + ", otherScentedProducts=" + otherScentedProducts
				+ ", anySeperateTempHumidityControlSystem=" + anySeperateTempHumidityControlSystem
				+ ", ifYesAnySeperateTempHumidityControlSystem=" + ifYesAnySeperateTempHumidityControlSystem
				+ ", maintenanceFrequency=" + maintenanceFrequency + ", otherMaintenanceFrequency="
				+ otherMaintenanceFrequency + ", floorLevel=" + floorLevel + ", noOfWindowsNearSamplingLocation="
				+ noOfWindowsNearSamplingLocation + ", curtainsPresent=" + curtainsPresent
				+ ", mallDistanceFromTrafficSource=" + mallDistanceFromTrafficSource + ", cafeteriaDistanceFromKitchen="
				+ cafeteriaDistanceFromKitchen + ", airPurifierUsed=" + airPurifierUsed
				+ ", artificialPlantsPresentInMall=" + artificialPlantsPresentInMall + ", electronicsUsed="
				+ electronicsUsed + ", esclatorsOrLiftInMall=" + esclatorsOrLiftInMall + ", noOfEsclatorsInMall="
				+ noOfEsclatorsInMall + ", noOfLiftsInMall=" + noOfLiftsInMall + ", anyIndoorPlantsPresent="
				+ anyIndoorPlantsPresent + ", noOfIndoorPlantsPresent=" + noOfIndoorPlantsPresent
				+ ", other_observation=" + other_observation + ", getBuildingId()=" + getBuildingId()
				+ ", getLocationId()=" + getLocationId() + ", getParticipantId()=" + getParticipantId()
				+ ", getObserverName()=" + getObserverName() + ", getObservationDate()=" + getObservationDate()
				+ ", getBuildingAddress()=" + getBuildingAddress() + ", getBuildingAgeyears()=" + getBuildingAgeyears()
				+ ", getNewRenovation()=" + getNewRenovation() + ", getMallTotalArea()=" + getMallTotalArea()
				+ ", getOccupantsTotal()=" + getOccupantsTotal() + ", getNumberOfShops()=" + getNumberOfShops()
				+ ", getFoodCourtAndRestaurantsPresent()=" + getFoodCourtAndRestaurantsPresent() + ", getCookingFuel()="
				+ getCookingFuel() + ", getVentilationType()=" + getVentilationType() + ", getVentilationOfWholeMall()="
				+ getVentilationOfWholeMall() + ", getDuctsMaintenance()=" + getDuctsMaintenance()
				+ ", getNoOfVentsCategory()=" + getNoOfVentsCategory() + ", getExhaustFanInletVelocity()="
				+ getExhaustFanInletVelocity() + ", getExhaustFanOutletVelocity()=" + getExhaustFanOutletVelocity()
				+ ", getCleaningMethod()=" + getCleaningMethod() + ", getManualCleaningFrequency()="
				+ getManualCleaningFrequency() + ", getEquipmentCleaningFrequency()=" + getEquipmentCleaningFrequency()
				+ ", getChemicalProductsPresentForCleaning()=" + getChemicalProductsPresentForCleaning()
				+ ", getChemicalProducts()=" + getChemicalProducts() + ", getOtherChemicalProducts()="
				+ getOtherChemicalProducts() + ", getEmployeeNumberInSamplingArea()="
				+ getEmployeeNumberInSamplingArea() + ", getAverageFootballEachHourSamplingArea()="
				+ getAverageFootballEachHourSamplingArea() + ", getOtherFootballEachHourSamplingArea()="
				+ getOtherFootballEachHourSamplingArea() + ", getFurnitureMaterialInSamplingArea()="
				+ getFurnitureMaterialInSamplingArea() + ", getFurnitureNumberInSamplingArea()="
				+ getFurnitureNumberInSamplingArea() + ", getOtherFurnitureNumberInSamplingArea()="
				+ getOtherFurnitureNumberInSamplingArea() + ", getWallMaterialInSamplingArea()="
				+ getWallMaterialInSamplingArea() + ", getFloorType()=" + getFloorType()
				+ ", getSeparateVentilationSystemMall()=" + getSeparateVentilationSystemMall()
				+ ", getMoistureOrDampPatchesMarks()=" + getMoistureOrDampPatchesMarks()
				+ ", getSpecifyMoistureOrDampPatchesMarks()=" + getSpecifyMoistureOrDampPatchesMarks()
				+ ", getUseOfScentedProducts()=" + getUseOfScentedProducts() + ", getScentedProducts()="
				+ getScentedProducts() + ", getOtherScentedProducts()=" + getOtherScentedProducts()
				+ ", getAnySeperateTempHumidityControlSystem()=" + getAnySeperateTempHumidityControlSystem()
				+ ", getIfYesAnySeperateTempHumidityControlSystem()=" + getIfYesAnySeperateTempHumidityControlSystem()
				+ ", getMaintenanceFrequency()=" + getMaintenanceFrequency() + ", getOtherMaintenanceFrequency()="
				+ getOtherMaintenanceFrequency() + ", getFloorLevel()=" + getFloorLevel()
				+ ", getNoOfWindowsNearSamplingLocation()=" + getNoOfWindowsNearSamplingLocation()
				+ ", getCurtainsPresent()=" + getCurtainsPresent() + ", getMallDistanceFromTrafficSource()="
				+ getMallDistanceFromTrafficSource() + ", getCafeteriaDistanceFromKitchen()="
				+ getCafeteriaDistanceFromKitchen() + ", getAirPurifierUsed()=" + getAirPurifierUsed()
				+ ", getArtificialPlantsPresentInMall()=" + getArtificialPlantsPresentInMall()
				+ ", getElectronicsUsed()=" + getElectronicsUsed() + ", getEsclatorsOrLiftInMall()="
				+ getEsclatorsOrLiftInMall() + ", getNoOfEsclatorsInMall()=" + getNoOfEsclatorsInMall()
				+ ", getNoOfLiftsInMall()=" + getNoOfLiftsInMall() + ", getAnyIndoorPlantsPresent()="
				+ getAnyIndoorPlantsPresent() + ", getNoOfIndoorPlantsPresent()=" + getNoOfIndoorPlantsPresent()
				+ ", getOther_observation()=" + getOther_observation() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}

	
}

