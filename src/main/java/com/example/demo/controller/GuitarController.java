package com.example.demo.controller;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.model.GuitarModel;
import com.example.demo.repository.GuitarRepository;
import com.example.demo.services.GuitarService;

@RestController
@CrossOrigin(origins="http://localhost:4200/login")  
public class GuitarController {
	
	@Autowired
	GuitarModel guitar;
	/**
	 *  Adding this Java doc to check the continuous build using GitHub Actions
	 */
	
	@Autowired
	GuitarRepository guitarRepo;
	
	@Autowired
	GuitarService guitarService;
	
	@GetMapping("/")
	public String homePage()
	{
		return "Welcome!";
	}
	
	@GetMapping("/guitars")
	public List<GuitarModel> getGuitars()
	{
		return guitarRepo.findAll();
	}
	
	@PostMapping()
	@ResponseStatus(HttpStatus.OK)
	public GuitarModel guitar(@RequestBody GuitarModel guitar)
	{
		return guitarRepo.save(guitar);
	}
	
//	@PostMapping("guitar-saver")
//	public boolean saveGuitar(@RequestBody GuitarModel guitar)
//	{
//		return guitarService.saveGuitar(guitar);
//	}
	
	 @GetMapping("/guitar/{id}")
	  Optional<GuitarModel> one(@PathVariable Long id) {
	    
	    return guitarRepo.findById(id);
	  }

}
