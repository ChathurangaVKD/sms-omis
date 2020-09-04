package com.omis.universitymanagementsystem.model;

import javax.persistence.*;

/**
 * Student Model to create the student table
 * Use constructor injection and setters to set values, use getters to access values
 */
@Entity
@Table(name = "firstuserapplication")
public class FirstUserApplication {
    private long id;
    private String applicantTypeId;
    private String programId;
    private String specializationId;
    private String preferedAcademicCenterId;
    private String studyMediumId;
    private String al3Passes;
    private String olMathsCpass;
    private String alGenEnglishCpass;
    private String nameWithInitial;
    private String nic;
    private String correspondanceAddress;
    private String mobileNo;
    private String landNo;
    private String email;

    public FirstUserApplication() {

    }

    public FirstUserApplication(String applicantTypeId, String specializationId, String programId
    ,String preferedAcademicCenterId, String studyMediumId, String al3Passes
    ,String olMathsCpass, String alGenEnglishCpass, String nameWithInitial
    ,String nic, String correspondanceAddress, String mobileNo,String landNo, String email) {
          this.applicantTypeId = applicantTypeId;
          this.specializationId = specializationId;
          this.programId = programId;
          this.preferedAcademicCenterId = preferedAcademicCenterId;
          this.studyMediumId = studyMediumId;
          this.al3Passes = al3Passes;
          this.olMathsCpass = olMathsCpass;
          this.alGenEnglishCpass = alGenEnglishCpass;
          this.nameWithInitial = nameWithInitial;
          this.nic = nic;
          this.correspondanceAddress = correspondanceAddress;
          this.mobileNo = mobileNo;
          this.landNo = landNo;
          this.email = email;

    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Column(name = "applicant_type_id", nullable = false)
    public String getApplicantTypeId() {
        return applicantTypeId;
    }

    public void setApplicantTypeId(String applicantTypeId) {
        this.applicantTypeId = applicantTypeId;
    }

    @Column(name = "specialization_id", nullable = false)
    public String getSpecializationId() {
        return specializationId;
    }

    public void setSpecializationId(String specializationId) {
        this.specializationId = specializationId;
    }

    @Column(name = "program_id", nullable = false)
    public String getProgramId() {
        return programId;
    }

    public void setProgramId(String programId) {
        this.programId = programId;
    }

    @Column(name = "prefered_academic_center_id", nullable = false)
    public String getPreferedAcademicCenterId() {
        return preferedAcademicCenterId;
    }

    public void setPreferedAcademicCenterId(String preferedAcademicCenterId) {
        this.preferedAcademicCenterId = preferedAcademicCenterId;
    }

    @Column(name = "study_medium_id", nullable = false)
    public String getStudyMediumId() {
        return studyMediumId;
    }

    public void setStudyMediumId(String studyMediumId) {
        this.studyMediumId = studyMediumId;
    }

    @Column(name = "al_3_passes", nullable = false)
    public String getAl3Passes() {
        return al3Passes;
    }

    public void setAl3Passes(String al3Passes) {
        this.al3Passes = al3Passes;
    }

    @Column(name = "ol_maths_cpass", nullable = false)
    public String getOlMathsCpass() {
        return olMathsCpass;
    }

    public void setOlMathsCpass(String olMathsCpass) {
        this.olMathsCpass = olMathsCpass;
    }

    @Column(name = "al_gen_english_cpass", nullable = false)
    public String getAlGenEnglishCpass() {
        return alGenEnglishCpass;
    }

    public void setAlGenEnglishCpass(String alGenEnglishCpass) {
        this.alGenEnglishCpass = alGenEnglishCpass;
    }

    @Column(name = "name_with_initial", nullable = false)
    public String getNameWithInitial() {
        return nameWithInitial;
    }

    public void setNameWithInitial(String nameWithInitial) {
        this.nameWithInitial = nameWithInitial;
    }

    @Column(name = "nic", nullable = false)
    public String getNic() {
        return nic;
    }

    public void setNic(String nic) {
        this.nic = nic;
    }

    @Column(name = "correspondance_address", nullable = false)
    public String getCorrespondanceAddress() {
        return correspondanceAddress;
    }

    public void setCorrespondanceAddress(String correspondanceAddress) {
        this.correspondanceAddress = correspondanceAddress;
    }

    @Column(name = "mobile_no", nullable = false)
    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    @Column(name = "land_no", nullable = false)
    public String getLandNo() {
        return landNo;
    }

    public void setLandNo(String landNo) {
        this.landNo = landNo;
    }

    @Column(name = "email", nullable = false)
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "FirstUserApplication [id=" + id +
                ", applicantTypeId=" + applicantTypeId +
                ", specializationId=" + specializationId +
                ", programId=" + programId +
                ", preferedAcademicCenterId=" + preferedAcademicCenterId +
                ", studyMediumId=" + studyMediumId +
                ", al3Passes=" + al3Passes +
                ", olMathsCpass=" + olMathsCpass +
                ", alGenEnglishCpass=" + alGenEnglishCpass +
                ", nameWithInitial=" + nameWithInitial +
                ", nic=" + nic +
                ", correspondanceAddress=" + correspondanceAddress +
                ", mobileNo=" + mobileNo +
                ", landNo=" + landNo +
                ", email=" + email
                + "]";
    }
}
