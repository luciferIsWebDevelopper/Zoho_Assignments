package Assignment.ClassAndObject;

import java.util.*;

public class MainBook {
    public static void main(String[] args) {
        Book book = new Book(876);
        book.setTittle("The Good Developer");
        book.setAuthorName("Gurusamy");
        book.setAuthorId(001);
        book.setYear(2020);
        // book.setIsbn(875);

        /*
         * this could be possible but meaning less
         * because we don't change the isbn of a specific book i'd therev and there
         */
        System.out.println("ISBN: " + book.getIsbn());
        System.out.println("Tittle: " + book.getTittle());
        System.out.println("Author I'd: " + book.getAuthorId());
        System.out.println("Author Name: " + book.getAuthorName());
        System.out.println("Year: " + book.getYear());
        book.IsBookReadable();
        Book book1 = new Book(88936);
        book1.setTittle("The Good Developer");
        book1.setAuthorName("Deepa");
        book1.setAuthorId(002);
        book1.setYear(1999);
        // book1.setIsbn(875);

        /*
         * this could be possible but meaning less
         * because we don't change the isbn of a specific book1 i'd therev and there
         */
        System.out.println("ISBN: " + book1.getIsbn());
        System.out.println("Tittle: " + book1.getTittle());
        System.out.println("Author I'd: " + book1.getAuthorId());
        System.out.println("Author Name: " + book1.getAuthorName());
        System.out.println("Year: " + book1.getYear());
        book1.IsBookReadable();
    }
}