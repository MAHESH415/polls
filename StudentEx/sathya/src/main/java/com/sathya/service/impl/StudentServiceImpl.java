package com.sathya.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sathya.data.StudentRepository;
import com.sathya.entities.Student;
import com.sathya.service.IStudentService;

@Service
public class StudentServiceImpl  implements IStudentService{

	@Autowired
	private StudentRepository studentRepository;

	
	
	
	
	
	
	@Override
	public Student insertStudents(Student student) {
		
		return studentRepository.save(student);
	}

	@Override
	public Iterable<Student> getAllStudents() {
		
		return studentRepository.findAll();
	}

	@Override
	public Student updateStudent(Student student) {
	
		return studentRepository.save(student);
	}

	@Override
	public void deleteById(Integer id) {
		
		studentRepository.deleteById(id);
	}
	
}
