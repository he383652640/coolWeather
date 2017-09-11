package com.example.churiy.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by Churiy on 2017/9/11.
 */

public class Province extends DataSupport{

    private String provinceName;
    private int ID,provinceCode;

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(int provinceCode) {
        this.provinceCode = provinceCode;
    }
}
