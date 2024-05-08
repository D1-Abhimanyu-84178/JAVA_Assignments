package com.app.Student;

public class Student implements Comparable<Student>{

	private int rollno;
	private String name;
	private double marks;
	private String course;
	
	public Student() {
		
	}
	public Student(int rollno, String name, double marks, String course) {
		this.rollno = rollno;
		this.name = name;
		this.marks = marks;
		this.course = course;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public void setName(int rollno) {
		this.rollno = rollno;
	}
	public void setMarks(int rollno) {
		this.rollno = rollno;
	}
	public void setCourse(int rollno) {
		this.rollno = rollno;
	}
	
	public int getRollno() {
		return rollno;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getMarks() {
		return marks;
	}
	public void setMarks(double marks) {
		this.marks = marks;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public String name() {
		return name;
	}
    
	public double marks() {
		return marks;
	}
	
	public String course() {
		return course;
	}
	
	public String toString() {
		return "[" + "RollNo: "+ rollno + " Name: "+ name +" Marks: " + marks + "Course: "+ course +"]";
		
	}
	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		return 0;
	}
}
