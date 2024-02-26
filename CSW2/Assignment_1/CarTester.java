import java.util.Scanner;

class Car {
	private String make;
	private String model;

	Car(String make, String model) {
		this.make = make;
		this.model = model;
	}

	String get_make() {
		return this.make;
	}

	String get_model() {
		return this.model;
	}

	void set_make(String make) {
		this.make = make;
	}

	void set_model(String model) {
		this.model = model;
	}

	void display() {
		System.out.println("Make: " + make + " Model:" + model);
	}

}

class CarTester {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter make for myCar1: ");
		String make1 = sc.next();
		System.out.print("Enter model for myCar1: ");
		String model1 = sc.next();
		Car myCar1 = new Car(make1, model1);
		Car myCar2 = new Car(null, null);
		System.out.println("For  myCar1");
		myCar1.display();
		System.out.println("For  myCar2");
		myCar2.display();
		System.out.print("Enter make for myCar2: ");
		String make2 = sc.next();
		System.out.print("Enter model for myCar2: ");
		String model2 = sc.next();
		myCar2.set_make(make2);
		myCar2.set_model(model2);
		System.out.println("Updated  myCar2");
		myCar2.display();

	}
}

/*
 * Output--
 * Enter make for myCar1: abc
 * Enter model for myCar1: i9
 * For myCar1
 * Make: abc Model:i9
 * For myCar2
 * Make: null Model:null
 * Enter make for myCar2: bcd
 * Enter model for myCar2: i15
 * Updated myCar2
 * Make: bcd Model:i15
 * 
 */
