package MINIPROJECT;

import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class Library {
    private HashMap<String, Book> books = new HashMap<>();
    private HashMap<String, Member> members = new HashMap<>();
    private final String logFile = "operations_log.txt";

    public void addBook(Book book) {
        books.put(book.getBookId(), book);
        logOperation("Added Book: " + book.getTitle());
    }

    public void addMember(Member member) {
        members.put(member.getMemberId(), member);
        logOperation("Added Member: " + member.getName());
    }

    public void issueBook(String bookId, String memberId) {
        Book book = books.get(bookId);
        Member member = members.get(memberId);

        if (book != null && member != null && !book.isIssued()) {
            book.setIssued(true);
            member.borrowBook(bookId);
            logOperation("Issued Book: " + bookId + " to " + memberId);
            System.out.println("✅ Book issued successfully!");
        } else {
            System.out.println("❌ Cannot issue book! Check ID or book availability.");
        }
    }

    public void returnBook(String bookId, String memberId, int lateDays) throws InvalidReturnException {
        Member member = members.get(memberId);
        Book book = books.get(bookId);

        if (member == null || book == null || !member.getBorrowedBooks().contains(bookId)) {
            throw new InvalidReturnException("Invalid return attempt — this member didn’t borrow that book!");
        }

        book.setIssued(false);
        member.returnBook(bookId);
        double lateFee = lateDays * 2.0;
        logOperation("Returned Book: " + bookId + " by " + memberId + " (Late Fee: ₹" + lateFee + ")");
        System.out.println("✅ Book returned successfully! Late Fee: ₹" + lateFee);
    }

    public void displayAllBooks() {
        System.out.println("\n📚 List of Books:");
        for (Book book : books.values()) {
            book.displayBookInfo();
        }
    }

    public void displayAllMembers() {
        System.out.println("\n👥 List of Members:");
        for (Member member : members.values()) {
            member.displayMemberInfo();
        }
    }

    private void logOperation(String message) {
        try (FileWriter fw = new FileWriter(logFile, true)) {
            fw.write("[" + new Date() + "] " + message + "\n");
        } catch (IOException e) {
            System.out.println("⚠️ Error writing to log: " + e.getMessage());
        }
    }
}

