package com.switchcase;

import java.util.Scanner;

public class DaysOfWeek {
    Scanner scanner = new Scanner(System.in);
    public void daysOfWeek() {
        System.out.print("Enter the Day of Week (0 to 6): ");
        int day = scanner.nextInt();
        switch (day) {
            case 0:
                System.out.println("Sunday");
                break;
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Enter Number between 0 to 6");
        }

    }
}
