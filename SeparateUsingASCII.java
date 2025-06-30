package com.day1;
import java.util.Scanner;

public class SeparateUsingASCII {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

    
        char[] chars = input.toCharArray();

 
        char[] letters = new char[input.length()];
        char[] digits = new char[input.length()];
        char[] symbols = new char[input.length()];

        int letterIndex = 0, digitIndex = 0, symbolIndex = 0;

        for (char ch : chars) {
            if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
                letters[letterIndex++] = ch;
            } else if (ch >= '0' && ch <= '9') {
                digits[digitIndex++] = ch; 
            } else {
                symbols[symbolIndex++] = ch; 
            }
        }

   
        System.out.print("Letters: ");
        for (int i = 0; i < letterIndex; i++) {
            System.out.print(letters[i]);
        }
        System.out.println("\nTotal letters: " + letterIndex);
        System.out.println();

        System.out.print("Digits: ");
        for (int i = 0; i < digitIndex; i++) {
            System.out.print(digits[i]);
        }
        System.out.println("\nTotal digits: " + digitIndex);
        System.out.println();

        System.out.print("Symbols: ");
        for (int i = 0; i < symbolIndex; i++) {
            System.out.print(symbols[i]);
        }
        System.out.println("\nTotal symbols: " + symbolIndex);
        System.out.println();

        scanner.close();
    }
}
