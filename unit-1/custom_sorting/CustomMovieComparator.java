import java.util.Comparator;
public class CustomMovieComparator implements Comparator<Movie> {
    @Override
    public int compare(Movie m1, Movie m2) {
        // Compare by movie rating in descending order
        return m1.getMovieName().compareTo(m2.getMovieName());
    }
}
