package com.example.fragmentevents;

import java.io.Serializable;

public class Model implements Serializable {
    private String title;
    private String Discription;
    private String startdate;
    private String enddate;
    private String starttime;
    private String endtime;
    private String price;

    public Model(String title, String discription, String startdate, String enddate, String starttime, String endtime, String price) {
        this.title = title;
        Discription = discription;
        this.startdate = startdate;
        this.enddate = enddate;
        this.starttime = starttime;
        this.endtime = endtime;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public String getDiscription() {
        return Discription;
    }

    public String getStartdate() {
        return startdate;
    }

    public String getEnddate() {
        return enddate;
    }

    public String getStarttime() {
        return starttime;
    }

    public String getEndtime() {
        return endtime;
    }

    public String getPrice() {
        return price;
    }
}
