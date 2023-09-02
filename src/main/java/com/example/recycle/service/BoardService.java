package com.example.recycle.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
//import org.springframework.data.domain.Pageable;
//import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.recycle.model.Board;
import com.example.recycle.repository.BoardRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class BoardService {

	private final BoardRepository boardRepository;
	
	//추가하기
	public Board insert(Board board) {
		return boardRepository.save(board);
	}
	
	//목록보기
	public List<Board> list(){
		return boardRepository.findAll();
	}
	
	//게시글삭제
	public void delete(Long id) {
		boardRepository.deleteById(id);
	}
	
	//수정
	@Transactional
	public Board update(Long id, Board board) {
		Board board1 = boardRepository.findById(id).get();
		
		board1.setTitle(board.getTitle());
		board1.setCategory(board.getCategory());
		board1.setName(board.getName());
		board1.setContent(board.getContent());
		
		return board1;
	}
	
//	//페이징처리
	public List<Board>getBoards(int page, int size){
		Pageable pageable = PageRequest.of(page, size);
		return boardRepository.findAllByOrderByDateDesc(pageable);
	}
	

}
