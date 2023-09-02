package com.example.recycle.service;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.example.recycle.model.Product;
import com.example.recycle.repository.ProductRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ProductService {

	private final ProductRepository productRepository;
	
	//업데이트 된 폐기물(전체보기)
	public List<Product>update10List() {
		return productRepository.update10List();
	}
	
	//카테고리별 폐기물 리스트
	public List<Product>cgList(String category) {
		//return productRepository.cgList(category);
		return productRepository.findByCategory(category);
	}
	
	//폐기물 상세보기
	public Product view(int pnum) {
		return productRepository.findById(pnum).get();
	}
	
	//폐기물 등록
	public void insert(Product product, String uploadFolder) {
		UUID uuid = UUID.randomUUID();
		MultipartFile f = product.getUpload();
		String uploadFileName="";
		
		if(!f.isEmpty()) {
			uploadFileName = uuid.toString()+"_"+f.getOriginalFilename();
			File saveFile = new File(uploadFolder, uploadFileName);
			try {
				f.transferTo(saveFile);
				product.setImg(uploadFileName);
			} catch (IllegalStateException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		productRepository.save(product);
	}
	
	//폐기물 검색
	public List<Product>search(String word) {
		return productRepository.search(word);
	}
	
	
}
