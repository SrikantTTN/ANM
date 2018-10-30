package com.example.srikant.apishitting.home.java_model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Generated;

@Entity
public class UserDetails {

    @SerializedName("profileUrl")
    @Expose
    private String profileUrl;

    @SerializedName("firstName")
    @Expose
    private String firstName;

    @SerializedName("lastName")
    @Expose
    private String lastName;

    @SerializedName("phoneNumber")
    @Expose
    private String phoneNumber;

    @SerializedName("gender")
    @Expose
    private String gender;
    @SerializedName("alternatePhoneNumber")
    @Expose
    private String alternatePhoneNumber;

    @SerializedName("emailId")
    @Expose
    private String emailId;

    @Id
    @SerializedName("id")
    @Expose
    private Long id;

    @SerializedName("userType")
    @Expose
    private String userType;

    @Generated(hash = 1740312876)
    public UserDetails(String profileUrl, String firstName, String lastName,
            String phoneNumber, String gender, String alternatePhoneNumber,
            String emailId, Long id, String userType) {
        this.profileUrl = profileUrl;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.gender = gender;
        this.alternatePhoneNumber = alternatePhoneNumber;
        this.emailId = emailId;
        this.id = id;
        this.userType = userType;
    }

    @Generated(hash = 64089743)
    public UserDetails() {
    }

    public String getProfileUrl() {
        return this.profileUrl;
    }

    public void setProfileUrl(String profileUrl) {
        this.profileUrl = profileUrl;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getGender() {
        return this.gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAlternatePhoneNumber() {
        return this.alternatePhoneNumber;
    }

    public void setAlternatePhoneNumber(String alternatePhoneNumber) {
        this.alternatePhoneNumber = alternatePhoneNumber;
    }

    public String getEmailId() {
        return this.emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserType() {
        return this.userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }
}