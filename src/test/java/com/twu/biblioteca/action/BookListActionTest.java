package com.twu.biblioteca.action;
import com.twu.biblioteca.bean.Book;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.*;

public class BookListActionTest {

    @Test
    public void should_get_success_when_do_booklistaction() throws Exception {
        BookListAction action = new BookListAction();
        String result=action.execute();
        assertEquals("success", result);
    }
    @Test
    public void should_get_bookdetails_when_do_initial() throws Exception{
        BookListAction action = new BookListAction();
        action.initialDetails();

        assertEquals(2, action.getBookList().size());
        assertEquals("clean code", action.getBookList().get(0).getName());
        assertEquals("Martin", action.getBookList().get(1).getAuthor());
        assertEquals(1998, action.getBookList().get(1).getPublishYear());
    }




}