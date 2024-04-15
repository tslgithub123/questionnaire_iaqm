package com.survey.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.Date;

@Entity
@Table(name = "school")
public class AirQualityData {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "observation_id")
    private Long observationId;
    
    @Column(name = "location_id")
    private String locationId;
    
    @Column(name = "participant_id")
    private String participantId;
    
    @Column(name = "observer_name")
    private String observerName;

    @Column(name = "observation_date")
    private Date observationDate;

    @Column(name = "school_address")
    private String schoolAddress;

    @Column(name = "building_age")
    private String buildingAgeCategory;

    @Column(name = "school_total_area")
    private String schoolTotalAreaCategory;

    @Column(name = "total_student")
    private String totalStudentsCategory;

    @Column(name = "average_students_present")
    private String averageStudentsPresent;


    @Column(name = "total_staff")
    private String totalStaffCategory;

    @Column(name = "average_staff_present")
    private String averageStaffPresent;

    @Column(name = "total_classrooms")
    private String totalClassroomsCategory;

    @Column(name = "computer_labs")
    private String computerLabsCategory;

    @Column(name = "chemistry_labs")
    private String chemistryLabsCategory;

    @Column(name = "biology_labs")
    private String biologyLabsCategory;

    @Column(name = "physics_labs")
    private String physicsLabsCategory;

    @Column(name = "sports_room")
    private String sportsRoomCategory;

    @Column(name = "canteen")
    private String canteen;

    @Column(name = "canteen_cooking_fuel")
    private String canteenCookingFuel;

    @Column(name = "canteen_cooking_time")
    private String canteenCookingTimeCategory;

    @Column(name = "canteen_ventilation_type")
    private String canteenVentilationType;

    @Column(name = "school_ventilation_type")
    private String schoolVentilationType;

    @Column(name = "school_windows")
    private Integer schoolWindowsCategory;

    @Column(name = "hvac_ducts_maintenance")
    private String hvacDuctsMaintenance;

    @Column(name = "hvac_no_of_vents")
    private String hvacNoOfVentsCategory;

    @Column(name = "exhaust_fan_air_velocities_inlet")
    private String exhaustFanAirVelocitiesInlet;

    @Column(name = "exhaust_fan_air_velocities_outlet")
    private String exhaustFanAirVelocitiesOutlet;

    @Column(name = "cleaning_activities_method")
    private String cleaningActivitiesMethod;

    @Column(name = "cleaning_activities_times_manually")
    private String cleaningActivitiesTimesManually;

    @Column(name = "cleaning_activities_times_equipment")
    private String cleaningActivitiesTimesEquipment;

    @Column(name = "chemical_based_cleaning_products")
    private String chemicalBasedCleaningProducts;

    @Column(name = "cleaning_product_type")
    private String cleaningProductType;

    @Column(name = "teaching_material_used")
    private String teachingMaterialUsed;

    @Column(name = "classroom_area")
    private String classroomAreaCategory;

    @Column(name = "classroom_student_count")
    private String classroomStudentCountCategory;

    @Column(name = "classroom_tables_chairs_count")
    private String classroomTablesChairsCountCategory;

    @Column(name = "classroom_benches_count")
    private String classroomBenchesCountCategory;

    @Column(name = "classroom_furniture_material")
    private String classroomFurnitureMaterial;

    @Column(name = "classroom_wall_material")
    private String classroomWallMaterial;

    @Column(name = "classroom_floor_type")
    private String classroomFloorType;

    @Column(name = "classroom_blackboard_types")
    private String classroomBlackboardTypes;

    @Column(name = "classroom_teaching_material")
    private String classroomTeachingMaterial;

    @Column(name = "classroom_activities")
    private String classroomActivities;

    @Column(name = "classroom_ventilation_control")
    private String classroomVentilationControl;

    @Column(name = "classroom_moisture_dampness")
    private String classroomMoistureDampness;

    @Column(name = "classroom_temp_humidity_control")
    private String classroomTempHumidityControl;

    @Column(name = "classroom_maintenance_issues")
    private String classroomMaintenanceIssues;

    @Column(name = "classroom_location_floor_level")
    private Integer classroomLocationFloorLevel;

    @Column(name = "classroom_window_count")
    private Integer classroomWindowCount;

    @Column(name = "classroom_curtains_present")
    private String classroomCurtainsPresent;

    @Column(name = "classroom_lunch_break_students_present")
    private Integer classroomLunchBreakStudentsPresent;

    @Column(name = "classroom_distance_from_traffic_source")
    private String classroomDistanceFromTrafficSourceCategory;

    @Column(name = "classroom_air_purifiers_used")
    private String classroomAirPurifiersUsed;

    @Column(name = "classroom_indoor_plants_present")
    private String classroomIndoorPlantsPresent;

    @Column(name = "classroom_indoor_plants_count")
    private String classroomIndoorPlantsCountCategory;

    @Column(name = "classroom_playground_distance")
    private String classroomPlaygroundDistanceCategory;

    @Column(name = "other_activities_observed")
    private String otherActivitiesObserved;

	public Long getObservationId() {
		return observationId;
	}

	public void setObservationId(Long observationId) {
		this.observationId = observationId;
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

	public Date getObservationDate() {
		return observationDate;
	}

	public void setObservationDate(Date observationDate) {
		this.observationDate = observationDate;
	}

	public String getSchoolAddress() {
		return schoolAddress;
	}

	public void setSchoolAddress(String schoolAddress) {
		this.schoolAddress = schoolAddress;
	}

	public String getBuildingAgeCategory() {
		return buildingAgeCategory;
	}

	public void setBuildingAgeCategory(String buildingAgeCategory) {
		this.buildingAgeCategory = buildingAgeCategory;
	}

	public String getSchoolTotalAreaCategory() {
		return schoolTotalAreaCategory;
	}

	public void setSchoolTotalAreaCategory(String schoolTotalAreaCategory) {
		this.schoolTotalAreaCategory = schoolTotalAreaCategory;
	}

	public String getTotalStudentsCategory() {
		return totalStudentsCategory;
	}

	public void setTotalStudentsCategory(String totalStudentsCategory) {
		this.totalStudentsCategory = totalStudentsCategory;
	}

	public String getAverageStudentsPresent() {
		return averageStudentsPresent;
	}

	public void setAverageStudentsPresent(String averageStudentsPresent) {
		this.averageStudentsPresent = averageStudentsPresent;
	}

	public String getTotalStaffCategory() {
		return totalStaffCategory;
	}

	public void setTotalStaffCategory(String totalStaffCategory) {
		this.totalStaffCategory = totalStaffCategory;
	}

	public String getAverageStaffPresent() {
		return averageStaffPresent;
	}

	public void setAverageStaffPresent(String averageStaffPresent) {
		this.averageStaffPresent = averageStaffPresent;
	}

	public String getTotalClassroomsCategory() {
		return totalClassroomsCategory;
	}

	public void setTotalClassroomsCategory(String totalClassroomsCategory) {
		this.totalClassroomsCategory = totalClassroomsCategory;
	}

	public String getComputerLabsCategory() {
		return computerLabsCategory;
	}

	public void setComputerLabsCategory(String computerLabsCategory) {
		this.computerLabsCategory = computerLabsCategory;
	}

	public String getChemistryLabsCategory() {
		return chemistryLabsCategory;
	}

	public void setChemistryLabsCategory(String chemistryLabsCategory) {
		this.chemistryLabsCategory = chemistryLabsCategory;
	}

	public String getBiologyLabsCategory() {
		return biologyLabsCategory;
	}

	public void setBiologyLabsCategory(String biologyLabsCategory) {
		this.biologyLabsCategory = biologyLabsCategory;
	}

	public String getPhysicsLabsCategory() {
		return physicsLabsCategory;
	}

	public void setPhysicsLabsCategory(String physicsLabsCategory) {
		this.physicsLabsCategory = physicsLabsCategory;
	}

	public String getSportsRoomCategory() {
		return sportsRoomCategory;
	}

	public void setSportsRoomCategory(String sportsRoomCategory) {
		this.sportsRoomCategory = sportsRoomCategory;
	}

	public String getCanteen() {
		return canteen;
	}

	public void setCanteen(String canteen) {
		this.canteen = canteen;
	}

	public String getCanteenCookingFuel() {
		return canteenCookingFuel;
	}

	public void setCanteenCookingFuel(String canteenCookingFuel) {
		this.canteenCookingFuel = canteenCookingFuel;
	}

	public String getCanteenCookingTimeCategory() {
		return canteenCookingTimeCategory;
	}

	public void setCanteenCookingTimeCategory(String canteenCookingTimeCategory) {
		this.canteenCookingTimeCategory = canteenCookingTimeCategory;
	}

	public String getCanteenVentilationType() {
		return canteenVentilationType;
	}

	public void setCanteenVentilationType(String canteenVentilationType) {
		this.canteenVentilationType = canteenVentilationType;
	}

	public String getSchoolVentilationType() {
		return schoolVentilationType;
	}

	public void setSchoolVentilationType(String schoolVentilationType) {
		this.schoolVentilationType = schoolVentilationType;
	}

	public Integer getSchoolWindowsCategory() {
		return schoolWindowsCategory;
	}

	public void setSchoolWindowsCategory(Integer schoolWindowsCategory) {
		this.schoolWindowsCategory = schoolWindowsCategory;
	}

	public String getHvacDuctsMaintenance() {
		return hvacDuctsMaintenance;
	}

	public void setHvacDuctsMaintenance(String hvacDuctsMaintenance) {
		this.hvacDuctsMaintenance = hvacDuctsMaintenance;
	}

	public String getHvacNoOfVentsCategory() {
		return hvacNoOfVentsCategory;
	}

	public void setHvacNoOfVentsCategory(String hvacNoOfVentsCategory) {
		this.hvacNoOfVentsCategory = hvacNoOfVentsCategory;
	}

	public String getExhaustFanAirVelocitiesInlet() {
		return exhaustFanAirVelocitiesInlet;
	}

	public void setExhaustFanAirVelocitiesInlet(String exhaustFanAirVelocitiesInlet) {
		this.exhaustFanAirVelocitiesInlet = exhaustFanAirVelocitiesInlet;
	}

	public String getExhaustFanAirVelocitiesOutlet() {
		return exhaustFanAirVelocitiesOutlet;
	}

	public void setExhaustFanAirVelocitiesOutlet(String exhaustFanAirVelocitiesOutlet) {
		this.exhaustFanAirVelocitiesOutlet = exhaustFanAirVelocitiesOutlet;
	}

	public String getCleaningActivitiesMethod() {
		return cleaningActivitiesMethod;
	}

	public void setCleaningActivitiesMethod(String cleaningActivitiesMethod) {
		this.cleaningActivitiesMethod = cleaningActivitiesMethod;
	}

	public String getCleaningActivitiesTimesManually() {
		return cleaningActivitiesTimesManually;
	}

	public void setCleaningActivitiesTimesManually(String cleaningActivitiesTimesManually) {
		this.cleaningActivitiesTimesManually = cleaningActivitiesTimesManually;
	}

	public String getCleaningActivitiesTimesEquipment() {
		return cleaningActivitiesTimesEquipment;
	}

	public void setCleaningActivitiesTimesEquipment(String cleaningActivitiesTimesEquipment) {
		this.cleaningActivitiesTimesEquipment = cleaningActivitiesTimesEquipment;
	}

	public String getChemicalBasedCleaningProducts() {
		return chemicalBasedCleaningProducts;
	}

	public void setChemicalBasedCleaningProducts(String chemicalBasedCleaningProducts) {
		this.chemicalBasedCleaningProducts = chemicalBasedCleaningProducts;
	}

	public String getCleaningProductType() {
		return cleaningProductType;
	}

	public void setCleaningProductType(String cleaningProductType) {
		this.cleaningProductType = cleaningProductType;
	}

	public String getTeachingMaterialUsed() {
		return teachingMaterialUsed;
	}

	public void setTeachingMaterialUsed(String teachingMaterialUsed) {
		this.teachingMaterialUsed = teachingMaterialUsed;
	}

	public String getClassroomAreaCategory() {
		return classroomAreaCategory;
	}

	public void setClassroomAreaCategory(String classroomAreaCategory) {
		this.classroomAreaCategory = classroomAreaCategory;
	}

	public String getClassroomStudentCountCategory() {
		return classroomStudentCountCategory;
	}

	public void setClassroomStudentCountCategory(String classroomStudentCountCategory) {
		this.classroomStudentCountCategory = classroomStudentCountCategory;
	}

	public String getClassroomTablesChairsCountCategory() {
		return classroomTablesChairsCountCategory;
	}

	public void setClassroomTablesChairsCountCategory(String classroomTablesChairsCountCategory) {
		this.classroomTablesChairsCountCategory = classroomTablesChairsCountCategory;
	}

	public String getClassroomBenchesCountCategory() {
		return classroomBenchesCountCategory;
	}

	public void setClassroomBenchesCountCategory(String classroomBenchesCountCategory) {
		this.classroomBenchesCountCategory = classroomBenchesCountCategory;
	}

	public String getClassroomFurnitureMaterial() {
		return classroomFurnitureMaterial;
	}

	public void setClassroomFurnitureMaterial(String classroomFurnitureMaterial) {
		this.classroomFurnitureMaterial = classroomFurnitureMaterial;
	}

	public String getClassroomWallMaterial() {
		return classroomWallMaterial;
	}

	public void setClassroomWallMaterial(String classroomWallMaterial) {
		this.classroomWallMaterial = classroomWallMaterial;
	}

	public String getClassroomFloorType() {
		return classroomFloorType;
	}

	public void setClassroomFloorType(String classroomFloorType) {
		this.classroomFloorType = classroomFloorType;
	}

	public String getClassroomBlackboardTypes() {
		return classroomBlackboardTypes;
	}

	public void setClassroomBlackboardTypes(String classroomBlackboardTypes) {
		this.classroomBlackboardTypes = classroomBlackboardTypes;
	}

	public String getClassroomTeachingMaterial() {
		return classroomTeachingMaterial;
	}

	public void setClassroomTeachingMaterial(String classroomTeachingMaterial) {
		this.classroomTeachingMaterial = classroomTeachingMaterial;
	}

	public String getClassroomActivities() {
		return classroomActivities;
	}

	public void setClassroomActivities(String classroomActivities) {
		this.classroomActivities = classroomActivities;
	}

	public String getClassroomVentilationControl() {
		return classroomVentilationControl;
	}

	public void setClassroomVentilationControl(String classroomVentilationControl) {
		this.classroomVentilationControl = classroomVentilationControl;
	}

	public String getClassroomMoistureDampness() {
		return classroomMoistureDampness;
	}

	public void setClassroomMoistureDampness(String classroomMoistureDampness) {
		this.classroomMoistureDampness = classroomMoistureDampness;
	}

	public String getClassroomTempHumidityControl() {
		return classroomTempHumidityControl;
	}

	public void setClassroomTempHumidityControl(String classroomTempHumidityControl) {
		this.classroomTempHumidityControl = classroomTempHumidityControl;
	}

	public String getClassroomMaintenanceIssues() {
		return classroomMaintenanceIssues;
	}

	public void setClassroomMaintenanceIssues(String classroomMaintenanceIssues) {
		this.classroomMaintenanceIssues = classroomMaintenanceIssues;
	}

	public Integer getClassroomLocationFloorLevel() {
		return classroomLocationFloorLevel;
	}

	public void setClassroomLocationFloorLevel(Integer classroomLocationFloorLevel) {
		this.classroomLocationFloorLevel = classroomLocationFloorLevel;
	}

	public Integer getClassroomWindowCount() {
		return classroomWindowCount;
	}

	public void setClassroomWindowCount(Integer classroomWindowCount) {
		this.classroomWindowCount = classroomWindowCount;
	}

	public String getClassroomCurtainsPresent() {
		return classroomCurtainsPresent;
	}

	public void setClassroomCurtainsPresent(String classroomCurtainsPresent) {
		this.classroomCurtainsPresent = classroomCurtainsPresent;
	}

	public Integer getClassroomLunchBreakStudentsPresent() {
		return classroomLunchBreakStudentsPresent;
	}

	public void setClassroomLunchBreakStudentsPresent(Integer classroomLunchBreakStudentsPresent) {
		this.classroomLunchBreakStudentsPresent = classroomLunchBreakStudentsPresent;
	}

	public String getClassroomDistanceFromTrafficSourceCategory() {
		return classroomDistanceFromTrafficSourceCategory;
	}

	public void setClassroomDistanceFromTrafficSourceCategory(String classroomDistanceFromTrafficSourceCategory) {
		this.classroomDistanceFromTrafficSourceCategory = classroomDistanceFromTrafficSourceCategory;
	}

	public String getClassroomAirPurifiersUsed() {
		return classroomAirPurifiersUsed;
	}

	public void setClassroomAirPurifiersUsed(String classroomAirPurifiersUsed) {
		this.classroomAirPurifiersUsed = classroomAirPurifiersUsed;
	}

	public String getClassroomIndoorPlantsPresent() {
		return classroomIndoorPlantsPresent;
	}

	public void setClassroomIndoorPlantsPresent(String classroomIndoorPlantsPresent) {
		this.classroomIndoorPlantsPresent = classroomIndoorPlantsPresent;
	}

	public String getClassroomIndoorPlantsCountCategory() {
		return classroomIndoorPlantsCountCategory;
	}

	public void setClassroomIndoorPlantsCountCategory(String classroomIndoorPlantsCountCategory) {
		this.classroomIndoorPlantsCountCategory = classroomIndoorPlantsCountCategory;
	}

	public String getClassroomPlaygroundDistanceCategory() {
		return classroomPlaygroundDistanceCategory;
	}

	public void setClassroomPlaygroundDistanceCategory(String classroomPlaygroundDistanceCategory) {
		this.classroomPlaygroundDistanceCategory = classroomPlaygroundDistanceCategory;
	}

	public String getOtherActivitiesObserved() {
		return otherActivitiesObserved;
	}

	public void setOtherActivitiesObserved(String otherActivitiesObserved) {
		this.otherActivitiesObserved = otherActivitiesObserved;
	}

	public AirQualityData(Long observationId, String locationId, String participantId, String observerName,
			Date observationDate, String schoolAddress, String buildingAgeCategory, String schoolTotalAreaCategory,
			String totalStudentsCategory, String averageStudentsPresent, String totalStaffCategory,
			String averageStaffPresent, String totalClassroomsCategory, String computerLabsCategory,
			String chemistryLabsCategory, String biologyLabsCategory, String physicsLabsCategory,
			String sportsRoomCategory, String canteen, String canteenCookingFuel, String canteenCookingTimeCategory,
			String canteenVentilationType, String schoolVentilationType, Integer schoolWindowsCategory,
			String hvacDuctsMaintenance, String hvacNoOfVentsCategory, String exhaustFanAirVelocitiesInlet,
			String exhaustFanAirVelocitiesOutlet, String cleaningActivitiesMethod,
			String cleaningActivitiesTimesManually, String cleaningActivitiesTimesEquipment,
			String chemicalBasedCleaningProducts, String cleaningProductType, String teachingMaterialUsed,
			String classroomAreaCategory, String classroomStudentCountCategory,
			String classroomTablesChairsCountCategory, String classroomBenchesCountCategory,
			String classroomFurnitureMaterial, String classroomWallMaterial, String classroomFloorType,
			String classroomBlackboardTypes, String classroomTeachingMaterial, String classroomActivities,
			String classroomVentilationControl, String classroomMoistureDampness, String classroomTempHumidityControl,
			String classroomMaintenanceIssues, Integer classroomLocationFloorLevel, Integer classroomWindowCount,
			String classroomCurtainsPresent, Integer classroomLunchBreakStudentsPresent,
			String classroomDistanceFromTrafficSourceCategory, String classroomAirPurifiersUsed,
			String classroomIndoorPlantsPresent, String classroomIndoorPlantsCountCategory,
			String classroomPlaygroundDistanceCategory, String otherActivitiesObserved) {
		super();
		this.observationId = observationId;
		this.locationId = locationId;
		this.participantId = participantId;
		this.observerName = observerName;
		this.observationDate = observationDate;
		this.schoolAddress = schoolAddress;
		this.buildingAgeCategory = buildingAgeCategory;
		this.schoolTotalAreaCategory = schoolTotalAreaCategory;
		this.totalStudentsCategory = totalStudentsCategory;
		this.averageStudentsPresent = averageStudentsPresent;
		this.totalStaffCategory = totalStaffCategory;
		this.averageStaffPresent = averageStaffPresent;
		this.totalClassroomsCategory = totalClassroomsCategory;
		this.computerLabsCategory = computerLabsCategory;
		this.chemistryLabsCategory = chemistryLabsCategory;
		this.biologyLabsCategory = biologyLabsCategory;
		this.physicsLabsCategory = physicsLabsCategory;
		this.sportsRoomCategory = sportsRoomCategory;
		this.canteen = canteen;
		this.canteenCookingFuel = canteenCookingFuel;
		this.canteenCookingTimeCategory = canteenCookingTimeCategory;
		this.canteenVentilationType = canteenVentilationType;
		this.schoolVentilationType = schoolVentilationType;
		this.schoolWindowsCategory = schoolWindowsCategory;
		this.hvacDuctsMaintenance = hvacDuctsMaintenance;
		this.hvacNoOfVentsCategory = hvacNoOfVentsCategory;
		this.exhaustFanAirVelocitiesInlet = exhaustFanAirVelocitiesInlet;
		this.exhaustFanAirVelocitiesOutlet = exhaustFanAirVelocitiesOutlet;
		this.cleaningActivitiesMethod = cleaningActivitiesMethod;
		this.cleaningActivitiesTimesManually = cleaningActivitiesTimesManually;
		this.cleaningActivitiesTimesEquipment = cleaningActivitiesTimesEquipment;
		this.chemicalBasedCleaningProducts = chemicalBasedCleaningProducts;
		this.cleaningProductType = cleaningProductType;
		this.teachingMaterialUsed = teachingMaterialUsed;
		this.classroomAreaCategory = classroomAreaCategory;
		this.classroomStudentCountCategory = classroomStudentCountCategory;
		this.classroomTablesChairsCountCategory = classroomTablesChairsCountCategory;
		this.classroomBenchesCountCategory = classroomBenchesCountCategory;
		this.classroomFurnitureMaterial = classroomFurnitureMaterial;
		this.classroomWallMaterial = classroomWallMaterial;
		this.classroomFloorType = classroomFloorType;
		this.classroomBlackboardTypes = classroomBlackboardTypes;
		this.classroomTeachingMaterial = classroomTeachingMaterial;
		this.classroomActivities = classroomActivities;
		this.classroomVentilationControl = classroomVentilationControl;
		this.classroomMoistureDampness = classroomMoistureDampness;
		this.classroomTempHumidityControl = classroomTempHumidityControl;
		this.classroomMaintenanceIssues = classroomMaintenanceIssues;
		this.classroomLocationFloorLevel = classroomLocationFloorLevel;
		this.classroomWindowCount = classroomWindowCount;
		this.classroomCurtainsPresent = classroomCurtainsPresent;
		this.classroomLunchBreakStudentsPresent = classroomLunchBreakStudentsPresent;
		this.classroomDistanceFromTrafficSourceCategory = classroomDistanceFromTrafficSourceCategory;
		this.classroomAirPurifiersUsed = classroomAirPurifiersUsed;
		this.classroomIndoorPlantsPresent = classroomIndoorPlantsPresent;
		this.classroomIndoorPlantsCountCategory = classroomIndoorPlantsCountCategory;
		this.classroomPlaygroundDistanceCategory = classroomPlaygroundDistanceCategory;
		this.otherActivitiesObserved = otherActivitiesObserved;
	}

	public AirQualityData() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "AirQualityData [observationId=" + observationId + ", locationId=" + locationId + ", participantId="
				+ participantId + ", observerName=" + observerName + ", observationDate=" + observationDate
				+ ", schoolAddress=" + schoolAddress + ", buildingAgeCategory=" + buildingAgeCategory
				+ ", schoolTotalAreaCategory=" + schoolTotalAreaCategory + ", totalStudentsCategory="
				+ totalStudentsCategory + ", averageStudentsPresent=" + averageStudentsPresent + ", totalStaffCategory="
				+ totalStaffCategory + ", averageStaffPresent=" + averageStaffPresent + ", totalClassroomsCategory="
				+ totalClassroomsCategory + ", computerLabsCategory=" + computerLabsCategory
				+ ", chemistryLabsCategory=" + chemistryLabsCategory + ", biologyLabsCategory=" + biologyLabsCategory
				+ ", physicsLabsCategory=" + physicsLabsCategory + ", sportsRoomCategory=" + sportsRoomCategory
				+ ", canteen=" + canteen + ", canteenCookingFuel=" + canteenCookingFuel
				+ ", canteenCookingTimeCategory=" + canteenCookingTimeCategory + ", canteenVentilationType="
				+ canteenVentilationType + ", schoolVentilationType=" + schoolVentilationType
				+ ", schoolWindowsCategory=" + schoolWindowsCategory + ", hvacDuctsMaintenance=" + hvacDuctsMaintenance
				+ ", hvacNoOfVentsCategory=" + hvacNoOfVentsCategory + ", exhaustFanAirVelocitiesInlet="
				+ exhaustFanAirVelocitiesInlet + ", exhaustFanAirVelocitiesOutlet=" + exhaustFanAirVelocitiesOutlet
				+ ", cleaningActivitiesMethod=" + cleaningActivitiesMethod + ", cleaningActivitiesTimesManually="
				+ cleaningActivitiesTimesManually + ", cleaningActivitiesTimesEquipment="
				+ cleaningActivitiesTimesEquipment + ", chemicalBasedCleaningProducts=" + chemicalBasedCleaningProducts
				+ ", cleaningProductType=" + cleaningProductType + ", teachingMaterialUsed=" + teachingMaterialUsed
				+ ", classroomAreaCategory=" + classroomAreaCategory + ", classroomStudentCountCategory="
				+ classroomStudentCountCategory + ", classroomTablesChairsCountCategory="
				+ classroomTablesChairsCountCategory + ", classroomBenchesCountCategory="
				+ classroomBenchesCountCategory + ", classroomFurnitureMaterial=" + classroomFurnitureMaterial
				+ ", classroomWallMaterial=" + classroomWallMaterial + ", classroomFloorType=" + classroomFloorType
				+ ", classroomBlackboardTypes=" + classroomBlackboardTypes + ", classroomTeachingMaterial="
				+ classroomTeachingMaterial + ", classroomActivities=" + classroomActivities
				+ ", classroomVentilationControl=" + classroomVentilationControl + ", classroomMoistureDampness="
				+ classroomMoistureDampness + ", classroomTempHumidityControl=" + classroomTempHumidityControl
				+ ", classroomMaintenanceIssues=" + classroomMaintenanceIssues + ", classroomLocationFloorLevel="
				+ classroomLocationFloorLevel + ", classroomWindowCount=" + classroomWindowCount
				+ ", classroomCurtainsPresent=" + classroomCurtainsPresent + ", classroomLunchBreakStudentsPresent="
				+ classroomLunchBreakStudentsPresent + ", classroomDistanceFromTrafficSourceCategory="
				+ classroomDistanceFromTrafficSourceCategory + ", classroomAirPurifiersUsed="
				+ classroomAirPurifiersUsed + ", classroomIndoorPlantsPresent=" + classroomIndoorPlantsPresent
				+ ", classroomIndoorPlantsCountCategory=" + classroomIndoorPlantsCountCategory
				+ ", classroomPlaygroundDistanceCategory=" + classroomPlaygroundDistanceCategory
				+ ", otherActivitiesObserved=" + otherActivitiesObserved + "]";
	}

	

}
