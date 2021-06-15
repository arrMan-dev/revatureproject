package com.logic;

import java.util.List;

public interface StudentDao {
	
	public List<Student> getAllStudents();
	public Student getStudent(int rollNum);
	public void updateStudent(Student student);
	public void deleteStudent(Student student);

}
