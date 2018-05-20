package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class DocRestController {
	
	@Autowired
	WebRepository webRepository;
	
	@Autowired
	DocumentService documentServe;
	@GetMapping(value="all")
	
	public List<Document> getAllProduct(){
		
		List<Document> allDocument=webRepository.findAll();
		return allDocument;
		
	}
	
	  
	@GetMapping(value = "getDefectCount") 
	 public @ResponseBody  List<Document> hello(@RequestParam(value = "name")String name) {  
	  System.err.println(name.toString());  
	  return documentServe.byAuthor(name); 
	  
	 }
	}  
	

