package com.logic;

import java.util.ArrayList;
import java.util.List;

public class StudentDaoImpl {
	
	List<Student> students;
	public StudentDaoImpl() {
		
		 students = new ArrayList<Student>();
		 Student s1 = new Student("Albert", 001);
		 Student s2 = new Student("Sean", 002);
		 Student s3 = new Student("Bohorquez", 003);
		 Student s4 = new Student("Paul", 004);
		 Student s5 = new Student("Peter", 005);
		 Student s6 = new Student("John", 006);
		 Student s7 = new Student("Joseph", 007);
		 
		 
		 students.add(s1);
		 students.add(s2);
		 students.add(s3);
		 students.add(s4);
		 students.add(s5);
		 students.add(s6);
		 students.add(s7); 
		 
	}
	public void deleteStudent(Student student) {
	      students.remove(student.getRollNum());
	      System.out.println("Student: Roll Number " + student.getRollNum() + ", deleted from database");
	}

	public List<Student> getAllStudents() {
	      return students;
	}

	public Student getStudent(int rollNum) {
	    return students.get(rollNum);
	}

	public void updateStudent(Student student) {
	    students.get(student.getRollNum()).setName(student.getName());
	    System.out.println("Student: Roll Number " + student.getRollNum() + ", updated in the database");
	   }
}
