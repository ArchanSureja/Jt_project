package com.JT_project.GradingSystem.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/api")
public class GradeSystemControl {
	
	@Autowired
	@GetMapping("/student")
	public String Student_methods()
	{
	
		return "only for students";
	}
	@GetMapping("/prof")
	public String prof_api()
	{
		  return "(only for prof)";
	}
}