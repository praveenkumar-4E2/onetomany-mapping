package crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import crud.model.Student;

@Repository
public interface StudentRepository  extends JpaRepository<Student, Integer> {

	public Student findByrollNo(String rollNO);
}
