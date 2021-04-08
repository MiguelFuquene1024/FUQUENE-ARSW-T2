/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.arsw.openWeather.services;

import com.mashape.unirest.http.exceptions.UnirestException;

import org.json.JSONObject;

/**
 *
 * @author Acer
 */
public interface WebConnectionService {
    JSONObject getWeatherByCity(String city) throws UnirestException;
}