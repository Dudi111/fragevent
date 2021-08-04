package com.example.fragmentevents;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;


public class PriceFragment extends Fragment {
    private TextView tvrs;
    private  TextView tvcurrency;
    private Button mbtnpreview;
    private String title;
    private String discription;
    private String startdate;
    private String enddate;
    private String starttime;
    private String endtime;


    @Override
    public void onCreate(@Nullable  Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if(getArguments()!=null){
            title=getArguments().getString("title");
            discription=getArguments().getString("discription");
            startdate=getArguments().getString("startdate");
            enddate=getArguments().getString("enddate");
            starttime=getArguments().getString("starttime");
            endtime=getArguments().getString("endtime");

        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_price, container, false);
    }

    @Override
    public void onViewCreated(@NonNull  View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initViews(view);
    }

    private void initViews(View view) {
        tvrs=view.findViewById(R.id.tvprice);
        tvcurrency=view.findViewById(R.id.tvcurrency);
        mbtnpreview=view.findViewById(R.id.btnpreview);
        mbtnpreview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String price=tvrs.getText().toString();
                Model model=new Model(title,discription,startdate,enddate,starttime,endtime,price);
                Intent intent=new Intent(getActivity(),PreviewActivity.class);
                intent.putExtra("model",model);
                startActivity(intent);

            }
        });
    }
}