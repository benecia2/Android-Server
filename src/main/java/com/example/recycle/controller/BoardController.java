package com.example.recycle.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.recycle.model.Board;
import com.example.recycle.service.BoardService;

@RestController
public class BoardController {
	@Autowired
	private BoardService boardService;

	//추가
	@PostMapping("insert")
	public Board insert(@RequestBody Board board) {
		System.out.println("insert"+"추가");
		return boardService.insert(board);
	}
	
	//목록보기
	@GetMapping("list")
	public List<Board>list(){
		System.out.println("list"+"list");
		return boardService.list();
	}
	
	//게시글삭제
	@DeleteMapping("delete/{id}")
	public String delete(@PathVariable Long id	) {
		System.out.println(id);
		boardService.delete(id);
		return "success	";
	}
	
	//수정
	@PutMapping("update/{id}")
	public Board update(@PathVariable Long id, @RequestBody Board board) {
		return boardService.update(id, board);
	}
	
	//페이지네이션
	@GetMapping("boards")
	public List<Board>getBoards(
			@RequestParam(defaultValue = "0") int page,
			@RequestParam(defaultValue = "10") int size){
		return boardService.getBoards(page, size);
	}
	
}
