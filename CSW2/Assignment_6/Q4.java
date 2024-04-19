
import java.io.*;
import java.util.*;

public class Q4 {
    public static void main(String[] args) {
        String mainDir = "G:/300324/csw2/Assignment_6/";
        File file = new File(mainDir);
        Stack<File> s = new Stack<>();
        s.push(file);
        System.out.println("Content of Directory " + mainDir + " is");
        while (!s.empty()) {
            File tmpF = s.pop();
            if (tmpF.isFile()) {
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
 * Q4.java
 * Q3.java
 * Q2.java
 * diary.txt
 * Q1.java
 * abc.java
 */
