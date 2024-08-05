package com.Aurionpro.Model;

public class Book {
	private int bookId;
	private String name;
	private String author;
	private double price;
	private String publication;

	public Book() {

	}

	public Book(int bookId, String name, String author, double price, String publication) {
		this.bookId = bookId;
		this.name = name;
		this.author = author;
		this.price = price;
		this.publication = publication;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public int getBookId() {
		return bookId;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getAuthor() {
		return author;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public double getPrice() {
		return price;
	}

	public void setPublication(String publication) {
		this.publication = publication;
	}

	public String getPublication() {
		return publication;
	}

	public void display() {
		System.out.println("BookId is: " + bookId);
		System.out.println("Name of the book is: " + name);
		System.out.println("Name of the author is: " + author);
		System.out.println("Price of the book is: " + price);
		System.out.println("Publication of the book is: " + publication);
	}

}
