package com.quiz.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class AdminController {
	@RequestMapping("admin")
	public String admin(Model model) {
		
		return "admin";
		
	}
	@RequestMapping("add-question-form")
	public String addQuestion(Model model) {
		return "addQuestionForm";
		
	}
	@RequestMapping("update-doctor-form")
	public String showEditForm(){
		
		return "editForm";
		
	}

}
