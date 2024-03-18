package part_1;

import java.util.*;

public class Q4 {
    public static void main(String[] args) {
        Student_2[] arr = new Student_2[3];
        System.out.println("Enter 3 student detail:");
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            arr[i] = new Student_2(sc.next(), sc.nextInt(), sc.nextDouble());
        }
        System.out.print("Enter student data to search: ");
        Student_2 s = new Student_2(sc.next(), sc.nextInt(), sc.nextDouble());
        boolean isFound = false;
        for (int i = 0; i < 3; i++) {
            if (arr[i].compareTo(s) == 0) {
                isFound = true;
                break;
            }
        }
        if (isFound) {
            System.out.println("Found");
        } else {
            System.out.println("Not Found");
        }

    }
}

class Student_2 implements Comparable<Student_2> {
    String name;
    int rn;
    double total_mark;

    Student_2(String n, int r, double m) {
        this.name = n;
        this.rn = r;
        this.total_mark = m;
    }

    public int compareTo(Student_2 stu) {
        return this.rn == stu.rn && this.name.equals(stu.name) && this.total_mark == stu.total_mark ? 0 : -1;
    }
}
/*
 * Output--
 * Enter 3 student detail:
 * Anish 2 88.7
 * Himanshu 4 90.3
 * Tushar 5 88.5
 * Enter student data to search: Tushar 5 88.5
 * Found
 */