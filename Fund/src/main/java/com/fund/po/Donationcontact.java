package com.fund.po;

public class Donationcontact {
    private Integer donationcontactId;

    private String dcName;

    private String job;

    private String officephone;

    private String mobilephone;

    private String dcEmail;

    private String fax;

    private String notes;

    private Byte isAlumni;

    private Byte state;

    public Integer getDonationcontactId() {
        return donationcontactId;
    }

    public void setDonationcontactId(Integer donationcontactId) {
        this.donationcontactId = donationcontactId;
    }

    public String getDcName() {
        return dcName;
    }

    public void setDcName(String dcName) {
        this.dcName = dcName == null ? null : dcName.trim();
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job == null ? null : job.trim();
    }

    public String getOfficephone() {
        return officephone;
    }

    public void setOfficephone(String officephone) {
        this.officephone = officephone == null ? null : officephone.trim();
    }

    public String getMobilephone() {
        return mobilephone;
    }

    public void setMobilephone(String mobilephone) {
        this.mobilephone = mobilephone == null ? null : mobilephone.trim();
    }

    public String getDcEmail() {
        return dcEmail;
    }

    public void setDcEmail(String dcEmail) {
        this.dcEmail = dcEmail == null ? null : dcEmail.trim();
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax == null ? null : fax.trim();
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

    public Byte getState() {
        return state;
    }

    public void setState(Byte state) {
        this.state = state;
    }
}