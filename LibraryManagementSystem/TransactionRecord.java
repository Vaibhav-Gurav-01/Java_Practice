import java.util.Date;

public class TransactionRecord {
    private String memberId;
    private String bookTitle;
    private String transactionType; // Borrow/Return
    private Date transactionDate;

    public TransactionRecord(String memberId, String bookTitle, String transactionType) {
        this.memberId = memberId;
        this.bookTitle = bookTitle;
        this.transactionType = transactionType;
        this.transactionDate = new Date();
    }

    // Getters
    public String getMemberId() {
        return memberId;
    }
    public String getBookId() {
        return bookTitle; // Assuming bookTitle as bookId for simplicity
    }
    public String getTransactionType() {
        return transactionType;
    }
    public Date getTransactionDate() {
        return transactionDate;
    }
}
