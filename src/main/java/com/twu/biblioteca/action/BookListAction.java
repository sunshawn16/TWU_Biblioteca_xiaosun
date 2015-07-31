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
        Book book1=new Book("clean code","sun",1990);
        Book book2=new Book("refactor","sun",1990);
        //List<Book> bookList={book1,book2};//没有这种写法！！！！
        bookList=new ArrayList<Book>();
        bookList.add(book1);
        bookList.add(book2);

        //System.out.println("Get book list");
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
