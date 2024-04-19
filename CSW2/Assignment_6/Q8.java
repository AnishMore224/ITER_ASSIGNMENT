
import java.io.File;

public class Q8 {
    public static void main(String[] args) {

        File file = new File("Data/diary.txt");
        File rename = new File("Data/diary2.txt");
        boolean flag = file.renameTo(rename);

        if (flag == true) {
            System.out.println("File Successfully Rename");
        } else {
            System.out.println("Operation Failed");
        }
    }
}
/*
 * Output--
 * File Successfully Rename
 */