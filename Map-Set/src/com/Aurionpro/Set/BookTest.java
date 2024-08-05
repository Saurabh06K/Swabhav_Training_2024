package com.Aurionpro.Set;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import com.Aurionpro.Comparator.BookComparator;
import com.Aurionpro.Comparator.BookComparator.BookAuthorComparator;
import com.Aurionpro.Comparator.BookComparator.BookTitleComparator;
import com.Aurionpro.Comparator.BookComparator.BookPriceComparator;
import com.Aurionpro.Comparator.BookComparator.BookPublicationYearComparator;
import com.Aurionpro.Model.Book;

public class BookTest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number of books: ");
		int size = scanner.nextInt();

		List<Book> books = new ArrayList<Book>();
		for (int i = 0; i < size; i++) {
			System.out.println("Enter Title of book: ");
			String title = scanner.next();
			System.out.println("Enter Author of book: ");
			String author = scanner.next();
			System.out.println("Enter Price of book: ");
			double price = scanner.nextDouble();
			System.out.println("Enter year of book publication: ");
			int publicationYear = scanner.nextInt();

			books.add(new Book(title, author, price, publicationYear));
		}

		System.out.println("\nBook Details before sort: ");
		System.out.println(books);

		System.out.println("\nSorting of books by Title: ");
		Collections.sort(books, new BookComparator.BookTitleComparator());
		System.out.println(books);

		System.out.println("\nSorting of books by Author: ");
		Collections.sort(books, new BookComparator.BookAuthorComparator());
		System.out.println(books);

		System.out.println("\nSorting of books by Price: ");
		Collections.sort(books, new BookComparator.BookPriceComparator());
		System.out.println(books);

		System.out.println("\nSorting of books by year of publication: ");
		Collections.sort(books, new BookComparator.BookPublicationYearComparator().reversed());
		System.out.println(books);

		System.out.println("\nSorting the books first by author, then by title, and finally by price.");
		Collections.sort(books, new BookAuthorComparator().thenComparing(new BookTitleComparator())
				.thenComparing(new BookPriceComparator()));
		System.out.println(books);

		System.out.println("\nSorting the books first by publication year, then by price, and finally by author.");
		Collections.sort(books, new BookPublicationYearComparator().thenComparing(new BookPriceComparator())
				.thenComparing(new BookAuthorComparator()));
		System.out.println(books);
	}
}
