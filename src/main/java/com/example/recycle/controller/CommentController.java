package com.example.recycle.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.recycle.model.Board;
import com.example.recycle.model.Comment;
import com.example.recycle.service.CommentService;

@RestController
public class CommentController {
		
	@Autowired
	private CommentService commentService;
	
	//댓글추가
	@PostMapping("comment/{id}")
	public Comment insert(@PathVariable Long id, @RequestBody Comment comment) {
		Board board = new Board();
		board.setId(id);
		comment.setBoard(board);
		return commentService.insert(comment);
	}
	
	//댓글목록
	@GetMapping("comment/{boardId}")
	public List<Comment>list(@PathVariable Long boardId){
		System.out.println("컨트롤러리스트 출력");
		List<Comment>clist = commentService.list(boardId);
		return clist;
	}
	
	//댓글삭제
	@DeleteMapping("comment/{id}")
	public String delete(@PathVariable Long id) {
		commentService.delete(id);
		return "success";
	}
}
