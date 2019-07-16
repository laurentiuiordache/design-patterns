package creational.prototype;

import creational.prototype.beans.ItemType;
import creational.prototype.beans.Movie;
import creational.prototype.beans.Registry;

public class TestPrototype {
    public static void main(String[] args) {

        Registry registry = new Registry();
        Movie movieOne = (Movie) registry.createItem(ItemType.MOVIE);
        movieOne.setTitle("Creational Patterns in Java: part one");

        System.out.println(movieOne);

        Movie movieTwo = (Movie) registry.createItem(ItemType.MOVIE);
        movieTwo.setTitle("Creational Patterns in Java: part two");
        System.out.println(movieTwo);

    }
}
