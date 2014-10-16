package jp.com.inotaku.service;

import jp.com.inotaku.domain.Book;

public class BookServiceImpl implements BookService {
	
    public void saveBook(Book book) {
        bookRepository.save(book);
    }
}
