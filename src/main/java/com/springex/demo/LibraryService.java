package com.springex.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class LibraryService {

	
	
	
	@Autowired
	LibraryRepository repo;
	
	
	public void saveToDB(Teacher t)
	{
		System.out.println("Im service");
		repo.save(t);
	}
	
	
	public Iterable<Teacher> findAll()
	{
		System.out.println("Im service");
		return repo.findAll();
	}
	
	public String getfromdb(String bookid)
	{
		int vv = Integer.parseInt(bookid);
		Optional<Teacher> tt = repo.findById(vv);
		
		System.out.println(tt.get());
		return tt.get().getBookName();
	}
	
	public void delfromdb(String bookid)
	{
		repo.deleteById(Integer.parseInt(bookid));
	}
	
	public void updindb(Teacher t)
	{
		repo.save(t);
	}
}
