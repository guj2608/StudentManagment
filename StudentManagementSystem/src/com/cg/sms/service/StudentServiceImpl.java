package com.cg.sms.service;

import java.util.ArrayList;

import com.cg.sms.dao.StudentDao;
import com.cg.sms.dao.StudentDaoImpl;
import com.cg.sms.dto.Student;

public class StudentServiceImpl implements StudentService {
	StudentDao  dao;
	public StudentServiceImpl(){
	 dao= new StudentDaoImpl();	
	}

	@Override
	public int addStudent(Student student) {
		// TODO Auto-generated method stub
		int rn=dao.addStudent(student);
		return rn;
	}

	@Override
	public Student getStudent(int rn) {
		// TODO Auto-generated method stub
		return dao.getStudent(rn);
	}

	@Override
	public Student updateStudent(Student student) {
		// TODO Auto-generated method stub
		return dao.updateStudent(student);
	}

	@Override
	public ArrayList<Student> getStudentList(String coursename) {
		// TODO Auto-generated method stub
		return dao.getStudentList(coursename);
	}


	

}
