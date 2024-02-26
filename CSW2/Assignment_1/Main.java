import java.util.Scanner;

class Laptop {
	private String model;
	private double price;

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String toString() {
		return "Model:" + this.model + ", Price:" + this.price;
	}

}

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Laptop obj = new Laptop();
		System.out.print("Enter Model:");
		obj.setModel(sc.next());
		System.out.print("Enter Price:");
		obj.setPrice(sc.nextDouble());
		System.out.println(obj);
	}
}

/*
 * Output--
 * Enter Model:abc
 * Enter Price:100000
 * Model:abc, Price:100000.0
 */
