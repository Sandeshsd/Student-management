package com.mvc_demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.mvc_demo.dao.StudentDAO;
import com.mvc_demo.dto.Student;

@Controller
public class StudentController {

	@Autowired
	Student student;
	@Autowired
	StudentDAO dao;
	
	@RequestMapping("/saveStudent")
	public ModelAndView saveStudent(){
		ModelAndView view= new ModelAndView();
		view.addObject("student",student);
		view.setViewName("savestudent.jsp");		
		return view;
	}
	
	@RequestMapping("/addStudent")
	public ModelAndView addStudent(@ModelAttribute Student student){
	  dao.saveStudent(student);
	  ModelAndView view=new ModelAndView();
	  view.setViewName("index.jsp");
	  return view;
	}
}
