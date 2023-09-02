package com.example.recycle.service;


import java.util.List;

import org.springframework.stereotype.Service;

import com.example.recycle.model.Comment;
import com.example.recycle.repository.CommentRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class CommentService {
		
	private final CommentRepository commentRepository;
	
	//댓글추가
	public Comment insert(Comment comment) {
		System.out.println("서비스댓글추가");
		return commentRepository.save(comment);
	}
	//댓글목록
	public List<Comment>list(Long boardId){
		System.out.println("서비스댓글목록");
		return commentRepository.findByBoardId(boardId);
	}
	
	//댓글삭제
	public void delete(Long id) {
		commentRepository.deleteById(id);
	}
}
