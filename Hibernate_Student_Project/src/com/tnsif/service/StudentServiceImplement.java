package com.tnsif.service;

import com.tnsif.entities.Student;
import com.tnsif.dao.StudentDao;
import com.tnsif.dao.StudentDaoImplement;

public class StudentServiceImplement implements StudentService {
	
	private StudentDao dao;
	
	public StudentServiceImplement() {
		dao = new StudentDaoImplement();
	}

	@Override
	public Student findStudentById(int id) {
		Student student = dao.getStudentById(id); 
		return student;
	}

	@Override
	public void addStudent(Student student) {
		dao.beginTransaction();
		dao.addStudent(student);
		dao.commitTransaction();
		
	}

	@Override
	public void removeStudent(Student student) {
		dao.beginTransaction();
		dao.removeStudent(student);
		dao.removeStudent(student);
		dao.commitTransaction();
		
	}

	@Override
	public void updateStudent(Student student) {
		dao.beginTransaction();
		dao.updateStudent(student);
		dao.updateStudent(student);
		dao.commitTransaction();
		
	}
	

}
