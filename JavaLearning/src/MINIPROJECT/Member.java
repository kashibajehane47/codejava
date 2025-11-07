package MINIPROJECT;

import java.util.ArrayList;

public class Member {
    private String memberId;
    private String name;
    private ArrayList<String> borrowedBooks;

    public Member(String memberId, String name) {
        this.memberId = memberId;
        this.name = name;
        this.borrowedBooks = new ArrayList<>();
    }

    public String getMemberId() {
        return memberId;
    }

    public String getName() {
        return name;
    }

    public ArrayList<String> getBorrowedBooks() {
        return borrowedBooks;
    }

    public void borrowBook(String bookId) {
        borrowedBooks.add(bookId);
    }

    public void returnBook(String bookId) {
        borrowedBooks.remove(bookId);
    }

    public void displayMemberInfo() {
        System.out.println("Member ID: " + memberId + " | Name: " + name + " | Borrowed Books: " + borrowedBooks);
    }
}
