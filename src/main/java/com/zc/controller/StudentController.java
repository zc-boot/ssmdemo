package com.zc.controller;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.zc.entity.Student;
import com.zc.service.IStudentService;



@Controller
public class StudentController{
	
	@Autowired
	IStudentService studentService;
	
	@RequestMapping("/add.do")
	public ModelAndView add(Student student) {
		ModelAndView mv=new ModelAndView();
		studentService.add(student);
		mv.setViewName("forward:list.do");
		return mv;
	}	
	
	
	@RequestMapping("/delete.do")
	public ModelAndView delete(int id) {
		ModelAndView mv=new ModelAndView();
		studentService.delete(id);
		mv.setViewName("forward:list.do");
		return mv;
	}
	
	@RequestMapping("/update.do")
	public ModelAndView update(Student student) {
		ModelAndView mv=new ModelAndView();
		studentService.update(student);
		mv.setViewName("forward:list.do");
		return mv;
	}
	
	@RequestMapping("/list.do")
	public ModelAndView findAll() {
		ModelAndView mv=new ModelAndView();
		List<Student> list=studentService.findAllStudents();
		mv.addObject("list",list);
//		mv.setViewName("forward:/WEB-INF/jsp/list.jsp");
		mv.setViewName("list");
		
		return mv;
	}
	
	
	@RequestMapping("/detail.do")
	public ModelAndView detail(int id) {
		ModelAndView mv=new ModelAndView();
		Student stu=studentService.findStudentById(id);
		mv.addObject("stu",stu);
		System.out.println(stu.getSname());		
		mv.setViewName("detail");
		return mv;
	}
	
	
	@RequestMapping("/toupdate.do")
	public ModelAndView toUpdate(int id) {
		ModelAndView mv=new ModelAndView();
		Student stu=studentService.findStudentById(id);
		mv.addObject("stu",stu);
		mv.setViewName("update");
		return mv;
	}
	
	@RequestMapping("/toadd.do")
	public ModelAndView toAdd() {
		ModelAndView mv=new ModelAndView();		
		mv.setViewName("add");
		return mv;
	}
	

	

	
}
