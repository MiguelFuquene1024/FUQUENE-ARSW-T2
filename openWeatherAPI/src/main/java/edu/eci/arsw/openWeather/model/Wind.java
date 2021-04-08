/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.arsw.openWeather.model;

import java.io.Serializable;

/**
 *
 * @author Acer
 */
public class Wind implements Serializable{
    private double speed;
    private double deg;
    
    public Wind() {

    }

    public Wind(double speed, double deg) {
        this.speed = speed;
        this.deg = deg;
    }

    public double getDeg() {
        return deg;
    }

    public void setDeg(double deg) {
        this.deg = deg;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }
}
