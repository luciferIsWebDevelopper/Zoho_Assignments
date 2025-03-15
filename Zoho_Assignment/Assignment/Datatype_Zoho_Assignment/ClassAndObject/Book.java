package Assignment.ClassAndObject;

public class Book {
    String tittle;
    int isbn;
    String authorName;
    int authorId;
    int year;
    Book(int isbn){
        this.isbn=isbn;
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public void IsBookReadable(){
        if(year>2000){
            System.out.println("The Book is Readable");
        }
        else System.out.println("The Book is Un Readable");
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
