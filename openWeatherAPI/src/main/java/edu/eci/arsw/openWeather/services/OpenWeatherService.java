/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.arsw.openWeather.services;

import com.mashape.unirest.http.exceptions.UnirestException;

import java.io.IOException;

/**
 *
 * @author Acer
 */
public interface OpenWeatherService {
    void getWeatherByCity(String city) throws UnirestException, IOException;
}
