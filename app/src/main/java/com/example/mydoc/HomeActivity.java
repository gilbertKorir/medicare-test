package com.example.mydoc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class HomeActivity extends AppCompatActivity implements View.OnClickListener {
    @BindView(R.id.btn)
    Button mSend;
    @BindView(R.id.editdrug) EditText mEdit;
    @BindView(R.id.searchdoctor)TextView mSearch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        ButterKnife.bind(this);

        mSend.setOnClickListener(this);
        mSearch.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v == mSend) {
            String drug = mEdit.getText().toString().trim();
            Intent intent = new Intent(HomeActivity.this, DrugActivity.class);
            intent.putExtra("drug", drug);
            startActivity(intent);
        }
        if (v == mSearch) {
            Intent intent = new Intent(HomeActivity.this, MainActivity.class);
            startActivity(intent);
        }
    }
}