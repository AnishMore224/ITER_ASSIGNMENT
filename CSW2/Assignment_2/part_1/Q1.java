package part_1;

public class Q1 {
    public static void main(String[] args) {
        Student_1<Integer> a = new Student_1<>("Tom", 1, 40);
        Student_1<String> b = new Student_1<>("Jerry", "2", 40);
        System.out.println(a + "\n" + b);
    }
}

class Student_1<T> {
    String name;
    T roll;
    int age;

    Student_1(String name, T roll, int age) {
        this.name = name;
        this.roll = roll;
        this.age = age;
    }

    public String toString() {
        return "Name: " + this.name + "\t Roll No.: " + this.roll + "\t Age:" + this.age;
    }
}
/*
 * Output--
 * Name: Tom Roll No.: 1 Age:40
 * Name: Jerry Roll No.: 2 Age:40
 */