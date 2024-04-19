//9.	Display File Metadata: Create a Java program that displays metadata of a specified file. The user should be able to input the file name, and the program should output the file size, last modified date, and other available attributes.

import java.util.*;
import java.io.*;

public class Q9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of the file: ");
        String fileName = sc.nextLine();
        File file = new File(fileName);
        if (file.exists()) {
            System.out.println("File Size: " + file.length() + " bytes");
            System.out.println("Last Modified: " + new Date(file.lastModified()));
            System.out.println("Readable: " + file.canRead());
            System.out.println("Writable: " + file.canWrite());

        } else {
            System.out.println("File does not exist.");
        }
    }
}
/*
 * Output--
 * File Size: 58 bytes
 * Last Modified: Fri Apr 19 17:44:26 IST 2024
 * Readable: true
 * Writable: true
 */