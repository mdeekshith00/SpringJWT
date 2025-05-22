package com.sms.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.sms.exception.ErrorReponse;
import com.sms.exception.StudentNotFound;
import com.sms.model.Student;
import com.sms.repositary.Studentrepositary;

@Service
public class Studentserviceimp implements Studentservice {
	@Autowired
	private Studentrepositary repositary;
	
	public Studentserviceimp(Studentrepositary repositary) {
	super();
	this.repositary = repositary;
}

	@Override
	public String saveStudent(Student s) {
		// TODO Auto-generated method stub
		repositary.save(s);
		return "inserted";
	}

	@Override
	public List<Student> getallstudents() {
		// TODO Auto-generated method stub
		return repositary.findAll();
	}

	@Override
	public Student getStudentbyId(int sid) {
		// TODO Auto-generated method stub
		Student s1 = repositary.findById(sid).orElseThrow(() -> new StudentNotFound("Student details not Found on this id"));
		return s1;
	}

	@Override
	public String updateStudent(Student s, int sid) {
		// TODO Auto-generated method stub
		
//		Student s2 = repositary.findById(sid).get();
//		s2.setSname(s.getSname());
//		repositary.save(s);
		return "updated.....";
	}

	@Override
	public String deleteStudent(int sid) {
		// TODO Auto-generated method stub
		repositary.deleteById(sid);
		return "deleted.....";
	}
	@ExceptionHandler(StudentNotFound.class)
	public ResponseEntity<?> handleStudentNotFoundException (StudentNotFound exception) {
		ErrorReponse StudentException = new ErrorReponse("Student", "Sid", "sid");
		return new ResponseEntity<>(StudentException , HttpStatus.NOT_FOUND);
	}

}
