package com.switchcase;

import java.util.Scanner;

public class NumberToCharacter {
    Scanner scanner = new Scanner(System.in);
    char forRepeat;
    public void numberToCharacterFormat() {
        System.out.print("Enter Number between 0 & 10: ");
        byte myNumber = scanner.nextByte();
        switch (myNumber) {
            case 0:
                System.out.println("Zero");
                break;
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            case 3:
                System.out.println("Three");
                break;
            case 4:
                System.out.println("Four");
                break;
            case 5:
                System.out.println("Five");
                break;
            case 6:
                System.out.println("Six");
                break;
            case 7:
                System.out.println("Seven");
                break;
            case 8:
                System.out.println("Eight");
                break;
            case 9:
                System.out.println("Nine");
                break;
            case 10:
                System.out.println("Ten");
            default:
                System.out.println("Out of Range!\n" + "Enter number between 0 to 10: ");
        }
    }

    public void loopTheFunction() {
        do {
            numberToCharacterFormat();
            System.out.print("Enter 'Y' if you want to Repeat.");
            forRepeat = scanner.next().charAt(0);
        } while (forRepeat == 'y' || forRepeat == 'Y');
    }
}
