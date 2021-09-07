package com.zc.dao;

import java.util.List;

import com.zc.entity.Student;
import org.springframework.stereotype.Repository;


public interface IStudentDao {
	
	public void add(Student stu);
	public void delete(int id);
	public void update(Student stu);
	public List<Student> findAllStudents();
	public Student findStudentById(int id);
	
}
