package com.example.recycle.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.recycle.model.Comment;


public interface CommentRepository extends JpaRepository<Comment, Long>{
	List<Comment> findByBoardId(Long boardId);
}
