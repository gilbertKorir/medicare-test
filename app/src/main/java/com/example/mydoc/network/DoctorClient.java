package com.example.mydoc.network;

import static com.example.mydoc.Constants.BASE_URL;

import com.example.mydoc.models.Doctor;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class DoctorClient {
    private static Retrofit retrofit = null;

    public static DoctorApi getClient() {

        if (retrofit == null) {
            retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }

        return retrofit.create(DoctorApi.class);
    }
}
