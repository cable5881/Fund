package com.fund.po;

public class Benificiarycontact {
    private Integer benificiarycontactId;

    private String bcName;

    private String officephone;

    private String mobilephone;

    private String fax;

    private String bcEmail;

    private String notes;

    private Byte state;

    public Integer getBenificiarycontactId() {
        return benificiarycontactId;
    }

    public void setBenificiarycontactId(Integer benificiarycontactId) {
        this.benificiarycontactId = benificiarycontactId;
    }

    public String getBcName() {
        return bcName;
    }

    public void setBcName(String bcName) {
        this.bcName = bcName == null ? null : bcName.trim();
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

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax == null ? null : fax.trim();
    }

    public String getBcEmail() {
        return bcEmail;
    }

    public void setBcEmail(String bcEmail) {
        this.bcEmail = bcEmail == null ? null : bcEmail.trim();
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes == null ? null : notes.trim();
    }

    public Byte getState() {
        return state;
    }

    public void setState(Byte state) {
        this.state = state;
    }
}