
package com.example.mydoc.models;

import java.util.List;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class Generic {

    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("formAndDosages")
    @Expose
    private List<FormAndDosage__1> formAndDosages = null;
    @SerializedName("mostCommonPricingKey")
    @Expose
    private String mostCommonPricingKey;
    @SerializedName("mostCommonImageUrl")
    @Expose
    private String mostCommonImageUrl;
    @SerializedName("mostCommonDefaultQty")
    @Expose
    private Integer mostCommonDefaultQty;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Generic() {
    }

    /**
     * 
     * @param mostCommonDefaultQty
     * @param mostCommonImageUrl
     * @param name
     * @param formAndDosages
     * @param mostCommonPricingKey
     */
    public Generic(String name, List<FormAndDosage__1> formAndDosages, String mostCommonPricingKey, String mostCommonImageUrl, Integer mostCommonDefaultQty) {
        super();
        this.name = name;
        this.formAndDosages = formAndDosages;
        this.mostCommonPricingKey = mostCommonPricingKey;
        this.mostCommonImageUrl = mostCommonImageUrl;
        this.mostCommonDefaultQty = mostCommonDefaultQty;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<FormAndDosage__1> getFormAndDosages() {
        return formAndDosages;
    }

    public void setFormAndDosages(List<FormAndDosage__1> formAndDosages) {
        this.formAndDosages = formAndDosages;
    }

    public String getMostCommonPricingKey() {
        return mostCommonPricingKey;
    }

    public void setMostCommonPricingKey(String mostCommonPricingKey) {
        this.mostCommonPricingKey = mostCommonPricingKey;
    }

    public String getMostCommonImageUrl() {
        return mostCommonImageUrl;
    }

    public void setMostCommonImageUrl(String mostCommonImageUrl) {
        this.mostCommonImageUrl = mostCommonImageUrl;
    }

    public Integer getMostCommonDefaultQty() {
        return mostCommonDefaultQty;
    }

    public void setMostCommonDefaultQty(Integer mostCommonDefaultQty) {
        this.mostCommonDefaultQty = mostCommonDefaultQty;
    }

}
