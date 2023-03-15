package com.board.Basic.board.entity;

import java.time.LocalDateTime;

public class Board {
	
	private Long id;
	private String title;
	private String content;
	private String writer;
	private int view_cnt;
	private char delete_yn;
	private LocalDateTime insert_time = LocalDateTime.now();
	private LocalDateTime update_time;
	
	public Board(String title, String content, String writer, int view_cnt, char delete_yn) {
		this.title = title;
		this.content = content;
		this.writer = writer;
		this.view_cnt = view_cnt;
		this.delete_yn = delete_yn;
	}
}
