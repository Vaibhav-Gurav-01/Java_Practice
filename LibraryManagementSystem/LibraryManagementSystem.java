import java.util.Scanner;

public class LibraryManagementSystem {
    public static void main(String[] args) {
        Library library = new Library();
        Transaction transaction = new Transaction();
        Scanner scanner = new Scanner(System.in);

        // Example usage
        while (true) {
            System.out.println("Library Management System");
            System.out.println("1. Add Book");
            System.out.println("2. Add Member");
            System.out.println("3. Borrow Book");
            System.out.println("4. Return Book");
            System.out.println("5. Display All Books");
            System.out.println("6. Display All Members");
            System.out.println("7. Display Transactions");
            System.out.println("0. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    // Add Book
                    System.out.print("Enter book title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter book author: ");
                    String author = scanner.nextLine();
                    System.out.print("Enter book category: ");
                    String category = scanner.nextLine();
                    Book book = new Book();
                    book.setTitle(title);
                    book.setAuthor(author);
                    book.setCategory(category);
                    book.setAvailability(true);
                    library.addBook(book);
                    System.out.println("Book added!");
                    break;

                case 2:
                    // Add Member
                    System.out.print("Enter member name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter member ID: ");
                    String memberId = scanner.nextLine();
                    Member member = new Member();
                    member.setName(name);
                    member.setMemberId(memberId);
                    library.addMember(member);
                    System.out.println("Member added!");
                    break;

                case 3:
                    // Borrow Book
                    System.out.print("Enter member ID: ");
                    String borrowMemberId = scanner.nextLine();
                    System.out.print("Enter book title: ");
                    String borrowBookTitle = scanner.nextLine();
                    library.borrowBook(borrowMemberId, borrowBookTitle);
                    transaction.recordBorrowTransaction(borrowMemberId, borrowBookTitle);
                    System.out.println("Book borrowed!");
                    break;

                case 4:
                    // Return Book
                    System.out.print("Enter member ID: ");
                    String returnMemberId = scanner.nextLine();
                    System.out.print("Enter book title: ");
                    String returnBookTitle = scanner.nextLine();
                    library.returnBook(returnMemberId, returnBookTitle);
                    transaction.recordReturnTransaction(returnMemberId, returnBookTitle);
                    System.out.println("Book returned!");
                    break;

                case 5:
                    // Display All Books
                    library.displayAllBooks();
                    break;

                case 6:
                    // Display All Members
                    library.displayAllMembers();
                    break;

                case 7:
                    // Display Transactions
                    transaction.displayTransactions();
                    break;

                case 0:
                    // Exit
                    System.out.println("Exiting...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
    }
}
