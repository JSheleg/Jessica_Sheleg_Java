package com.company.M2ChallengeShelegJessica.models;

import java.util.Objects;

public class Month {
    int monthNumber;
    String monthName;

    public Month(int monthNumber, String monthName) {
        this.monthNumber = monthNumber;
        this.monthName = monthName;
    }

    public Month(int monthNumber) {
        this.monthNumber = monthNumber;
    }

    public Month() {
    }

    public int getMonthNumber() {
        return monthNumber;
    }

    public void setMonthNumber(int monthNumber) {
        this.monthNumber = monthNumber;
    }

    public String getMonthName() {
        return monthName;
    }

    public void setMonthName(String monthName) {
        this.monthName = monthName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Month month = (Month) o;
        return monthNumber == month.monthNumber && Objects.equals(monthName, month.monthName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(monthNumber, monthName);
    }
}
