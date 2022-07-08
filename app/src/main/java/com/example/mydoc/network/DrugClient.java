package com.example.mydoc.network;

import static com.example.mydoc.Constants.BASE_URL;
import static com.example.mydoc.Constants.DRUG_URL;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class DrugClient {
    private static Retrofit retrofit = null;

    public static DrugApi getClient() {

        if (retrofit == null) {
            retrofit = new Retrofit.Builder()
                    .baseUrl(DRUG_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit.create(DrugApi.class);
    }
}
