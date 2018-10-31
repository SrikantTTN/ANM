package com.example.srikant.apishitting.user.java_model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Location {

    @SerializedName("stateId")
    @Expose
    public Integer stateId;

    @SerializedName("stateName")
    @Expose
    public LocName stateName;

    @SerializedName("districtId")
    @Expose
    public Integer districtId;

    @SerializedName("districtName")
    @Expose
    public LocName districtName;

    @SerializedName("talukaId")
    @Expose
    public Integer talukaId;

    @SerializedName("talukaName")
    @Expose
    public LocName talukaName;

    @SerializedName("phcId")
    @Expose
    public Integer phcId;

    @SerializedName("phcName")
    @Expose
    public LocName phcName;

    @SerializedName("subCentreId")
    @Expose
    public Integer subCentreId;

    @SerializedName("subCentreName")
    @Expose
    public LocName subCentreName;

    @SerializedName("villageId")
    @Expose
    public Integer villageId;

    @SerializedName("villageName")
    @Expose
    public LocName villageName;

    @SerializedName("anganwadiId")
    @Expose
    public Long anganwadiId;

    @SerializedName("anganwadiName")
    @Expose
    public LocName anganwadiName;

    @SerializedName("anganwadiWorkerDetails")
    @Expose
    public UserDetails anganwadiWorkerDetails;

    @SerializedName("ashaWorkerDetails")
    @Expose
    public UserDetails ashaWorkerDetails;

    @SerializedName("anmWorkerDetails")
    @Expose
    public UserDetails anmWorkerDetails;

    @SerializedName("awwHelperWorkerDetails")
    @Expose
    public UserDetails awwHelperWorkerDetails;
}
