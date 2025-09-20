/*
Create a WeatherController class that uses constructor injection
to receive the WeatherService and has endpoints to:
/weather/temperature - Returns current temperature
/weather/condition - Returns current weather condition
/weather/wind - Returns current wind speed
/weather/all - Returns all weather information in a single response
*/

package com.antoninrgb.labjavaspringbootlocal.controller;
import com.antoninrgb.labjavaspringbootlocal.service.WeatherService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/weather")
public class WeatherController {

    private final WeatherService weatherService;

    WeatherController (WeatherService weatherService) {
        this.weatherService = weatherService;
    }

    @GetMapping("/temperature")
    public int getTemp() {
        return weatherService.getTemp();
    }

    @GetMapping("/condition")
    public String getWeather() {
        return weatherService.getWeather();
    }

    @GetMapping("/wind")
    public int getWind() {
        return weatherService.getWind();
    }

    @GetMapping("/all")
    public String getAll() {
        return "Today it's " + weatherService.getWeather() +
                " with " + weatherService.getTemp() + " degrees. Wind speed: " + weatherService.getWind();
    }
}
