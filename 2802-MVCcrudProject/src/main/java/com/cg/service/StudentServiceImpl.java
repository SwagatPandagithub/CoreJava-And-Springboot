package com.cg.service;

import com.cg.daoFactory.StudentDaoFactory;
import com.cg.model.Student;
import com.cg.dao.IStudentDao;

public class StudentServiceImpl implements IStudentService {

	IStudentDao studentDao;
	
	@Override
	public String addStudent(Student student) {
		studentDao=StudentDaoFactory.getStudentDao();
		return studentDao.addStudent(student);
	}

	@Override
	public Student searchStudent(Integer sid) {
		studentDao=StudentDaoFactory.getStudentDao();
		return studentDao.searchStudent(sid);
	}

	@Override
	public String updateStudent(Student student) {
		studentDao= StudentDaoFactory.getStudentDao();
		return studentDao.updateStudent(student);
	}

	@Override
	public String deleteStudent(Integer sid) {
		studentDao=StudentDaoFactory.getStudentDao();		
		return studentDao.deleteStudent(sid);
	}

}
