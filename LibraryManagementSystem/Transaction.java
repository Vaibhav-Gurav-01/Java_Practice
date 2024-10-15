import java.util.ArrayList;

public class Transaction {
    private ArrayList<TransactionRecord> transactions;

    public Transaction() {
        transactions = new ArrayList<>();
    }

    public void recordBorrowTransaction(String memberId, String bookId) {
        transactions.add(new TransactionRecord(memberId, bookId, "Borrow"));
    }

    public void recordReturnTransaction(String memberId, String bookId) {
        transactions.add(new TransactionRecord(memberId, bookId, "Return"));
    }

    public void displayTransactions() {
        for (TransactionRecord record : transactions) {
            System.out.println(record.getMemberId() + " " + record.getTransactionType() + " " + record.getBookId());
        }
    }
}
