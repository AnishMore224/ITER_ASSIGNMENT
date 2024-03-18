package part_2;
import java.util.HashMap;
import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        HashMap<Integer, Book> ob = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        ob.put(1, new Book(224, "csw", "Mayur Ramgir", 100));
        ob.put(2, new Book(243, "ad", "tartas", 150));
        System.out.println(ob);
        System.out.print("Enter book name to search:");
        String s = sc.next();
        for (Book book : ob.values()) {
            if (book.name.equalsIgnoreCase(s)) {
                System.out.println(s + "  is present  in the library.");
                break;
            }
        }
        System.out.print("Enter key to remove:");
        int k = sc.nextInt();
        ob.remove(k);
        System.out.println("After removing--\n" + ob);
    }
}

class Book {
    long id;
    String name;
    String author;
    int quantity;

    Book(long id, String name, String author, int quantity) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.quantity = quantity;
    }

    public String toString() {
        return "Id : " + id + "\tName : " + name + "\tAuthor : " + author + "\tQuantity : " + quantity + "\n";
    }
}

/*
 * Output--
 * {1=Id : 224  : csw Aut Mayur Ramgir Quantity 100
 *  * , 2=Id :  Name : ad  : tartas Quantity : 150
 *  
 *  * Enter book name to search
 *  * d is prese  in the library
 *  * Enter key to remov
 *  * After removin
 *  * {1=Id :  ame : csw   : Mayur Ramgir Quant  : 100
 *  * }
 */