package com.nighthawk.spring_portfolio.mvc.calendar;

import java.util.*;
import java.time.YearMonth;

public class APCalendar {

    /** Returns true if year is a leap year and false otherwise.
     * isLeapYear(2019) returns False
     * isLeapYear(2016) returns True
     */          
    static boolean isLeapYear(int year) {
        if ((year % 4 == 0) && (year % 400 == 0 || !(year % 100 == 0))) {
            return true;
        } else {
            return false;
        }
    }
        
    /** Returns the value representing the day of the week 
     * 0 denotes Sunday, 
     * 1 denotes Monday, ..., 
     * 6 denotes Saturday. 
     * firstDayOfYear(2019) returns 2 for Tuesday.
    */
    static int firstDayOfYear(int year) {
        Date currentDate = new Date(year-1900, 0, 1);

        return currentDate.getDay();
    }


    /** Returns n, where month, day, and year specify the nth day of the year.
     * This method accounts for whether year is a leap year. 
     * dayOfYear(1, 1, 2019) return 1
     * dayOfYear(3, 1, 2017) returns 60, since 2017 is not a leap year
     * dayOfYear(3, 1, 2016) returns 61, since 2016 is a leap year. 
    */ 
    private static int dayOfYear(int month, int day, int year) {
        // initializes dayValue as 0
        int dayVal = 0;

        for (int i = 1; i < month; i++) {
            // Creates a yearmonth object for each month in the year
            int monthDays = YearMonth.of(year, i).lengthOfMonth();
            dayVal += monthDays;
        }

        //Adds the day of the incomplete month to dayVal
        dayVal += day;
        return dayVal;
    }

    /** Returns the number of leap years between year1 and year2, inclusive.
     * Precondition: 0 <= year1 <= year2
    */ 
    public static int numberOfLeapYears(int year1, int year2) {
        // initializes leapYearCount as 0
        int leapYearCount = 0;

        // goes through each year to see if leap year = true
        for (int i = year1; i <= year2; i++) {
            if (isLeapYear(i)) {
                leapYearCount++;
            }
        }

        return leapYearCount;
    }

    /** Returns the value representing the day of the week for the given date
     * Precondition: The date represented by month, day, year is a valid date.
    */
    public static int dayOfWeek(int month, int day, int year) { 
        //initializes date object, gets day value of that week of initialized date
        Date date = new Date(year, month - 1, day);
        // fix for date.getDay being inacurate to the format we originally had, requires if statement
        if (date.getDay() == 0) {
            return 6;
        } else {
            return date.getDay() - 1;
        }
    }

    /** Tester method */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a year: ");
        int year = scanner.nextInt();
        
        System.out.println("Please enter a month: ");
        int month = scanner.nextInt();
        
        System.out.println("Please enter a day: ");
        int day = scanner.nextInt();

        System.out.println("Please enter the first year to calculate range: ");
        int year1 = scanner.nextInt();
        
        System.out.println("Please enter the second year to calculate range: ");
        int year2 = scanner.nextInt();


        // Private access modifiers
        System.out.println(year + " is a leap year =2 " + APCalendar.isLeapYear(year));


        // implement switch-case to improve user-friendliness
        System.out.println("The first day of " + year + " is " + APCalendar.firstDayOfYear(year));
        
        
        System.out.println(month + "/" + day + "/" + year + " is the " + APCalendar.dayOfYear(month, day, year) + "th day of the year");

        // Public access modifiers
        System.out.println("The number of leap years between " + year1 + " and " + year2 + " is " + APCalendar.numberOfLeapYears(year1, year2));
        System.out.println("dayOfWeek: " + APCalendar.dayOfWeek(month, day, year));
    }

}