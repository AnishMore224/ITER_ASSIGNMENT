class College{
	String collegeName;
	String collegeLoc;
	College(String collegeName,String collegeLoc){
		this.collegeLoc=collegeLoc;
		this.collegeName=collegeName;
	}
}
class Student{
	int studentId;
	String studentName;
	College c;
	Student(int studentId,String studentName,College c){
		this.studentId=studentId;
		this.studentName=studentName;
		this.c=c;
	}
	void displayStudentInfo() {
		System.out.println("Student's ID:"+studentId+", Student Name:"+studentName+", College name:"+c.collegeName+", College Location:"+c.collegeLoc);
	}
	
}

public class Q5 {
	public static void main(String[] args) {
		College c1=new College("Abc College","Bhubaneswar");
		College c2=new College("Iter College","Bhubaneswar");
		Student s1=new Student(1,"Anish",c1);
		Student s2=new Student(2,"Himanshu",c2);
		s1.displayStudentInfo();
		s2.displayStudentInfo();
	}
}

/*
Output--
Student's ID:1, Student Name:Anish, College name:Abc College, College Location:Bhubaneswar
Student's ID:2, Student Name:Himanshu, College name:Iter College, College Location:Bhubaneswar
 */
