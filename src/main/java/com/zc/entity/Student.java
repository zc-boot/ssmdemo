package com.zc.entity;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


public class Student {

	private String sid;
	private String sname;
	private String sex;
	private int age;	

	public Student(){		
	}
	
	public Student(String sname,String sex,int age){
	
		this.sname=sname;
		this.sex=sex;
		this.age=age;
	}
	
	public Student(String sid,String sname,String sex,int age){
		this.sid=sid;
		this.sname=sname;
		this.sex=sex;
		this.age=age;
	}
	
	public void show(){
		System.out.println("ѧ�����:"+sid+" ѧ������:"+sname+" ѧ���Ա�:"+sex+" ѧ������:"+age);
	}
	
	public String getSid() {
		return sid;
	}
	public void setSid(String sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	

}
