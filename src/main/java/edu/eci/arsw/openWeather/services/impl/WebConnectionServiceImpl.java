/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.arsw.openWeather.services.impl;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import edu.eci.arsw.openWeather.services.WebConnectionService;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

/**
 *
 * @author Acer
 */
@Service
public class WebConnectionServiceImpl implements WebConnectionService{

    public WebConnectionServiceImpl() {
    }

    @Override
    public JSONObject getWeatherByCity(String city) throws UnirestException {
        HttpResponse<String> httpResponse = Unirest.get("http://api.openweathermap.org/data/2.5/weather?q="+city+"&appid=99993786b64ca9a49cabd7fe9b6cdcc1").asString();
        return new JSONObject(httpResponse.getBody());    
    }
    
}
