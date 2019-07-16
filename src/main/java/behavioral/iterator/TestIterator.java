package behavioral.iterator;

import behavioral.iterator.beans.BikeRepository;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestIterator {

    public static void main(String[] args) {
        BikeRepository repo = new BikeRepository();

        repo.addBike("Bike1");
        repo.addBike("Bike2");
        repo.addBike("Bike3");

        Iterator<String> bikeIterator = repo.iterator();

        while (bikeIterator.hasNext()){
            System.out.println(bikeIterator.next());
        }

        List<Integer> test = new ArrayList<>();
        test.add(1);
        test.add(2);
    }
}
