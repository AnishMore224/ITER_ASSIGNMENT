
//	Delete a Specific File: Write a Java program where the user can enter the name of a file to be deleted from the system. The program should check if the file exists and delete it, providing a confirmation message upon successful deletion or an error message if the file does not exist.
import java.io.*;
import java.util.*;

public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of the file to be deleted: ");
        String fileName = sc.nextLine();
        File file = new File(fileName);
        if (file.exists()) {
            if (file.delete()) {
                System.out.println("File deleted successfully.");
            } else {
                System.out.println("An error occurred while deleting the file.");
            }
        } else {
            System.out.println("File does not exist.");
        }
    }
}
/*
 * Output--
 * Enter the name of the file to be deleted:
 * abc.java
 * File deleted successfully.
 */