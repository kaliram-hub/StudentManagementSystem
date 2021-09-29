package com.kaliram.sms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.kaliram.sms.entity.Student;
import com.kaliram.sms.repository.StudentRepository;

@SpringBootApplication
public class StudentManagementSystemApplication  implements CommandLineRunner{//this command line runner interface execute the run method which throughs exception

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementSystemApplication.class, args);
	}
	
	@Autowired
	private StudentRepository studentRepository;

	@Override
	public void run(String... args) throws Exception {
		

		/*
		 * Student student1 = new Student("Ramesh","Fadatare","ramesh@gmail.com");
		 * studentRepository.save(student1);
		 * 
		 * Student student2 =new Student("kali","ram","kaliram@gmail.com");
		 * studentRepository.save(student2);
		 * 
		 * Student student3 =new Student("tony","stark","tonystark@gmail.com");
		 * studentRepository.save(student3);
		 */
		
	}

}
