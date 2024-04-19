import java.io.File;
import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the directory path: ");
        String mainDir = sc.nextLine();
        File file = new File(mainDir);
        listFiles(file);
    }

    // Recursive function to list all files and subdirectories
    public static void listFiles(File file) {
        if (file.isFile()) {
            System.out.println(file.getName());
        } else if (file.isDirectory()) {
            System.out.println(file.getName() + " (Directory)");
            File[] files = file.listFiles();
            if (files != null) {
                for (File f : files) {
                    listFiles(f);
                }
            }
        }
    }
}

/*
 * Output--
 * Assignment_6 (Directory)
 * Q1.java
 * Data (Directory)
 * diary2.txt
 * diary1.txt
 * Q2.java
 * Q3.java
 * Q4.java
 * Q5.java
 * Q6.java
 * Q7.java
 * Q8.java
 * Q9.java
 * Q10.java
 */