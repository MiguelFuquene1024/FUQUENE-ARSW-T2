/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.arsw.openWeather.services.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.mashape.unirest.http.exceptions.UnirestException;
import edu.eci.arsw.openWeather.model.Cloud;
import edu.eci.arsw.openWeather.model.Coord;
import edu.eci.arsw.openWeather.model.Main;
import edu.eci.arsw.openWeather.model.OpenWeatherCity;
import edu.eci.arsw.openWeather.model.Sys;
import edu.eci.arsw.openWeather.model.Weather;
import edu.eci.arsw.openWeather.model.Wind;

import edu.eci.arsw.openWeather.services.OpenWeatherService;
import edu.eci.arsw.openWeather.services.WebConnectionService;

import java.io.IOException;
import org.json.JSONObject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 *
 * @author Acer
 */
@Service
public class OpenWeatherServiceImpl implements OpenWeatherService{
    
    @Autowired    
    WebConnectionService webConnectionService;
    
    public OpenWeatherServiceImpl() {
        
    }
    
    @Override
    public OpenWeatherCity getWeatherByCity(String city) throws UnirestException, IOException {
        JSONObject cityWeather = webConnectionService.getWeatherByCity(city);

        JSONObject jsonObject = cityWeather.getJSONObject("coord");
        ObjectMapper mapper = new ObjectMapper();
        Coord coord = mapper.readValue(jsonObject.toString(), Coord.class);

        jsonObject = cityWeather.getJSONArray("weather").getJSONObject(0);
        Weather weather = mapper.readValue(jsonObject.toString(), Weather.class);

        String base = cityWeather.getString("base");

        jsonObject = cityWeather.getJSONObject("main");
        Main main = mapper.readValue(jsonObject.toString(), Main.class);

        int visibility = cityWeather.getInt("visibility");

        jsonObject = cityWeather.getJSONObject("wind");
        Wind wind = mapper.readValue(jsonObject.toString(), Wind.class);

        jsonObject = cityWeather.getJSONObject("clouds");
        Cloud clouds = mapper.readValue(jsonObject.toString(), Cloud.class);

        Long dt = cityWeather.getLong("dt");

        jsonObject = cityWeather.getJSONObject("sys");
        Sys sys = mapper.readValue(jsonObject.toString(), Sys.class);

        int timezone = cityWeather.getInt("timezone");

        int id = cityWeather.getInt("id");

        String name = cityWeather.getString("name");

        return new OpenWeatherCity(coord, weather, base, main, visibility, wind, clouds, dt, sys, timezone, id, name);
    }
}
