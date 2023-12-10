package Vjezba1911.RECORDS;
import java.util.List;
public record Movie(int movieId, String title, String genre, double rating) {
}
class MovieLibrary{
    public static List<Movie> filterMoviesByRating(List<Movie> movies, double minRating){
        return movies.stream().
                filter(a -> a.rating() >= minRating)
                .toList();
    }
}
class MainFive{
    public static void main(String[] args) {
        List<Movie> movieList = List.of(
                new Movie(1, "Inception", "Sci-Fi", 8.7),
                new Movie(2, "The Shawshank Redemption", "Drama", 9.3),
                new Movie(3, "The Dark Knight", "Action", 9.0)
        );
        System.out.println(MovieLibrary.filterMoviesByRating(movieList, 9.0));
    }
}