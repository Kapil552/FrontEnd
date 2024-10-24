package spring.mapping;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "jpa_student")
public class Student {

	@Id
	private int studentId;
	private String studentName;
	private String about;
	
	@OneToOne
	private Laptop laptop;

}
