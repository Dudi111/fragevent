package com.example.fragmentevents;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements FragListener{
    private FragmentManager fragmentManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fragmentManager=getSupportFragmentManager();
        launchstudentdetailfragment();
    }
    private void launchstudentdetailfragment() {

        FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
        EventDetailFragment eventDetailFragment=new EventDetailFragment();
        fragmentTransaction.add(R.id.container,eventDetailFragment,"EventFragment").commit();
    }

    @Override
    public void launchtimeFrag(Bundle bundle) {
        FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
        TimeDateFragment timeDateFragment=new TimeDateFragment();
        timeDateFragment.setArguments(bundle);
        fragmentTransaction.replace(R.id.container,timeDateFragment,"TimeDateFragment").addToBackStack("").commit();


    }

    @Override
    public void launchPriceGrag(Bundle bundle) {
        FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
        PriceFragment priceFragment=new PriceFragment();
        priceFragment.setArguments(bundle);
        fragmentTransaction.replace(R.id.container,priceFragment,"PriceFragment").addToBackStack("").commit();

    }
}