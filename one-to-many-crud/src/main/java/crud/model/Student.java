package crud.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.MapKey;

import org.hibernate.annotations.ForeignKey;
import org.hibernate.annotations.NaturalId;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@AllArgsConstructor
@Setter
@Getter
@Entity
public class Student implements Serializable {

	@Id
	private int studentId;
	private String studentName;
	@Column(unique = true)
	@NaturalId
	private String rollNo;
	
	
	@ManyToMany(fetch = FetchType.LAZY )
		  @JoinTable(name = "student_placement",
		        joinColumns = { @JoinColumn(name = "student_id", referencedColumnName = "rollNo",insertable = false,updatable = false) },
		        inverseJoinColumns = { @JoinColumn(name = "placement_id") })
	
	private List<Library> library;
	
	

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Student(int studentId, String studentName, String rollNo, List<Library> library) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.rollNo = rollNo;
		this.library = library;
	}



	public int getStudentId() {
		return studentId;
	}



	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}



	public String getStudentName() {
		return studentName;
	}



	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}



	public String getRollNo() {
		return rollNo;
	}



	public void setRollNo(String rollNo) {
		this.rollNo = rollNo;
	}



	public List<Library> getLibrary() {
		return library;
	}



	public void setLibrary(List<Library> library) {
		this.library = library;
	}



	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", rollNo=" + rollNo + ", library="
				+ library + "]";
	}

	

	
	
	

	
}
