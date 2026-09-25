package org.ritik.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> trainees = new ArrayList<>();
		trainees.add("ka");
		trainees.add("Rahul");
		trainees.add("kiyan");
		trainees.add("Ankit");
		trainees.add("kivek");

		/*
		 * Stream<String> streamTrainees= trainees.stream(); Stream<String>
		 * traineesWithK = streamTrainees.filter(str->str.startsWith("k"));
		 * traineesWithK.forEach(System.out::println);
		 */

		/*
		 * trainees.stream() .filter(str->str.startsWith("k")) .sorted()
		 * .forEach(System.out::println);
		 * 
		 * List<String> alltarineesK = trainees.stream()
		 * .filter(str->str.startsWith("k")) .sorted() .collect(Collectors.toList());
		 * 
		 * alltarineesK.forEach(System.out::println);
		 */

		
		  trainees.stream() 
		  			.filter(str->str.length()>2) 
		  			.map(name->name.toUpperCase())
		  			.forEach(System.out::println);
		  
		  
		  
		  
		 

		List<Book> bookList = Arrays.asList(
				new Book(101, "Java Programming", "James Gosling", 2020, 10, BookGenre.FICTION),
				new Book(102, "Clean Code", "Robert C. Martin", 2008, 8, BookGenre.TECHNOLOGY),
				new Book(103, "Effective Java", "Joshua Bloch", 2018, 12, BookGenre.TECHNOLOGY),
				new Book(104, "The Alchemist", "Paulo Coelho", 1988, 15, BookGenre.FICTION),
				new Book(105, "Harry Potter", "J. K. Rowling", 1997, 20, BookGenre.FICTION),
				new Book(106, "The Silent Patient", "Alex Michaelides", 2019, 9, BookGenre.CRIMETHRILLIER),
				new Book(107, "Gone Girl", "Gillian Flynn", 2012, 11, BookGenre.CRIMETHRILLIER),
				new Book(108, "Ramayana", "Valmiki", 500, 7, BookGenre.MYTHOLOGY),
				new Book(109, "Mahabharata", "Ved Vyasa", 400, 6, BookGenre.MYTHOLOGY),
				new Book(110, "The Shiva Trilogy", "Amish Tripathi", 2010, 14, BookGenre.MYTHOLOGY));

		filterOnAuthor(bookList);

//		uniqueBooks(bookList);

//		usingCollectors(bookList);

//		sortedBook(bookList);

//		maxBook(bookList);
		
//		grouping(bookList);
		
//		parititioning(bookList);

	}

	private static void parititioning(List<Book> bookList) {
		Map<Boolean,List<Book>> partitionedList=bookList.stream()
				.collect(Collectors.partitioningBy(book -> book.getBookTotalQuantity()<=10));
		
		List<Book> above5 = partitionedList.get(true);
		above5.forEach(System.out::println);
		
		System.out.println("==============================");
		
		List<Book> below5 = partitionedList.get(false);
		below5.forEach(System.out::println);
	}

	private static void grouping(List<Book> bookList) {
		Map<BookGenre,List<Book>> bookByGenre = bookList.stream()
				.collect(Collectors.groupingBy(Book::getBookGenre));
		
		List<Book> bookTech = bookByGenre.get(BookGenre.TECHNOLOGY);
		List<Book> bookFiction = bookByGenre.get(BookGenre.FICTION);
		List<Book> bookMthology = bookByGenre.get(BookGenre.MYTHOLOGY);
		
		bookTech.forEach(System.out::println);
		System.out.println("********************");
		bookFiction.forEach(System.out::println);
		System.out.println("********************");
		bookMthology.forEach(System.out::println);
		System.out.println("********************");
	}

	private static void maxBook(List<Book> bookList) {
		Optional<Book> optBook = bookList.stream()
				.max((book1, book2) -> book1.getBookTotalQuantity() > book2.getBookTotalQuantity() ? 1
						: book1.getBookTotalQuantity() < book2.getBookTotalQuantity() ? -1 : 0);

		if (optBook.isPresent()) {
			Book maxBook = optBook.get();
			System.out.println(maxBook);
		}
	}

	private static void sortedBook(List<Book> bookList) {
		bookList.stream()
				.sorted((book1, book2) -> book1.getBookYearPublication() > book2.getBookYearPublication() ? 1
						: book1.getBookYearPublication() < book2.getBookYearPublication() ? -1 : 0)
				.forEach(System.out::println);
	}

	private static void usingCollectors(List<Book> bookList) {
		List<Book> finalList = bookList.stream().filter((book1) -> book1.getBookGenre() == BookGenre.TECHNOLOGY)
				.collect(Collectors.toList());

		finalList.forEach(System.out::println);
	}

	private static void uniqueBooks(List<Book> bookList) {
		bookList.stream().distinct().forEach(System.out::println);
	}

	private static void filterOnAuthor(List<Book> bookList) {
		bookList.stream()
		.filter(book -> book.bookGenre.equals("James Gosling"))
		.forEach(System.out::println);
	}

}
