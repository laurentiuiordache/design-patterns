package structural.bridge.example3.printer;

import structural.bridge.example3.beans.Detail;
import structural.bridge.example3.beans.Movie;

import java.util.Arrays;
import java.util.List;

public class MoviePrinter extends Printer {
    private Movie movie;

    public MoviePrinter(Movie movie) {
        this.movie = movie;
    }

    @Override
    protected List<Detail> getDetails() {
        return Arrays.asList(
                new Detail("Title", movie.getTitle()),
                new Detail("Year", movie.getYear()),
                new Detail("Runtime", movie.getRuntime())
        );
    }

    @Override
    protected String getHeader() {
        return movie.getClassification();
    }
}
