import java.util.HashMap;
import java.util.ArrayList;

public class Library {
    private HashMap<String, Book> books;
    private HashMap<String, Member> members;

    public Library() {
        books = new HashMap<>();
        members = new HashMap<>();
    }

    // Book Management Methods
    public void addBook(Book book) {
        books.put(book.getTitle(), book);
    }
    public void removeBook(String bookId) {
        books.remove(bookId);
    }
    public void updateBook(String bookId, Book updatedBook) {
        books.put(bookId, updatedBook);
    }
    public Book searchBookByTitle(String title) {
        return books.get(title);
    }
    public ArrayList<Book> searchBookByAuthor(String author) {
        ArrayList<Book> result = new ArrayList<>();
        for (Book book : books.values()) {
            if (book.getAuthor().equalsIgnoreCase(author)) {
                result.add(book);
            }
        }
        return result;
    }
    public ArrayList<Book> searchBookByCategory(String category) {
        ArrayList<Book> result = new ArrayList<>();
        for (Book book : books.values()) {
            if (book.getCategory().equalsIgnoreCase(category)) {
                result.add(book);
            }
        }
        return result;
    }

    // Member Management Methods
    public void addMember(Member member) {
        members.put(member.getMemberId(), member);
    }
    public void removeMember(String memberId) {
        members.remove(memberId);
    }
    public void updateMember(String memberId, Member updatedMember) {
        members.put(memberId, updatedMember);
    }
    public Member getMemberById(String memberId) {
        return members.get(memberId);
    }

    // Transaction Methods
    public void borrowBook(String memberId, String bookId) {
        Member member = getMemberById(memberId);
        Book book = searchBookByTitle(bookId);
        if (member != null && book != null && book.isAvailable()) {
            member.borrowBook(book);
        }
    }
    public void returnBook(String memberId, String bookId) {
        Member member = getMemberById(memberId);
        Book book = searchBookByTitle(bookId);
        if (member != null && book != null) {
            member.returnBook(book);
        }
    }

    // Display Methods
    public void displayAllBooks() {
        for (Book book : books.values()) {
            System.out.println(book.getTitle());
        }
    }
    public void displayAllMembers() {
        for (Member member : members.values()) {
            System.out.println(member.getName());
        }
    }
}
