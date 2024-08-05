package com.Aurionpro.Test;

import java.util.Scanner;

import com.Aurionpro.Model.Book;

public class BookTest {

	public static void displayBooksByDescendingOrder(Book[] books) {
		Book temp = null;
		for (int i = 0; i < books.length; i++) {
			for (int j = 0; j < books.length - 1 - i; j++) {
				if (books[j].getPrice() < books[j + 1].getPrice()) {
					temp = books[j];
					books[j] = books[j + 1];
					books[j + 1] = temp;
				}
			}
		}
		System.out.println("Displaying Books in Descending Order by their Price");
		for (int i = 0; i < books.length; i++) {
			System.out.println(books[i].getBookId() + " " + books[i].getName() + " " + books[i].getPrice());
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter number of books: ");
		int booksLength = sc.nextInt();
		Book[] books = new Book[booksLength];

		for (int i = 0; i < books.length; i++) {
			System.out.println("Enter the Book Id");
			int bookId = sc.nextInt();
			sc.nextLine();
			System.out.println("Enter name of the Book");
			String bookName = sc.nextLine();
			System.out.println("Enter author of the Book");
			String bookAuthor = sc.nextLine();
			System.out.println("Enter price of the Book");
			double bookPrice = sc.nextDouble();
			sc.nextLine();
			System.out.println("Enter Book Publication");
			String bookPublication = sc.nextLine();

			Book book = new Book(bookId, bookName, bookAuthor, bookPrice, bookPublication);
			books[i] = book;
		}

		System.out.println("Details of the Books are: ");

		for (int i = 0; i < books.length; i++) {
			books[i].display();
		}

		displayBooksByDescendingOrder(books);

	}
}
