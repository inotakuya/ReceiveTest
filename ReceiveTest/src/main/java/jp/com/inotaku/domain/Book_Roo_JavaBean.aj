// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package jp.com.inotaku.domain;

import jp.com.inotaku.domain.Book;

privileged aspect Book_Roo_JavaBean {
    
    public long Book.getBookId() {
        return this.bookId;
    }
    
    public void Book.setBookId(long bookId) {
        this.bookId = bookId;
    }
    
    public String Book.getBookName() {
        return this.bookName;
    }
    
    public void Book.setBookName(String bookName) {
        this.bookName = bookName;
    }
    
    public int Book.getPrice() {
        return this.price;
    }
    
    public void Book.setPrice(int price) {
        this.price = price;
    }
    
}
