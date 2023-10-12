package com.lb;

import java.time.LocalDate;
import java.util.ArrayList;

public class Library {

    private int bookId=1000;
    private ArrayList<Book> library = new ArrayList<>();
    private ArrayList<Patron> patrons = new ArrayList<>();
    private int patronId=100;

    public void addBook(String title, String author){
        Book book = new Book();
        book.setBookId(bookId++);
        library.add(book);
    }


    public Book getBook(int bookId){
        return library.get(bookId-1000);
    }

    public Patron getPatron(int patron){
        return patrons.get(patron-100);
    }

    public void addPatron(String name){
        Patron patron = new Patron();
        patron.setPatronId(patronId++);
        patrons.add(patron);
    }

    public void borrowBook(int patronId, int bookId){
        Book book = library.get(bookId-1000);
        Patron patron = patrons.get(patronId-100);

        book.setAvailable(false);
        LocalDate today = LocalDate.of(LocalDate.now().getYear(), LocalDate.now().getMonth(), (LocalDate.now().getDayOfMonth()+3)%28);
        book.setDueDate(today);
        patron.addBook(book);

    }

    public void returnBook(int patronId, int bookId){
        Book book = library.get(bookId-1000);
        Patron patron = patrons.get(patronId-100);

        book.setAvailable(true);;
        patron.removeBook(book);
    }

    public ArrayList<Book> getAvailableBooks(){
        ArrayList<Book> available = new ArrayList<>();

        for(int i=0; i < library.size(); i++){
            if(library.get(i).isAvailable()){
                available.add(library.get(i));
            }
        }

        return available;
    }

    public ArrayList<Book> getPatronBorrowedBooks(int patronId){
        Patron patron = patrons.get(patronId-100);
        return patron.getBorrowedBooks();

    }

    public ArrayList<Book> getOverdueBooks(){

        ArrayList<Book> overdue = new ArrayList<>();
        for(Patron p: patrons){
            for(Book book: p.getBorrowedBooks()){
                if(book.getDueDate().getDayOfMonth() < LocalDate.now().getDayOfMonth()){
                    overdue.add(book);
                }
            }
        }

        return overdue;
    }

    public ArrayList<Book> getLibrary() {
        return library;
    }

    public void setLibrary(ArrayList<Book> library) {
        this.library = library;
    }

    public ArrayList<Patron> getPatrons() {
        return patrons;
    }

    public void setPatrons(ArrayList<Patron> patrons) {
        this.patrons = patrons;
    }

}
