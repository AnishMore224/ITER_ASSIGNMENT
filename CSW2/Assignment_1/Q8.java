interface Vehicle {
    abstract void accelerate();

    abstract void brake();
}

class Car1 implements Vehicle {
    public void accelerate() {
        System.out.println("Car is accelerating at 2m/s^2");
    }

    public void brake() {
        System.out.println("Car Brake is getting applied");
    }

    public void accelerate(double speed) {
        System.out.println("Car is accelerating at speed:" + speed);
    }

    public void accelerate(int duration) {
        System.out.println("Car is accelerating for duartion:" + duration);
    }
}

class Bicycle implements Vehicle {
    public void accelerate() {
        System.out.println("Bicycle is accelerating at 1m/s^2");
    }

    public void accelerate(double speed) {
        System.out.println("Bicycle is accelerating at speed:" + speed);
    }

    public void accelerate(int duration) {
        System.out.println("Bicycle is accelerating for duration:" + duration);
    }

    public void brake() {
        System.out.println("Bicycle Brake is getting applied");
    }
}

public class Q8 {
    public static void main(String[] args) {
        Car1 c = new Car1();
        Bicycle b = new Bicycle();
        c.accelerate();
        c.brake();
        b.accelerate();
        b.brake();
        c.accelerate(60.0);
        c.accelerate(5);
    }
}

/*
 * Output--
 * Car is accelerating at 2m/s^2
 * Car Brake is getting applied
 * Bicycle is accelerating at 1m/s^2
 * Bicycle Brake is getting applied
 * Car is accelerating at speed:60.0
 * Car is accelerating for duartion:5
 */