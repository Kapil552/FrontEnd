package com.crud.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
//import jakarta.persistence.Column;
//import jakarta.persistence.Entity;
//import jakarta.persistence.GeneratedValue;
//import jakarta.persistence.GenerationType;
//import jakarta.persistence.Id;
//import jakarta.persistence.Table;
//import lombok.Getter;
import lombok.NoArgsConstructor;
//import lombok.Setter;
//import lombok.ToString;

//@Entity
@Document
@Data
@NoArgsConstructor
@AllArgsConstructor
//@Getter
//@Setter
//@ToString
//@Table(name="student_data")
public class Student{

	@Id
//	@GeneratedValue(strategy = GenerationType.AUTO)
//	@Column
	private Integer id;
	
	private String name;
	
	private String branch;
	
	private int rollno;
	
	
	
}
