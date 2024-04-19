//2.	Read from a File: Write a Java application that opens the "diary.txt" file created in the previous question and displays its content on the console. The program should handle cases where the file does not exist by displaying an appropriate error message
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
public class Q2 {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("Data/diary.txt");
            int i;
            while ((i = fr.read()) != -1) {
                System.out.print((char) i);
            }
            fr.close();
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
