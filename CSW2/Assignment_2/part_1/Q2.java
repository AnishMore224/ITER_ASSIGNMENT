package part_1;

public class Q2 {
    public static void main(String[] args) {
        Book a = new Book(1, "Java", 300.5);
        Book b = new Book(2, "Python", 300.5);
        System.out.println(a + "\n" + b);
        System.out.println("Is Equals:" + a.equals(b));
    }
}

class Book {
    int bookId;
    String bookName;
    double price;

    Book(int bookId, String bookName, double price) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.price = price;
    }

    public boolean equals(Book b) {
        return this.price == b.price;
    }

    public String toString() {
        return "ID: " + this.bookId + "\t Name: " + this.bookName + "\t Price:" + this.price;
    }
}