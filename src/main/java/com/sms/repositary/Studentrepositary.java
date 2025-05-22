package com.sms.repositary;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sms.model.Student;

public interface Studentrepositary extends JpaRepository<Student, Integer> {

}
