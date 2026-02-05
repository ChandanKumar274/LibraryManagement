public class Main {

    public static void main(String[] args) {

        Book book1 = new Book(101, "Java Basics");
        Book book2 = new Book(102 , "C++");
        Student s1 = new Student("Chandan");
        Student s2 = new Student("rahul");
        Library library = new Library();

        s1.showRole();
        library.issueBook(book1, s2);
        library.issueBook(book2, s1 );
        library.returnBook(book1);
        library.returnBook(book2);
    }
}