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
import com.example.mydoc.models.FormAndDosage;
import com.squareup.picasso.Picasso;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class DrugAdapter extends RecyclerView.Adapter<DrugAdapter.MyViewHolder> {
    private Context mContext;
    private List<FormAndDosage> formAndDosages;

    public DrugAdapter(Context mContext, List<FormAndDosage> formAndDosages) {
        this.mContext = mContext;
        this.formAndDosages = formAndDosages;
    }

    @NonNull
    @Override
    public DrugAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.display_drug, parent, false);
        DrugAdapter.MyViewHolder myHolder = new DrugAdapter.MyViewHolder(view);
        return myHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull DrugAdapter.MyViewHolder holder, int position) {
        holder.bindDrug(formAndDosages.get(position));
    }

    @Override
    public int getItemCount() {
        return formAndDosages.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        @BindView(R.id.form) TextView mForm;
        @BindView(R.id.drugimage) ImageView mImage;
        @BindView(R.id.price) TextView mprice;
        @BindView(R.id.strength) TextView mStr;
        @BindView(R.id.qty) TextView mqty;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
            mContext = itemView.getContext();
        }
        public void bindDrug(FormAndDosage formAndDosage){
            Picasso.get().load(formAndDosage.getImageUrl()).into(mImage);
            mForm.setText(formAndDosage.getForm());
            mprice.setText(formAndDosage.getPricingUrlKey());
            mStr.setText(formAndDosage.getStrength());
            mqty.setText(formAndDosage.getDefaultQty().toString());
        }
    }
}
