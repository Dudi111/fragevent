package com.example.fragmentevents;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class PreviewActivity extends AppCompatActivity {
    private TextView tvview1;
    private TextView tvview2;
    private TextView tvview3;
    private TextView tvview4;
    private TextView tvview5;
    private TextView tvview6;
    private TextView tvview7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_preview);
        initviews();
        getdata();
    }

    private void getdata() {
        Model model= (Model) getIntent().getSerializableExtra("model");
        tvview1.setText(model.getTitle());
        tvview2.setText(model.getDiscription());
        tvview3.setText(model.getStartdate());
        tvview4.setText(model.getEnddate());
        tvview5.setText(model.getStarttime());
        tvview6.setText(model.getEndtime());
        tvview7.setText(model.getPrice());
    }

    private void initviews() {
        tvview1=findViewById(R.id.tvview1);
        tvview2=findViewById(R.id.tvview2);
        tvview3=findViewById(R.id.tvview3);
        tvview4=findViewById(R.id.tvview4);
        tvview5=findViewById(R.id.tvview5);
        tvview6=findViewById(R.id.tvview6);
        tvview7=findViewById(R.id.tvview7);
    }
}