package org.mykola.sarafan2.controller;

import org.mykola.sarafan2.domain.User;
import org.mykola.sarafan2.repository.MessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.HashMap;

@Controller
@RequestMapping("/")
public class MainController {
	
	@Autowired
	MessageRepository messageRepo;
	
	@GetMapping
	public String mainPage(Model model, @AuthenticationPrincipal User user){
		
		HashMap<Object, Object> data = new HashMap<>();
		data.put("profile", user);
		data.put("messages", messageRepo.findAll());
		model.addAttribute("frontendData", data);
		
		return "index";
	}
}
