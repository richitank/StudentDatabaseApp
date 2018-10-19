package studentdatabaseapp;

import java.util.Scanner;

public class StudentDatabaseApp {

	public static void main(String[] args) {
		//how many users we want to add?
		
		//create n number of new students
		
		System.out.println("enter no of students to enroll:");
		Scanner in  = new Scanner(System.in);
		int numberOfStudents =  in.nextInt();
		Student[] students = new Student[numberOfStudents];
		
		for(int n=0 ; n < numberOfStudents;n++) {
			
			students[n] = new Student();
			students[n].enroll();
			students[n].payTuition();
			
			System.out.println(students[n].toString());
		}
		
		
		
		
		
		}

}
