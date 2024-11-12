package com.mappingdemo.entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name="facultyData")
public class Faculty {

	@Id
	private Integer id;
	
	private String facultyName;
	
	@OneToMany(mappedBy = "faculty")
	private List<Address> addresses;
	
	@ManyToMany(mappedBy = "faculty")
	private List<Branch> branchs;
}
