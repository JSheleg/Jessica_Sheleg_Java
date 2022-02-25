package com.company.M2ChallengeShelegJessica.controller;

import com.company.M2ChallengeShelegJessica.models.Month;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

@RestController
public class MonthController {
    public static List<Month> monthList = new ArrayList<>(Arrays.asList(
            new Month(1, "January"),
            new Month(2, "February"),
            new Month(3, "March"),
            new Month(4,"April"),
            new Month(5, "May"),
            new Month(6,"June"),
            new Month(7, "July"),
            new Month(8, "August"),
            new Month(9, "September"),
            new Month(10, "October"),
            new Month(11, "November"),
            new Month(12, "December")
    ));

    // get random month "/randomMonth"
    @RequestMapping(value = "/randomMonth", method = RequestMethod.GET)
    @ResponseStatus(value = HttpStatus.OK)
    public Month getRandomMonth(){
        Random rand = new Random();
        int length = monthList.size();
        int num = rand.nextInt(length);
        return monthList.get(num);
    }

    //get month by number "/month/{monthNumber}
    @RequestMapping(value = "/month/{monthNumber}", method = RequestMethod.GET)
    @ResponseStatus(value = HttpStatus.OK)
    public Month getMonthByMonthNumber(@PathVariable int monthNumber){
        if(monthNumber < 1 || monthNumber > 12){
            //throw 422 error: unproccesable entity
            throw new IllegalArgumentException("Input is out of range");


        }
        Month foundMonth = null;
        for(Month month: monthList){
            if(month.getMonthNumber() == monthNumber){
                foundMonth = month;
                break;
            }
        }

        return foundMonth;
    }


}
