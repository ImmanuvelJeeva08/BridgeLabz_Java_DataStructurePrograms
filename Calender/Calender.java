/******************************************************************************************************************
 *
 * Write a program Calendar.java that takes the month and year as command-line arguments and prints the Calendar of the month.
 * Store the Calendar in an 2D Array,
 * the first dimension the week of the month and the second dimension stores the day of the week.
 *
 * @author : Immanuvel Jeeva
 * @Since  : 29-07-2021
 *
 ******************************************************************************************************************/
package Calender;

import java.util.Scanner;

public class Calender {
    public static int day(int month, int day, int year) {
        int y = year - (14 - month) / 12;
        int x = y + y/4 - y/100 + y/400;
        int m = month + 12 * ((14 - month) / 12) - 2;
        int d = (day + x + (31*m)/12) % 7;
        return d;
    }

    public static boolean isLeapYear(int year) {
        if  ((year % 4 == 0) && (year % 100 != 0))
            return true;
        if  (year % 400 == 0)
            return true;

        return false;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the month in digits: ");
        int month = input.nextInt();
        System.out.print("Enter the year: ");
        int year = input.nextInt();

        //Leave the 0th index because month count starts from 1
        String[] months = {"", "January", "February", "March", "April", "May", "June",
                "July", "August", "September", "October", "November", "December"};

        //Leave the 0th index since there is no 0th month
        int[] days = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        // check for leap year
        if (month == 2 && isLeapYear(year))
            days[month] = 29;

        // print calendar header
        System.out.println("   " + months[month] + " " + year);
        System.out.println(" S  M Tu  W Th  F  S");

        // starting day
        int d = day(month, 1, year);

        // print the calendar
        for (int i = 0; i < d; i++)
            System.out.print("   ");
        for (int i = 1; i <= days[month]; i++) {
            System.out.printf("%2d ", i);
            if ((i + d) % 7 == 0)
                System.out.println();
        }

        QueueMain queueMain = new QueueMain();
        queueMain.performQueueOperation(days, d, month);

        StackMain stackMain = new StackMain();
        stackMain.performStackOperation(days, d, month);
    }
}

