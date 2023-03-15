package com.board.Basic.board.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
@Table(name = "posts")
public class Board {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;	// PK
	
	private String title;	// 제목
	
	private String content;	// 내용
	
	private String writer;	// 작성자
	
	private int hits;		// 조회수
	
	private char deleteYn;	// 삭제 여부
	
	private LocalDateTime insert_time = LocalDateTime.now();	// 생성일
	
	private LocalDateTime update_time;	// 수정일
	
	@Builder
	public Board(String title, String content, String writer, int hits, char deleteYn) {
		this.title = title;
		this.content = content;
		this.writer = writer;
		this.hits = hits;
		this.deleteYn = deleteYn;
	}
}
