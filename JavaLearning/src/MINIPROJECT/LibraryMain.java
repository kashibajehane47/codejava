package MINIPROJECT;

import java.util.Scanner;

public class LibraryMain {
    public static void main(String[] args) {
        Library library = new Library();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n-----  Library Management System -----");
            System.out.println("1. Add Book");
            System.out.println("2. Add Member");
            System.out.println("3. Issue Book");
            System.out.println("4. Return Book");
            System.out.println("5. View All Books");
            System.out.println("6. View All Members");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine(); // consume newline

            try {
                switch (choice) {
                    case 1:
                        System.out.print("Enter Book ID: ");
                        String bookId = sc.nextLine();
                        System.out.print("Enter Book Title: ");
                        String title = sc.nextLine();
                        System.out.print("Enter Author: ");
                        String author = sc.nextLine();
                        library.addBook(new Book(bookId, title, author));
                        break;

                    case 2:
                        System.out.print("Enter Member ID: ");
                        String memberId = sc.nextLine();
                        System.out.print("Enter Member Name: ");
                        String name = sc.nextLine();
                        library.addMember(new Member(memberId, name));
                        break;

                    case 3:
                        System.out.print("Enter Book ID to issue: ");
                        String issueBookId = sc.nextLine();
                        System.out.print("Enter Member ID: ");
                        String issueMemberId = sc.nextLine();
                        library.issueBook(issueBookId, issueMemberId);
                        break;

                    case 4:
                        System.out.print("Enter Book ID to return: ");
                        String returnBookId = sc.nextLine();
                        System.out.print("Enter Member ID: ");
                        String returnMemberId = sc.nextLine();
                        System.out.print("Enter Late Days: ");
                        int lateDays = sc.nextInt();
                        sc.nextLine();
                        library.returnBook(returnBookId, returnMemberId, lateDays);
                        break;

                    case 5:
                        library.displayAllBooks();
                        break;

                    case 6:
                        library.displayAllMembers();
                        break;

                    case 7:
                        System.out.println(" Exiting Library System...");
                        sc.close();
                        return;

                    default:
                        System.out.println("⚠Invalid choice! Try again.");
                }
            } catch (InvalidReturnException e) {
                System.out.println(" Error: " + e.getMessage());
            }
        }
    }
}

