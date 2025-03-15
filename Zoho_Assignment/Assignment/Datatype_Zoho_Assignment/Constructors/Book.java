package Assignment.Constructors;

import java.util.ArrayList;

public class Book {
    String tittle;
    int isbn;
    String authorName;
    int authorId;
    int year;
    Book(int isbn,String title,String authorName,int authorId,int year){
        this.isbn=isbn;
        this.tittle=title;
        this.authorName=authorName;
        this.authorId=authorId;
        this.year=year;
    }
    public static ArrayList<Book> books = new ArrayList<>();

    public static void getBooks() {
        for (int i = 0; i < books.size(); i++) {
            Book a = books.get(i);
            System.out.println("ISBN: " + a.getIsbn());
            System.out.println("Tittle: " + a.getTittle());
            System.out.println("Author I'd: " + a.getAuthorId());
            System.out.println("Author Name: " + a.getAuthorName());
            System.out.println("Year: " + a.getYear());
            a.IsBookReadable();

        }
    }

    public void addBooks(Book b) {
        books.add(b);
    }

    Book(int isbn) {
        this.isbn = isbn;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void IsBookReadable() {
        if (year > 2000) {
            System.out.println("The Book is Readable");
        } else
            System.out.println("The Book is Un Readable");
    }

    public int getIsbn() {
        return isbn;
    }

    protected void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public String getTittle() {
        return tittle;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    public int getAuthorId() {
        return authorId;
    }

    public void setAuthorId(int authorId) {
        this.authorId = authorId;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }
}
