package org.ritik.stream;

public class Book {
	
	int bookId;
	String bookName;
	String bookAuthor;
	int bookYearPublication;
	int bookTotalQuantity;
	BookGenre bookGenre;
	
	public Book(int bookId, String bookName, String bookAuthor, int bookYearPublication, int bookTotalQuantity,
			BookGenre bookGenre) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
		this.bookAuthor = bookAuthor;
		this.bookYearPublication = bookYearPublication;
		this.bookTotalQuantity = bookTotalQuantity;
		this.bookGenre = bookGenre;
	}

	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getBookAuthor() {
		return bookAuthor;
	}

	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}

	public int getBookYearPublication() {
		return bookYearPublication;
	}

	public void setBookYearPublication(int bookYearPublication) {
		this.bookYearPublication = bookYearPublication;
	}

	public int getBookTotalQuantity() {
		return bookTotalQuantity;
	}

	public void setBookTotalQuantity(int bookTotalQuantity) {
		this.bookTotalQuantity = bookTotalQuantity;
	}

	public BookGenre getBookGenre() {
		return bookGenre;
	}

	public void setBookGenre(BookGenre bookGenre) {
		this.bookGenre = bookGenre;
	}

	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", bookName=" + bookName + ", bookAuthor=" + bookAuthor
				+ ", bookYearPublication=" + bookYearPublication + ", bookTotalQuantity=" + bookTotalQuantity
				+ ", bookGenre=" + bookGenre + "]";
	}
	
	
}
