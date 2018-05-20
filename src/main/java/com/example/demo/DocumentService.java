package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DocumentService {
	
	@Autowired
	WebRepository webRepository;

	public List<Document> byAuthor(String document) {
		// TODO Auto-generated method stub
		return webRepository.findAllByName(document);
	}

}
