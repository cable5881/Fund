package com.fund.po;

public class Donationunit {
    private Integer donationunitId;

    private String duName;

    private String address;

    private String zipCode;

    private String officephone;

    private String mobilephone;

    private String websiteurl;

    private String fax;

    private String duEmail;

    private Integer donationcontactId;

    private String notes;

    private Byte state;

    public Integer getDonationunitId() {
        return donationunitId;
    }

    public void setDonationunitId(Integer donationunitId) {
        this.donationunitId = donationunitId;
    }

    public String getDuName() {
        return duName;
    }

    public void setDuName(String duName) {
        this.duName = duName == null ? null : duName.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode == null ? null : zipCode.trim();
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

    public String getWebsiteurl() {
        return websiteurl;
    }

    public void setWebsiteurl(String websiteurl) {
        this.websiteurl = websiteurl == null ? null : websiteurl.trim();
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax == null ? null : fax.trim();
    }

    public String getDuEmail() {
        return duEmail;
    }

    public void setDuEmail(String duEmail) {
        this.duEmail = duEmail == null ? null : duEmail.trim();
    }

    public Integer getDonationcontactId() {
        return donationcontactId;
    }

    public void setDonationcontactId(Integer donationcontactId) {
        this.donationcontactId = donationcontactId;
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