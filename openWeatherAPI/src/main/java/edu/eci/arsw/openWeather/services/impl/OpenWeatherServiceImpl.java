/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.arsw.openWeather.services.impl;

import com.mashape.unirest.http.exceptions.UnirestException;

import edu.eci.arsw.openWeather.services.OpenWeatherService;

import java.io.IOException;

/**
 *
 * @author Acer
 */
public class OpenWeatherServiceImpl implements OpenWeatherService{

    @Override
    public void getWeatherByCity(String city) throws UnirestException, IOException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
