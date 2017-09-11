package com.example.churiy.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by Churiy on 2017/9/11.
 */

public class County extends DataSupport {
    private int ID;
    private int cityID;
    private String weatherID;
    private String countyName;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getCityID() {
        return cityID;
    }

    public void setCityID(int cityID) {
        this.cityID = cityID;
    }

    public String getWeatherID() {
        return weatherID;
    }

    public void setWeatherID(String weatherID) {
        this.weatherID = weatherID;
    }

    public String getCountyName() {
        return countyName;
    }

    public void setCountyName(String countyName) {
        this.countyName = countyName;
    }
}