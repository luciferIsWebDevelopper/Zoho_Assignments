package Assignment.Constructors;

public class MainBook {
    public static void main(String[] args) {
        Book book = new Book(876, "The Good Developer", "Gurusamy", 93, 2002);
        book.addBooks(book);
        Book book1 = new Book(786, "The Atheist", "Sai Prasath", 99, 1999);
        book1.addBooks(book1);
        book1.getBooks();
    }
}
