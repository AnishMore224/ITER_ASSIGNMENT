import java.util.*;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder ob = new StringBuilder();

        while (true) {
            System.out.println("***Menu*** \n 1) Add a substring at a specified position \n " +
                    "2) Remove a range of characters from the string.\n" +
                    "3) Modify a character at a specified index.\n" +
                    "4) Concatenate another string at the end.\n" +
                    "5) Exit");
            int ch = sc.nextInt();
            switch (ch) {

                case 1:
                    System.out.print("Insert string and Index: ");
                    ob.insert(sc.nextInt(), sc.next());
                    System.out.println("After insert:" + ob);
                    break;
                case 2:
                    System.out.print("Delete from Index1 to Index2: ");
                    ob.delete(sc.nextInt(), sc.nextInt());
                    System.out.println("After delete:" + ob);
                    break;
                case 3:
                    System.out.print("Enter index and character: ");
                    ob.setCharAt(sc.nextInt(), sc.next().charAt(0));
                    System.out.println("After modify:" + ob);
                    break;
                case 4:
                    System.out.print("Add string: ");
                    ob.append(sc.next());
                    System.out.println("After append:" + ob);
                    break;
                case 5:
                    System.exit(0);
                default:
                    System.out.println("Invalid Input");
            }
        }
    }
}

/*
 * Output--
 * ***Menu***
 * 1) Add a substring at a specified position
 * 2) Remove a range of characters from the string.
 * 3) Modify a character at a specified index.
 * 4) Concatenate another string at the end.
 * 5) Exit
 * 4
 * Add string: anish
 * After append:anish
 *** Menu***
 * 1) Add a substring at a specified position
 * 2) Remove a range of characters from the string.
 * 3) Modify a character at a specified index.
 * 4) Concatenate another string at the end.
 * 5) Exit
 * 1
 * Insert string and Index: 2 224
 * After insert:an224ish
 *** Menu***
 * 1) Add a substring at a specified position
 * 2) Remove a range of characters from the string.
 * 3) Modify a character at a specified index.
 * 4) Concatenate another string at the end.
 * 5) Exit
 * 2
 * Delete from Index1 to Index2: 2 5
 * After delete:anish
 *** Menu***
 * 1) Add a substring at a specified position
 * 2) Remove a range of characters from the string.
 * 3) Modify a character at a specified index.
 * 4) Concatenate another string at the end.
 * 5) Exit
 * 3
 * Enter index and character: 1 m
 * After modify:amish
 *** Menu***
 * 1) Add a substring at a specified position
 * 2) Remove a range of characters from the string.
 * 3) Modify a character at a specified index.
 * 4) Concatenate another string at the end.
 * 5) Exit
 * 5
 * Invalid Input
 *** Menu***
 * 1) Add a substring at a specified position
 * 2) Remove a range of characters from the string.
 * 3) Modify a character at a specified index.
 * 4) Concatenate another string at the end.
 * 5) Exit
 * 5
 */