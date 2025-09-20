/*
Create a TimeService class that has methods to:
Get current time
Get current date
Get current day of the week
*/

package com.antoninrgb.labjavaspringbootlocal.service;
import org.springframework.stereotype.Service;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalTime;

@Service
public class TimeService {

    public String getTime() {
        return LocalTime.now().toString();
    }

    public String getDate() {
        return LocalDate.now().toString();
    }

    public String getDay() {
        return (LocalDate.now()).getDayOfWeek().toString();
    }

}
