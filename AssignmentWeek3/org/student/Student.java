package org.student;

import org.department.Department;

public class Student extends Department {
	
	
	public void studentName () {
			
			System.out.println("Bhardhwaj");
	}
	
	public void studentDept () {
		System.out.println("EEE");
	}
	
	public void studentId () {
		System.out.println("1139B001");
	}

	public static void main(String[] args) {
		
		
		
		Student dep = new Student ();
		dep.collegeCode();
		dep.collegeName();
		dep.collegeRank();
		dep.departmentName();
		dep.studentDept();
		dep.studentId();
		dep.studentName();
		
		
	}
	 
}
