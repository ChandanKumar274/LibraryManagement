public class Library {

    public void issueBook(Book book, Student student) {

        if (!book.isIssued()) {
            book.issueBook();
            System.out.println(book.getBookName() + " issued to " + student.name);
        } else {
            System.out.println("Book already issued");
        }
    }

    public void returnBook(Book book) {
        book.returnBook();
        System.out.println(book.getBookName() + " returned successfully");
    }
}

