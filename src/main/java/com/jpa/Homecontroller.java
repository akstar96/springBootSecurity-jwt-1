package com.jpa;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Homecontroller {
@RequestMapping({"/hello"})
public String home() {
	return "Home Page ";
	
}
	
	
}
