package com.example.churiy.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by Churiy on 2017/9/11.
 */

public class City extends DataSupport{
    private int ID,cityCode;
    private String cityName;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getCityCode() {
        return cityCode;
    }

    public void setCityCode(int cityCode) {
        this.cityCode = cityCode;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }
}
