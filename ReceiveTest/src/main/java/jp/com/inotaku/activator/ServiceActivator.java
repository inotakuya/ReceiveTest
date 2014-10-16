package jp.com.inotaku.activator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import jp.com.inotaku.domain.Book;
import jp.com.inotaku.service.BookService;

@Transactional
public class ServiceActivator {

	@Autowired
	private BookService bookService;
	
	public void create(Book book){
		bookService.saveBook(book);
		System.out.println("create: " + book.getBookName());
	}
	
	public void update(Book book){
		bookService.updateBook(book);
		System.out.println("update: " + book.getBookName());
	}
	
	public void delete(Book book){
		System.out.println("delete: " + book.getBookName());
		bookService.deleteBook(book);
	}
	
	public void error(Book book){
		System.out.println("error: " + book.getBookName());
	}
}
