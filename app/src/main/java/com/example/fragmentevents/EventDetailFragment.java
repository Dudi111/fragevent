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


public class EventDetailFragment extends Fragment {
    private TextView tvevent;
    private TextView tvdisp;
    private Button mbtnnext;
    private FragListener listener;



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_event_detail, container, false);
    }

    @Override
    public void onViewCreated(@NonNull  View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initview(view);
    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        listener= (FragListener) context;
    }

    private void initview(View view) {
        tvevent=view.findViewById(R.id.ettitle);
        tvdisp=view.findViewById(R.id.etDisc);
        mbtnnext=view.findViewById(R.id.btnNext);
        mbtnnext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String title=tvevent.getText().toString();
                String discription=tvdisp.getText().toString();
                Bundle bundle=new Bundle();
                bundle.putString("title",title);
                bundle.putString("discription",discription);
                if(listener!=null){
                    listener.launchtimeFrag(bundle);
                }

            }
        });
    }
}