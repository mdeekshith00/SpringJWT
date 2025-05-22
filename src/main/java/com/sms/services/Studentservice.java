package com.sms.services;

import java.util.List;

import com.sms.model.Student;

public interface Studentservice {
	String saveStudent(Student s);
	List<Student> getallstudents();
	Student getStudentbyId(int sid);
	String updateStudent(Student s, int sid);
	String deleteStudent(int sid);

}
