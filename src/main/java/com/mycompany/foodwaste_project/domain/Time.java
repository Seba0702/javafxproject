package com.mycompany.foodwaste_project.domain;

public class Time {

    private int hours = 1;

    private int days = 1;

    Time() {

    }

    Time(int days, int hours) {
        this.days = days;
        this.hours = hours;

    }

    public void setDate(int days, int hours) {
        this.days = days;
        this.hours = hours;

    }

    public int getDateOfHours() {
        return hours;

    }

    public int getDateOfDays() {
        return days;

    }

    public void swichDayWithBed() {
        {
            this.days += 1;
            this.hours = 6;
        }
    }

    public void swichDayOutsideOfBedroom() {
        {

            this.days += 1;
            this.hours = 16;
        }
    }

    public void swichHour() {
        if (this.hours == 0) 
        {
            System.out.println("you need to sleep");
        } 
        else if (this.hours == 23) 
        {
            this.hours -= 23;
        }
        else 
        {
            this.hours += 1;

        }
    }

    public void checkForDaysQuitGame() {
        if (this.days >= 8) {
            System.exit(0);

        }
    }

}


 

