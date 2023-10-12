package com.lb;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDate;
import java.util.ArrayList;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class LibraryTest
{
    static Library library;

    @BeforeAll
    static void inits(){
        library = new Library();

        for(int i=1; i < 20; i++){
            String title = "book"+i;
            String author = "author"+i;
            String patron = "patron"+i;
            library.addBook(title,author);
            library.addPatron(patron);
        }
    }

    @BeforeEach
    public void setupBeforeEachTest(){
    }

    @Test
    public void addBookTest(){
        int librarySizeBeforeAdding = library.getLibrary().size();
        library.addBook("Harry Potter", "JK Rowling");

        //If book is successfully added then library size will increase by 1
        assertEquals(librarySizeBeforeAdding+1, library.getLibrary().size());
    }

    @Test
    public void borrowTest(){
        library.borrowBook(105, 1004);
        assertFalse(library.getBook(1004).isAvailable());
    }

    @Test
    public void returnTest(){
        library.returnBook(105, 1004);
        assertTrue(library.getBook(1004).isAvailable());
    }
    @Test
    public void availableBooksTest(){
        int numberOfAvailabeBooks = library.getAvailableBooks().size();
        library.borrowBook(103,1008);

        //After borrowing the size of available books should decrease by 1
        assertEquals(numberOfAvailabeBooks-1, library.getAvailableBooks().size());

    }

    @Test
    public void booksBorrowedByPatronTest(){
        int booksBorrowedByPatron = library.getPatron(103).getBorrowedBooks().size();
        library.borrowBook(103,1007);

        //After successfull borrowing the size of borrowed books by the patron should increase by 1
        assertEquals(booksBorrowedByPatron+1, library.getPatron(103).getBorrowedBooks().size());
    }

    @Test
    public void overDueBookTest(){
        library.borrowBook(102,1005);
        Book book = library.getBook(1005);
        ArrayList<Book> overdueBooks = library.getOverdueBooks();
        assertEquals(0,overdueBooks.size());


        book.setDueDate(LocalDate.of(LocalDate.now().getYear(), LocalDate.now().getMonth(), LocalDate.now().getDayOfMonth()-10));

        overdueBooks = library.getOverdueBooks();
        assertEquals(1,overdueBooks.size());

    }
}
