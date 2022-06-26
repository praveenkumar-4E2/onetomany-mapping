package crud.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@AllArgsConstructor
@Setter
@Getter
@Entity
public class Library {

	@Id
	private int bookId;
	private String bookName;
	
	@ManyToMany(fetch = FetchType.LAZY,
		    
		      mappedBy = "library")
		  @JsonIgnore
	private List<Student> student ;

	public Library() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Library(int bookId, String bookName, List<Student> student) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
		this.student = student;
	}

	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public List<Student> getStudent() {
		return student;
	}

	public void setStudent(List<Student> student) {
		this.student = student;
	}

	@Override
	public String toString() {
		return "Library [bookId=" + bookId + ", bookName=" + bookName + ", student=" + student + "]";
	}

	

}
