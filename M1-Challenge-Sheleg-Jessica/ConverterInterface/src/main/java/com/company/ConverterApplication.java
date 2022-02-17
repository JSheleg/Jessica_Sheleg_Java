package com.company;

public class ConverterApplication {
    public static void main(String[] args) {

        Converter converterSwitch = new ConverterSwitch();
        Converter converterIf = new ConverterIf();

        System.out.println("=============If/Else Conditionals =================");

        String dayOfWeek =  converterIf.convertDay(1);
        System.out.println(dayOfWeek);
        String dayOfWeekError = converterIf.convertDay(10);
        System.out.println(dayOfWeekError);
        String monthOfYear = converterIf.convertMonth(7);
        System.out.println(monthOfYear);
        String monthOfYearError = converterIf.convertMonth(20);
        System.out.println(monthOfYearError);

        System.out.println("==================Switch Statement===========================");

        String dayOfWeekSwitch = converterSwitch.convertDay(5);
        System.out.println(dayOfWeekSwitch);
        String dayOfWeekSwitchError = converterSwitch.convertDay(0);
        System.out.println(dayOfWeekSwitchError);
        String monthOfYearSwitch = converterSwitch.convertMonth(2);
        System.out.println(monthOfYearSwitch);
        String monthOfYearSwitchError = converterSwitch.convertMonth(25);
        System.out.println(monthOfYearSwitchError);






    }
}
