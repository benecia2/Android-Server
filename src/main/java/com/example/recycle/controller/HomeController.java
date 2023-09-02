package com.example.recycle.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.recycle.model.Product;
import com.example.recycle.service.ProductService;

@Controller
public class HomeController {

	@Autowired
	private ProductService productService;
	
	//폐기물 정보 등록(홈페이지)
	@GetMapping("/")
	public String home() {
		return "home";
	}
	
	//파일 추가
	@PostMapping("fileInsert")
	public String insert(Product product, HttpSession session) {
		String uploadFolder = session.getServletContext().getRealPath("/")+"\\resources\\img";
		productService.insert(product, uploadFolder);
		return "home";
	}
	
}
