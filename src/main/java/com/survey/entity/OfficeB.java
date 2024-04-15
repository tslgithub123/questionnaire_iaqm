package com.survey.entity;


import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "office_b")
public class OfficeB {

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

	    @Column(name = "office_type")
	    private String officeType;

	    @Column(name = "other_office_type")
	    private String otherOfficeType;
	    
	    @Column(name = "building_address")
	    private String buildingAddress;

	    @Column(name = "site_location")
	    private String siteLocation;
	    
	    @Column(name = "other_site_location")
	    private String otherSiteLocation;

	    @Column(name = "distance_from_areas")
	    private String distanceFromAreas;

	    @Column(name = "building_age_years")
	    private String buildingAgeYears;

	    @Column(name = "floor_level")
	    private String floorLevel;
	    
	    @Column(name = "other_floor_level")
	    private String otherFloorLevel;

	    @Column(name = "roof_condition")
	    private String roofCondition;
	    
	    @Column(name = "other_roof_condition")
	    private String otherRoofCondition;

	    @Column(name = "gaps_between_doors_windows")
	    private String gapsBetweenDoorsWindows;

	    @Column(name = "renovation_activities")
	    private String renovationActivities;

	    @Column(name = "renovation_time")
	    private String renovationTime;

	    @Column(name = "damp_marks")
	    private String dampMarks;

	    @Column(name = "carpets_present_on _floor")
	    private String carpetsPresentOnFloor;

	    @Column(name = "carpet_area")
	    private String carpetArea;

	    @Column(name = "total_area_office_building")
	    private String totalAreaOfficeBuilding;

	    @Column(name = "total_employees")
	    private String totalEmployees;

	    @Column(name = "totalAttendance")
	    private String totalAttendance;

	    @Column(name = "total_rooms")
	    private String totalRooms;

	    @Column(name = "canteen_present")
	    private String canteenPresent;

	    @Column(name = "cooking_fuel")
	    private String cookingFuel;
	    
	    @Column(name = "other_cooking_fuel")
	    private String otherCookingFuel;

	    @Column(name = "cooking_time")
	    private String cookingTime;

	    @Column(name = "ventilation_type")
	    private String ventilationType;
	    
	    @Column(name = "other_ventilation_type")
	    private String otherVentilationType;

	    @Column(name = "ventilation_type_in_office")
	    private String ventilationTypeInOffice;

	    @Column(name = "no_of_windows_category")
	    private String noOfWindowsCategory;

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

	    @Column(name = "chemical_based_cleaning")
	    private String chemicalBasedCleaning;

	    @Column(name = "chemical_products")
	    private String chemicalProducts;
	    
	    @Column(name = "other_chemical_products")
	    private String otherChemicalProducts;

	    @Column(name = "office_glue_used")
	    private String officeGlueUsed;

	    @Column(name = "office_printers_used")
	    private String officePrintersUsed;

	    @Column(name = "printer_types")
	    private String printerTypes;

	    @Column(name = "no_of_printers")
	    private String noOfPrinters;
	    
	    @Column(name = "other_no_of_printers")
	    private String otherNoOfPrinters;  
	    
	    @Column(name = "office_computers_used")
	    private String officeComputersUsed;

	    @Column(name = "computer_types")
	    private String computerTypes;

	    @Column(name = "no_of_systems")
	    private String noOfSystems;

	    @Column(name = "office_projector_used")
	    private String officeProjectorUsed;

	    @Column(name = "cabinetry_present")
	    private String cabinetryPresent;

	    @Column(name = "no_of_desk_chairs_category")
	    private String noOfDeskChairsCategory;

	    @Column(name = "furniture_material")
	    private String furnitureMaterial;
	    
	    @Column(name = "other_furniture_material")
	    private String otherFurnitureMaterial;

	    @Column(name = "wall_of_Office")
	    private String wallOfOffice;
	    
	    @Column(name = "other_wall_of_Office")
	    private String otherWallOfOffice;

	    @Column(name = "floor_type")
	    private String floorType;
	    
	    @Column(name = "other_floor_type")
	    private String otherFloorType;

	    @Column(name = "separate_ventilation_system")
	    private String separateVentilationSystem;

	    @Column(name = "moisture_or_damp_patches")
	    @JsonDeserialize(using = YesNoToBooleanDeserializer.class)
	    private boolean moistureOrDampPatches;

	    @Column(name = "molds_present")
	    @JsonDeserialize(using = YesNoToBooleanDeserializer.class)
	    private boolean moldsPresent;

	    @Column(name = "temp_humidity_control_system")
	    @JsonDeserialize(using = YesNoToBooleanDeserializer.class)
	    private boolean tempHumidityControlSystem;
	    
	    @Column(name = "lack_of_maintenance")
	    @JsonDeserialize(using = YesNoToBooleanDeserializer.class)
	    private boolean lackOfMaintenance;

	    @Column(name = "curtains_present")
	    @JsonDeserialize(using = YesNoToBooleanDeserializer.class)
	    private boolean curtainsPresent;

	    @Column(name = "any_air_purifier_present")
	    @JsonDeserialize(using = YesNoToBooleanDeserializer.class)
	    private boolean anyAirPurifierPresent;

	    @Column(name = "any_indoor_plant_present")
	    @JsonDeserialize(using = YesNoToBooleanDeserializer.class)
	    private boolean anyIndoorPlantPresent;
	    
	    @Column(name = "no_of_plants_present")
	    private String noOfPlantsPresent;
	    
	    @Column(name = "building_maintenance")
	    @JsonDeserialize(using = YesNoToBooleanDeserializer.class)
	    private boolean buildingMaintenance;
	    
	    @Column(name = "building_maintenance_if_yes")
	    private String buildingMaintenanceIfYes;
	    
	    @Column(name = "smoker_in_the_building")
	    private String smokerInTheBuilding;
	    
	    @Column(name = "any_other_activity")
	    private String anyOtherAcitivity;

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

		public String getOfficeType() {
			return officeType;
		}

		public void setOfficeType(String officeType) {
			this.officeType = officeType;
		}

		public String getOtherOfficeType() {
			return otherOfficeType;
		}

		public void setOtherOfficeType(String otherOfficeType) {
			this.otherOfficeType = otherOfficeType;
		}

		public String getBuildingAddress() {
			return buildingAddress;
		}

		public void setBuildingAddress(String buildingAddress) {
			this.buildingAddress = buildingAddress;
		}

		public String getSiteLocation() {
			return siteLocation;
		}

		public void setSiteLocation(String siteLocation) {
			this.siteLocation = siteLocation;
		}

		public String getOtherSiteLocation() {
			return otherSiteLocation;
		}

		public void setOtherSiteLocation(String otherSiteLocation) {
			this.otherSiteLocation = otherSiteLocation;
		}

		public String getDistanceFromAreas() {
			return distanceFromAreas;
		}

		public void setDistanceFromAreas(String distanceFromAreas) {
			this.distanceFromAreas = distanceFromAreas;
		}

		public String getBuildingAgeYears() {
			return buildingAgeYears;
		}

		public void setBuildingAgeYears(String buildingAgeYears) {
			this.buildingAgeYears = buildingAgeYears;
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

		public String getRoofCondition() {
			return roofCondition;
		}

		public void setRoofCondition(String roofCondition) {
			this.roofCondition = roofCondition;
		}

		public String getOtherRoofCondition() {
			return otherRoofCondition;
		}

		public void setOtherRoofCondition(String otherRoofCondition) {
			this.otherRoofCondition = otherRoofCondition;
		}

		public String getGapsBetweenDoorsWindows() {
			return gapsBetweenDoorsWindows;
		}

		public void setGapsBetweenDoorsWindows(String gapsBetweenDoorsWindows) {
			this.gapsBetweenDoorsWindows = gapsBetweenDoorsWindows;
		}

		public String getRenovationActivities() {
			return renovationActivities;
		}

		public void setRenovationActivities(String renovationActivities) {
			this.renovationActivities = renovationActivities;
		}

		public String getRenovationTime() {
			return renovationTime;
		}

		public void setRenovationTime(String renovationTime) {
			this.renovationTime = renovationTime;
		}

		public String getDampMarks() {
			return dampMarks;
		}

		public void setDampMarks(String dampMarks) {
			this.dampMarks = dampMarks;
		}

		public String getCarpetsPresentOnFloor() {
			return carpetsPresentOnFloor;
		}

		public void setCarpetsPresentOnFloor(String carpetsPresentOnFloor) {
			this.carpetsPresentOnFloor = carpetsPresentOnFloor;
		}

		public String getCarpetArea() {
			return carpetArea;
		}

		public void setCarpetArea(String carpetArea) {
			this.carpetArea = carpetArea;
		}

		public String getTotalAreaOfficeBuilding() {
			return totalAreaOfficeBuilding;
		}

		public void setTotalAreaOfficeBuilding(String totalAreaOfficeBuilding) {
			this.totalAreaOfficeBuilding = totalAreaOfficeBuilding;
		}

		public String getTotalEmployees() {
			return totalEmployees;
		}

		public void setTotalEmployees(String totalEmployees) {
			this.totalEmployees = totalEmployees;
		}

		public String getTotalAttendance() {
			return totalAttendance;
		}

		public void setTotalAttendance(String totalAttendance) {
			this.totalAttendance = totalAttendance;
		}

		public String getTotalRooms() {
			return totalRooms;
		}

		public void setTotalRooms(String totalRooms) {
			this.totalRooms = totalRooms;
		}

		public String getCanteenPresent() {
			return canteenPresent;
		}

		public void setCanteenPresent(String canteenPresent) {
			this.canteenPresent = canteenPresent;
		}

		public String getCookingFuel() {
			return cookingFuel;
		}

		public void setCookingFuel(String cookingFuel) {
			this.cookingFuel = cookingFuel;
		}

		public String getOtherCookingFuel() {
			return otherCookingFuel;
		}

		public void setOtherCookingFuel(String otherCookingFuel) {
			this.otherCookingFuel = otherCookingFuel;
		}

		public String getCookingTime() {
			return cookingTime;
		}

		public void setCookingTime(String cookingTime) {
			this.cookingTime = cookingTime;
		}

		public String getVentilationType() {
			return ventilationType;
		}

		public void setVentilationType(String ventilationType) {
			this.ventilationType = ventilationType;
		}

		public String getOtherVentilationType() {
			return otherVentilationType;
		}

		public void setOtherVentilationType(String otherVentilationType) {
			this.otherVentilationType = otherVentilationType;
		}

		public String getVentilationTypeInOffice() {
			return ventilationTypeInOffice;
		}

		public void setVentilationTypeInOffice(String ventilationTypeInOffice) {
			this.ventilationTypeInOffice = ventilationTypeInOffice;
		}

		public String getNoOfWindowsCategory() {
			return noOfWindowsCategory;
		}

		public void setNoOfWindowsCategory(String noOfWindowsCategory) {
			this.noOfWindowsCategory = noOfWindowsCategory;
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

		public String getChemicalBasedCleaning() {
			return chemicalBasedCleaning;
		}

		public void setChemicalBasedCleaning(String chemicalBasedCleaning) {
			this.chemicalBasedCleaning = chemicalBasedCleaning;
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

		public String getOfficeGlueUsed() {
			return officeGlueUsed;
		}

		public void setOfficeGlueUsed(String officeGlueUsed) {
			this.officeGlueUsed = officeGlueUsed;
		}

		public String getOfficePrintersUsed() {
			return officePrintersUsed;
		}

		public void setOfficePrintersUsed(String officePrintersUsed) {
			this.officePrintersUsed = officePrintersUsed;
		}

		public String getPrinterTypes() {
			return printerTypes;
		}

		public void setPrinterTypes(String printerTypes) {
			this.printerTypes = printerTypes;
		}

		public String getNoOfPrinters() {
			return noOfPrinters;
		}

		public void setNoOfPrinters(String noOfPrinters) {
			this.noOfPrinters = noOfPrinters;
		}

		public String getOtherNoOfPrinters() {
			return otherNoOfPrinters;
		}

		public void setOtherNoOfPrinters(String otherNoOfPrinters) {
			this.otherNoOfPrinters = otherNoOfPrinters;
		}

		public String getOfficeComputersUsed() {
			return officeComputersUsed;
		}

		public void setOfficeComputersUsed(String officeComputersUsed) {
			this.officeComputersUsed = officeComputersUsed;
		}

		public String getComputerTypes() {
			return computerTypes;
		}

		public void setComputerTypes(String computerTypes) {
			this.computerTypes = computerTypes;
		}

		public String getNoOfSystems() {
			return noOfSystems;
		}

		public void setNoOfSystems(String noOfSystems) {
			this.noOfSystems = noOfSystems;
		}

		public String getOfficeProjectorUsed() {
			return officeProjectorUsed;
		}

		public void setOfficeProjectorUsed(String officeProjectorUsed) {
			this.officeProjectorUsed = officeProjectorUsed;
		}

		public String getCabinetryPresent() {
			return cabinetryPresent;
		}

		public void setCabinetryPresent(String cabinetryPresent) {
			this.cabinetryPresent = cabinetryPresent;
		}

		public String getNoOfDeskChairsCategory() {
			return noOfDeskChairsCategory;
		}

		public void setNoOfDeskChairsCategory(String noOfDeskChairsCategory) {
			this.noOfDeskChairsCategory = noOfDeskChairsCategory;
		}

		public String getFurnitureMaterial() {
			return furnitureMaterial;
		}

		public void setFurnitureMaterial(String furnitureMaterial) {
			this.furnitureMaterial = furnitureMaterial;
		}

		public String getOtherFurnitureMaterial() {
			return otherFurnitureMaterial;
		}

		public void setOtherFurnitureMaterial(String otherFurnitureMaterial) {
			this.otherFurnitureMaterial = otherFurnitureMaterial;
		}

		public String getWallOfOffice() {
			return wallOfOffice;
		}

		public void setWallOfOffice(String wallOfOffice) {
			this.wallOfOffice = wallOfOffice;
		}

		public String getOtherWallOfOffice() {
			return otherWallOfOffice;
		}

		public void setOtherWallOfOffice(String otherWallOfOffice) {
			this.otherWallOfOffice = otherWallOfOffice;
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

		public String getSeparateVentilationSystem() {
			return separateVentilationSystem;
		}

		public void setSeparateVentilationSystem(String separateVentilationSystem) {
			this.separateVentilationSystem = separateVentilationSystem;
		}

		public boolean isMoistureOrDampPatches() {
			return moistureOrDampPatches;
		}

		public void setMoistureOrDampPatches(boolean moistureOrDampPatches) {
			this.moistureOrDampPatches = moistureOrDampPatches;
		}

		public boolean isMoldsPresent() {
			return moldsPresent;
		}

		public void setMoldsPresent(boolean moldsPresent) {
			this.moldsPresent = moldsPresent;
		}

		public boolean isTempHumidityControlSystem() {
			return tempHumidityControlSystem;
		}

		public void setTempHumidityControlSystem(boolean tempHumidityControlSystem) {
			this.tempHumidityControlSystem = tempHumidityControlSystem;
		}

		public boolean isLackOfMaintenance() {
			return lackOfMaintenance;
		}

		public void setLackOfMaintenance(boolean lackOfMaintenance) {
			this.lackOfMaintenance = lackOfMaintenance;
		}

		public boolean isCurtainsPresent() {
			return curtainsPresent;
		}

		public void setCurtainsPresent(boolean curtainsPresent) {
			this.curtainsPresent = curtainsPresent;
		}

		public boolean isAnyAirPurifierPresent() {
			return anyAirPurifierPresent;
		}

		public void setAnyAirPurifierPresent(boolean anyAirPurifierPresent) {
			this.anyAirPurifierPresent = anyAirPurifierPresent;
		}

		public boolean isAnyIndoorPlantPresent() {
			return anyIndoorPlantPresent;
		}

		public void setAnyIndoorPlantPresent(boolean anyIndoorPlantPresent) {
			this.anyIndoorPlantPresent = anyIndoorPlantPresent;
		}

		public String getNoOfPlantsPresent() {
			return noOfPlantsPresent;
		}

		public void setNoOfPlantsPresent(String noOfPlantsPresent) {
			this.noOfPlantsPresent = noOfPlantsPresent;
		}

		public boolean isBuildingMaintenance() {
			return buildingMaintenance;
		}

		public void setBuildingMaintenance(boolean buildingMaintenance) {
			this.buildingMaintenance = buildingMaintenance;
		}

		public String getBuildingMaintenanceIfYes() {
			return buildingMaintenanceIfYes;
		}

		public void setBuildingMaintenanceIfYes(String buildingMaintenanceIfYes) {
			this.buildingMaintenanceIfYes = buildingMaintenanceIfYes;
		}

		public String getSmokerInTheBuilding() {
			return smokerInTheBuilding;
		}

		public void setSmokerInTheBuilding(String smokerInTheBuilding) {
			this.smokerInTheBuilding = smokerInTheBuilding;
		}

		public String getAnyOtherAcitivity() {
			return anyOtherAcitivity;
		}

		public void setAnyOtherAcitivity(String anyOtherAcitivity) {
			this.anyOtherAcitivity = anyOtherAcitivity;
		}

		public OfficeB(Long buildingId, String locationId, String participantId, String observerName,
				String observationDate, String officeType, String otherOfficeType, String buildingAddress,
				String siteLocation, String otherSiteLocation, String distanceFromAreas, String buildingAgeYears,
				String floorLevel, String otherFloorLevel, String roofCondition, String otherRoofCondition,
				String gapsBetweenDoorsWindows, String renovationActivities, String renovationTime, String dampMarks,
				String carpetsPresentOnFloor, String carpetArea, String totalAreaOfficeBuilding, String totalEmployees,
				String totalAttendance, String totalRooms, String canteenPresent, String cookingFuel,
				String otherCookingFuel, String cookingTime, String ventilationType, String otherVentilationType,
				String ventilationTypeInOffice, String noOfWindowsCategory, String ductsMaintenance,
				String noOfVentsCategory, Integer exhaustFanInletVelocity, Integer exhaustFanOutletVelocity,
				String cleaningMethod, String manualCleaningFrequency, String equipmentCleaningFrequency,
				String chemicalBasedCleaning, String chemicalProducts, String otherChemicalProducts,
				String officeGlueUsed, String officePrintersUsed, String printerTypes, String noOfPrinters,
				String otherNoOfPrinters, String officeComputersUsed, String computerTypes, String noOfSystems,
				String officeProjectorUsed, String cabinetryPresent, String noOfDeskChairsCategory,
				String furnitureMaterial, String otherFurnitureMaterial, String wallOfOffice, String otherWallOfOffice,
				String floorType, String otherFloorType, String separateVentilationSystem,
				boolean moistureOrDampPatches, boolean moldsPresent, boolean tempHumidityControlSystem,
				boolean lackOfMaintenance, boolean curtainsPresent, boolean anyAirPurifierPresent,
				boolean anyIndoorPlantPresent, String noOfPlantsPresent, boolean buildingMaintenance,
				String buildingMaintenanceIfYes, String smokerInTheBuilding, String anyOtherAcitivity) {
			super();
			this.buildingId = buildingId;
			this.locationId = locationId;
			this.participantId = participantId;
			this.observerName = observerName;
			this.observationDate = observationDate;
			this.officeType = officeType;
			this.otherOfficeType = otherOfficeType;
			this.buildingAddress = buildingAddress;
			this.siteLocation = siteLocation;
			this.otherSiteLocation = otherSiteLocation;
			this.distanceFromAreas = distanceFromAreas;
			this.buildingAgeYears = buildingAgeYears;
			this.floorLevel = floorLevel;
			this.otherFloorLevel = otherFloorLevel;
			this.roofCondition = roofCondition;
			this.otherRoofCondition = otherRoofCondition;
			this.gapsBetweenDoorsWindows = gapsBetweenDoorsWindows;
			this.renovationActivities = renovationActivities;
			this.renovationTime = renovationTime;
			this.dampMarks = dampMarks;
			this.carpetsPresentOnFloor = carpetsPresentOnFloor;
			this.carpetArea = carpetArea;
			this.totalAreaOfficeBuilding = totalAreaOfficeBuilding;
			this.totalEmployees = totalEmployees;
			this.totalAttendance = totalAttendance;
			this.totalRooms = totalRooms;
			this.canteenPresent = canteenPresent;
			this.cookingFuel = cookingFuel;
			this.otherCookingFuel = otherCookingFuel;
			this.cookingTime = cookingTime;
			this.ventilationType = ventilationType;
			this.otherVentilationType = otherVentilationType;
			this.ventilationTypeInOffice = ventilationTypeInOffice;
			this.noOfWindowsCategory = noOfWindowsCategory;
			this.ductsMaintenance = ductsMaintenance;
			this.noOfVentsCategory = noOfVentsCategory;
			this.exhaustFanInletVelocity = exhaustFanInletVelocity;
			this.exhaustFanOutletVelocity = exhaustFanOutletVelocity;
			this.cleaningMethod = cleaningMethod;
			this.manualCleaningFrequency = manualCleaningFrequency;
			this.equipmentCleaningFrequency = equipmentCleaningFrequency;
			this.chemicalBasedCleaning = chemicalBasedCleaning;
			this.chemicalProducts = chemicalProducts;
			this.otherChemicalProducts = otherChemicalProducts;
			this.officeGlueUsed = officeGlueUsed;
			this.officePrintersUsed = officePrintersUsed;
			this.printerTypes = printerTypes;
			this.noOfPrinters = noOfPrinters;
			this.otherNoOfPrinters = otherNoOfPrinters;
			this.officeComputersUsed = officeComputersUsed;
			this.computerTypes = computerTypes;
			this.noOfSystems = noOfSystems;
			this.officeProjectorUsed = officeProjectorUsed;
			this.cabinetryPresent = cabinetryPresent;
			this.noOfDeskChairsCategory = noOfDeskChairsCategory;
			this.furnitureMaterial = furnitureMaterial;
			this.otherFurnitureMaterial = otherFurnitureMaterial;
			this.wallOfOffice = wallOfOffice;
			this.otherWallOfOffice = otherWallOfOffice;
			this.floorType = floorType;
			this.otherFloorType = otherFloorType;
			this.separateVentilationSystem = separateVentilationSystem;
			this.moistureOrDampPatches = moistureOrDampPatches;
			this.moldsPresent = moldsPresent;
			this.tempHumidityControlSystem = tempHumidityControlSystem;
			this.lackOfMaintenance = lackOfMaintenance;
			this.curtainsPresent = curtainsPresent;
			this.anyAirPurifierPresent = anyAirPurifierPresent;
			this.anyIndoorPlantPresent = anyIndoorPlantPresent;
			this.noOfPlantsPresent = noOfPlantsPresent;
			this.buildingMaintenance = buildingMaintenance;
			this.buildingMaintenanceIfYes = buildingMaintenanceIfYes;
			this.smokerInTheBuilding = smokerInTheBuilding;
			this.anyOtherAcitivity = anyOtherAcitivity;
		}

		public OfficeB() {
			super();
			// TODO Auto-generated constructor stub
		}

		@Override
		public String toString() {
			return "OfficeB [buildingId=" + buildingId + ", locationId=" + locationId + ", participantId="
					+ participantId + ", observerName=" + observerName + ", observationDate=" + observationDate
					+ ", officeType=" + officeType + ", otherOfficeType=" + otherOfficeType + ", buildingAddress="
					+ buildingAddress + ", siteLocation=" + siteLocation + ", otherSiteLocation=" + otherSiteLocation
					+ ", distanceFromAreas=" + distanceFromAreas + ", buildingAgeYears=" + buildingAgeYears
					+ ", floorLevel=" + floorLevel + ", otherFloorLevel=" + otherFloorLevel + ", roofCondition="
					+ roofCondition + ", otherRoofCondition=" + otherRoofCondition + ", gapsBetweenDoorsWindows="
					+ gapsBetweenDoorsWindows + ", renovationActivities=" + renovationActivities + ", renovationTime="
					+ renovationTime + ", dampMarks=" + dampMarks + ", carpetsPresentOnFloor=" + carpetsPresentOnFloor
					+ ", carpetArea=" + carpetArea + ", totalAreaOfficeBuilding=" + totalAreaOfficeBuilding
					+ ", totalEmployees=" + totalEmployees + ", totalAttendance=" + totalAttendance + ", totalRooms="
					+ totalRooms + ", canteenPresent=" + canteenPresent + ", cookingFuel=" + cookingFuel
					+ ", otherCookingFuel=" + otherCookingFuel + ", cookingTime=" + cookingTime + ", ventilationType="
					+ ventilationType + ", otherVentilationType=" + otherVentilationType + ", ventilationTypeInOffice="
					+ ventilationTypeInOffice + ", noOfWindowsCategory=" + noOfWindowsCategory + ", ductsMaintenance="
					+ ductsMaintenance + ", noOfVentsCategory=" + noOfVentsCategory + ", exhaustFanInletVelocity="
					+ exhaustFanInletVelocity + ", exhaustFanOutletVelocity=" + exhaustFanOutletVelocity
					+ ", cleaningMethod=" + cleaningMethod + ", manualCleaningFrequency=" + manualCleaningFrequency
					+ ", equipmentCleaningFrequency=" + equipmentCleaningFrequency + ", chemicalBasedCleaning="
					+ chemicalBasedCleaning + ", chemicalProducts=" + chemicalProducts + ", otherChemicalProducts="
					+ otherChemicalProducts + ", officeGlueUsed=" + officeGlueUsed + ", officePrintersUsed="
					+ officePrintersUsed + ", printerTypes=" + printerTypes + ", noOfPrinters=" + noOfPrinters
					+ ", otherNoOfPrinters=" + otherNoOfPrinters + ", officeComputersUsed=" + officeComputersUsed
					+ ", computerTypes=" + computerTypes + ", noOfSystems=" + noOfSystems + ", officeProjectorUsed="
					+ officeProjectorUsed + ", cabinetryPresent=" + cabinetryPresent + ", noOfDeskChairsCategory="
					+ noOfDeskChairsCategory + ", furnitureMaterial=" + furnitureMaterial + ", otherFurnitureMaterial="
					+ otherFurnitureMaterial + ", wallOfOffice=" + wallOfOffice + ", otherWallOfOffice="
					+ otherWallOfOffice + ", floorType=" + floorType + ", otherFloorType=" + otherFloorType
					+ ", separateVentilationSystem=" + separateVentilationSystem + ", moistureOrDampPatches="
					+ moistureOrDampPatches + ", moldsPresent=" + moldsPresent + ", tempHumidityControlSystem="
					+ tempHumidityControlSystem + ", lackOfMaintenance=" + lackOfMaintenance + ", curtainsPresent="
					+ curtainsPresent + ", anyAirPurifierPresent=" + anyAirPurifierPresent + ", anyIndoorPlantPresent="
					+ anyIndoorPlantPresent + ", noOfPlantsPresent=" + noOfPlantsPresent + ", buildingMaintenance="
					+ buildingMaintenance + ", buildingMaintenanceIfYes=" + buildingMaintenanceIfYes
					+ ", smokerInTheBuilding=" + smokerInTheBuilding + ", anyOtherAcitivity=" + anyOtherAcitivity
					+ ", getBuildingId()=" + getBuildingId() + ", getLocationId()=" + getLocationId()
					+ ", getParticipantId()=" + getParticipantId() + ", getObserverName()=" + getObserverName()
					+ ", getObservationDate()=" + getObservationDate() + ", getOfficeType()=" + getOfficeType()
					+ ", getOtherOfficeType()=" + getOtherOfficeType() + ", getBuildingAddress()="
					+ getBuildingAddress() + ", getSiteLocation()=" + getSiteLocation() + ", getOtherSiteLocation()="
					+ getOtherSiteLocation() + ", getDistanceFromAreas()=" + getDistanceFromAreas()
					+ ", getBuildingAgeYears()=" + getBuildingAgeYears() + ", getFloorLevel()=" + getFloorLevel()
					+ ", getOtherFloorLevel()=" + getOtherFloorLevel() + ", getRoofCondition()=" + getRoofCondition()
					+ ", getOtherRoofCondition()=" + getOtherRoofCondition() + ", getGapsBetweenDoorsWindows()="
					+ getGapsBetweenDoorsWindows() + ", getRenovationActivities()=" + getRenovationActivities()
					+ ", getRenovationTime()=" + getRenovationTime() + ", getDampMarks()=" + getDampMarks()
					+ ", getCarpetsPresentOnFloor()=" + getCarpetsPresentOnFloor() + ", getCarpetArea()="
					+ getCarpetArea() + ", getTotalAreaOfficeBuilding()=" + getTotalAreaOfficeBuilding()
					+ ", getTotalEmployees()=" + getTotalEmployees() + ", getTotalAttendance()=" + getTotalAttendance()
					+ ", getTotalRooms()=" + getTotalRooms() + ", getCanteenPresent()=" + getCanteenPresent()
					+ ", getCookingFuel()=" + getCookingFuel() + ", getOtherCookingFuel()=" + getOtherCookingFuel()
					+ ", getCookingTime()=" + getCookingTime() + ", getVentilationType()=" + getVentilationType()
					+ ", getOtherVentilationType()=" + getOtherVentilationType() + ", getVentilationTypeInOffice()="
					+ getVentilationTypeInOffice() + ", getNoOfWindowsCategory()=" + getNoOfWindowsCategory()
					+ ", getDuctsMaintenance()=" + getDuctsMaintenance() + ", getNoOfVentsCategory()="
					+ getNoOfVentsCategory() + ", getExhaustFanInletVelocity()=" + getExhaustFanInletVelocity()
					+ ", getExhaustFanOutletVelocity()=" + getExhaustFanOutletVelocity() + ", getCleaningMethod()="
					+ getCleaningMethod() + ", getManualCleaningFrequency()=" + getManualCleaningFrequency()
					+ ", getEquipmentCleaningFrequency()=" + getEquipmentCleaningFrequency()
					+ ", getChemicalBasedCleaning()=" + getChemicalBasedCleaning() + ", getChemicalProducts()="
					+ getChemicalProducts() + ", getOtherChemicalProducts()=" + getOtherChemicalProducts()
					+ ", getOfficeGlueUsed()=" + getOfficeGlueUsed() + ", getOfficePrintersUsed()="
					+ getOfficePrintersUsed() + ", getPrinterTypes()=" + getPrinterTypes() + ", getNoOfPrinters()="
					+ getNoOfPrinters() + ", getOtherNoOfPrinters()=" + getOtherNoOfPrinters()
					+ ", getOfficeComputersUsed()=" + getOfficeComputersUsed() + ", getComputerTypes()="
					+ getComputerTypes() + ", getNoOfSystems()=" + getNoOfSystems() + ", getOfficeProjectorUsed()="
					+ getOfficeProjectorUsed() + ", getCabinetryPresent()=" + getCabinetryPresent()
					+ ", getNoOfDeskChairsCategory()=" + getNoOfDeskChairsCategory() + ", getFurnitureMaterial()="
					+ getFurnitureMaterial() + ", getOtherFurnitureMaterial()=" + getOtherFurnitureMaterial()
					+ ", getWallOfOffice()=" + getWallOfOffice() + ", getOtherWallOfOffice()=" + getOtherWallOfOffice()
					+ ", getFloorType()=" + getFloorType() + ", getOtherFloorType()=" + getOtherFloorType()
					+ ", getSeparateVentilationSystem()=" + getSeparateVentilationSystem()
					+ ", isMoistureOrDampPatches()=" + isMoistureOrDampPatches() + ", isMoldsPresent()="
					+ isMoldsPresent() + ", isTempHumidityControlSystem()=" + isTempHumidityControlSystem()
					+ ", isLackOfMaintenance()=" + isLackOfMaintenance() + ", isCurtainsPresent()="
					+ isCurtainsPresent() + ", isAnyAirPurifierPresent()=" + isAnyAirPurifierPresent()
					+ ", isAnyIndoorPlantPresent()=" + isAnyIndoorPlantPresent() + ", getNoOfPlantsPresent()="
					+ getNoOfPlantsPresent() + ", isBuildingMaintenance()=" + isBuildingMaintenance()
					+ ", getBuildingMaintenanceIfYes()=" + getBuildingMaintenanceIfYes() + ", getSmokerInTheBuilding()="
					+ getSmokerInTheBuilding() + ", getAnyOtherAcitivity()=" + getAnyOtherAcitivity() + ", getClass()="
					+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
		}

		
}

