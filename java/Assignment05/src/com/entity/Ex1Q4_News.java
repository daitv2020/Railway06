package com.entity;

import java.util.ArrayList;
import java.util.Arrays;

import com.backend.Ex1Q4_INews;

public class Ex1Q4_News implements Ex1Q4_INews {

	private int id;
	private String title;
	private String publishDate;
	private String author;
	private String content;
	private float averagerate;
	private int[] rates;
	

	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getPublishDate() {
		return publishDate;
	}
	public void setPublishDate(String publishDate) {
		this.publishDate = publishDate;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	
	public int[] getRates() {
		return rates;
	}
	public void setRates(int[] rates) {
		this.rates = rates;
	}
	public float getAveragerate() {
		
		return averagerate ;
	}
	@Override
	public void display() {
		System.out.println("ID " + id);
		System.out.println("title " + title);
		System.out.println("PublishDate " + publishDate);
		System.out.println("Author " + author);
		System.out.println("content " + content);
		
	
	}

	@Override
	public float calculate() {
		averagerate = (float)(rates[0] + rates[1] + rates[2])/3 ;
		return averagerate;
	}

	
	
	
}
