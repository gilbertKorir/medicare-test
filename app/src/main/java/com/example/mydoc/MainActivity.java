package com.example.mydoc;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.mydoc.models.Doctor;
import com.example.mydoc.network.DoctorApi;
import com.example.mydoc.network.DoctorClient;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
    private DoctorAdapter mDisplayAdapter;
    @BindView(R.id.recycler) RecyclerView mRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);


        DoctorApi client = DoctorClient.getClient();
        Call<List<Doctor>> call = client.getDoctors();

        call.enqueue(new Callback<List<Doctor>>(){

            @Override
            public void onResponse(Call<List<Doctor>> call, Response<List<Doctor>> response) {

                if(response.isSuccessful()){
                    List<Doctor> doctor = response.body();
                    DoctorAdapter doctorAdapter = new DoctorAdapter(mRecyclerView.getContext(),doctor);
                    mRecyclerView.setAdapter(doctorAdapter);
                    mRecyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
                }
            }

            @Override
            public void onFailure(Call<List<Doctor>> call, Throwable t) {

            }
        });

    }
}