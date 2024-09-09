package com.rv.sm.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.rv.sm.DAO.StudentDAO;
import com.rv.sm.api.Student;

@Controller
public class StudentController {
	@Autowired
	private StudentDAO StudentDAO;

	@GetMapping("/showStudent")
	public String showStudentList(Model model) {
		// call the DAO method to get the data
		List<Student> studentList = StudentDAO.loadStudents();

//		for (Student tempStudent : studentList) {
//			System.out.println(tempStudent);
//		}

		model.addAttribute("Students", studentList);
		return "student-list";
	}
	
	@GetMapping("/showAddStudentPage")
	public String addstudent(Model model) {
		Student student =new Student();
		model.addAttribute("student",student);
		return "add-student";
	}
	

	@PostMapping("/save-student")
	public String saveStudent(Student student) {
		
		System.out.println(student);
		// do a DAO call to save the students
		StudentDAO.saveStudent(student);
		
		return "redirect:/showStudent";
	}
		
	
	
}
