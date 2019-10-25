package io.turntabl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // book instances
        Book book1 = new Book("erbynn", "code tips", 23454, BookCategory.ADVENTURE, BookState.BORROWED);
        Book book2 = new Book("Sam", "Turntabl.io", 12344, BookCategory.ADVENTURE.ADVENTURE, BookState.AVAILABLE);

        // collection of instances of borrowers as list...use array.aslist when creating
        List<Borrower> borrowers = Arrays.asList(
                new Borrower("john", 3494, BorrowType.GOLD),
                new Borrower("pk", 1244, BorrowType.PREMIUM),
                new Borrower("bin", 128, BorrowType.GOLD),
                new Borrower("erbynn", 174, BorrowType.GOLD),
                new Borrower("demystify", 164, BorrowType.PREMIUM),
                new Borrower("turntabl", 124, BorrowType.GOLD)
        );
        printBorrowers(borrowers);

//        filtering to get only premium borrowers
        List<Borrower> premiumBorrowers = new ArrayList<>();    //...use arraylist when using to store
        for(Borrower bor: borrowers){
            if(bor.getBorrowType() == BorrowType.PREMIUM){
                premiumBorrowers.add(bor);
            }
        }
        printBorrowers(premiumBorrowers);



    }

    private static void printBorrowers(List<Borrower> borrowers) {
        System.out.println(borrowers);
        System.out.println("Lenght: " + borrowers.size());
    }
}
