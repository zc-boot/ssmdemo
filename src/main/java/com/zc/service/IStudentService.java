package com.zc.service;

import java.util.List;

import com.zc.entity.Student;

public interface IStudentService {
	public void add(Student stu);
	public void delete(int id);
	public void update(Student stu);
	public List<Student> findAllStudents();
	public Student findStudentById(int id);
	
	public void testTransaction();
}
