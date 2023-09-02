package com.example.recycle.model;


import lombok.Getter;
import lombok.Setter;


@Getter @Setter
public class PageDTO {
	private int page;	//요청할 페이지 번호
	private int size;		//페이지 당 아이템 수
}
