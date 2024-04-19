import java.util.*;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuffer ob = new StringBuffer();

        while (true) {
            System.out.println("***Menu*** \n1. Append a given string to the existing text.\n" +
                    "2. Insert a given string at a specified index within the existing text.\n" +
                    "3. Delete a portion of text between two specified indices.\r\n" +
                    "4. Reverse the entire text.\n" +
                    "5. Replace a portion of the text between two specified indices with a given string.\n 6:Exit");
            int ch = sc.nextInt();
            switch (ch) {
                case 1:
                    System.out.print("Append string: ");
                    ob.append(sc.next());
                    System.out.println("After append:" + ob);
                    break;
                case 2:
                    System.out.print("Insert Index and string: ");
                    ob.insert(sc.nextInt(), sc.next());
                    System.out.println("After insert:" + ob);
                    break;
                case 3:
                    System.out.print("Delete from Index1 to Index2: ");
                    ob.delete(sc.nextInt(), sc.nextInt());
                    System.out.println("After delete:" + ob);

                    break;
                case 4:
                    System.out.println("\nAfter Reverse:" + ob.reverse());
                    break;
                case 5:
                    System.out.print("Enter string:");
                    String s = sc.next();
                    System.out.print("Enter range:");
                    ob.replace(sc.nextInt(), sc.nextInt(), s);
                    System.out.println("After replace:" + ob);
                    break;
                case 6:
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
 * 1. Append a given string to the existing text.
 * 2. Insert a given string at a specified index within the existing text.
 * 3. Delete a portion of text between two specified indices.
 * 4. Reverse the entire text.
 * 5. Replace a portion of the text between two specified indices with a given
 * string.
 * 6:Exit
 * 
 * 1
 * Append string: anish
 * After append:anish
 *** Menu***
 * 1. Append a given string to the existing text.
 * 2. Insert a given string at a specified index within the existing text.
 * 3. Delete a portion of text between two specified indices.
 * 4. Reverse the entire text.
 * 5. Replace a portion of the text between two specified indices with a given
 * string.
 * 6:Exit
 * 2
 * Insert string and Index: 2 hello
 * After insert:anhelloish
 *** Menu***
 * 1. Append a given string to the existing text.
 * 2. Insert a given string at a specified index within the existing text.
 * 3. Delete a portion of text between two specified indices.
 * 4. Reverse the entire text.
 * 5. Replace a portion of the text between two specified indices with a given
 * string.
 * 6:Exit
 * 3
 * Delete from Index1 to Index2: 2 7
 * After delete:anish
 *** Menu***
 * 1. Append a given string to the existing text.
 * 2. Insert a given string at a specified index within the existing text.
 * 3. Delete a portion of text between two specified indices.
 * 4. Reverse the entire text.
 * 5. Replace a portion of the text between two specified indices with a given
 * string.
 * 6:Exit
 * 4
 * 
 * After Reverse:hsina
 *** Menu***
 * 1. Append a given string to the existing text.
 * 2. Insert a given string at a specified index within the existing text.
 * 3. Delete a portion of text between two specified indices.
 * 4. Reverse the entire text.
 * 5. Replace a portion of the text between two specified indices with a given
 * string.
 * 6:Exit
 * 5
 * Enter string:anish
 * Enter range:0 5
 * After replace:anish
 *** Menu***
 * 1. Append a given string to the existing text.
 * 2. Insert a given string at a specified index within the existing text.
 * 3. Delete a portion of text between two specified indices.
 * 4. Reverse the entire text.
 * 5. Replace a portion of the text between two specified indices with a given
 * string.
 * 6:Exit
 * 6
 */