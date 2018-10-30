package com.example.srikant.apishitting.home.java_model;

import com.google.gson.annotations.SerializedName;
import org.greenrobot.greendao.annotation.Entity;

public class Language {

    @SerializedName("id")
    private String langId;

    @SerializedName("name")
    private String langName;
}
