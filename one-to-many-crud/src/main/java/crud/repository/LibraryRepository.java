package crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import crud.model.Library;

@Repository
public interface LibraryRepository extends JpaRepository<Library, Integer>{

}
