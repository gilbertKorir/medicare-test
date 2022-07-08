package com.example.mydoc.network;

import com.example.mydoc.models.Brand;
import com.example.mydoc.models.Doctor;
import com.example.mydoc.models.DrugList;
import com.example.mydoc.models.FormAndDosage;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface DrugApi {
    @GET("{slug}")
    Call<DrugList> getInfo(@Path("slug") String slug);
}
