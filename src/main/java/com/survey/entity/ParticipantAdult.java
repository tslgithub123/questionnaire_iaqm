package com.survey.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.Date;

import com.survey.enums.ResidenceType;
import com.survey.enums.RoomFreshenerFrequency;
import com.survey.enums.SmokingStatus;

import com.survey.enums.AgarbattiFrequency;
import com.survey.enums.CandleFrequency;
import com.survey.enums.DhoopStickFrequency;
import com.survey.enums.DiyaFrequency;
import com.survey.enums.Gender;
import com.survey.enums.KeroseneLampFrequency;
import com.survey.enums.LocationCategory;
import com.survey.enums.MosquitoCoilFrequency;
import com.survey.enums.MosquitoMattFrequency;
import com.survey.enums.OccupationStatus;

/**
 * @author user
 *
 */
@Entity
@Table(name = "ParticipantAdult")
public class ParticipantAdult {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "health_id")
    private Long healthId;
    
    @Column(name = "Participant_id")
    private String participantId;
    
    @Column(name = "Location_id")
    private String locationId;

    @Column(name = "place_of_data_collection")
    private String placeOfDataCollection;
    
   
    @Column(name = "date_of_participation")
    private Date dateOfParticipation;

    @Column(name = "participant_name")
    private String subjectInitials;

    @Column(name = "date_of_birth")
    private Date dateOfBirth;

    @Column(name = "age")
    private int age;

    @Enumerated(EnumType.STRING)
    @Column(name = "location_category")
    private LocationCategory locationCategory;

    @Enumerated(EnumType.STRING)
    @Column(name = "gender")
    private Gender gender;

    @Column(name = "educational_qualifications")
    private String educationalQualifications;

    @Enumerated(EnumType.STRING)
    @Column(name = "occupation_status")
    private OccupationStatus occupationStatus;

    @Column(name = "occupation_name")
    private String occupationName;
    //otherOccupation
    
    @Column(name = "other_disease")
    private String otherDisease;

    @Column(name = "other_disease_name")
    private String otherDiseaseName;

    @Column(name = "other_disease_duration")
    private int otherDiseaseDuration;
    
    @Column(name = "other_occupation")
    private String otherOccupation;
    
//    @Column(name = "employer_name")
//    private String employerName;

    @Enumerated(EnumType.STRING)
    @Column(name = "type_of_residence")
    private ResidenceType typeOfResidence;

    @Column(name = "residence_details")
    private String residenceDetails;

    @Column(name = "distance_from_main_road")
    private String distanceFromMainRoad;

    @Column(name = "has_separate_kitchen")
    private String hasSeparateKitchen;

    @Column(name = "number_of_windows_in_kitchen")
    private String numberOfWindowsInKitchen;

    @Enumerated(EnumType.STRING)
    @Column(name = "smoking_status")
    private SmokingStatus smokingStatus;

    @Column(name = "cigarettes_bidis_per_day")
    private int cigarettesBidisPerDay;

    @Column(name = "smoking_years")
    private int smokingYears;

    @Column(name = "lpg_usage")
//    @JsonDeserialize(using = YesNoToBooleanDeserializer.class)
    private String lpgUsage;

    @Column(name = "lpg_usage_years")
    private int lpgUsageYears;

    @Column(name = "kerosene_usage")
//    @JsonDeserialize(using = YesNoToBooleanDeserializer.class)
    private String keroseneUsage;

    @Column(name = "kerosene_usage_years")
    private int keroseneUsageYears;

    @Column(name = "biomass_usage")
    private String biomassUsage;

    @Column(name = "biomass_usage_years")
    private int biomassUsageYears;

    @Column(name = "electric_heater_usage")
//    @JsonDeserialize(using = YesNoToBooleanDeserializer.class)
    private String electricHeaterUsage;

    @Column(name = "electric_heater_usage_years")
    private int electricHeaterUsageYears;

    @Column(name = "high_blood_pressure_current")
//    @JsonDeserialize(using = YesNoToBooleanDeserializer.class)
    private String highBloodPressureCurrent;

    @Column(name = "high_blood_pressure_current_years")
    private int highBloodPressureCurrentYears;

    @Column(name = "high_blood_pressure_past")
//    @JsonDeserialize(using = YesNoToBooleanDeserializer.class)
    private String highBloodPressurePast;

    @Column(name = "high_blood_pressure_past_years")
    private int highBloodPressurePastYears;

    @Column(name = "heart_disease_current")
//    @JsonDeserialize(using = YesNoToBooleanDeserializer.class)
    private String heartDiseaseCurrent;

    @Column(name = "heart_disease_current_years")
    private int heartDiseaseCurrentYears;

    @Column(name = "heart_disease_past")
//    @JsonDeserialize(using = YesNoToBooleanDeserializer.class)
    private String heartDiseasePast;

//    @Column(name = "heart_disease_past_years")
//    private int heartDiseasePastYears;

    @Column(name = "diabetes_current")
//    @JsonDeserialize(using = YesNoToBooleanDeserializer.class)
    private String diabetesCurrent;

    @Column(name = "diabetes_current_years")
    private int diabetesCurrentYears;

//    @Column(name = "diabetes_past")
////    @JsonDeserialize(using = YesNoToBooleanDeserializer.class)
//    private String diabetesPast;

//    @Column(name = "diabetes_past_years")
//    private int diabetesPastYears;

    @Column(name = "asthma_current")
//    @JsonDeserialize(using = YesNoToBooleanDeserializer.class)
    private String asthmaCurrent;

    @Column(name = "asthma_current_years")
    private int asthmaCurrentYears;

    @Column(name = "cancer_past")
//    @JsonDeserialize(using = YesNoToBooleanDeserializer.class)
    private String cancerPast;

    @Column(name = "cancer_past_years")
    private int cancerPastYears;

    @Column(name = "copd_current")
//    @JsonDeserialize(using = YesNoToBooleanDeserializer.class)
    private String copdCurrent;

    @Column(name = "copd_current_years")
    private int copdCurrentYears;

    @Column(name = "pneumonia_past")
//    @JsonDeserialize(using = YesNoToBooleanDeserializer.class)
    private String pneumoniaPast;

    @Column(name = "pneumonia_past_years")
    private int pneumoniaPastYears;

    @Column(name = "stroke_paralysis_current")
//    @JsonDeserialize(using = YesNoToBooleanDeserializer.class)
    private String strokeParalysisCurrent;

    @Column(name = "stroke_paralysis_current_years")
    private int strokeParalysisCurrentYears;

//    @Column(name = "stroke_paralysis_past")
////    @JsonDeserialize(using = YesNoToBooleanDeserializer.class)
//    private String strokeParalysisPast;
//
//    @Column(name = "stroke_paralysis_past_years")
//    private int strokeParalysisPastYears;

    @Column(name = "tb_current")
//    @JsonDeserialize(using = YesNoToBooleanDeserializer.class)
    private String tbCurrent;

    @Column(name = "tb_current_years")
    private int tbCurrentYears;

    @Column(name = "tb_past")
//    @JsonDeserialize(using = YesNoToBooleanDeserializer.class)
    private String tbPast;

    @Column(name = "tb_past_years")
    private int tbPastYears;

    @Column(name = "other_diagnosis")
    private String otherDiagnosis;

    @Column(name = "other_diagnosis_years")
    private int otherDiagnosisYears;

    @Column(name = "child_current_symptoms_cough")
//    @JsonDeserialize(using = YesNoToBooleanDeserializer.class)
    private String childCurrentSymptomsCough;

    @Column(name = "child_current_symptoms_shortness_of_breath")
//    @JsonDeserialize(using = YesNoToBooleanDeserializer.class)
    private String childCurrentSymptomsShortnessOfBreath;

    @Column(name = "child_current_symptoms_phlegm")
//    @JsonDeserialize(using = YesNoToBooleanDeserializer.class)
    private String childCurrentSymptomsPhlegm;

    @Column(name = "child_current_symptoms_chest_tightness")
//    @JsonDeserialize(using = YesNoToBooleanDeserializer.class)
    private String childCurrentSymptomsChestTightness;

    @Column(name = "child_current_symptoms_wheeze")
//    @JsonDeserialize(using = YesNoToBooleanDeserializer.class)
    private String childCurrentSymptomsWheeze;

    @Column(name = "child_current_symptoms_headache")
//    @JsonDeserialize(using = YesNoToBooleanDeserializer.class)
    private String childCurrentSymptomsHeadache;

    @Column(name = "child_current_symptoms_allergic_skin_conditions")
//    @JsonDeserialize(using = YesNoToBooleanDeserializer.class)
    private String childCurrentSymptomsAllergicSkinConditions;

    @Column(name = "child_current_symptoms_allergic_runny_nose")
//    @JsonDeserialize(using = YesNoToBooleanDeserializer.class)
    private String childCurrentSymptomsAllergicRunnyNose;

    @Column(name = "child_past_symptoms_cough")
//    @JsonDeserialize(using = YesNoToBooleanDeserializer.class)
    private String childPastSymptomsCough;

    @Column(name = "child_past_symptoms_shortness_of_breath")
//    @JsonDeserialize(using = YesNoToBooleanDeserializer.class)
    private String childPastSymptomsShortnessOfBreath;

    @Column(name = "child_past_symptoms_phlegm")
//    @JsonDeserialize(using = YesNoToBooleanDeserializer.class)
    private String childPastSymptomsPhlegm;

    @Column(name = "child_past_symptoms_chest_tightness")
//    @JsonDeserialize(using = YesNoToBooleanDeserializer.class)
    private String childPastSymptomsChestTightness;

    @Column(name = "child_past_symptoms_wheeze")
//    @JsonDeserialize(using = YesNoToBooleanDeserializer.class)
    private String childPastSymptomsWheeze;

    @Column(name = "child_past_symptoms_headache")
//    @JsonDeserialize(using = YesNoToBooleanDeserializer.class)
    private String childPastSymptomsHeadache;

    @Column(name = "child_past_symptoms_allergic_skin_conditions")
//    @JsonDeserialize(using = YesNoToBooleanDeserializer.class)
    private String childPastSymptomsAllergicSkinConditions;

    @Column(name = "child_past_symptoms_allergic_runny_nose")
    private String childPastSymptomsAllergicRunnyNose;

    @Enumerated(EnumType.STRING)
    @Column(name = "mosquito_matt_frequency")
    private MosquitoMattFrequency mosquitoMattFrequency;

    @Enumerated(EnumType.STRING)
    @Column(name = "mosquito_coil_frequency")
    private MosquitoCoilFrequency mosquitoCoilFrequency;

    @Column(name = "mosquito_liquid_vaporizer_frequency")
    private String mosquitoLiquidVaporizerFrequency;

    @Enumerated(EnumType.STRING)
    @Column(name = "dhoop_stick_frequency")
    private DhoopStickFrequency dhoopStickFrequency;

    @Enumerated(EnumType.STRING)
    @Column(name = "agarbatti_frequency")
    private AgarbattiFrequency agarbattiFrequency;

    @Enumerated(EnumType.STRING)
    @Column(name = "diya_frequency")
    private DiyaFrequency diyaFrequency;

    @Enumerated(EnumType.STRING)
    @Column(name = "candle_frequency")
    private CandleFrequency candleFrequency;

    @Enumerated(EnumType.STRING)
    @Column(name = "kerosene_lamp_frequency")
    private KeroseneLampFrequency keroseneLampFrequency;

    @Enumerated(EnumType.STRING)
    @Column(name = "room_freshener_frequency")
    private RoomFreshenerFrequency roomFreshenerFrequency;

    @Column(name = "height_cm")
    private Double heightCm;

    @Column(name = "weight_kg")
    private Double weightKg;

    @Column(name = "blood_pressure_sys")
    private String bloodPressureSys;

    @Column(name = "blood_pressure_diasto")
    private String bloodPressurediaSto;
    
    @Column(name = "pulse_bpm")
    private Integer pulseBpm;

    @Column(name = "spo2_percent")
    private Integer spO2Percent;

    @Column(name = "peak_flow_meter_reading_1")
    private Integer peakFlowMeterReading1;

    @Column(name = "peak_flow_meter_reading_2")
    private Integer peakFlowMeterReading2;

    @Column(name = "peak_flow_meter_reading_3")
    private Integer peakFlowMeterReading3;

    @Column(name = "lung_oscillometry")
    private String lungOscillometry;

    @Column(name = "lung_oscillometry_performedOrNot")
    private String lungOscillometryReason;

	public Long getHealthId() {
		return healthId;
	}

	public void setHealthId(Long healthId) {
		this.healthId = healthId;
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

	public String getPlaceOfDataCollection() {
		return placeOfDataCollection;
	}

	public void setPlaceOfDataCollection(String placeOfDataCollection) {
		this.placeOfDataCollection = placeOfDataCollection;
	}

	public Date getDateOfParticipation() {
		return dateOfParticipation;
	}

	public void setDateOfParticipation(Date dateOfParticipation) {
		this.dateOfParticipation = dateOfParticipation;
	}

	public String getSubjectInitials() {
		return subjectInitials;
	}

	public void setSubjectInitials(String subjectInitials) {
		this.subjectInitials = subjectInitials;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public LocationCategory getLocationCategory() {
		return locationCategory;
	}

	public void setLocationCategory(LocationCategory locationCategory) {
		this.locationCategory = locationCategory;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public String getEducationalQualifications() {
		return educationalQualifications;
	}

	public void setEducationalQualifications(String educationalQualifications) {
		this.educationalQualifications = educationalQualifications;
	}

	public OccupationStatus getOccupationStatus() {
		return occupationStatus;
	}

	public void setOccupationStatus(OccupationStatus occupationStatus) {
		this.occupationStatus = occupationStatus;
	}

	public String getOccupationName() {
		return occupationName;
	}

	public void setOccupationName(String occupationName) {
		this.occupationName = occupationName;
	}

	public String getOtherDisease() {
		return otherDisease;
	}

	public void setOtherDisease(String otherDisease) {
		this.otherDisease = otherDisease;
	}

	public String getOtherDiseaseName() {
		return otherDiseaseName;
	}

	public void setOtherDiseaseName(String otherDiseaseName) {
		this.otherDiseaseName = otherDiseaseName;
	}

	public int getOtherDiseaseDuration() {
		return otherDiseaseDuration;
	}

	public void setOtherDiseaseDuration(int otherDiseaseDuration) {
		this.otherDiseaseDuration = otherDiseaseDuration;
	}

	public String getOtherOccupation() {
		return otherOccupation;
	}

	public void setOtherOccupation(String otherOccupation) {
		this.otherOccupation = otherOccupation;
	}

	public ResidenceType getTypeOfResidence() {
		return typeOfResidence;
	}

	public void setTypeOfResidence(ResidenceType typeOfResidence) {
		this.typeOfResidence = typeOfResidence;
	}

	public String getResidenceDetails() {
		return residenceDetails;
	}

	public void setResidenceDetails(String residenceDetails) {
		this.residenceDetails = residenceDetails;
	}

	public String getDistanceFromMainRoad() {
		return distanceFromMainRoad;
	}

	public void setDistanceFromMainRoad(String distanceFromMainRoad) {
		this.distanceFromMainRoad = distanceFromMainRoad;
	}

	public String getHasSeparateKitchen() {
		return hasSeparateKitchen;
	}

	public void setHasSeparateKitchen(String hasSeparateKitchen) {
		this.hasSeparateKitchen = hasSeparateKitchen;
	}

	public String getNumberOfWindowsInKitchen() {
		return numberOfWindowsInKitchen;
	}

	public void setNumberOfWindowsInKitchen(String numberOfWindowsInKitchen) {
		this.numberOfWindowsInKitchen = numberOfWindowsInKitchen;
	}

	public SmokingStatus getSmokingStatus() {
		return smokingStatus;
	}

	public void setSmokingStatus(SmokingStatus smokingStatus) {
		this.smokingStatus = smokingStatus;
	}

	public int getCigarettesBidisPerDay() {
		return cigarettesBidisPerDay;
	}

	public void setCigarettesBidisPerDay(int cigarettesBidisPerDay) {
		this.cigarettesBidisPerDay = cigarettesBidisPerDay;
	}

	public int getSmokingYears() {
		return smokingYears;
	}

	public void setSmokingYears(int smokingYears) {
		this.smokingYears = smokingYears;
	}

	public String getLpgUsage() {
		return lpgUsage;
	}

	public void setLpgUsage(String lpgUsage) {
		this.lpgUsage = lpgUsage;
	}

	public int getLpgUsageYears() {
		return lpgUsageYears;
	}

	public void setLpgUsageYears(int lpgUsageYears) {
		this.lpgUsageYears = lpgUsageYears;
	}

	public String getKeroseneUsage() {
		return keroseneUsage;
	}

	public void setKeroseneUsage(String keroseneUsage) {
		this.keroseneUsage = keroseneUsage;
	}

	public int getKeroseneUsageYears() {
		return keroseneUsageYears;
	}

	public void setKeroseneUsageYears(int keroseneUsageYears) {
		this.keroseneUsageYears = keroseneUsageYears;
	}

	public String getBiomassUsage() {
		return biomassUsage;
	}

	public void setBiomassUsage(String biomassUsage) {
		this.biomassUsage = biomassUsage;
	}

	public int getBiomassUsageYears() {
		return biomassUsageYears;
	}

	public void setBiomassUsageYears(int biomassUsageYears) {
		this.biomassUsageYears = biomassUsageYears;
	}

	public String getElectricHeaterUsage() {
		return electricHeaterUsage;
	}

	public void setElectricHeaterUsage(String electricHeaterUsage) {
		this.electricHeaterUsage = electricHeaterUsage;
	}

	public int getElectricHeaterUsageYears() {
		return electricHeaterUsageYears;
	}

	public void setElectricHeaterUsageYears(int electricHeaterUsageYears) {
		this.electricHeaterUsageYears = electricHeaterUsageYears;
	}

	public String getHighBloodPressureCurrent() {
		return highBloodPressureCurrent;
	}

	public void setHighBloodPressureCurrent(String highBloodPressureCurrent) {
		this.highBloodPressureCurrent = highBloodPressureCurrent;
	}

	public int getHighBloodPressureCurrentYears() {
		return highBloodPressureCurrentYears;
	}

	public void setHighBloodPressureCurrentYears(int highBloodPressureCurrentYears) {
		this.highBloodPressureCurrentYears = highBloodPressureCurrentYears;
	}

	public String getHighBloodPressurePast() {
		return highBloodPressurePast;
	}

	public void setHighBloodPressurePast(String highBloodPressurePast) {
		this.highBloodPressurePast = highBloodPressurePast;
	}

	public int getHighBloodPressurePastYears() {
		return highBloodPressurePastYears;
	}

	public void setHighBloodPressurePastYears(int highBloodPressurePastYears) {
		this.highBloodPressurePastYears = highBloodPressurePastYears;
	}

	public String getHeartDiseaseCurrent() {
		return heartDiseaseCurrent;
	}

	public void setHeartDiseaseCurrent(String heartDiseaseCurrent) {
		this.heartDiseaseCurrent = heartDiseaseCurrent;
	}

	public int getHeartDiseaseCurrentYears() {
		return heartDiseaseCurrentYears;
	}

	public void setHeartDiseaseCurrentYears(int heartDiseaseCurrentYears) {
		this.heartDiseaseCurrentYears = heartDiseaseCurrentYears;
	}

	public String getHeartDiseasePast() {
		return heartDiseasePast;
	}

	public void setHeartDiseasePast(String heartDiseasePast) {
		this.heartDiseasePast = heartDiseasePast;
	}

	public String getDiabetesCurrent() {
		return diabetesCurrent;
	}

	public void setDiabetesCurrent(String diabetesCurrent) {
		this.diabetesCurrent = diabetesCurrent;
	}

	public int getDiabetesCurrentYears() {
		return diabetesCurrentYears;
	}

	public void setDiabetesCurrentYears(int diabetesCurrentYears) {
		this.diabetesCurrentYears = diabetesCurrentYears;
	}

	public String getAsthmaCurrent() {
		return asthmaCurrent;
	}

	public void setAsthmaCurrent(String asthmaCurrent) {
		this.asthmaCurrent = asthmaCurrent;
	}

	public int getAsthmaCurrentYears() {
		return asthmaCurrentYears;
	}

	public void setAsthmaCurrentYears(int asthmaCurrentYears) {
		this.asthmaCurrentYears = asthmaCurrentYears;
	}

	public String getCancerPast() {
		return cancerPast;
	}

	public void setCancerPast(String cancerPast) {
		this.cancerPast = cancerPast;
	}

	public int getCancerPastYears() {
		return cancerPastYears;
	}

	public void setCancerPastYears(int cancerPastYears) {
		this.cancerPastYears = cancerPastYears;
	}

	public String getCopdCurrent() {
		return copdCurrent;
	}

	public void setCopdCurrent(String copdCurrent) {
		this.copdCurrent = copdCurrent;
	}

	public int getCopdCurrentYears() {
		return copdCurrentYears;
	}

	public void setCopdCurrentYears(int copdCurrentYears) {
		this.copdCurrentYears = copdCurrentYears;
	}

	public String getPneumoniaPast() {
		return pneumoniaPast;
	}

	public void setPneumoniaPast(String pneumoniaPast) {
		this.pneumoniaPast = pneumoniaPast;
	}

	public int getPneumoniaPastYears() {
		return pneumoniaPastYears;
	}

	public void setPneumoniaPastYears(int pneumoniaPastYears) {
		this.pneumoniaPastYears = pneumoniaPastYears;
	}

	public String getStrokeParalysisCurrent() {
		return strokeParalysisCurrent;
	}

	public void setStrokeParalysisCurrent(String strokeParalysisCurrent) {
		this.strokeParalysisCurrent = strokeParalysisCurrent;
	}

	public int getStrokeParalysisCurrentYears() {
		return strokeParalysisCurrentYears;
	}

	public void setStrokeParalysisCurrentYears(int strokeParalysisCurrentYears) {
		this.strokeParalysisCurrentYears = strokeParalysisCurrentYears;
	}

	public String getTbCurrent() {
		return tbCurrent;
	}

	public void setTbCurrent(String tbCurrent) {
		this.tbCurrent = tbCurrent;
	}

	public int getTbCurrentYears() {
		return tbCurrentYears;
	}

	public void setTbCurrentYears(int tbCurrentYears) {
		this.tbCurrentYears = tbCurrentYears;
	}

	public String getTbPast() {
		return tbPast;
	}

	public void setTbPast(String tbPast) {
		this.tbPast = tbPast;
	}

	public int getTbPastYears() {
		return tbPastYears;
	}

	public void setTbPastYears(int tbPastYears) {
		this.tbPastYears = tbPastYears;
	}

	public String getOtherDiagnosis() {
		return otherDiagnosis;
	}

	public void setOtherDiagnosis(String otherDiagnosis) {
		this.otherDiagnosis = otherDiagnosis;
	}

	public int getOtherDiagnosisYears() {
		return otherDiagnosisYears;
	}

	public void setOtherDiagnosisYears(int otherDiagnosisYears) {
		this.otherDiagnosisYears = otherDiagnosisYears;
	}

	public String getChildCurrentSymptomsCough() {
		return childCurrentSymptomsCough;
	}

	public void setChildCurrentSymptomsCough(String childCurrentSymptomsCough) {
		this.childCurrentSymptomsCough = childCurrentSymptomsCough;
	}

	public String getChildCurrentSymptomsShortnessOfBreath() {
		return childCurrentSymptomsShortnessOfBreath;
	}

	public void setChildCurrentSymptomsShortnessOfBreath(String childCurrentSymptomsShortnessOfBreath) {
		this.childCurrentSymptomsShortnessOfBreath = childCurrentSymptomsShortnessOfBreath;
	}

	public String getChildCurrentSymptomsPhlegm() {
		return childCurrentSymptomsPhlegm;
	}

	public void setChildCurrentSymptomsPhlegm(String childCurrentSymptomsPhlegm) {
		this.childCurrentSymptomsPhlegm = childCurrentSymptomsPhlegm;
	}

	public String getChildCurrentSymptomsChestTightness() {
		return childCurrentSymptomsChestTightness;
	}

	public void setChildCurrentSymptomsChestTightness(String childCurrentSymptomsChestTightness) {
		this.childCurrentSymptomsChestTightness = childCurrentSymptomsChestTightness;
	}

	public String getChildCurrentSymptomsWheeze() {
		return childCurrentSymptomsWheeze;
	}

	public void setChildCurrentSymptomsWheeze(String childCurrentSymptomsWheeze) {
		this.childCurrentSymptomsWheeze = childCurrentSymptomsWheeze;
	}

	public String getChildCurrentSymptomsHeadache() {
		return childCurrentSymptomsHeadache;
	}

	public void setChildCurrentSymptomsHeadache(String childCurrentSymptomsHeadache) {
		this.childCurrentSymptomsHeadache = childCurrentSymptomsHeadache;
	}

	public String getChildCurrentSymptomsAllergicSkinConditions() {
		return childCurrentSymptomsAllergicSkinConditions;
	}

	public void setChildCurrentSymptomsAllergicSkinConditions(String childCurrentSymptomsAllergicSkinConditions) {
		this.childCurrentSymptomsAllergicSkinConditions = childCurrentSymptomsAllergicSkinConditions;
	}

	public String getChildCurrentSymptomsAllergicRunnyNose() {
		return childCurrentSymptomsAllergicRunnyNose;
	}

	public void setChildCurrentSymptomsAllergicRunnyNose(String childCurrentSymptomsAllergicRunnyNose) {
		this.childCurrentSymptomsAllergicRunnyNose = childCurrentSymptomsAllergicRunnyNose;
	}

	public String getChildPastSymptomsCough() {
		return childPastSymptomsCough;
	}

	public void setChildPastSymptomsCough(String childPastSymptomsCough) {
		this.childPastSymptomsCough = childPastSymptomsCough;
	}

	public String getChildPastSymptomsShortnessOfBreath() {
		return childPastSymptomsShortnessOfBreath;
	}

	public void setChildPastSymptomsShortnessOfBreath(String childPastSymptomsShortnessOfBreath) {
		this.childPastSymptomsShortnessOfBreath = childPastSymptomsShortnessOfBreath;
	}

	public String getChildPastSymptomsPhlegm() {
		return childPastSymptomsPhlegm;
	}

	public void setChildPastSymptomsPhlegm(String childPastSymptomsPhlegm) {
		this.childPastSymptomsPhlegm = childPastSymptomsPhlegm;
	}

	public String getChildPastSymptomsChestTightness() {
		return childPastSymptomsChestTightness;
	}

	public void setChildPastSymptomsChestTightness(String childPastSymptomsChestTightness) {
		this.childPastSymptomsChestTightness = childPastSymptomsChestTightness;
	}

	public String getChildPastSymptomsWheeze() {
		return childPastSymptomsWheeze;
	}

	public void setChildPastSymptomsWheeze(String childPastSymptomsWheeze) {
		this.childPastSymptomsWheeze = childPastSymptomsWheeze;
	}

	public String getChildPastSymptomsHeadache() {
		return childPastSymptomsHeadache;
	}

	public void setChildPastSymptomsHeadache(String childPastSymptomsHeadache) {
		this.childPastSymptomsHeadache = childPastSymptomsHeadache;
	}

	public String getChildPastSymptomsAllergicSkinConditions() {
		return childPastSymptomsAllergicSkinConditions;
	}

	public void setChildPastSymptomsAllergicSkinConditions(String childPastSymptomsAllergicSkinConditions) {
		this.childPastSymptomsAllergicSkinConditions = childPastSymptomsAllergicSkinConditions;
	}

	public String getChildPastSymptomsAllergicRunnyNose() {
		return childPastSymptomsAllergicRunnyNose;
	}

	public void setChildPastSymptomsAllergicRunnyNose(String childPastSymptomsAllergicRunnyNose) {
		this.childPastSymptomsAllergicRunnyNose = childPastSymptomsAllergicRunnyNose;
	}

	public MosquitoMattFrequency getMosquitoMattFrequency() {
		return mosquitoMattFrequency;
	}

	public void setMosquitoMattFrequency(MosquitoMattFrequency mosquitoMattFrequency) {
		this.mosquitoMattFrequency = mosquitoMattFrequency;
	}

	public MosquitoCoilFrequency getMosquitoCoilFrequency() {
		return mosquitoCoilFrequency;
	}

	public void setMosquitoCoilFrequency(MosquitoCoilFrequency mosquitoCoilFrequency) {
		this.mosquitoCoilFrequency = mosquitoCoilFrequency;
	}

	public String getMosquitoLiquidVaporizerFrequency() {
		return mosquitoLiquidVaporizerFrequency;
	}

	public void setMosquitoLiquidVaporizerFrequency(String mosquitoLiquidVaporizerFrequency) {
		this.mosquitoLiquidVaporizerFrequency = mosquitoLiquidVaporizerFrequency;
	}

	public DhoopStickFrequency getDhoopStickFrequency() {
		return dhoopStickFrequency;
	}

	public void setDhoopStickFrequency(DhoopStickFrequency dhoopStickFrequency) {
		this.dhoopStickFrequency = dhoopStickFrequency;
	}

	public AgarbattiFrequency getAgarbattiFrequency() {
		return agarbattiFrequency;
	}

	public void setAgarbattiFrequency(AgarbattiFrequency agarbattiFrequency) {
		this.agarbattiFrequency = agarbattiFrequency;
	}

	public DiyaFrequency getDiyaFrequency() {
		return diyaFrequency;
	}

	public void setDiyaFrequency(DiyaFrequency diyaFrequency) {
		this.diyaFrequency = diyaFrequency;
	}

	public CandleFrequency getCandleFrequency() {
		return candleFrequency;
	}

	public void setCandleFrequency(CandleFrequency candleFrequency) {
		this.candleFrequency = candleFrequency;
	}

	public KeroseneLampFrequency getKeroseneLampFrequency() {
		return keroseneLampFrequency;
	}

	public void setKeroseneLampFrequency(KeroseneLampFrequency keroseneLampFrequency) {
		this.keroseneLampFrequency = keroseneLampFrequency;
	}

	public RoomFreshenerFrequency getRoomFreshenerFrequency() {
		return roomFreshenerFrequency;
	}

	public void setRoomFreshenerFrequency(RoomFreshenerFrequency roomFreshenerFrequency) {
		this.roomFreshenerFrequency = roomFreshenerFrequency;
	}

	public Double getHeightCm() {
		return heightCm;
	}

	public void setHeightCm(Double heightCm) {
		this.heightCm = heightCm;
	}

	public Double getWeightKg() {
		return weightKg;
	}

	public void setWeightKg(Double weightKg) {
		this.weightKg = weightKg;
	}

	public String getBloodPressureSys() {
		return bloodPressureSys;
	}

	public void setBloodPressureSys(String bloodPressureSys) {
		this.bloodPressureSys = bloodPressureSys;
	}

	public String getBloodPressureSto() {
		return bloodPressurediaSto;
	}

	public void setBloodPressurediaSto(String bloodPressurediaSto) {
		this.bloodPressurediaSto = bloodPressurediaSto;
	}

	public Integer getPulseBpm() {
		return pulseBpm;
	}

	public void setPulseBpm(Integer pulseBpm) {
		this.pulseBpm = pulseBpm;
	}

	public Integer getSpO2Percent() {
		return spO2Percent;
	}

	public void setSpO2Percent(Integer spO2Percent) {
		this.spO2Percent = spO2Percent;
	}

	public Integer getPeakFlowMeterReading1() {
		return peakFlowMeterReading1;
	}

	public void setPeakFlowMeterReading1(Integer peakFlowMeterReading1) {
		this.peakFlowMeterReading1 = peakFlowMeterReading1;
	}

	public Integer getPeakFlowMeterReading2() {
		return peakFlowMeterReading2;
	}

	public void setPeakFlowMeterReading2(Integer peakFlowMeterReading2) {
		this.peakFlowMeterReading2 = peakFlowMeterReading2;
	}

	public Integer getPeakFlowMeterReading3() {
		return peakFlowMeterReading3;
	}

	public void setPeakFlowMeterReading3(Integer peakFlowMeterReading3) {
		this.peakFlowMeterReading3 = peakFlowMeterReading3;
	}

	public String getLungOscillometry() {
		return lungOscillometry;
	}

	public void setLungOscillometry(String lungOscillometry) {
		this.lungOscillometry = lungOscillometry;
	}

	public String getLungOscillometryReason() {
		return lungOscillometryReason;
	}

	public void setLungOscillometryReason(String lungOscillometryReason) {
		this.lungOscillometryReason = lungOscillometryReason;
	}

	public ParticipantAdult(Long healthId, String participantId, String locationId, String placeOfDataCollection,
			Date dateOfParticipation, String subjectInitials, Date dateOfBirth, int age,
			LocationCategory locationCategory, Gender gender, String educationalQualifications,
			OccupationStatus occupationStatus, String occupationName, String otherDisease, String otherDiseaseName,
			int otherDiseaseDuration, String otherOccupation, ResidenceType typeOfResidence, String residenceDetails,
			String distanceFromMainRoad, String hasSeparateKitchen, String numberOfWindowsInKitchen,
			SmokingStatus smokingStatus, int cigarettesBidisPerDay, int smokingYears, String lpgUsage,
			int lpgUsageYears, String keroseneUsage, int keroseneUsageYears, String biomassUsage, int biomassUsageYears,
			String electricHeaterUsage, int electricHeaterUsageYears, String highBloodPressureCurrent,
			int highBloodPressureCurrentYears, String highBloodPressurePast, int highBloodPressurePastYears,
			String heartDiseaseCurrent, int heartDiseaseCurrentYears, String heartDiseasePast, String diabetesCurrent,
			int diabetesCurrentYears, String asthmaCurrent, int asthmaCurrentYears, String cancerPast,
			int cancerPastYears, String copdCurrent, int copdCurrentYears, String pneumoniaPast, int pneumoniaPastYears,
			String strokeParalysisCurrent, int strokeParalysisCurrentYears, String tbCurrent, int tbCurrentYears,
			String tbPast, int tbPastYears, String otherDiagnosis, int otherDiagnosisYears,
			String childCurrentSymptomsCough, String childCurrentSymptomsShortnessOfBreath,
			String childCurrentSymptomsPhlegm, String childCurrentSymptomsChestTightness,
			String childCurrentSymptomsWheeze, String childCurrentSymptomsHeadache,
			String childCurrentSymptomsAllergicSkinConditions, String childCurrentSymptomsAllergicRunnyNose,
			String childPastSymptomsCough, String childPastSymptomsShortnessOfBreath, String childPastSymptomsPhlegm,
			String childPastSymptomsChestTightness, String childPastSymptomsWheeze, String childPastSymptomsHeadache,
			String childPastSymptomsAllergicSkinConditions, String childPastSymptomsAllergicRunnyNose,
			MosquitoMattFrequency mosquitoMattFrequency, MosquitoCoilFrequency mosquitoCoilFrequency,
			String mosquitoLiquidVaporizerFrequency, DhoopStickFrequency dhoopStickFrequency,
			AgarbattiFrequency agarbattiFrequency, DiyaFrequency diyaFrequency, CandleFrequency candleFrequency,
			KeroseneLampFrequency keroseneLampFrequency, RoomFreshenerFrequency roomFreshenerFrequency, Double heightCm,
			Double weightKg, String bloodPressureSys, String bloodPressureSto, Integer pulseBpm, Integer spO2Percent,
			Integer peakFlowMeterReading1, Integer peakFlowMeterReading2, Integer peakFlowMeterReading3,
			String lungOscillometry, String lungOscillometryReason) {
		super();
		this.healthId = healthId;
		this.participantId = participantId;
		this.locationId = locationId;
		this.placeOfDataCollection = placeOfDataCollection;
		this.dateOfParticipation = dateOfParticipation;
		this.subjectInitials = subjectInitials;
		this.dateOfBirth = dateOfBirth;
		this.age = age;
		this.locationCategory = locationCategory;
		this.gender = gender;
		this.educationalQualifications = educationalQualifications;
		this.occupationStatus = occupationStatus;
		this.occupationName = occupationName;
		this.otherDisease = otherDisease;
		this.otherDiseaseName = otherDiseaseName;
		this.otherDiseaseDuration = otherDiseaseDuration;
		this.otherOccupation = otherOccupation;
		this.typeOfResidence = typeOfResidence;
		this.residenceDetails = residenceDetails;
		this.distanceFromMainRoad = distanceFromMainRoad;
		this.hasSeparateKitchen = hasSeparateKitchen;
		this.numberOfWindowsInKitchen = numberOfWindowsInKitchen;
		this.smokingStatus = smokingStatus;
		this.cigarettesBidisPerDay = cigarettesBidisPerDay;
		this.smokingYears = smokingYears;
		this.lpgUsage = lpgUsage;
		this.lpgUsageYears = lpgUsageYears;
		this.keroseneUsage = keroseneUsage;
		this.keroseneUsageYears = keroseneUsageYears;
		this.biomassUsage = biomassUsage;
		this.biomassUsageYears = biomassUsageYears;
		this.electricHeaterUsage = electricHeaterUsage;
		this.electricHeaterUsageYears = electricHeaterUsageYears;
		this.highBloodPressureCurrent = highBloodPressureCurrent;
		this.highBloodPressureCurrentYears = highBloodPressureCurrentYears;
		this.highBloodPressurePast = highBloodPressurePast;
		this.highBloodPressurePastYears = highBloodPressurePastYears;
		this.heartDiseaseCurrent = heartDiseaseCurrent;
		this.heartDiseaseCurrentYears = heartDiseaseCurrentYears;
		this.heartDiseasePast = heartDiseasePast;
		this.diabetesCurrent = diabetesCurrent;
		this.diabetesCurrentYears = diabetesCurrentYears;
		this.asthmaCurrent = asthmaCurrent;
		this.asthmaCurrentYears = asthmaCurrentYears;
		this.cancerPast = cancerPast;
		this.cancerPastYears = cancerPastYears;
		this.copdCurrent = copdCurrent;
		this.copdCurrentYears = copdCurrentYears;
		this.pneumoniaPast = pneumoniaPast;
		this.pneumoniaPastYears = pneumoniaPastYears;
		this.strokeParalysisCurrent = strokeParalysisCurrent;
		this.strokeParalysisCurrentYears = strokeParalysisCurrentYears;
		this.tbCurrent = tbCurrent;
		this.tbCurrentYears = tbCurrentYears;
		this.tbPast = tbPast;
		this.tbPastYears = tbPastYears;
		this.otherDiagnosis = otherDiagnosis;
		this.otherDiagnosisYears = otherDiagnosisYears;
		this.childCurrentSymptomsCough = childCurrentSymptomsCough;
		this.childCurrentSymptomsShortnessOfBreath = childCurrentSymptomsShortnessOfBreath;
		this.childCurrentSymptomsPhlegm = childCurrentSymptomsPhlegm;
		this.childCurrentSymptomsChestTightness = childCurrentSymptomsChestTightness;
		this.childCurrentSymptomsWheeze = childCurrentSymptomsWheeze;
		this.childCurrentSymptomsHeadache = childCurrentSymptomsHeadache;
		this.childCurrentSymptomsAllergicSkinConditions = childCurrentSymptomsAllergicSkinConditions;
		this.childCurrentSymptomsAllergicRunnyNose = childCurrentSymptomsAllergicRunnyNose;
		this.childPastSymptomsCough = childPastSymptomsCough;
		this.childPastSymptomsShortnessOfBreath = childPastSymptomsShortnessOfBreath;
		this.childPastSymptomsPhlegm = childPastSymptomsPhlegm;
		this.childPastSymptomsChestTightness = childPastSymptomsChestTightness;
		this.childPastSymptomsWheeze = childPastSymptomsWheeze;
		this.childPastSymptomsHeadache = childPastSymptomsHeadache;
		this.childPastSymptomsAllergicSkinConditions = childPastSymptomsAllergicSkinConditions;
		this.childPastSymptomsAllergicRunnyNose = childPastSymptomsAllergicRunnyNose;
		this.mosquitoMattFrequency = mosquitoMattFrequency;
		this.mosquitoCoilFrequency = mosquitoCoilFrequency;
		this.mosquitoLiquidVaporizerFrequency = mosquitoLiquidVaporizerFrequency;
		this.dhoopStickFrequency = dhoopStickFrequency;
		this.agarbattiFrequency = agarbattiFrequency;
		this.diyaFrequency = diyaFrequency;
		this.candleFrequency = candleFrequency;
		this.keroseneLampFrequency = keroseneLampFrequency;
		this.roomFreshenerFrequency = roomFreshenerFrequency;
		this.heightCm = heightCm;
		this.weightKg = weightKg;
		this.bloodPressureSys = bloodPressureSys;
		this.bloodPressurediaSto = bloodPressurediaSto;
		this.pulseBpm = pulseBpm;
		this.spO2Percent = spO2Percent;
		this.peakFlowMeterReading1 = peakFlowMeterReading1;
		this.peakFlowMeterReading2 = peakFlowMeterReading2;
		this.peakFlowMeterReading3 = peakFlowMeterReading3;
		this.lungOscillometry = lungOscillometry;
		this.lungOscillometryReason = lungOscillometryReason;
	}

	@Override
	public String toString() {
		return "Participant [healthId=" + healthId + ", participantId=" + participantId + ", locationId=" + locationId
				+ ", placeOfDataCollection=" + placeOfDataCollection + ", dateOfParticipation=" + dateOfParticipation
				+ ", subjectInitials=" + subjectInitials + ", dateOfBirth=" + dateOfBirth + ", age=" + age
				+ ", locationCategory=" + locationCategory + ", gender=" + gender + ", educationalQualifications="
				+ educationalQualifications + ", occupationStatus=" + occupationStatus + ", occupationName="
				+ occupationName + ", otherDisease=" + otherDisease + ", otherDiseaseName=" + otherDiseaseName
				+ ", otherDiseaseDuration=" + otherDiseaseDuration + ", otherOccupation=" + otherOccupation
				+ ", typeOfResidence=" + typeOfResidence + ", residenceDetails=" + residenceDetails
				+ ", distanceFromMainRoad=" + distanceFromMainRoad + ", hasSeparateKitchen=" + hasSeparateKitchen
				+ ", numberOfWindowsInKitchen=" + numberOfWindowsInKitchen + ", smokingStatus=" + smokingStatus
				+ ", cigarettesBidisPerDay=" + cigarettesBidisPerDay + ", smokingYears=" + smokingYears + ", lpgUsage="
				+ lpgUsage + ", lpgUsageYears=" + lpgUsageYears + ", keroseneUsage=" + keroseneUsage
				+ ", keroseneUsageYears=" + keroseneUsageYears + ", biomassUsage=" + biomassUsage
				+ ", biomassUsageYears=" + biomassUsageYears + ", electricHeaterUsage=" + electricHeaterUsage
				+ ", electricHeaterUsageYears=" + electricHeaterUsageYears + ", highBloodPressureCurrent="
				+ highBloodPressureCurrent + ", highBloodPressureCurrentYears=" + highBloodPressureCurrentYears
				+ ", highBloodPressurePast=" + highBloodPressurePast + ", highBloodPressurePastYears="
				+ highBloodPressurePastYears + ", heartDiseaseCurrent=" + heartDiseaseCurrent
				+ ", heartDiseaseCurrentYears=" + heartDiseaseCurrentYears + ", heartDiseasePast=" + heartDiseasePast
				+ ", diabetesCurrent=" + diabetesCurrent + ", diabetesCurrentYears=" + diabetesCurrentYears
				+ ", asthmaCurrent=" + asthmaCurrent + ", asthmaCurrentYears=" + asthmaCurrentYears + ", cancerPast="
				+ cancerPast + ", cancerPastYears=" + cancerPastYears + ", copdCurrent=" + copdCurrent
				+ ", copdCurrentYears=" + copdCurrentYears + ", pneumoniaPast=" + pneumoniaPast
				+ ", pneumoniaPastYears=" + pneumoniaPastYears + ", strokeParalysisCurrent=" + strokeParalysisCurrent
				+ ", strokeParalysisCurrentYears=" + strokeParalysisCurrentYears + ", tbCurrent=" + tbCurrent
				+ ", tbCurrentYears=" + tbCurrentYears + ", tbPast=" + tbPast + ", tbPastYears=" + tbPastYears
				+ ", otherDiagnosis=" + otherDiagnosis + ", otherDiagnosisYears=" + otherDiagnosisYears
				+ ", childCurrentSymptomsCough=" + childCurrentSymptomsCough
				+ ", childCurrentSymptomsShortnessOfBreath=" + childCurrentSymptomsShortnessOfBreath
				+ ", childCurrentSymptomsPhlegm=" + childCurrentSymptomsPhlegm + ", childCurrentSymptomsChestTightness="
				+ childCurrentSymptomsChestTightness + ", childCurrentSymptomsWheeze=" + childCurrentSymptomsWheeze
				+ ", childCurrentSymptomsHeadache=" + childCurrentSymptomsHeadache
				+ ", childCurrentSymptomsAllergicSkinConditions=" + childCurrentSymptomsAllergicSkinConditions
				+ ", childCurrentSymptomsAllergicRunnyNose=" + childCurrentSymptomsAllergicRunnyNose
				+ ", childPastSymptomsCough=" + childPastSymptomsCough + ", childPastSymptomsShortnessOfBreath="
				+ childPastSymptomsShortnessOfBreath + ", childPastSymptomsPhlegm=" + childPastSymptomsPhlegm
				+ ", childPastSymptomsChestTightness=" + childPastSymptomsChestTightness + ", childPastSymptomsWheeze="
				+ childPastSymptomsWheeze + ", childPastSymptomsHeadache=" + childPastSymptomsHeadache
				+ ", childPastSymptomsAllergicSkinConditions=" + childPastSymptomsAllergicSkinConditions
				+ ", childPastSymptomsAllergicRunnyNose=" + childPastSymptomsAllergicRunnyNose
				+ ", mosquitoMattFrequency=" + mosquitoMattFrequency + ", mosquitoCoilFrequency="
				+ mosquitoCoilFrequency + ", mosquitoLiquidVaporizerFrequency=" + mosquitoLiquidVaporizerFrequency
				+ ", dhoopStickFrequency=" + dhoopStickFrequency + ", agarbattiFrequency=" + agarbattiFrequency
				+ ", diyaFrequency=" + diyaFrequency + ", candleFrequency=" + candleFrequency
				+ ", keroseneLampFrequency=" + keroseneLampFrequency + ", roomFreshenerFrequency="
				+ roomFreshenerFrequency + ", heightCm=" + heightCm + ", weightKg=" + weightKg + ", bloodPressureSys="
				+ bloodPressureSys + ", bloodPressureSto=" + bloodPressurediaSto + ", pulseBpm=" + pulseBpm
				+ ", spO2Percent=" + spO2Percent + ", peakFlowMeterReading1=" + peakFlowMeterReading1
				+ ", peakFlowMeterReading2=" + peakFlowMeterReading2 + ", peakFlowMeterReading3="
				+ peakFlowMeterReading3 + ", lungOscillometry=" + lungOscillometry + ", lungOscillometryReason="
				+ lungOscillometryReason + ", getHealthId()=" + getHealthId() + ", getParticipantId()="
				+ getParticipantId() + ", getLocationId()=" + getLocationId() + ", getPlaceOfDataCollection()="
				+ getPlaceOfDataCollection() + ", getDateOfParticipation()=" + getDateOfParticipation()
				+ ", getSubjectInitials()=" + getSubjectInitials() + ", getDateOfBirth()=" + getDateOfBirth()
				+ ", getAge()=" + getAge() + ", getLocationCategory()=" + getLocationCategory() + ", getGender()="
				+ getGender() + ", getEducationalQualifications()=" + getEducationalQualifications()
				+ ", getOccupationStatus()=" + getOccupationStatus() + ", getOccupationName()=" + getOccupationName()
				+ ", getOtherDisease()=" + getOtherDisease() + ", getOtherDiseaseName()=" + getOtherDiseaseName()
				+ ", getOtherDiseaseDuration()=" + getOtherDiseaseDuration() + ", getOtherOccupation()="
				+ getOtherOccupation() + ", getTypeOfResidence()=" + getTypeOfResidence() + ", getResidenceDetails()="
				+ getResidenceDetails() + ", getDistanceFromMainRoad()=" + getDistanceFromMainRoad()
				+ ", getHasSeparateKitchen()=" + getHasSeparateKitchen() + ", getNumberOfWindowsInKitchen()="
				+ getNumberOfWindowsInKitchen() + ", getSmokingStatus()=" + getSmokingStatus()
				+ ", getCigarettesBidisPerDay()=" + getCigarettesBidisPerDay() + ", getSmokingYears()="
				+ getSmokingYears() + ", getLpgUsage()=" + getLpgUsage() + ", getLpgUsageYears()=" + getLpgUsageYears()
				+ ", getKeroseneUsage()=" + getKeroseneUsage() + ", getKeroseneUsageYears()=" + getKeroseneUsageYears()
				+ ", getBiomassUsage()=" + getBiomassUsage() + ", getBiomassUsageYears()=" + getBiomassUsageYears()
				+ ", getElectricHeaterUsage()=" + getElectricHeaterUsage() + ", getElectricHeaterUsageYears()="
				+ getElectricHeaterUsageYears() + ", getHighBloodPressureCurrent()=" + getHighBloodPressureCurrent()
				+ ", getHighBloodPressureCurrentYears()=" + getHighBloodPressureCurrentYears()
				+ ", getHighBloodPressurePast()=" + getHighBloodPressurePast() + ", getHighBloodPressurePastYears()="
				+ getHighBloodPressurePastYears() + ", getHeartDiseaseCurrent()=" + getHeartDiseaseCurrent()
				+ ", getHeartDiseaseCurrentYears()=" + getHeartDiseaseCurrentYears() + ", getHeartDiseasePast()="
				+ getHeartDiseasePast() + ", getDiabetesCurrent()=" + getDiabetesCurrent()
				+ ", getDiabetesCurrentYears()=" + getDiabetesCurrentYears() + ", getAsthmaCurrent()="
				+ getAsthmaCurrent() + ", getAsthmaCurrentYears()=" + getAsthmaCurrentYears() + ", getCancerPast()="
				+ getCancerPast() + ", getCancerPastYears()=" + getCancerPastYears() + ", getCopdCurrent()="
				+ getCopdCurrent() + ", getCopdCurrentYears()=" + getCopdCurrentYears() + ", getPneumoniaPast()="
				+ getPneumoniaPast() + ", getPneumoniaPastYears()=" + getPneumoniaPastYears()
				+ ", getStrokeParalysisCurrent()=" + getStrokeParalysisCurrent() + ", getStrokeParalysisCurrentYears()="
				+ getStrokeParalysisCurrentYears() + ", getTbCurrent()=" + getTbCurrent() + ", getTbCurrentYears()="
				+ getTbCurrentYears() + ", getTbPast()=" + getTbPast() + ", getTbPastYears()=" + getTbPastYears()
				+ ", getOtherDiagnosis()=" + getOtherDiagnosis() + ", getOtherDiagnosisYears()="
				+ getOtherDiagnosisYears() + ", getChildCurrentSymptomsCough()=" + getChildCurrentSymptomsCough()
				+ ", getChildCurrentSymptomsShortnessOfBreath()=" + getChildCurrentSymptomsShortnessOfBreath()
				+ ", getChildCurrentSymptomsPhlegm()=" + getChildCurrentSymptomsPhlegm()
				+ ", getChildCurrentSymptomsChestTightness()=" + getChildCurrentSymptomsChestTightness()
				+ ", getChildCurrentSymptomsWheeze()=" + getChildCurrentSymptomsWheeze()
				+ ", getChildCurrentSymptomsHeadache()=" + getChildCurrentSymptomsHeadache()
				+ ", getChildCurrentSymptomsAllergicSkinConditions()=" + getChildCurrentSymptomsAllergicSkinConditions()
				+ ", getChildCurrentSymptomsAllergicRunnyNose()=" + getChildCurrentSymptomsAllergicRunnyNose()
				+ ", getChildPastSymptomsCough()=" + getChildPastSymptomsCough()
				+ ", getChildPastSymptomsShortnessOfBreath()=" + getChildPastSymptomsShortnessOfBreath()
				+ ", getChildPastSymptomsPhlegm()=" + getChildPastSymptomsPhlegm()
				+ ", getChildPastSymptomsChestTightness()=" + getChildPastSymptomsChestTightness()
				+ ", getChildPastSymptomsWheeze()=" + getChildPastSymptomsWheeze() + ", getChildPastSymptomsHeadache()="
				+ getChildPastSymptomsHeadache() + ", getChildPastSymptomsAllergicSkinConditions()="
				+ getChildPastSymptomsAllergicSkinConditions() + ", getChildPastSymptomsAllergicRunnyNose()="
				+ getChildPastSymptomsAllergicRunnyNose() + ", getMosquitoMattFrequency()=" + getMosquitoMattFrequency()
				+ ", getMosquitoCoilFrequency()=" + getMosquitoCoilFrequency()
				+ ", getMosquitoLiquidVaporizerFrequency()=" + getMosquitoLiquidVaporizerFrequency()
				+ ", getDhoopStickFrequency()=" + getDhoopStickFrequency() + ", getAgarbattiFrequency()="
				+ getAgarbattiFrequency() + ", getDiyaFrequency()=" + getDiyaFrequency() + ", getCandleFrequency()="
				+ getCandleFrequency() + ", getKeroseneLampFrequency()=" + getKeroseneLampFrequency()
				+ ", getRoomFreshenerFrequency()=" + getRoomFreshenerFrequency() + ", getHeightCm()=" + getHeightCm()
				+ ", getWeightKg()=" + getWeightKg() + ", getBloodPressureSys()=" + getBloodPressureSys()
				+ ", getBloodPressureSto()=" + getBloodPressureSto() + ", getPulseBpm()=" + getPulseBpm()
				+ ", getSpO2Percent()=" + getSpO2Percent() + ", getPeakFlowMeterReading1()="
				+ getPeakFlowMeterReading1() + ", getPeakFlowMeterReading2()=" + getPeakFlowMeterReading2()
				+ ", getPeakFlowMeterReading3()=" + getPeakFlowMeterReading3() + ", getLungOscillometry()="
				+ getLungOscillometry() + ", getLungOscillometryReason()=" + getLungOscillometryReason()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}

	public ParticipantAdult() {
		super();
		// TODO Auto-generated constructor stub
	}

	

}

