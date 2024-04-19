
//5.	Filter and List Specific File Types: Create a Java application that lists all the ".txt" files in a given directory. The program should prompt the user for the directory path and then display a list of all text files found in that directory.
import java.io.*;
import java.util.*;

public class Q5 {
    public static void main(String[] args) {
        String mainDir = "G:/300324/csw2/Assignment_6/";
        File file = new File(mainDir);
        Stack<File> s = new Stack<>();
        s.push(file);
        System.out.println("Content of Directory " + mainDir + " is");
        while (!s.empty()) {
            File tmpF = s.pop();
            if (tmpF.isFile() && tmpF.getName().endsWith(".txt")) {
                System.out.println(tmpF.getName());
            } else if (tmpF.isDirectory()) {
                File[] f = tmpF.listFiles();
                for (File fpp : f) {
                    s.push(fpp);
                }
            }
        }
    }
}
/*
 * Output--
 * Content of Directory G:/300324/csw2/Assignment_6/ is
 * diary.txt
 */
