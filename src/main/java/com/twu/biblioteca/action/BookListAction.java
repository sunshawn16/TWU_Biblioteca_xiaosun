package com.twu.biblioteca.action;

import com.opensymphony.xwork2.ActionSupport;
import com.twu.biblioteca.bean.Book;
import java.util.ArrayList;
import java.util.List;

public class BookListAction extends ActionSupport{

    private String bookMsg="Get Book List....";
    private  List<Book> bookList=null;
    @Override
    public String execute() throws Exception {
        return SUCCESS;
    }
    public String initialDetails() throws Exception{
        Book book1=new Book("clean code","Martin F",1990);
        Book book2=new Book("refactor","Martin",1998);

        bookList=new ArrayList<Book>();
        bookList.add(book1);
        bookList.add(book2);
        return SUCCESS;
    }


    public List<Book> getBookList() {
        return bookList;
    }
    public void setBookList(List<Book> bookList) {
        this.bookList = bookList;
    }
    public String getBookMsg() {
        return bookMsg;
    }
    public void setBookMsg(String bookMsg) {
        this.bookMsg = bookMsg;
    }
}
