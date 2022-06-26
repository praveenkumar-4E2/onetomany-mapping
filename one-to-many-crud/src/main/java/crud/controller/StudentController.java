package crud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import crud.model.Student;
import crud.repository.StudentRepository;

@RestController
public class StudentController {
	
	@Autowired
	private StudentRepository studentRepository;
	
	@PostMapping("add")
	public Student saveStudent(@RequestBody Student student) {
		return studentRepository.save(student);
	}
	
	@GetMapping("{roll}")
	public Student getAll(@PathVariable String roll) {
		return studentRepository.findByrollNo(roll);
		
	}
	
	
	@GetMapping("student/{id}")
	public Student getBySId(@PathVariable Integer id) {
		return studentRepository.getById(id);
	}
	@GetMapping()
	public List<Student> getALL() {
		return studentRepository.findAll();
	}

	
}
