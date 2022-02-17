package com.company;

public class ConverterSwitch implements Converter{

    @Override
    public String convertMonth(int monthNumber) {
        switch(monthNumber){
            case 12:
                return "December";
            case 11:
                 return "November";
            case 10:
                return "October";
            case 9:
                return "September";
            case 8:
                return "August";
            case 7:
                return "July";
            case 6:
                return "June";
            case 5:
                return "May";
            case 4:
                return "April";
            case 3:
                return "March";
            case 2:
                return "February";
            case 1:
                return "January";
            default:
                return "This month doesn't exist";

        }

    }

    @Override
    public String convertDay(int dayNumber) {
        switch (dayNumber){
            case 1:
                return "Sunday";
            case 2:
                return "Monday";
            case 3:
                return "Tuesday";
            case 4:
                return "Wednesday";
            case 5:
                return "Thursday";
            case 6:
                return "Friday";
            case 7:
                return "Saturday";
            default:
                return "Day of week is not valid";
        }
    }
}
