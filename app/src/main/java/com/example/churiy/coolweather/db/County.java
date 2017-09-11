package com.example.churiy.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by Churiy on 2017/9/11.
 */

public class County extends DataSupport{
    private int ID,countyCode;
    private String countyName;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getCountyCode() {
        return countyCode;
    }

    public void setCountyCode(int countyCode) {
        this.countyCode = countyCode;
    }

    public String getCountyName() {
        return countyName;
    }

    public void setCountyName(String countyName) {
        this.countyName = countyName;
    }
}
