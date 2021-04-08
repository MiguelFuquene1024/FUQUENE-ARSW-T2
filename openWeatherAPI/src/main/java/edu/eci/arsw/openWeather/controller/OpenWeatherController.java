/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.arsw.openWeather.controller;

import edu.eci.arsw.openWeather.services.OpenWeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Acer
 */
@RestController
public class OpenWeatherController {
    @Autowired
    OpenWeatherService weatherService;
    
    @RequestMapping(value = "weather/{city}", method = RequestMethod.GET)
    public ResponseEntity<?> getWeatherByCity(@PathVariable(name="city") String city) {
        try {
            return new ResponseEntity<>(weatherService.getWeatherByCity(city), HttpStatus.ACCEPTED);
        } catch(Exception e) {
            return new ResponseEntity<>("Error, no se pudo buscar la ciudad", HttpStatus.BAD_REQUEST);
        }
    }
}
