package com.example.fragmentevents;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;


public class TimeDateFragment extends Fragment {
    private TextView tvstdate;
    private TextView tvenddate;
    private TextView tvsttime;
    private TextView tvendtime;
    private Button mbtnahead;
    private FragListener listener;



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_time_date, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable  Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        inittview(view);
    }

    @Override
    public void onAttach(@NonNull  Context context) {
        super.onAttach(context);
        listener= (FragListener) context;
    }

    private void inittview(View view) {
        tvstdate=view.findViewById(R.id.tvstartdate);
        tvenddate=view.findViewById(R.id.tvenddate);
        tvsttime=view.findViewById(R.id.tvstarttime);
        tvendtime=view.findViewById(R.id.tvendtime);
        mbtnahead=view.findViewById(R.id.btnahead);
        mbtnahead.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String startdate=tvstdate.getText().toString();
                String enddate=tvenddate.getText().toString();
                String starttime=tvsttime.getText().toString();
                String endtime=tvendtime.getText().toString();
                Bundle bundle=new Bundle();
                bundle.putString("startdate",startdate);
                bundle.putString("enddate",enddate);
                bundle.putString("starttime",starttime);
                bundle.putString("endtime",endtime);
                if(listener!=null){
                    listener.launchPriceGrag(bundle);
                }

            }
        });

    }
}