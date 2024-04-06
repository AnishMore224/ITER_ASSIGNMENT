
import java.io.*;
import java.io.FileNotFoundException;

public class Q24 {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream(
                    "C:\\Users\\hp\\Desktop\\2241013365\\csw2\\Assignment_3\\abc1.txt");
        } catch (FileNotFoundException e) {
            System.out.println(e);
        }
    }
}
/*
 * Output:
 * java.io.FileNotFoundException:
 * C:\Users\hp\Desktop\2241013365\csw2\Assignment_3\abc1.txt (The system cannot
 * find the path specified)
 */