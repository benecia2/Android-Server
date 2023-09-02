package com.example.recycle.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.recycle.model.Product;

public interface ProductRepository extends JpaRepository<Product, Integer>{

	@Query(value="SELECT * FROM product ORDER BY pnum DESC LIMIT 10", nativeQuery = true)
	public List<Product>update10List();
	
	//@Query(value="select * from product where category = :category", nativeQuery = true)
	//public List<Product>cgList(@Param("category")String category);
	
	public List<Product> findByCategory(String category);
	
	@Query(value="select * from product where pname like CONCAT('%',:word,'%')", nativeQuery = true)
	public List<Product>search(@Param("word")String word);
	
}
