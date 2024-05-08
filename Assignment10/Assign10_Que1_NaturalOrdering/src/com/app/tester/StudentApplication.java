package com.app.tester;

import java.util.Arrays;

import com.app.naturalordering.Student;

public class StudentApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		Student [] arr = { new Student(1, "student1", 70.70),
				           new Student(5, "Student5", 81.75),
				           new Student(4, "Student4", 79.75),
				           new Student(3, "Student3", 87.70),
				           new Student(2, "Student2", 75.75),
		};
		System.out.println("BEFORE SORTING...");
		for (Student student : arr) {
		    System.out.println("rollno: "+ student.rollno);
		    System.out.println("name: "+ student.name);
		    System.out.println("marks: "+ student.marks);
		}
		
		Arrays.sort(arr);
		System.out.println("AFTER SORTING...");
		for (Student student : arr) {
		    System.out.println("rollno: "+ student.rollno);
		    System.out.println("name: "+ student.name);
		    System.out.println("marks: "+ student.marks);
		}
	}

}
