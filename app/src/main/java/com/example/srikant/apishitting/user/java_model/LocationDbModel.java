package com.example.srikant.apishitting.user.java_model;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.annotation.ToOne;


@Entity(nameInDb = "Anganwadi")
public class LocationDbModel {

    private Integer stateId;

    private String stateName;

    private Integer districtId;

    private String districtName;

    private Integer talukaId;

    private String talukaName;

    private Integer phcId;

    private String phcName;

    private Integer subCentreId;

    private String subCentreName;

    private Integer villageId;

    private String villageName;

    @Id
    private Long anganwadiId;

    private String anganwadiName;


    public Integer getStateId() {
        return stateId;
    }

    public void setStateId(Integer stateId) {
        this.stateId = stateId;
    }

    public String getStateName() {
        return stateName;
    }

    public void setStateName(String stateName) {
        this.stateName = stateName;
    }

    public Integer getDistrictId() {
        return districtId;
    }

    public void setDistrictId(Integer districtId) {
        this.districtId = districtId;
    }

    public String getDistrictName() {
        return districtName;
    }

    public void setDistrictName(String districtName) {
        this.districtName = districtName;
    }

    public Integer getTalukaId() {
        return talukaId;
    }

    public void setTalukaId(Integer talukaId) {
        this.talukaId = talukaId;
    }

    public String getTalukaName() {
        return talukaName;
    }

    public void setTalukaName(String talukaName) {
        this.talukaName = talukaName;
    }

    public Integer getPhcId() {
        return phcId;
    }

    public void setPhcId(Integer phcId) {
        this.phcId = phcId;
    }

    public String getPhcName() {
        return phcName;
    }

    public void setPhcName(String phcName) {
        this.phcName = phcName;
    }

    public Integer getSubCentreId() {
        return subCentreId;
    }

    public void setSubCentreId(Integer subCentreId) {
        this.subCentreId = subCentreId;
    }

    public String getSubCentreName() {
        return subCentreName;
    }

    public void setSubCentreName(String subCentreName) {
        this.subCentreName = subCentreName;
    }

    public Integer getVillageId() {
        return villageId;
    }

    public void setVillageId(Integer villageId) {
        this.villageId = villageId;
    }

    public String getVillageName() {
        return villageName;
    }

    public void setVillageName(String villageName) {
        this.villageName = villageName;
    }

    public Long getAnganwadiId() {
        return anganwadiId;
    }

    public void setAnganwadiId(Long anganwadiId) {
        this.anganwadiId = anganwadiId;
    }

    public String getAnganwadiName() {
        return anganwadiName;
    }

    public void setAnganwadiName(String anganwadiName) {
        this.anganwadiName = anganwadiName;
    }


    @Generated(hash = 2103810425)
    public LocationDbModel(Integer stateId, String stateName, Integer districtId,
            String districtName, Integer talukaId, String talukaName, Integer phcId,
            String phcName, Integer subCentreId, String subCentreName,
            Integer villageId, String villageName, Long anganwadiId,
            String anganwadiName) {
        this.stateId = stateId;
        this.stateName = stateName;
        this.districtId = districtId;
        this.districtName = districtName;
        this.talukaId = talukaId;
        this.talukaName = talukaName;
        this.phcId = phcId;
        this.phcName = phcName;
        this.subCentreId = subCentreId;
        this.subCentreName = subCentreName;
        this.villageId = villageId;
        this.villageName = villageName;
        this.anganwadiId = anganwadiId;
        this.anganwadiName = anganwadiName;
    }

    @Generated(hash = 350558610)
    public LocationDbModel() {
    }
}
