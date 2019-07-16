package structural.bridge.example3;

import structural.bridge.example3.beans.Event;
import structural.bridge.example3.beans.Movie;
import structural.bridge.example3.formatter.Formatter;
import structural.bridge.example3.formatter.HtmlPrintFormatter;
import structural.bridge.example3.formatter.PrintFormatter;
import structural.bridge.example3.printer.EventPrinter;
import structural.bridge.example3.printer.MoviePrinter;
import structural.bridge.example3.printer.Printer;

import java.time.LocalDateTime;

public class TestBridge {
    public static void main(String[] args) {
        Movie movie = new Movie();
        movie.setClassification("Action");
        movie.setTitle("John Wick");
        movie.setRuntime("2:15");
        movie.setYear("1994");

        Formatter printFormatter = new PrintFormatter();
        Formatter htmlFormatter = new HtmlPrintFormatter();
        Printer moviePrinter = new MoviePrinter(movie);

        String printedMaterial = moviePrinter.print(printFormatter);
        String htmlMaterial = moviePrinter.print(htmlFormatter);

        System.out.println(printedMaterial);
        System.out.println(htmlMaterial);

        Event event = new Event();
        event.setTitle("Ziua lui Andrei");
        event.setDateTime(LocalDateTime.now());
        event.setLocation("Constanta");

        Printer eventPrinter = new EventPrinter(event);
        String printedEvent = eventPrinter.print(printFormatter);
        System.out.println(printedEvent);
    }
}
