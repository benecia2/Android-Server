package com.example.recycle.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Transient;

import org.springframework.web.multipart.MultipartFile;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Product {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int pnum;
	private String category;
	private String pname;
	private String pclass;
	private String pcontent1;
	private String pcontent2;
	private String pname2;
	@Transient
	private MultipartFile upload;
	private String img;
	
}
