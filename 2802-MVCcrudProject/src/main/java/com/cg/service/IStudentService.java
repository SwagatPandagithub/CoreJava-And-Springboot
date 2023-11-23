package com.cg.service;


import com.cg.model.Student;

public interface IStudentService {
	
	public String addStudent(Student student);
	
	public Student searchStudent(Integer sid);
	
	public String updateStudent(Student student);
	
	public String deleteStudent(Integer sid);
	
	


}