package com.api.workshopmongo.dto;

import java.io.Serializable;
import java.util.Calendar;

public class CommentDTO implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private String text;
//	private Calendar data;
	private AuthorDTO author;
	
	public CommentDTO() {
	}

	public CommentDTO(String text, AuthorDTO author) {
		super();
		this.text = text;
//		this.data
		this.author = author;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}
//
//	public Calendar getData() {
//		return data;
//	}
//
//	public void setData(Calendar data) {
//		this.data = data;
//	}

	public AuthorDTO getAuthor() {
		return author;
	}

	public void setAuthor(AuthorDTO author) {
		this.author = author;
	}
}
