package com.projectbackendh2.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projectbackendh2.Repository.StudentRepository;
import com.projectbackendh2.model.Student;

@Service
public class StudentsService {
	@Autowired 
	StudentRepository studentRepository;   
	public List<Student> getAllStudent()   
	{  
	List<Student> student = new ArrayList<Student>();  
	studentRepository.findAll().forEach(student1 -> student.add(student1)); 
	return student;  
	}  
	//getting a specific record by using the method findById() of CrudRepository  
	public Student getStudent(Long id)   
	{  
	return studentRepository.findById(id).get();  
	}  
	//saving a specific record by using the method save() of CrudRepository  
	public void saveOrUpdate(Student student)   
	{  
	studentRepository.save(student);  
	}  
	//deleting a specific record by using the method deleteById() of CrudRepository  
	public void delete(long id)   
	{  
	studentRepository.deleteById(id);  
	}  
	//updating a record  
	public void update(Student student, long id)   
	{  
	studentRepository.save(student);  
	}  

}
