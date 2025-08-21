import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

public class Movie implements Comparable<Movie> {
    private int movieId;
    private String movieName;
    private String movieDesctiption;
    private double movieRating;
    private String movieGenre;

    public Movie(int movieId, String movieName, String movieDesctiption, double movieRating, String movieGenre) {
        this.movieId = movieId;
        this.movieName = movieName;
        this.movieDesctiption = movieDesctiption;
        this.movieRating = movieRating;
        this.movieGenre = movieGenre;
    }

    // getters and setters
    public int getMovieId() {
        return movieId;
    }

    public void setMovieId(int movieId) {
        this.movieId = movieId;
    }
    public String getMovieName() {
        return movieName;
    }   

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getMovieDesctiption() {
        return movieDesctiption;
    }

    public void setMovieDesctiption(String movieDesctiption) {
        this.movieDesctiption = movieDesctiption;
    }

    public double getMovieRating() {
        return movieRating;
    }

    public void setMovieRating(double movieRating) {
        this.movieRating = movieRating;
    }

    public String getMovieGenre() {
        return movieGenre;
    }

    public void setMovieGenre(String movieGenre) {
        this.movieGenre = movieGenre;
    }

    // add the compareTo method to sort by movie rating
    @Override   
    public int compareTo(Movie other) {
        return this.movieRating > other.movieRating ? -1 : (this.movieRating < other.movieRating ? 1 : 0);
    }


    @Override
    public String toString() {
        return "Movie{" +
                "movieId=" + movieId +
                ", movieName='" + movieName + '\'' +
                ", movieDesctiption='" + movieDesctiption + '\'' +
                ", movieRating=" + movieRating +
                ", movieGenre='" + movieGenre + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Movie movie = new Movie(1, "Inception", "A mind-bending thriller", 8.8, "Sci-Fi");
        System.out.println(movie);

        Movie movie2 = new Movie(2, "The Dark Knight", "A gritty superhero film", 9.0, "Action");
        System.out.println(movie2);

        Movie movie3 = new Movie(3, "Interstellar", "A space exploration epic", 8.6, "Sci-Fi");

        System.out.println(movie3);

        List<Movie> movieList = new ArrayList<>();

        movieList.add(movie);
        movieList.add(movie2);
        movieList.add(movie3);

        Collections.sort(movieList);

        // System.out.println("Sorted Movies by Rating:" + movieList);


        // Example of using CustomMovieComparator
        CustomMovieComparator comparator = new CustomMovieComparator();
        Collections.sort(movieList, comparator);
        
        System.out.println("Sorted Movies by Name: " + movieList);

        // // Example of using getters
        // System.out.println("Movie Name: " + movie.getMovieName());
        // System.out.println("Movie Rating: " + movie.getMovieRating());
        
        // // Example of using setters
        // movie.setMovieRating(9.0);
        // System.out.println("Updated Movie Rating: " + movie.getMovieRating());
    }

}
