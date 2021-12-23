package org.mykola.sarafan2.controller;

import org.mykola.sarafan2.repository.MessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class MainController {
	
	@Autowired
	MessageRepository messageRepo;
	
	@GetMapping
	public String mainPage(Model model){
		
		return "index";
	}
}
