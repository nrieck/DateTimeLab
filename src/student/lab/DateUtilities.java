/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student.lab;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author Nick
 */
public class DateUtilities {
    
    private DateUtilities() {      
    }
    
    public final LocalDateTime nowLocalDateTime() {
        return LocalDateTime.now();
    }
    
    public final LocalDate nowLocalDate() {
        return LocalDate.now();
    }
    
    public final LocalTime nowLocalTime() {
        return LocalTime.now();
    }
    
    public final String nowLocalFormatted() {
        LocalDateTime date = LocalDateTime.now();
        DateTimeFormatter format = DateTimeFormatter.ofPattern("MMM d yyyy  hh:mm a");
        String strDate = date.format(format);
        return strDate;
    }
    
    public final long findDaysInBetween(LocalDate startDate, LocalDate endDate) throws IllegalArgumentException{
        if(startDate == null || endDate == null){
            throw new IllegalArgumentException("Start date or endDate null");
        }
        Duration difference = Duration.between(startDate, endDate);
        long daysCalc = difference.toDays();
        return daysCalc;
    }
    
    public final Duration findDurationBetweenDates(LocalDate startDate, LocalDate endDate) throws IllegalArgumentException{
        if(startDate == null || endDate == null){
            throw new IllegalArgumentException("Start date or endDate null");
        }
        Duration difference = Duration.between(startDate, endDate);
        return difference;
    }
}