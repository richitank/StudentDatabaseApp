package studentdatabaseapp;

import java.util.Scanner;

public class Student {
	
	private String firstName;
	private String lastName;
	private int gradeYear;
	private String studentID ;
	private String courses ;
	private static int id=1000;
	
	private int tuitionBalance;
	private static int costOfCourse = 600;
	


	//constructor : prompt user to enter name and year
	
	public Student() {
		Scanner in = new Scanner(System.in);  //to accept values from console
		
		System.out.println("Enter first name:");
		this.firstName = in.nextLine();
		

		System.out.println("Enter last name:");
		this.lastName = in.nextLine();  // for string 
		
		System.out.println("Enter 1- Freshman\n2.Sophomore\n3.Junior\n4.Senior\n grade level:");
		this.gradeYear = in.nextInt();
		
		setStudentID();
//		System.out.println(firstName+" "+lastName+" "+gradeYear+ " " +studentID);
		
		
	}
	
	//generate an ID
	
	private String setStudentID() {
		//grade level + static ID
		id++;
		
		this.studentID = gradeYear + "" + id;
		
		return studentID;
		
		
	}
	
	//enroll in courses
	
	public void enroll()
	{
		//get inside a loop, user hits 0
		do {
		System.out.println("Enter a course to enroll. Q to quit:");
		
		Scanner in = new Scanner(System.in);
		
		String course= in.nextLine();
		
		if(!course.equals( "Q")) {
			
			courses  = courses + "\n " + course;
			tuitionBalance = tuitionBalance + costOfCourse ;
		}
		else{ break;}
		}
		while(1!=0);
//		System.out.println("Enrolled in courses:" +courses);
//		
//		System.out.println("Tuition Balance"+ tuitionBalance);
		
	}
	
	//view balance and pay tuition
	
	public void viewBalance() {
		
		System.out.println("Balance is $:" +tuitionBalance);
	}
	

	public void payTuition() {
		// TODO Auto-generated method stub
		
		viewBalance();
		System.out.println("Enter your payment:$");
		Scanner in  = new Scanner(System.in);
		int payment = in.nextInt();

		tuitionBalance = tuitionBalance - payment;
		System.out.println("Thank you for payment of $" + payment);
		viewBalance();
	}
	
	
	
	//show status
	
	public String toString() {
		return "Name:" + firstName +" "+lastName+
				"\nGrade level:"+ gradeYear +" "+ "\nStudentID:" +studentID+
				"\nCoursesEnrolled:"+courses+
				"\nBalance is"+tuitionBalance;
	}
	
}
