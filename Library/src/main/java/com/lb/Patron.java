package com.lb;

public class Patron {

    private int patronId;
    private String name;
    private ArrayList<Book> borrowedBooks;

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

}
