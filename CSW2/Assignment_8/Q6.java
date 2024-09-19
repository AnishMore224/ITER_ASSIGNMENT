//Write a program that demonstrates a function returning another function, where the inner function calculates the square of a number. Define a function that returns another function. The inner function should calculate the square of a given number. Demonstrate the use of the returned function to calculate squares.

import java.util.function.Function;

// interface Square {
//     Square calculate(int a);
// }
class Q6 {
    public static void main(String[] args) {
        // Square s = (a) -> {
        //     return (a) -> a * a;
        // };
        // System.out.println(s.calculate(5));
        Function ab=op();
        System.out.println(ab.apply(5));
    }
    public static Function<Object,Object> op(){
        return ( a, Integer b)->(a*b);
    }

}