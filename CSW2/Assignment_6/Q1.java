import java.io.FileWriter;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your diary entry: ");
        String entry = sc.nextLine();
        try {
            File file = new File("Data/diary.txt");
            if (file.exists()) {
                System.out.println("File already exists");
            } else {
                FileWriter fw = new FileWriter(file);
                String date = java.time.LocalDate.now().toString();
                fw.write(date + "\n");
                fw.write(entry);
                fw.close();
                System.out.println("Diary entry written to file.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
