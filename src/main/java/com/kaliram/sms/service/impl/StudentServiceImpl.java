package com.kaliram.sms.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kaliram.sms.entity.Student;
import com.kaliram.sms.repository.StudentRepository;
import com.kaliram.sms.service.StudentService;
@Service
public class StudentServiceImpl implements StudentService{

	@Autowired
	private StudentRepository studentRepository;//constructor based depenanancy injection-autowiring
	
	
	
	public StudentServiceImpl(StudentRepository studentRepository) {
		super();
		this.studentRepository = studentRepository;
	}



	@Override
	public List<Student> getAllStudent() {
		return studentRepository.findAll();
	}



	@Override
	public Student saveStudent(Student student) {
		return studentRepository.save(student);
	}



	@Override
	public Student getStudentById(Long id) {
		return studentRepository.findById(id).get();
	}



	@Override
	public Student updateStudent(Student student) {
		return studentRepository.save(student);
	}



	@Override
	public void deleteStudentById(Long id) {
		studentRepository.deleteById(id);;
	}

}


















