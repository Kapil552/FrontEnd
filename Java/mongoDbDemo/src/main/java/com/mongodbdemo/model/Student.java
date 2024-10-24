package com.mongodbdemo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Document  
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Student {

	@Id
	private Integer id;
	private String name;
	private String address;
	
}
