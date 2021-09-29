package com.kaliram.sms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kaliram.sms.entity.Student;
//this is the repository class which will do the 
//all the CRUD operations,so nothings to change in this.
public interface StudentRepository extends JpaRepository<Student,Long> {

}
