package part_1;

public class Q6 {
    public static void main(String[] args) {
        Animal a1 = new Animal(1, "Dog", "Black", "pet");
        Animal a2 = new Animal(2, "Cat", "White", "wild");
        System.out.println("Dog hashCode:" + a1.hashCode());
        System.out.println("Cat hashCode:" + a2.hashCode());
    }
}

class Animal {
    String name;
    String color;
    String type;
    int id;

    public Animal(int id, String name, String color, String type) {
        this.id = id;
        this.name = name;
        this.color = color;
        this.type = type;
    }

    public int hashCode() {
        return id;
    }
}
/*
 * Output:
 * Dog hashCode:1
 * Cat hashCode:2
 */