package com.zc.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zc.dao.IStudentDao;

import com.zc.entity.Student;

@Service
public class StudentServiceImpl implements IStudentService{
	
	@Autowired
	private IStudentDao studentDao;

	public void setStudentDao(IStudentDao studentDao) {
		this.studentDao = studentDao;
	}
	
	public StudentServiceImpl(){
		
	}
	
	@Override
	public void add(Student stu) {
		studentDao.add(stu);		
	}

	@Override
	public void delete(int id) {
		studentDao.delete(id);		
	}

	@Override
	public void update(Student stu) {
		studentDao.update(stu);				
	}

	@Override
	public List<Student> findAllStudents() {		
		return studentDao.findAllStudents();
	}

	@Override
	public Student findStudentById(int id) {		
		return studentDao.findStudentById(id);
	}
	
	public void testTransaction(){
		delete(4);
		Integer.parseInt("a");
		delete(3);
	}
}
