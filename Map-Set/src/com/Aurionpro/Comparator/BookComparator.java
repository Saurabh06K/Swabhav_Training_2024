package com.Aurionpro.Comparator;

import java.util.Comparator;

import com.Aurionpro.Model.Book;

public class BookComparator {
	public static class BookTitleComparator implements Comparator<Book> {

		@Override
		public int compare(Book book1, Book book2) {
			return book1.getTitle().compareTo(book2.getTitle());
		}

	}

	public static class BookAuthorComparator implements Comparator<Book> {

		@Override
		public int compare(Book book1, Book book2) {
			return book1.getAuthor().compareTo(book2.getAuthor());
		}

	}

	public static class BookPriceComparator implements Comparator<Book> {

		@Override
		public int compare(Book book1, Book book2) {
			if (book1.getPrice() > book2.getPrice())
				return 1;
			if (book1.getPrice() < book2.getPrice())
				return -1;
			return 0;
		}

	}

	public static class BookPublicationYearComparator implements Comparator<Book> {

		@Override
		public int compare(Book book1, Book book2) {
			if (book1.getPublicationYear() > book2.getPublicationYear())
				return 1;
			if (book1.getPublicationYear() < book2.getPublicationYear())
				return -1;
			return 0;
		}

	}
}
