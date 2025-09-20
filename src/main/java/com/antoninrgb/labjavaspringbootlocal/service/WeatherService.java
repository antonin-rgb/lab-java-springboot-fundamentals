/*
Create a WeatherService class that has methods to:
Get current temperature (simulate with random number between -10 and 40)
Get weather condition (randomly return: "Sunny", "Rainy", "Cloudy", "Windy")
Get wind speed (simulate with random number between 0 and 100)
*/

package com.antoninrgb.labjavaspringbootlocal.service;
import org.springframework.stereotype.Service;
import java.util.Random;

@Service
public class WeatherService {
    Random random = new Random();
    String[] options = {"Sunny", "Rainy", "Cloudy", "Windy"};

    public int getTemp() {
        return random.nextInt(51) - 10;
    }

    public String getWeather() {
        return options[random.nextInt(options.length)];
    }

    public int getWind() {
        return random.nextInt(101);
    }
}
