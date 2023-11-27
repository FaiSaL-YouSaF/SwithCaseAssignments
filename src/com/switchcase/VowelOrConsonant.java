package com.switchcase;

import java.util.Scanner;

public class VowelOrConsonant {
    Scanner scanner = new Scanner(System.in);
    char forRepeat;
    public void isVowelOrConsonant() {
        System.out.print("Enter a Letter to check if it is vowel or consonant: ");
        char myChar = scanner.next().charAt(0);

        switch (myChar) {
            case 'a':
                System.out.println("Vowel");
                break;
            case 'e':
                System.out.println("Vowel");
                break;
            case 'i':
                System.out.println("Vowel");
                break;
            case 'o':
                System.out.println("Vowel");
                break;
            case 'u':
                System.out.println("Vowel");
                break;
            case 'A':
                System.out.println("Vowel");
                break;
            case 'E':
                System.out.println("Vowel");
                break;
            case 'I':
                System.out.println("Vowel");
                break;
            case 'O':
                System.out.println("Vowel");
                break;
            case 'U':
                System.out.println("Vowel");
                break;
            default:
                System.out.println("Consonant");
        }
    }
    public void vowelChecker() {
        do {
            isVowelOrConsonant();
            System.out.print("Enter 'Y' if you want to repeat: ");
            forRepeat = scanner.next().charAt(0);
        }while (forRepeat == 'y' || forRepeat == 'Y');
    }
}
