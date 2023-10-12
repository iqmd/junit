package com.lb;

import java.util.ArrayList;

public class Patron {

    private int patronId;
    private String name;
    private ArrayList<Book> borrowedBooks = new ArrayList<>();

    public int getPatronId() {
        return patronId;
    }
    public void setPatronId(int patronId) {
        this.patronId = patronId;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public ArrayList<Book> getBorrowedBooks() {
        return borrowedBooks;
    }
    public void setBorrowedBooks(ArrayList<Book> borrowedBooks) {
        this.borrowedBooks = borrowedBooks;
    }

    public void addBook(Book book){
        borrowedBooks.add(book);
    }

    public void removeBook(Book book){
       for(int i=0; i < borrowedBooks.size(); i++){
          if(borrowedBooks.get(i).getBookId() == book.getBookId()) {
              borrowedBooks.remove(i);
          }
       }
    }

}
