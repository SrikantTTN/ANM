package com.example.srikant.apishitting.user.java_model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.greenrobot.greendao.annotation.*;


@Entity
public class House{

    @SerializedName("deleted")
    @Expose
    private Boolean deleted;
    @SerializedName("clientGeneratedId")
    @Expose
    private String clientGeneratedId;
    @SerializedName("status")
    @Expose
    private Boolean status;
    @SerializedName("timestamp")
    @Expose
    private Long timestamp;
    @SerializedName("number")
    @Expose
    private String number;
    @SerializedName("address")
    @Expose
    private String address;

    @SerializedName("anganwadiCentreId")
    @Expose
    private Long anganwadiCentreId;

    @SerializedName("version")
    @Expose
    private Integer version;

    @SerializedName("serverGeneratedId")
    @Expose
    private Integer serverGeneratedId;
    @Generated(hash = 819191285)
    public House(Boolean deleted, String clientGeneratedId, Boolean status,
            Long timestamp, String number, String address, Long anganwadiCentreId,
            Integer version, Integer serverGeneratedId) {
        this.deleted = deleted;
        this.clientGeneratedId = clientGeneratedId;
        this.status = status;
        this.timestamp = timestamp;
        this.number = number;
        this.address = address;
        this.anganwadiCentreId = anganwadiCentreId;
        this.version = version;
        this.serverGeneratedId = serverGeneratedId;
    }
    @Generated(hash = 389023854)
    public House() {
    }
    public Boolean getDeleted() {
        return this.deleted;
    }
    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }
    public String getClientGeneratedId() {
        return this.clientGeneratedId;
    }
    public void setClientGeneratedId(String clientGeneratedId) {
        this.clientGeneratedId = clientGeneratedId;
    }
    public Boolean getStatus() {
        return this.status;
    }
    public void setStatus(Boolean status) {
        this.status = status;
    }
    public Long getTimestamp() {
        return this.timestamp;
    }
    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }
    public String getNumber() {
        return this.number;
    }
    public void setNumber(String number) {
        this.number = number;
    }
    public String getAddress() {
        return this.address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public Long getAnganwadiCentreId() {
        return this.anganwadiCentreId;
    }
    public void setAnganwadiCentreId(Long anganwadiCentreId) {
        this.anganwadiCentreId = anganwadiCentreId;
    }
    public Integer getVersion() {
        return this.version;
    }
    public void setVersion(Integer version) {
        this.version = version;
    }
    public Integer getServerGeneratedId() {
        return this.serverGeneratedId;
    }
    public void setServerGeneratedId(Integer serverGeneratedId) {
        this.serverGeneratedId = serverGeneratedId;
    }

}

