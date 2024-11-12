package com.mappingdemo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name="addressDetails")
public class Address {
	

	@Id
	private String Country;
	
	private String addressType;
	
	private String State;
	
	private String city;
	
	private String village;
	
	@ManyToOne
	private Student student;
	
	@ManyToOne
	private Faculty faculty;
}
