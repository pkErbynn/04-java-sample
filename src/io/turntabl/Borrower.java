package io.turntabl;

import java.util.List;

public class Borrower {
    private String name;
    private int accountNumber;
    private BorrowType borrow;
//    private List<Book> booksBorrowed;

    public Borrower(String name, int accountNumber, BorrowType borrow) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.borrow = borrow;
//        this.date = date;
//        this.booksBorrowed = booksBorrowed;
    }

    @Override
    public String toString() {
        return "Borrower{" +
                "name='" + name + '\'' +
                ", accountNumber=" + accountNumber +
                ", borrow=" + borrow +
//                ", date=" + date +
//                ", booksBorrowed=" + booksBorrowed +
                '}';
    }

    public String getName() {
        return name;
    }

    public BorrowType getBorrowType() {
        return borrow;
    }

    public int getAccountNumber() {
        return accountNumber;
    }



    void returnBook(List<Book> books){
        for(Book bb: books){
            System.out.println(bb);
        }
    }

    void borrowBook(){

    }
}
