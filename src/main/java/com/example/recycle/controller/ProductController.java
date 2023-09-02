package com.example.recycle.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.recycle.model.Product;
import com.example.recycle.service.ProductService;

@RestController
public class ProductController {

	@Autowired
	private ProductService productService;
	
	//업데이트 된 폐기물(전체보기 최근 업데이트 10개순)
	@GetMapping("upProdList")
	public List<Product>list() {
		return productService.update10List();
	}
	
	//카테고리별 폐기물 리스트
	@GetMapping("cgList")
	public List<Product>cgListByCategory(@RequestParam("category") String category) {
		return productService.cgList(category);
	}
	
	//폐기물 상세보기
	@PostMapping("productView/{pnum}")
	public Product view(@PathVariable int pnum, @RequestBody Product product) {
		return productService.view(pnum);
	}
	
	//폐기물 검색
	@GetMapping("searchView")
	public List<Product>search(@RequestParam(required = false, defaultValue="")String word) {
		return productService.search(word);
	}
	
	
}
