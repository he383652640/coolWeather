package com.example.churiy.coolweather.utils;

import android.text.TextUtils;

import com.example.churiy.coolweather.db.City;
import com.example.churiy.coolweather.db.County;
import com.example.churiy.coolweather.db.Province;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by Churiy on 2017/9/11.
 */

public class Utility {

    /**
     * 解析和处理服务器返回的省级数据
     */
    public static boolean handleProvinceResponse(String response){
        if(!TextUtils.isEmpty(response)){
            try {
                JSONArray allProvince = new JSONArray(response);
                for(int i=0;i<allProvince.length();i++){
                    JSONObject provinceObject =allProvince.getJSONObject(i);
                    Province province =new Province();
                    province.setProvinceName(provinceObject.getString("name"));
                    province.setProvinceCode(provinceObject.getInt("id"));
                    province.save();
                }
                return true;
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }


        return  false;
    }

    /**
     * 解析和处理服务器返回的市级数据
     */
    public static boolean handleCityResponse(String response,int provinceID){
        if(!TextUtils.isEmpty(response)){
            try {
                JSONArray allCities =new JSONArray(response);
                for(int i=0;i<allCities.length();i++){
                    JSONObject cityObject =allCities.getJSONObject(i);
                    City city =new City();
                    city.setCityName(cityObject.getString("name"));
                    city.setCityCode(cityObject.getInt("id"));
                    city.setProvinceID(provinceID);
                    city.save();
                }

                return true;
            } catch (JSONException e) {
                e.printStackTrace();
            }


        }
        return false;
    }


    /**
     * 解析和处理服务器返回的县级数据
     */
    public  static  boolean handleCountyResponse(String response,int cityID){
        if (!TextUtils.isEmpty(response)){
            try {
                JSONArray allCounties =new JSONArray(response);
                for(int i=0;i<allCounties.length();i++){
                    JSONObject countyObject = allCounties.getJSONObject(i);
                    County county= new County();
                    county.setCountyName(countyObject.getString("name"));
                    county.setWeatherID(countyObject.getString("weather_id"));
                    county.setCityID(cityID);
                    county.save();
                }
                return true;
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }

        return false;
    }
}
