/*
Create a TimeController class that uses constructor injection to receive the TimeService and has endpoints to:
/time - Returns current time
/date - Returns current date
/day - Returns current day of the week
/all - Returns all time information in a single response
*/

package com.antoninrgb.labjavaspringbootlocal.controller;
import com.antoninrgb.labjavaspringbootlocal.service.TimeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TimeController {
    private final TimeService timeService;

    TimeController (TimeService timeService) {
        this.timeService = timeService;
    }

    @GetMapping("/time")
    public String getTime() {
        return timeService.getTime();
    }

    @GetMapping("/date")
    public String getDate() {
        return timeService.getDate();
    }

    @GetMapping("/day")
    public String getDay() {
        return timeService.getDay();
    }

    @GetMapping("/all")
    public String getAll() {
        return "Today it's " + timeService.getDay() + " " + timeService.getDate() + " and it's " + timeService.getTime();
    }
}
