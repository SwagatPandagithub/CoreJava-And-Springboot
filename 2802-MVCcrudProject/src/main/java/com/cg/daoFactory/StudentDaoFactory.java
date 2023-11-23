package com.cg.daoFactory;

import com.cg.dao.IStudentDao;

import com.cg.dao.StudentDaoImpl;

public class StudentDaoFactory {
	
	private StudentDaoFactory() {};// THis ensures a object to this class cannot be created
	
	//A Static reference variable is created at instance level
		private static IStudentDao studentDao=null;
		
		
		//a static method is created and an implementation class object of the interface is created
		//when we call this method from outside environment this implementation class object is returned with appropriate logics
		//this style of coding is called Singleton design pattern
		public static IStudentDao getStudentDao() {
			
			if (studentDao == null) {
				studentDao = new StudentDaoImpl();
		}
		return studentDao;
		}

}
