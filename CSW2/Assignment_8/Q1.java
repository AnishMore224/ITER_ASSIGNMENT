//Create a functional interface Calculator with methods for addition, subtraction, multiplication, and division. Implement these methods using lambda expressions. Define the Calculator functional interface with methods for arithmetic operations. Implement the interface methods using lambda expressions for basic arithmetic operations.

interface Calculator {
    int operation(int a, int b);
}

class Q1 {
    public static void main(String[] args) {
        Calculator add = (int a, int b) -> {
            return a + b;
        };
        Calculator sub = (int a, int b) -> {
            return a - b;
        };
        Calculator mul = (int a, int b) -> {
            return a * b;
        };
        Calculator div = (int a, int b) -> {
            if (b == 0) {
                throw new ArithmeticException("Division by zero");
            }
            return a / b;
        };
        System.out.println("Addition:" + add.operation(5, 3));
        System.out.println("Subtraction:" + sub.operation(5, 3));
        System.out.println("Multiplication:" + mul.operation(5, 3));
        System.out.println("Division:" + div.operation(5, 3));

    }
}