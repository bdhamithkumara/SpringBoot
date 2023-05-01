package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

//1
@Entity
//2
@Table(name="tbl_student")
//3
@Data
//4
@NoArgsConstructor
//5
@ToString
public class Student {
	
	// 7 set primary key 
	@Id
	// 8 auto increment
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	//6 create entities
	private long id;
	private String name;
	private String address;
	private String gender;

	
	// 9 constructors
	public Student() {
		
	}

	// 10  getters setters
	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}
	

	
	
	

}
