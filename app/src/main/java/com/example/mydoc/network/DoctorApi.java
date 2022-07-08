package com.example.mydoc.network;

import com.example.mydoc.models.Doctor;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface DoctorApi {
    @GET("doctor")
    Call<List<Doctor>> getDoctors();
}
