/*Name: ANISH MORE
Registration number: 2241013365
Section: 2241037
Branch: CSE
Name of the program : To create an Employee database using class and object.
*/


package AnishMore_2241013365;
import java.util.Scanner;
class Employee 
{
	
	String name;
	int empId;
	double salary;
	Date hireDate;
	String jobPosition;
	String contactNumber;
	Address address;
	
	
	public String getName() 
	{
		return name;
	}

	public void setName(String name) 
	{
		this.name = name;
	}

	public int getEmpId() 
	{
		return empId;
	}

	public void setEmpId(int empId)
	{
		this.empId = empId;
	}

	public double getSalary() 
	{
		return salary;
	}

	public void setSalary(double salary)
	{
		this.salary = salary;
	}

	public String getJobPosition() 
	{
		return jobPosition;
	}

	public void setJobPosition(String jobPosition)
	{
		this.jobPosition = jobPosition;
	}

	public String getContactNumber() 
	{
		return contactNumber;
	}

	public void setContactNumber(String contactNumber)
	{
		this.contactNumber = contactNumber;
	}
	
	public String getHireDate() 
	{
		return hireDate.day+"/"+hireDate.month+"/"+hireDate.year;
	}

	public void setHireDate(int day,int month,int year) 
	{
		this.hireDate=new Date(day,month,year);
	}
	
	
	public String getAddress() 
	{
		return address.city+"   "+address.state+"   "+address.country+"   "+address.pincode;
	}

	public void setAddress(String city, String state, String country, int pincode) 
	{
		this.address =new Address(city,state,country,pincode);
	}

	Employee()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter your Name: ");
		setName(sc.nextLine());
		System.out.print("Enter your employee id: ");
		setEmpId(sc.nextInt());
		System.out.print("Enter your salary: ");
		setSalary(sc.nextDouble());
		System.out.print("Enter your hire date in the form day month year: ");
		setHireDate(sc.nextInt(),sc.nextInt(),sc.nextInt());
		System.out.print("Enter your job position: ");
		sc.nextLine();
		setJobPosition(sc.nextLine());
		System.out.print("Enter your contact number: ");
		setContactNumber(sc.nextLine());
		System.out.println("Enter your address (city state country pincode): ");
		setAddress(sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextInt());
	}

	
	void display() 
	{
		System.out.println(getName()+"\t\t"+getEmpId()+"\t\t"+getSalary()+"\t"+getHireDate()+"\t"+getJobPosition()+"\t\t"+getContactNumber()+"\t\t"+getAddress());
	}
}

class Date{
	int day;
	int month;
	int year;
	
	public Date(int day,int month,int year)
	{
		this.day=day;
		this.month=month;
		this.year=year;
	}
}


class Address
{
	String city,state,country;
	int pincode;
    public Address(String city, String state, String country, int pincode) {
		this.city = city;
		this.state = state;
		this.country = country;
		this.pincode = pincode;
	}
}
