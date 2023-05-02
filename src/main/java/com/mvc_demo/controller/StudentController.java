package com.mvc_demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
	
	@RequestMapping("/viewStudent")
	public ModelAndView viewStudents() {
	List<Student> students=	dao.getAllStudents();
	ModelAndView view=new ModelAndView("viewStudents.jsp");
	view.addObject("students",students);
	return view;
	}
	@RequestMapping("/updateStudent")
	public ModelAndView updateStudents(@RequestParam int id) {
		ModelAndView view=new ModelAndView("updateStudent.jsp");
		Student student=dao.getStudentById(id);
		view.addObject("student",student);
		return view;
	}
	@RequestMapping("/saveUpdateStudent")
	public ModelAndView saveUpdatedStudent(@ModelAttribute Student student) {
		ModelAndView modelAndView=new ModelAndView("viewStudents.jsp");
		 dao.updateStudent(student);
	    modelAndView.addObject(("students"), dao.getAllStudents());
	    return modelAndView;
	}
}
