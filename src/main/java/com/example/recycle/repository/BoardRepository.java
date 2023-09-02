package com.example.recycle.repository;

import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.recycle.model.Board;


public interface BoardRepository extends JpaRepository<Board, Long> {
	//페이지네이션을 위한 메서드
	List<Board>findAllByOrderByDateDesc(Pageable pageable);

}
