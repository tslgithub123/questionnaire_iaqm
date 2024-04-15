package com.survey.entity;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "RestaurantObservations")
//@Getter
//@Setter
//@NoArgsConstructor
//@AllArgsConstructor
//@ToString
public class RestaurantObservation {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "observation_id")
    private Long id;

    @Column(name = "observation_date")
    private Date observationDate;


    @Column(name = "location_id")
    private String locationId;
    
    @Column(name = "location_address")
    private String locationAddress;
        
    @Column(name = "participant_id")
    private String participantId;

    @Column(name = "occupants_count")
    private String occupantsCount;

    @Column(name = "sitting_capacity")
    private String sittingCapacity;

    @Column(name = "average_active_hours")
    private String activeHours;

    @Column(name = "average_working_hours")
    private String workingHours;

    @Column(name = "average_staff_count")
    private String staffCount;

    @Column(name = "odour_present")
    private String odourPresent;

    @Column(name = "odour_type")
    private String odourType;

    @Column(name = "other_odour_type")
    private String otherOdourType;

    @Column(name = "odour_frequencyOfProduct")
    private String odourFrequency;

    @Column(name = "ventilation_type")
    private String ventilationType;

    @Column(name = "ducts_maintenance_frequency")
    private String ductsMaintenanceFrequency;

    @Column(name = "no_of_vents")
    private String noOfVents;

    @Column(name = "manual_cleaning_frequency")
    private String manualCleaningFrequency;

    @Column(name = "equipment_cleaning_frequency")
    private String equipmentCleaningFrequency;

    @Column(name = "chemical_cleaning")
    private String chemicalCleaning;

    @Column(name = "cleaning_agents")
    private String cleaningAgents;

    @Column(name = "other_cleaning_agents")
    private String otherCleaningAgents;

    @Column(name = "flooring_type_material")
    private String flooringType;

    @Column(name = "other_flooring_type")
    private String otherFlooringType;

    @Column(name = "carpet_conditionAndPresence")
    private String carpetCondition;

    @Column(name = "carpet_condition_remarks")
    private String carpetConditionRemarks;

    @Column(name = "furniture_type")
    private String furnitureType;

    @Column(name = "other_furniture_typeAndUpholsteryMaterial")
    private String otherFurnitureType;

    @Column(name = "serving_area_condition")
    private String servingAreaCondition;

    @Column(name = "smoke_presence")
    private String smokePresence;

    @Column(name = "stoves_present")
    private String stovesPresent;

    @Column(name = "serving_area_partition")
    private String servingAreaPartition;

    @Column(name = "remark_text")
    private String remarkText;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getObservationDate() {
		return observationDate;
	}

	public void setObservationDate(Date observationDate) {
		this.observationDate = observationDate;
	}

	public String getLocationId() {
		return locationId;
	}

	public void setLocationId(String locationId) {
		this.locationId = locationId;
	}

	public String getLocationAddress() {
		return locationAddress;
	}

	public void setLocationAddress(String locationAddress) {
		this.locationAddress = locationAddress;
	}

	public String getParticipantId() {
		return participantId;
	}

	public void setParticipantId(String participantId) {
		this.participantId = participantId;
	}

	public String getOccupantsCount() {
		return occupantsCount;
	}

	public void setOccupantsCount(String occupantsCount) {
		this.occupantsCount = occupantsCount;
	}

	public String getSittingCapacity() {
		return sittingCapacity;
	}

	public void setSittingCapacity(String sittingCapacity) {
		this.sittingCapacity = sittingCapacity;
	}

	public String getActiveHours() {
		return activeHours;
	}

	public void setActiveHours(String activeHours) {
		this.activeHours = activeHours;
	}

	public String getWorkingHours() {
		return workingHours;
	}

	public void setWorkingHours(String workingHours) {
		this.workingHours = workingHours;
	}

	public String getStaffCount() {
		return staffCount;
	}

	public void setStaffCount(String staffCount) {
		this.staffCount = staffCount;
	}

	public String getOdourPresent() {
		return odourPresent;
	}

	public void setOdourPresent(String odourPresent) {
		this.odourPresent = odourPresent;
	}

	public String getOdourType() {
		return odourType;
	}

	public void setOdourType(String odourType) {
		this.odourType = odourType;
	}

	public String getOtherOdourType() {
		return otherOdourType;
	}

	public void setOtherOdourType(String otherOdourType) {
		this.otherOdourType = otherOdourType;
	}

	public String getOdourFrequency() {
		return odourFrequency;
	}

	public void setOdourFrequency(String odourFrequency) {
		this.odourFrequency = odourFrequency;
	}

	public String getVentilationType() {
		return ventilationType;
	}

	public void setVentilationType(String ventilationType) {
		this.ventilationType = ventilationType;
	}

	public String getDuctsMaintenanceFrequency() {
		return ductsMaintenanceFrequency;
	}

	public void setDuctsMaintenanceFrequency(String ductsMaintenanceFrequency) {
		this.ductsMaintenanceFrequency = ductsMaintenanceFrequency;
	}

	public String getNoOfVents() {
		return noOfVents;
	}

	public void setNoOfVents(String noOfVents) {
		this.noOfVents = noOfVents;
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

	public String getChemicalCleaning() {
		return chemicalCleaning;
	}

	public void setChemicalCleaning(String chemicalCleaning) {
		this.chemicalCleaning = chemicalCleaning;
	}

	public String getCleaningAgents() {
		return cleaningAgents;
	}

	public void setCleaningAgents(String cleaningAgents) {
		this.cleaningAgents = cleaningAgents;
	}

	public String getOtherCleaningAgents() {
		return otherCleaningAgents;
	}

	public void setOtherCleaningAgents(String otherCleaningAgents) {
		this.otherCleaningAgents = otherCleaningAgents;
	}

	public String getFlooringType() {
		return flooringType;
	}

	public void setFlooringType(String flooringType) {
		this.flooringType = flooringType;
	}

	public String getOtherFlooringType() {
		return otherFlooringType;
	}

	public void setOtherFlooringType(String otherFlooringType) {
		this.otherFlooringType = otherFlooringType;
	}

	public String getCarpetCondition() {
		return carpetCondition;
	}

	public void setCarpetCondition(String carpetCondition) {
		this.carpetCondition = carpetCondition;
	}

	public String getCarpetConditionRemarks() {
		return carpetConditionRemarks;
	}

	public void setCarpetConditionRemarks(String carpetConditionRemarks) {
		this.carpetConditionRemarks = carpetConditionRemarks;
	}

	public String getFurnitureType() {
		return furnitureType;
	}

	public void setFurnitureType(String furnitureType) {
		this.furnitureType = furnitureType;
	}

	public String getOtherFurnitureType() {
		return otherFurnitureType;
	}

	public void setOtherFurnitureType(String otherFurnitureType) {
		this.otherFurnitureType = otherFurnitureType;
	}

	public String getServingAreaCondition() {
		return servingAreaCondition;
	}

	public void setServingAreaCondition(String servingAreaCondition) {
		this.servingAreaCondition = servingAreaCondition;
	}

	public String getSmokePresence() {
		return smokePresence;
	}

	public void setSmokePresence(String smokePresence) {
		this.smokePresence = smokePresence;
	}

	public String getStovesPresent() {
		return stovesPresent;
	}

	public void setStovesPresent(String stovesPresent) {
		this.stovesPresent = stovesPresent;
	}

	public String getServingAreaPartition() {
		return servingAreaPartition;
	}

	public void setServingAreaPartition(String servingAreaPartition) {
		this.servingAreaPartition = servingAreaPartition;
	}

	public String getRemarkText() {
		return remarkText;
	}

	public void setRemarkText(String remarkText) {
		this.remarkText = remarkText;
	}

	public RestaurantObservation(Long id, Date observationDate, String locationId, String locationAddress,
			String participantId, String occupantsCount, String sittingCapacity, String activeHours,
			String workingHours, String staffCount, String odourPresent, String odourType, String otherOdourType,
			String odourFrequency, String ventilationType, String ductsMaintenanceFrequency, String noOfVents,
			String manualCleaningFrequency, String equipmentCleaningFrequency, String chemicalCleaning,
			String cleaningAgents, String otherCleaningAgents, String flooringType, String otherFlooringType,
			String carpetCondition, String carpetConditionRemarks, String furnitureType, String otherFurnitureType,
			String servingAreaCondition, String smokePresence, String stovesPresent, String servingAreaPartition,
			String remarkText) {
		super();
		this.id = id;
		this.observationDate = observationDate;
		this.locationId = locationId;
		this.locationAddress = locationAddress;
		this.participantId = participantId;
		this.occupantsCount = occupantsCount;
		this.sittingCapacity = sittingCapacity;
		this.activeHours = activeHours;
		this.workingHours = workingHours;
		this.staffCount = staffCount;
		this.odourPresent = odourPresent;
		this.odourType = odourType;
		this.otherOdourType = otherOdourType;
		this.odourFrequency = odourFrequency;
		this.ventilationType = ventilationType;
		this.ductsMaintenanceFrequency = ductsMaintenanceFrequency;
		this.noOfVents = noOfVents;
		this.manualCleaningFrequency = manualCleaningFrequency;
		this.equipmentCleaningFrequency = equipmentCleaningFrequency;
		this.chemicalCleaning = chemicalCleaning;
		this.cleaningAgents = cleaningAgents;
		this.otherCleaningAgents = otherCleaningAgents;
		this.flooringType = flooringType;
		this.otherFlooringType = otherFlooringType;
		this.carpetCondition = carpetCondition;
		this.carpetConditionRemarks = carpetConditionRemarks;
		this.furnitureType = furnitureType;
		this.otherFurnitureType = otherFurnitureType;
		this.servingAreaCondition = servingAreaCondition;
		this.smokePresence = smokePresence;
		this.stovesPresent = stovesPresent;
		this.servingAreaPartition = servingAreaPartition;
		this.remarkText = remarkText;
	}

	public RestaurantObservation() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "RestaurantObservation [id=" + id + ", observationDate=" + observationDate + ", locationId=" + locationId
				+ ", locationAddress=" + locationAddress + ", participantId=" + participantId + ", occupantsCount="
				+ occupantsCount + ", sittingCapacity=" + sittingCapacity + ", activeHours=" + activeHours
				+ ", workingHours=" + workingHours + ", staffCount=" + staffCount + ", odourPresent=" + odourPresent
				+ ", odourType=" + odourType + ", otherOdourType=" + otherOdourType + ", odourFrequency="
				+ odourFrequency + ", ventilationType=" + ventilationType + ", ductsMaintenanceFrequency="
				+ ductsMaintenanceFrequency + ", noOfVents=" + noOfVents + ", manualCleaningFrequency="
				+ manualCleaningFrequency + ", equipmentCleaningFrequency=" + equipmentCleaningFrequency
				+ ", chemicalCleaning=" + chemicalCleaning + ", cleaningAgents=" + cleaningAgents
				+ ", otherCleaningAgents=" + otherCleaningAgents + ", flooringType=" + flooringType
				+ ", otherFlooringType=" + otherFlooringType + ", carpetCondition=" + carpetCondition
				+ ", carpetConditionRemarks=" + carpetConditionRemarks + ", furnitureType=" + furnitureType
				+ ", otherFurnitureType=" + otherFurnitureType + ", servingAreaCondition=" + servingAreaCondition
				+ ", smokePresence=" + smokePresence + ", stovesPresent=" + stovesPresent + ", servingAreaPartition="
				+ servingAreaPartition + ", remarkText=" + remarkText + ", getId()=" + getId()
				+ ", getObservationDate()=" + getObservationDate() + ", getLocationId()=" + getLocationId()
				+ ", getLocationAddress()=" + getLocationAddress() + ", getParticipantId()=" + getParticipantId()
				+ ", getOccupantsCount()=" + getOccupantsCount() + ", getSittingCapacity()=" + getSittingCapacity()
				+ ", getActiveHours()=" + getActiveHours() + ", getWorkingHours()=" + getWorkingHours()
				+ ", getStaffCount()=" + getStaffCount() + ", getOdourPresent()=" + getOdourPresent()
				+ ", getOdourType()=" + getOdourType() + ", getOtherOdourType()=" + getOtherOdourType()
				+ ", getOdourFrequency()=" + getOdourFrequency() + ", getVentilationType()=" + getVentilationType()
				+ ", getDuctsMaintenanceFrequency()=" + getDuctsMaintenanceFrequency() + ", getNoOfVents()="
				+ getNoOfVents() + ", getManualCleaningFrequency()=" + getManualCleaningFrequency()
				+ ", getEquipmentCleaningFrequency()=" + getEquipmentCleaningFrequency() + ", getChemicalCleaning()="
				+ getChemicalCleaning() + ", getCleaningAgents()=" + getCleaningAgents() + ", getOtherCleaningAgents()="
				+ getOtherCleaningAgents() + ", getFlooringType()=" + getFlooringType() + ", getOtherFlooringType()="
				+ getOtherFlooringType() + ", getCarpetCondition()=" + getCarpetCondition()
				+ ", getCarpetConditionRemarks()=" + getCarpetConditionRemarks() + ", getFurnitureType()="
				+ getFurnitureType() + ", getOtherFurnitureType()=" + getOtherFurnitureType()
				+ ", getServingAreaCondition()=" + getServingAreaCondition() + ", getSmokePresence()="
				+ getSmokePresence() + ", getStovesPresent()=" + getStovesPresent() + ", getServingAreaPartition()="
				+ getServingAreaPartition() + ", getRemarkText()=" + getRemarkText() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

	
    

}
