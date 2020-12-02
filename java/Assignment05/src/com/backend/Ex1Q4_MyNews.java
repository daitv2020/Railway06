package com.backend;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

import com.entity.Ex1Q4_News;

public class Ex1Q4_MyNews {
	ArrayList<Ex1Q4_News> mynews = new ArrayList<Ex1Q4_News>();
	
	int[] rates = new int[3];

	public void insertnews() {
		Ex1Q4_News news = new Ex1Q4_News();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap ID");
		news.setId(scanner.nextInt());
		scanner.nextLine();
		System.out.println("Nhap title");
		news.setTitle(scanner.nextLine());
		System.out.println("Nhap vao PublishDate");
		news.setPublishDate(scanner.nextLine());
		System.out.println("Moi ban nhap author");
		news.setAuthor(scanner.nextLine());
		System.out.println("Moi ban Nhap content");
		news.setContent(scanner.nextLine());
		for (int i = 0; i < 3; i++) {
			System.out.println("Moi ban nhap rate " + (i + 1));
			rates[i] = scanner.nextInt();
		}
		news.setRates(rates);
		mynews.add(news);
	}

	public void viewlistnews() {
		for(Ex1Q4_News ne:mynews) {
			ne.display();
		}
	}
	
	
	public void trungbinh() {
		for(Ex1Q4_News ne:mynews) {
			System.out.println("title " + ne.getTitle() + ": Average " + ne.calculate());
		}
	}
	

}
