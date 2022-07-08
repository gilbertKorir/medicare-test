package com.example.mydoc;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.mydoc.models.Doctor;
import com.squareup.picasso.Picasso;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class DoctorAdapter extends RecyclerView.Adapter<DoctorAdapter.MyHolder> {
    private Context mContext;
    private List<Doctor> responses;
    View mView;

    public DoctorAdapter(Context mContext, List<Doctor> responses) {
        this.mContext = mContext;
        this.responses = responses;
    }

    @NonNull
    @Override
    public DoctorAdapter.MyHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.display_doctor, parent, false);
        MyHolder myHolder = new MyHolder(view);
        return myHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull DoctorAdapter.MyHolder holder, int position) {
        holder.bindDoctor(responses.get(position));
    }

    @Override
    public int getItemCount() {
        return responses.size();
    }

    protected class MyHolder extends RecyclerView.ViewHolder {
        @BindView(R.id.nameView) TextView mName;
        @BindView(R.id.image) ImageView mImage;
        @BindView(R.id.last) TextView mLast;
        @BindView(R.id.specialization) TextView mSpecial;

        public MyHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
            mContext = itemView.getContext();
            mView = itemView;
        }
        public void bindDoctor(Doctor doctor){

            Picasso.get().load(doctor.getImage()).into(mImage);
            mName.setText(doctor.getFirstName());
            mLast.setText(doctor.getLastName());
            mSpecial.setText(doctor.getSpecialization());

        }
    }
}
