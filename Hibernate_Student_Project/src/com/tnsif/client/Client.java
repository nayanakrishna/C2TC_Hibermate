package com.tnsif.client;

import com.tnsif.entities.Student;
import com.tnsif.service.StudentService;
import com.tnsif.service.StudentServiceImplement;

public class Client {

	public static void main(String[] args) {
		StudentService service = new StudentServiceImplement();
		
		Student student = new Student();
		/*
		Create Operation
		student.setName("Nayana");
		student.setStudentId(1);
		service.addStudent(student);
		
		Create Operation
		student.setName("Pooja");
		student.setStudentId(2);
		service.addStudent(student);
		
		//Delete operation
		student = service.findStudentById(1);
		service.removeStudent(student);
		System.out.println("Studnet Deleted.");
		*/
		//Retrieve Operation
		student = service.findStudentById(1);
		System.out.println("ID: "+student.getStudentId());
		System.out.println("Name: "+student.getName());
		
	}

}
