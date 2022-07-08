
package com.example.mydoc.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Doctor {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("firstName")
    @Expose
    private String firstName;
    @SerializedName("lastName")
    @Expose
    private String lastName;
    @SerializedName("image")
    @Expose
    private String image;
    @SerializedName("specialization")
    @Expose
    private String specialization;
    @SerializedName("hospital")
    @Expose
    private String hospital;
    @SerializedName("experience")
    @Expose
    private Double experience;
    @SerializedName("phone")
    @Expose
    private Integer phone;
    @SerializedName("rating")
    @Expose
    private Double rating;
    @SerializedName("about")
    @Expose
    private String about;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Doctor() {
    }

    /**
     * 
     * @param firstName
     * @param lastName
     * @param image
     * @param phone
     * @param rating
     * @param about
     * @param specialization
     * @param id
     * @param hospital
     * @param experience
     */
    public Doctor(Integer id, String firstName, String lastName, String image, String specialization, String hospital, Double experience, Integer phone, Double rating, String about) {
        super();
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.image = image;
        this.specialization = specialization;
        this.hospital = hospital;
        this.experience = experience;
        this.phone = phone;
        this.rating = rating;
        this.about = about;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public String getHospital() {
        return hospital;
    }

    public void setHospital(String hospital) {
        this.hospital = hospital;
    }

    public Double getExperience() {
        return experience;
    }

    public void setExperience(Double experience) {
        this.experience = experience;
    }

    public Integer getPhone() {
        return phone;
    }

    public void setPhone(Integer phone) {
        this.phone = phone;
    }

    public Double getRating() {
        return rating;
    }

    public void setRating(Double rating) {
        this.rating = rating;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }

}
