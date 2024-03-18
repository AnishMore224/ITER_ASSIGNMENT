package part_2;
import java.util.*;

public class Q3 {
    public static void main(String[] args) {
        ArrayList<Car> ob = new ArrayList<>();
        ob.add(new Car(2013, "creta", 10));
        ob.add(new Car(2017, "Audi", 45));
        ob.add(new Car(2018, "Kia", 20));
        ob.add(new Car(2015, "BMW", 55));
        ob.add(new Car(2020, "MG", 13));
        Collections.sort(ob);
        System.out.println("Sorted List:\n" + ob);

    }
}

class Car implements Comparable<Car> {
    private int ModalNo;
    private String name;
    private int stock;

    Car(int modalno, String nm, int stk) {
        this.ModalNo = modalno;
        this.name = nm;
        this.stock = stk;
    }

    public int compareTo(Car c) {
        return this.stock - c.stock;
    }

    public String toString() {
        return "ModalNo:" + this.ModalNo + "\tName:" + this.name + "\tStock:" + this.stock + "\n";
    }
}

/*
 * Output--
 * Sorted List:
 * [ModalNo:2013 Name:creta Stock:10
 * , ModalNo:2020 Name:MG Stock:13
 * , ModalNo:2018 Name:Kia Stock:20
 * , ModalNo:2017 Name:Audi Stock:45
 * , ModalNo:2015 Name:BMW Stock:55
 * ]
 */