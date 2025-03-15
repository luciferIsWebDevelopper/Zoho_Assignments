package Assignment.Constructors;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MainMovie {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date today = simpleDateFormat.parse(new SimpleDateFormat("yyyy-MM-dd").format(new Date()));
        Movie movie = new Movie("3025", 1000, "Guru samy", "Samantha", "Raja Mouli",
                "Hombale Films", 500, "Action/Thriller", simpleDateFormat.parse("2025-04-09"));
        movie.addMovies(movie);
        Movie movie1 = new Movie("The Romantic Iceland", 10, "Sai  Prasath", "Arora", "Senthil Sel Am",
                "Vishal Film Factory", 10, "Ramance", simpleDateFormat.parse("2009-09-09"));
        movie1.addMovies(movie1);
        movie.getMovies();
    }
}
