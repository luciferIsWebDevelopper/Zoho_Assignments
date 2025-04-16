abstract class Movie {
    private String title;
    private int duration;
    private String villainActor;
    private String plotTwist;
    private String leadActor;
    private String leadActress;
    private String director;

    // getters and setters for the above variables
    public void setTitle(String title) {
        this.title = title;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public void setVillainActor(String villainActor) {
        this.villainActor = villainActor;
    }

    public void setPlotTwist(String plotTwist) {
        this.plotTwist = plotTwist;
    }

    public void setLeadActor(String leadActor) {
        this.leadActor = leadActor;
    }

    public void setLeadActress(String leadActress) {
        this.leadActress = leadActress;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getTitle() {
        return title;
    }

    abstract String getGenere();

    public int getDuration() {
        return duration;
    }

    public String getVillainActor() {
        return villainActor;
    }

    public String getPlotTwist() {
        return plotTwist;
    }

    public String getLeadActor() {
        return leadActor;
    }

    public String getLeadActress() {
        return leadActress;
    }

    public String getDirector() {
        return director;
    }

    public String getMovieDetails() {
        return "Movie Details:" + '\n' +
                "title='" + title + '\n' +
                "duration=" + duration + '\n' +
                "villainActor='" + villainActor + '\n' +
                "plotTwist='" + plotTwist + '\n' +
                "leadActor='" + leadActor + '\n' +
                "leadActress='" + leadActress + '\n' +
                "director='" + director + '\n';
    }
}

class RomComMovie extends Movie {

    public RomComMovie(String title, int duration, String villainActor, String plotTwist, String leadActor,
            String leadActress, String director) {
        setTitle(title);
        setDuration(duration);
        setVillainActor(villainActor);
        setPlotTwist(plotTwist);
        setLeadActor(leadActor);
        setLeadActress(leadActress);
        setDirector(director);
    }

    public String getGenere() {
        return "Thriller Genere Movie";
    }
}

class ThrillerMovie extends Movie {

    public ThrillerMovie(String title, int duration, String villainActor, String plotTwist, String leadActor,
            String leadActress, String director) {
        setTitle(title);
        setDuration(duration);
        setVillainActor(villainActor);
        setPlotTwist(plotTwist);
        setLeadActor(leadActor);
        setLeadActress(leadActress);
        setDirector(director);
    }

    public String getGenere() {
        return "Thriller Genere Movie";
    }
}

class MovieMain {
    public static void main(String[] args) {
        Movie movie = new RomComMovie("Lucky day", 197, "R J Balaji", "hero having 2 phases of life in same time",
                "Remo", "Samantha", "Gurusamy");
        System.out.println(movie.getGenere());
        System.out.println(movie.getMovieDetails());
        movie = new ThrillerMovie("ding dong bell", 197, "Kamal Hassan", "Hero is a Villain", "Gurusamy", "Anappama",
                "S S Rajamouli");
        System.out.println(movie.getGenere());
        System.out.println(movie.getMovieDetails());
    }
}