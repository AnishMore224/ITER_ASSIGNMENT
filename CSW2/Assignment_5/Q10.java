//10.	Interactive String Explorer: Prompt the user for a string. Display a menu with options to perform various operations: convert to lowercase/uppercase, search for a character/index, or concatenate with another string. Based on user selection, perform the appropriate string operation and show the result.

import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string:");
        String s = sc.next();
        while (true) {
            System.out.println("1. Convert to Lowercase\n" + "2. Convert to Uppercase\n" + "3. Search for a character\n"
                    + "4. Concatenate with another string\n" + "5. Exit");
            int ch = sc.nextInt();

            switch (ch) {
                case 1:
                    System.out.println("Lowercase: " + s.toLowerCase());
                    break;
                case 2:
                    System.out.println("Uppercase: " + s.toUpperCase());
                    break;
                case 3:
                    System.out.println("Enter the character to search:");
                    char c = sc.next().charAt(0);
                    System.out.println("First occurrence of " + c + " is at index " + s.indexOf(c));
                    break;
                case 4:
                    System.out.println("Enter the string to concatenate:");
                    String s2 = sc.next();
                    System.out.println("Concatenated String: " + s.concat(s2));
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid Input");
                    break;
            }
        }
    }
}

/*
 * Output--
 * Enter the string:
 * helloo
 * 1. Convert to Lowercase
 * 2. Convert to Uppercase
 * 3. Search for a character
 * 4. Concatenate with another string
 * 5. Exit
 * 1
 * Lowercase: helloo
 * 1. Convert to Lowercase
 * 2. Convert to Uppercase
 * 3. Search for a character
 * 4. Concatenate with another string
 * 5. Exit
 * 2
 * Uppercase: HELLOO
 * 1. Convert to Lowercase
 * 2. Convert to Uppercase
 * 3. Search for a character
 * 4. Concatenate with another string
 * 5. Exit
 * 3
 * Enter the character to search:
 * l
 * First occurrence of l is at index 2
 * 1. Convert to Lowercase
 * 2. Convert to Uppercase
 * 3. Search for a character
 * 4. Concatenate with another string
 * 5. Exit
 * 5
 */