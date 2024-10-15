import java.util.ArrayList;

public class Member {
    private String name;
    private String memberId;
    private ArrayList<Book> borrowedBooks;

    public Member() {
        borrowedBooks = new ArrayList<>();
    }

    // Getters and Setters
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getMemberId() {
        return memberId;
    }
    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }
    public ArrayList<Book> getBorrowedBooks() {
        return borrowedBooks;
    }
    public void borrowBook(Book book) {
        if (book.isAvailable()) {
            borrowedBooks.add(book);
            book.setAvailability(false);
        }
    }
    public void returnBook(Book book) {
        borrowedBooks.remove(book);
        book.setAvailability(true);
    }
}
