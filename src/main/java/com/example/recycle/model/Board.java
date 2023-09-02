package com.example.recycle.model;



import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Board {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String title;
	private String category;
	private String name;
	private String content;
	private String date;
	
	@OneToMany(mappedBy = "board") // "board"는 Comment 엔티티의 board 필드와 매핑됨
	private List<Comment> comment;
	
}
