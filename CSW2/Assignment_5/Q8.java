import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two strings:");
        String s1 = sc.next();
        String s2 = sc.next();
        System.out.println(s1 + s2);
        System.out.println(s1.concat(s2));
        System.out.println("Enter index Number");
        int index = sc.nextInt();
        System.out.println("Character at index " + index + " is " + s1.charAt(index));
    }
}

/*
 * Output--
 * Enter two strings:hello
 * anish
 * helloanish
 * helloanish
 * Enter index Number
 * 3
 * Character at index 3 is l
 */