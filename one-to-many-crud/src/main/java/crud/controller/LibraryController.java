package crud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import crud.model.Library;
import crud.repository.LibraryRepository;

@RestController
public class LibraryController {
	
	@Autowired
	private LibraryRepository libraryRepository;
	
	@PostMapping("library/add")
	public Library saveLibrary(@RequestBody Library library) {
		return libraryRepository.save(library);
	}
	
	@GetMapping("library/getall")
	public List<Library> getAll() {
		return libraryRepository.findAll();
	}
	

}
