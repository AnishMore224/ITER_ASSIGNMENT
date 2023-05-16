package AnishMore_2241013365;
import java.util.Scanner;
import AnishMore_2241013365.Date;
public class Test 
{
	public static void main(String[] args) 
	{
		//To get details of the Employee
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number of employees:");
		int n=sc.nextInt();
		Employee e[]=new Employee[n];
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter Employee "+(i+1)+" Detail");
			e[i]=new Employee();
		}
		
		//To arrange the employee details in descending order by salary
		arrangeEmployeeBySalary(e);
		
		//To display the details of employees whose jobPosition is manager
		System.out.println("Enter the job position for which you want to display the details of Employee");
		sc.nextLine();
		String jp=sc.nextLine();
		System.out.println("Details of employees whose jobPosition is "+jp);
		getEmployeesByJobPosition(e,jp);
		
		//To display the details of employees whose hireDate is between 01-04-2022 to 31-03-2023
		System.out.println("Enter your hire date range between which you want to get details in the form day month year: ");
		System.out.print("Enter starting of range:");
		Date d1=new Date(sc.nextInt(),sc.nextInt(),sc.nextInt());
		System.out.print("Enter ending of range:");
		Date d2=new Date(sc.nextInt(),sc.nextInt(),sc.nextInt());
		System.out.println("Details of employees whose hireDate is between"+d1.day+"/"+d1.month+"/"+d1.year+" to "+d2.day+"/"+d2.month+"/"+d2.year);
		getEmployeesByHireDate(e, d1, d2); 
		
		
		//To find the number of foreign employees
		int no_Of_Foreign_Employee=foreignEmployeeCount(e);
		System.out.println("Number of foreign employees: "+no_Of_Foreign_Employee);
		
		//To display the details of employees whose salary is in a range 150000 INR to 300000 INR
		System.out.println("Enter the range of salary between which you want to display the details of Employee");
		double s1=sc.nextDouble();
		double s2=sc.nextDouble();
		System.out.println("Details of employees whose salary is in a range "+s1+" INR to "+s2+" INR");
		getEmployeesBySalary(e,s1,s2);
		
	}
	
	
	
	public static void arrangeEmployeeBySalary(Employee e[]) 
	{
		int i,j;
		for(i=0;i<e.length;i++)
		{
			for(j=0;j<e.length-1;j++)
			{
				if(e[j].salary<e[j+1].salary)
				{
					Employee obj=e[j];
					e[j]=e[j+1];
					e[j+1]=obj;
				}
			}
		}
	}
	
	
	public static void getEmployeesByJobPosition(Employee e[], String jp) 
	{
		System.out.println("Name\t\tEmployee_Id\t\tSalary\t\tHire Date\tJob Position\tContact Number\t\tAddress");
		for(int i=0;i<e.length;i++)
		{
			if(e[i].jobPosition.equals(jp))
			{
				e[i].display();
			}
		}
	}
	
	
	public static void getEmployeesByHireDate(Employee e[], Date d1, Date d2) 
	{
		System.out.println("Name\t\tEmployee_Id\t\tSalary\t\tHire Date\tJob Position\tContact Number\t\tAddress");
		for(int i=0;i<e.length;i++)
		{
			if((e[i].hireDate.year==d2.year&&e[i].hireDate.month<=d2.month&&e[i].hireDate.day<=d2.day)||(e[i].hireDate.year==d1.year&&e[i].hireDate.month>=d1.month&&e[i].hireDate.day>=d1.day))
				e[i].display();
		}
	}
	
	
	public static int foreignEmployeeCount(Employee e[])
	{
		int count=0;
		for(int i=0;i<e.length;i++)
		{
			if(!e[i].contactNumber.startsWith("+91")) 
			{
				count++;
			}
		}
		return count;
	}
	
	
	public static void getEmployeesBySalary(Employee e[], double s1, double s2) 
	{
		System.out.println("Name\t\tEmployee_Id\t\tSalary\t\tHire Date\tJob Position\tContact Number\t\tAddress");
		for(int i=0;i<e.length;i++)
		{
			if(e[i].salary>=s1&&e[i].salary<=s2)
				e[i].display();
		}
	}
}

/*Output--- 
Enter number of employees:3
Enter Employee 1 Detail
Enter your Name: Anish More
Enter your employee id: 101
Enter your salary: 250000
Enter your hire date in the form day month year: 31 3 2022
Enter your job position: Manager
Enter your contact number: +919876543210
Enter your address (city state country pincode):
Jharsuguda
Odisha 
India
768201
Enter Employee 2 Detail
Enter your Name: Himanshu Kumar Pradhan
Enter your employee id: 102
Enter your salary: 200000 
Enter your hire date in the form day month year: 2 5 2022
Enter your job position: Designer
Enter your contact number: +619876543210 
Enter your address (city state country pincode):
Redcliffe City
Queensland
Australia
4020
Enter Employee 3 Detail
Enter your Name: Shayan Shekhar Paul
Enter your employee id: 103
Enter your salary: 270000
Enter your hire date in the form day month year: 1 2 2023
Enter your job position: Manager
Enter your contact number: +919876543210
Enter your address (city state country pincode):
Bhubaneshwar
Odisha
India
750017
Enter the job position for which you want to display the details of Employee
Manager

Details of employees whose jobPosition isManager
Name         	   Employee_Id           Salary         Hire Date      Job Position   	Contact Number          Address
Shayan Shekhar Paul     103             270000.0        1/2/2023        Manager         +919876543210           Bhubaneshwar   Odisha   India   750017
Anish More              101             250000.0        31/3/2022       Manager         +919876543210           Jharsuguda   Odisha   India   768201

Enter your hire date range between which you want to get details in the form day month year:
Enter starting of range:1 4 2022
Enter ending of range:31 3 2022
Details of employees whose hireDate is between1/4/2022 to 31/3/2022
Name            	Employee_Id         Salary          Hire Date       Job Position    Contact Number          Address
Anish More              101             250000.0        31/3/2022       Manager         +919876543210           Jharsuguda   Odisha   India   768201
Himanshu Kumar Pradhan  102             200000.0        2/5/2022        Designer        +619876543210           Redcliffe City   Queensland   Australia   4020

Number of foreign employees: 1

Enter the range of salary between which you want to display the details of Employee
150000 300000
Details of employees whose salary is in a range 150000.0 INR to 300000.0 INR
Name            	   Employee_Id      Salary         	Hire Date       Job Position    Contact Number          Address
Shayan Shekhar Paul     103             270000.0        1/2/2023        Manager         +919876543210           Bhubaneshwar   Odisha   India   750017    
Anish More              101             250000.0        31/3/2022       Manager         +919876543210           Jharsuguda   Odisha   India   768201
Himanshu Kumar Pradhan  102             200000.0        2/5/2022        Designer        +619876543210           Redcliffe City   Queensland   Australia   4020
 */
