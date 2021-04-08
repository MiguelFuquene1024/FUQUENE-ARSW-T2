/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.arsw.openWeather.services;

import com.mashape.unirest.http.exceptions.UnirestException;

import edu.eci.arsw.openWeather.model.OpenWeatherCity;

import java.io.IOException;

/**
 *
 * @author Acer
 */
public interface OpenWeatherService {
    OpenWeatherCity getWeatherByCity(String city) throws UnirestException, IOException;
}
