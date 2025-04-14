import java.util.ArrayList;

public class LibraryManagementSystem {
    String userType;
    String userName;
    String password;
    void login(){
        System.out.println("User logged in");
    }
    void logout(){
        System.out.println("User logged out");
    }
    void register(){
        System.out.println("User registered");
    }
}
class User{
    String name;
    int id;
    void verify(){
        System.out.println("User verified");
    }
    void checkAccount(){
        System.out.println("Account checked");
    }
    void getBookInfo(){
        System.out.println("Book info retrieved");
    }

}
class Staff extends User{
String Dept;    
}
class Student extends User{
    String Class;
}
class Account{
    int noOfBooksBorrowed;
    int noOfBooksReturned;
    int noOfBooksReserved;
    int noOfBooksLost;
    int fineAmount;
    void calculateFine(){
        System.out.println("Fine calculated");
    }
}
class Book{
    String title;
    String author;
    String ISBN;
    String publisher;
    void showdueDate(){
        System.out.println("Due date shown");
    }
    void reservationStatus(){
        System.out.println("Reservation status shown");
    }
    void feedback(){
        System.out.println("Feedback given");
    }
    void bookRequest(){
        System.out.println("Book requested");
    }
    void renewInfo(){
        System.out.println("Renewal info shown");
    }

}
class Librarian{
    String name;
    int id;
    String password;
    String searchString;
    boolean verifyLibrarian(){
        System.out.println("Librarian verified");
        return true;
    }
    void searchBook(){
        System.out.println("Book searched");
    }
}
class LibraryDatabase{
    ArrayList<Book> listOfBooks = new ArrayList<>();
    void addBook(){
        System.out.println("Book added to database");
    }
    void removeBook(){
        System.out.println("Book removed from database");
    }
    void updateBookInfo(){
        System.out.println("Book info updated in database");
    }
    void displayBooks(){
        System.out.println("Books displayed from database");
    }
    void searchBook(){
        System.out.println("Book searched in database");
    }
}