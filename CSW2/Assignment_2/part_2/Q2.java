import java.util.Arrays;

public class Q2 {
    public static void main(String[] args) {
        User arr[] = new User[3];
        arr[0] = new User("Anish", 20);
        arr[1] = new User("Himashu", 19);
        arr[2] = new User("Swastik", 18);
        System.out.println("Before sorting--");
        for (User i : arr) {
            System.out.println(i);
        }
        Arrays.sort(arr);
        System.out.println("After sorting--");
        for (User i : arr) {
            System.out.println(i);
        }
    }
}

class User implements Comparable<User> {
    private String name;
    private int age;

    User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return this.age;
    }

    public String toString() {
        return "User Name : " + this.getName() + "\tUser Age : " + this.getAge();
    }

    public int compareTo(User u) {
        if (this.getAge() > u.getAge())
            return 1;
        else if (this.getAge() < u.getAge())
            return -1;
        else
            return 0;
    }
}

/*
 * Output--
 * Before sorting--
 * User Name : Anish User Age : 20
 * User Name : Himashu User Age : 19
 * User Name : Swastik User Age : 18
 * After sorting--
 * User Name : Swastik User Age : 18
 * User Name : Himashu User Age : 19
 * User Name : Anish User Age : 20
 */