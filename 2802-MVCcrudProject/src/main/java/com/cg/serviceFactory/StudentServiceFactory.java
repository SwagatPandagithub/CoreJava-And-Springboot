package com.cg.serviceFactory;

import com.cg.service.IStudentService;
import com.cg.service.StudentServiceImpl;

//Abstraction logic of implementation
public class StudentServiceFactory {
	
	//The class is made private so that the object of the class cannot be created.
	private StudentServiceFactory(){
		
	}
	//A static reference variable at instance level is created
	private static IStudentService studentService=null;

//reference variable used inside a static method-->make a call to a method from outside environment
//and the method will give you the implementation class object
//which implementation class object i wont worry about
//only one object, it(method) will give.
//Writing code this style is Singleton design pattern code
	public static IStudentService getStudentService() {
		if(studentService == null) {
			studentService = new StudentServiceImpl();
		}
		return studentService;
	}
	
}
