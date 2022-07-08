package com.example.mydoc;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.example.mydoc.models.Brand;
import com.example.mydoc.models.Doctor;
import com.example.mydoc.models.DrugList;
import com.example.mydoc.models.FormAndDosage;
import com.example.mydoc.network.DoctorApi;
import com.example.mydoc.network.DoctorClient;
import com.example.mydoc.network.DrugApi;
import com.example.mydoc.network.DrugClient;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class DrugActivity extends AppCompatActivity {
    @BindView(R.id.recyc) RecyclerView mRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drug);
        ButterKnife.bind(this);


        Intent intent = getIntent();
        String slug = intent.getStringExtra("drug");

        DrugApi client = DrugClient.getClient();
        Call<DrugList> call = client.getInfo(slug);

        call.enqueue(new Callback<DrugList>(){

            @Override
            public void onResponse(Call<DrugList> call, Response<DrugList> response) {
                if(response.isSuccessful()){
//                    Log.d("TAG", call.request().url().toString());
                    List<FormAndDosage> form =  response.body().getData().getBrand().getFormAndDosages();
                    DrugAdapter drugAdapter = new DrugAdapter(mRecyclerView.getContext(), form);
                    mRecyclerView.setAdapter(drugAdapter);
                    mRecyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
                }else{
                    Toast.makeText(getBaseContext(), "Drug does not exist", Toast.LENGTH_SHORT).show();
                }
            }
            @Override
            public void onFailure(Call<DrugList> call, Throwable t) {
                Toast.makeText(getBaseContext(), "Look for internet", Toast.LENGTH_SHORT).show();
            }
        });

    }
}