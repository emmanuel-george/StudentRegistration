package com.george.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.george.entity.Scholar;
import com.george.service.StudentService;

@Controller
public class HomeController {
	@Autowired
	private StudentService service;
	
	
	@RequestMapping({"/","/home"})
	public String showHome()
	{
		return "Home";
	}
	@RequestMapping("/addStudent")
	public String displayAddStudentForm(Model model)
	{
		Scholar student=new Scholar();
		model.addAttribute("student",student);
		return "AddStudent";
	}
	
	@RequestMapping("/saveStudent")
	public String saveStudent(@ModelAttribute("student")@Validated Scholar student,BindingResult result,Model model)
	{
		if(result.hasErrors())
		{
			return "AddStudent";
		}
		else
		{
		    service.saveStudent(student);
		    System.out.println(student);
		    List<Scholar> scholars=service.getStudentList();
			model.addAttribute("students", scholars);
		   
		   
		     return "ListStudents";
		}
	}
	@RequestMapping("/listStudents")
	public String getAllStudentList(Model model)
	{
		List<Scholar> scholars=service.getStudentList();
		model.addAttribute("students", scholars);
		return "ListStudents";
	}
	
	private Scholar findbyId(Long id)
	{
		Scholar student= service.getStudentObjById(id);
		return student;
	}
	@RequestMapping("/showUpdateForm")
	public String showUpdateForm(Long id,Model model)
	{
		System.out.println("hiii"+id);
		Scholar student=findbyId(id);
		model.addAttribute("student", student);
		return "AddStudent";
	}
	@RequestMapping("/deleteRecord")
	public String deleteStudentObj(Long id)
	{
		Scholar student=findbyId(id);
		service.deleteStudentObj(student);
		return "redirect:/listStudents";
	}

}
