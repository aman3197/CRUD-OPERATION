package com.springex.demo;

import javax.persistence.Entity;
import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestAPI {
	
	@Autowired
	LibraryService service;
	
	@PostMapping("storebooks")
	public void storeBooks(@RequestBody Teacher teacher) {
		
		System.out.println("Request Received");
		service.saveToDB(teacher);
		
	}
	
	@GetMapping("getooks")
	public Iterable<Teacher> getBook() {
		
		System.out.println("Request Received");
		return service.findAll();
		
	}
	
	@PutMapping("updatebook")
	public void updateBook(@RequestBody Teacher teacher) {
		
		System.out.println("Request Received");
		service.updindb(teacher);
		
	}
	
	@DeleteMapping("deletebook/{bookid}")
	public void deleteBooks(@PathVariable String bookid) {
		
		System.out.println("Request Received");
		service.delfromdb(bookid);
		
	}
	
	@GetMapping("getbook/{bookid}")
	public String getbook(@PathVariable String bookidgetbook) {
		
		System.out.println("Request Received");
		return service.getfromdb(bookid);
		
	}
}
