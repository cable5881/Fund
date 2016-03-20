package com.fund.po;

import java.util.Date;

public class Donor {
    private Integer donorId;

    private String dName;

    private String dSex;

    private Date dBirthday;

    private String dUnit;

    private String dJob;

    private String hobbits;

    private String degreeinfo;

    private String notes;

    private Byte isAlumni;

    private String mobilephone;

    private String dEmail;

    private Integer donationcontactId;

    private Byte state;

    public Integer getDonorId() {
        return donorId;
    }

    public void setDonorId(Integer donorId) {
        this.donorId = donorId;
    }

    public String getdName() {
        return dName;
    }

    public void setdName(String dName) {
        this.dName = dName == null ? null : dName.trim();
    }

    public String getdSex() {
        return dSex;
    }

    public void setdSex(String dSex) {
        this.dSex = dSex == null ? null : dSex.trim();
    }

    public Date getdBirthday() {
        return dBirthday;
    }

    public void setdBirthday(Date dBirthday) {
        this.dBirthday = dBirthday;
    }

    public String getdUnit() {
        return dUnit;
    }

    public void setdUnit(String dUnit) {
        this.dUnit = dUnit == null ? null : dUnit.trim();
    }

    public String getdJob() {
        return dJob;
    }

    public void setdJob(String dJob) {
        this.dJob = dJob == null ? null : dJob.trim();
    }

    public String getHobbits() {
        return hobbits;
    }

    public void setHobbits(String hobbits) {
        this.hobbits = hobbits == null ? null : hobbits.trim();
    }

    public String getDegreeinfo() {
        return degreeinfo;
    }

    public void setDegreeinfo(String degreeinfo) {
        this.degreeinfo = degreeinfo == null ? null : degreeinfo.trim();
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes == null ? null : notes.trim();
    }

    public Byte getIsAlumni() {
        return isAlumni;
    }

    public void setIsAlumni(Byte isAlumni) {
        this.isAlumni = isAlumni;
    }

    public String getMobilephone() {
        return mobilephone;
    }

    public void setMobilephone(String mobilephone) {
        this.mobilephone = mobilephone == null ? null : mobilephone.trim();
    }

    public String getdEmail() {
        return dEmail;
    }

    public void setdEmail(String dEmail) {
        this.dEmail = dEmail == null ? null : dEmail.trim();
    }

    public Integer getDonationcontactId() {
        return donationcontactId;
    }

    public void setDonationcontactId(Integer donationcontactId) {
        this.donationcontactId = donationcontactId;
    }

    public Byte getState() {
        return state;
    }

    public void setState(Byte state) {
        this.state = state;
    }
}