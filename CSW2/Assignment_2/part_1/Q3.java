package part_1;

public class Q3 {
    public static void main(String[] args) {
        Car_1 car1 = new Car_1("Breeza", "White", 110.5);
        Car_1 car2 = new Car_1("Innova", "White", 120);
        System.out.println("Greater speed:" + (car1.compareTo(car2) == 1 ? car1 : car2));
    }
}

class Car_1 implements Comparable<Car_1> {
    String model;
    String color;
    double speed;

    Car_1(String m, String c, double s) {
        this.model = m;
        this.color = c;
        this.speed = s;
    }

    public int compareTo(Car_1 other) {
        if (this.speed < other.speed)
            return -1;
        else if (this.speed == other.speed)
            return 0;
        else
            return 1;
    }

    public String toString() {
        return "Model:" + model + "\t Color: " + color + "\t Speed: " + speed;
    }
}
/*
 * Output--
 * Greater speed:Model:Innova Color: White Speed: 120.0
 */