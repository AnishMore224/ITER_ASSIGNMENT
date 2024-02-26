import java.util.Scanner;

class Point {
	double X;
	double Y;

	Point(double X, double Y) {
		this.X = X;
		this.Y = Y;
	}

	Point(Point a) {
		this.X = a.X;
		this.Y = a.Y;
	}

	double get_X() {
		return this.X;
	}

	double get_Y() {
		return this.Y;
	}

	void set_X(double X) {
		this.X = X;
	}

	void set_Y(double Y) {
		this.Y = Y;
	}

}

class Q3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter X: ");
		double X = sc.nextDouble();
		System.out.print("Enter Y: ");
		double Y = sc.nextDouble();
		Point obj1 = new Point(X, Y);
		System.out.println("Obj1 data: X=" + obj1.get_X() + ",Y=" + obj1.get_Y());
		Point obj2 = new Point(obj1);
		System.out.println("Obj2 data: X=" + obj2.get_X() + ",Y=" + obj2.get_Y());
	}
}

/*
 * Output--
 * Enter X: 2.2
 * Enter Y: 0.4
 * Obj1 data: X=2.2,Y=0.4
 * Obj2 data: X=2.2,Y=0.4
 */
