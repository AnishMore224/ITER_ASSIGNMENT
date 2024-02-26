import java.util.Scanner;

class Rectangle {
	private double length;
	private double width;

	Rectangle(double length, double width) {
		this.length = length;
		this.width = width;
	}

	double get_length() {
		return this.length;
	}

	double get_width() {
		return this.width;
	}

	void set_length(double length) {
		this.length = length;
	}

	void set_width(double width) {
		this.width = width;
	}

	void display() {
		System.out.println("Length: " + length + ", Width:" + width);
	}

	double area() {
		return length * width;
	}

	double perimeter() {
		return 2 * (length + width);
	}

}

class Q2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter length: ");
		double length = sc.nextDouble();
		System.out.print("Enter width: ");
		double width = sc.nextDouble();
		Rectangle obj = new Rectangle(length, width);
		System.out.println("Area=" + obj.area());
		System.out.println("Perimeter=" + obj.perimeter());
	}
}

/*
 * Output--
 * Enter length: 5.5
 * Enter width: 4
 * Area=22.0
 * Perimeter=19.0
 */
