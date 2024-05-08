package com.app.naturalordering;

public class Student implements Comparable<Student>{
       
        public int rollno;
	    public String name; 
        public double marks;
	
	
	
	public Student(int rollno, String name, double marks) {
			super();
			this.rollno = rollno;
			this.name = name;
			this.marks = marks;
		}



	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		
		return Double.compare(o.marks, this.marks);
	}
	

}
