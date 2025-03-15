package Assignment.Constructors;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Movie {
    String movieName;
    int noOfActors;
    String heroName;
    String heroineName;
    String director;
    String producer;
    long budget;
    String genere;
    Date releaseDate;
    static ArrayList<Movie> movies = new ArrayList<>();

    Movie(String movieName, int noOfActors, String heroName, String heroineName, String director, String producer,
            long budget, String genere, Date releasDate) {
        this.movieName = movieName;
        this.noOfActors = noOfActors;
        this.heroName = heroName;
        this.heroineName = heroineName;
        this.director = director;
        this.producer = producer;
        this.budget = budget;
        this.genere = genere;
        this.releaseDate = releasDate;
    }

    public static void getMovies() throws ParseException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date today = simpleDateFormat.parse(new SimpleDateFormat("yyyy-MM-dd").format(new Date()));
        for (int i = 0; i < movies.size(); i++) {
            Movie movie = movies.get(i);
            System.out.println("Movie Name: " + movie.getMovieName());
            System.out.println("Hero Name: " + movie.getHeroName());
            System.out.println("Heroine Name: " + movie.getHeroineName());
            System.out.println("Movie Budget: " + movie.getBudget());
            System.out.println("Director: " + movie.getDirector());
            System.out.println("Producer: " + movie.getProducer());
            System.out.println("Movie Genere: " + movie.getGenere());
            System.out.println("No Of Actors: " + movie.getNoOfActors());
            System.out.println("Movie Release Date: " + movie.getReleaseDate());
            movie.isMovieReleased(today.compareTo(movie.getReleaseDate()));
        }
    }
    void addMovies(Movie m){
        movies.add(m);

    }
    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public int getNoOfActors() {
        return noOfActors;
    }

    public void setNoOfActors(int noOfActors) {
        this.noOfActors = noOfActors;
    }

    public String getHeroName() {
        return heroName;
    }

    public void setHeroName(String heroName) {
        this.heroName = heroName;
    }

    public String getHeroineName() {
        return heroineName;
    }

    public void setHeroineName(String heroineName) {
        this.heroineName = heroineName;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public long getBudget() {
        return budget;
    }

    public void setBudget(long budget) {
        this.budget = budget;
    }

    public String getGenere() {
        return genere;
    }

    public void setGenere(String genere) {
        this.genere = genere;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }

    void isMovieReleased(int d) {
        switch (d) {
            case 1 -> {
                System.out.println("The Movie has released");
            }
            case 0 -> {
                System.out.println("Today is the release Date");
            }
            case -1 -> {
                System.out.println("The Movie is not yet released");
            }
        }
    }
}
