import java.util.Scanner;
import java.util.ArrayList;

class EnrollmentException extends Exception {
    public EnrollmentException(String message) {
        super(message);
    }
}

interface enrollmentSystem {
    void dropping(student s);

    void enrolling(student s);

    boolean checkEnrollment(student s);

    void display();
}

class enrollment implements enrollmentSystem {
    static ArrayList<student> suArrayList = new ArrayList<>();

    public void dropping(student student) {
        suArrayList.remove(student);
    }

    public void enrolling(student student) {
        suArrayList.add(student);
    }

    public boolean checkEnrollment(student s) {
        for (student s1 : suArrayList) {
            if (s1.id == s.id) {
                return true;
            }
        }
        return false;
    }

    public void display() {
        for (student s1 : suArrayList) {
            s1.display();
        }

    }

}

class student {
    String name;
    long id;
    course c;

    public student(String name, long id, course c) {
        this.c = c;
        this.id = id;
        this.name = name;
    }

    void display() {
        System.out.println("Name:" + name + "	id:" + id + "	" + c);
    }

}

class course {
    String CourseName, codeString;
    static Scanner sc = new Scanner(System.in);

    public course() {
        System.out.print("Enter course name:");
        this.CourseName = sc.next();
        System.out.print("Enter course code:");
        this.codeString = sc.next();
    }

    public String toString() {
        return "course:" + CourseName + "	code:" + codeString;
    }

}

public class Q9 {

    static Scanner sc = new Scanner(System.in);

    public static student dataentry() {
        System.out.print("Enter Name: ");
        String name = sc.next();
        System.out.print("Enter Id: ");
        long id = sc.nextLong();
        course c = new course();
        student s1 = new student(name, id, c);
        return s1;
    }

    public static void main(String[] args) {

        enrollment e1 = new enrollment();
        while (true) {
            System.out.println("--------------");
            System.out.println("     MENU     ");
            System.out.println("--------------");
            System.out.println("Exit   (0)");
            System.out.println("Enroll (1)");
            System.out.println("Drop   (2)");
            System.out.println("Display(3)");
            int ch = sc.nextInt();
            switch (ch) {
                case 0:
                    System.exit(0);
                    break;
                case 1:
                    student s1 = dataentry();
                    try {
                        if (e1.checkEnrollment(s1)) {
                            throw new EnrollmentException("Already Enrolled!");
                        } else {
                            e1.enrolling(s1);
                        }
                    } catch (Exception e) {
                        System.out.println(e);
                    }
                    break;
                case 2:
                    student s2 = dataentry();
                    try {
                        if (!e1.checkEnrollment(s2)) {
                            throw new EnrollmentException("Student not found!");
                        } else {
                            e1.dropping(s2);
                        }
                    } catch (Exception e) {
                        System.out.println(e);
                    }
                    break;
                case 3:
                    e1.display();
                    break;

                default:
                    System.out.println("Invalid input!!!");
                    break;
            }
        }
    }
}
