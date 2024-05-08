package com.app.tester;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

import com.app.Student.Student;

public class StudentApplication {

	private static int menu(Scanner sc) {
		// TODO Auto-generated method stub
		System.out.println("1. add Student");
		System.out.println("2. Sort Students all Rollno");
		System.out.println("3. Sort Students all Name");
		System.out.println("4. Sort Students all Marks in desc");
		System.out.println("5. Sort Students all Course");
		System.out.println("Enter your Choice: ");
		return (sc.nextInt());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner sc = new Scanner(System.in);
//       Student [] arr = {
//    		   new Student(1, "std1", 87.80, "Science"),
//    		   new Student(3, "std3", 95.95, "Geography"),
//    		   new Student(5, "std5", 99.99, "Political science"),
//    		   new Student(6, "std6", 92.89, "Physics"),
//    		   new Student(4, "std4", 99.99, "Mathematics"),
//    		   new Student(2, "std2", 89, "History"),
//    		   new Student(9, "std9", 97.97, "Science"),
//    		   new Student(7, "std7", 90.20, "Chemistry"),
//    		   new Student(10, "std10",98.01, "History"),    		   
//    		   new Student(8, "std8", 100, "Social Science"),
//       };
       
      List<Student> studentList = new ArrayList<Student>();
      studentList.add(new Student(1, "std1", 87.80, "Science"));
      studentList.add(new Student(3, "std3", 95.95, "Geography"));
      studentList.add(new Student(1, "std1", 99.99, "Political Science"));
      studentList.add(new Student(6, "std6", 92.89, "Physics"));
      studentList.add(new Student(4, "std4", 99.99, "Mathematics"));
      studentList.add(new Student(2, "std2", 89, "History"));
      studentList.add(new Student(9, "std9", 97.97, "Science"));
      studentList.add(new Student(7, "std7", 90.20, "Chemistry"));
      studentList.add(new Student(10, "std10",98.01, "History"));
      studentList.add(new Student(8, "std8", 100, "Social Science"));
    
     
      
       int choice = 0;
       int count = 11;
          System.out.println("Before Sorting-->");
          for (Student student : studentList) {
			System.out.println(student.toString());
		}
          
          // to sort on the basis of comparator we need to create helper class
        
		do {
			
			switch (choice) {
			case 1:
				
                System.out.println("Enter Name of Student: ");
                String name = sc.next();
                System.out.println("Enter marks of student: ");
                double marks = sc.nextDouble();
                System.out.println("Enter course of Student: ");
                String course = sc.next();
                studentList.add(new Student(count++, name, marks, course));
				break;
			case 2:
		        class StudentRollnoComaparator implements Comparator<Student>{

					@Override
					public int compare(Student o1, Student o2) {
						return o1.getRollno()- o2.getRollno();
					}
		        }
		        
		        StudentRollnoComaparator rollnocomparator = new StudentRollnoComaparator();
		        studentList.sort(rollnocomparator);

		        System.out.println("After Sorting...");
		        for (Student student : studentList) {
				  System.out.println(student.toString());
				}
				break;
			case 3:
			   class StudentNameComaparator implements Comparator<Student>{

				@Override
				public int compare(Student o1, Student o2) {
					// TODO Auto-generated method stub
					return o1.getName().compareTo(o2.getName());
				}
				}
			StudentNameComaparator nameComparator = new StudentNameComaparator();
			studentList.sort(nameComparator);
			System.out.println("AFter Sorting-->");
			for (Student student : studentList) {
				System.out.println(student.toString());
			}
			break;
			case 4:
				class StudentMarksComaparator implements Comparator<Student>{

					@Override
					public int compare(Student o1, Student o2) {
						// TODO Auto-generated method stub
						return Double.compare(o2.getMarks(), o1.getMarks());
					}
					}
				StudentMarksComaparator marksComparator = new StudentMarksComaparator();
				studentList.sort(marksComparator);
				System.out.println("AFter Sorting-->");
				for (Student student : studentList) {
					System.out.println(student.toString());
				}
				break;
			case 5:
				class StudentCourseComaparator implements Comparator<Student>{

					@Override
					public int compare(Student o1, Student o2) {
						// TODO Auto-generated method stub
						return o1.getCourse().compareTo(o2.getCourse());
					}
					}
				StudentCourseComaparator courseComparator = new StudentCourseComaparator();
				studentList.sort(courseComparator);
				System.out.println("AFter Sorting-->");
				for (Student student : studentList) {
					System.out.println(student.toString());
				}
				break;
			default:
				System.out.println("Invalid Choice...");
				break;
			}
		}while((choice = menu(sc)) != 0);
	}


} 
