//Create a functional interface Shape with a method double area() and a default method void printArea(). Implement the interface using lambda expressions for different shapes. Define the Shape functional interface with an area method. Implement the interface for shapes like circle, square, and rectangle using lambda expressions. Use the default method to print the area of each shape.
class Q4 {
    public static void main(String[] args) {
        Shape circle = () -> {
            double radius = 5;
            return Math.PI * radius * radius;
        };
        circle.printArea();
        Shape square = () -> {
            double side = 5;
            return side * side;
        };
        square.printArea();
        Shape rectangle = () -> {
            double length = 5;
            double breadth = 3;
            return length * breadth;
        };
        rectangle.printArea();
    }
}
interface Shape {
    double area();
    default void printArea() {
        System.out.println("Area:" + area());
    }
}