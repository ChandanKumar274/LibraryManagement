public class Book {

    private int bookId;
    private String bookName;
    private boolean isIssued;

    public Book(int bookId, String bookName) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.isIssued = false;
    }

    public int getBookId() {
        return bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public boolean isIssued() {
        return isIssued;
    }

    public void issueBook() {
        isIssued = true;
    }

    public void returnBook() {
        isIssued = false;
    }
}

