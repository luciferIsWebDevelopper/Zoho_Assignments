package Assignment.ClassAndObject;

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
