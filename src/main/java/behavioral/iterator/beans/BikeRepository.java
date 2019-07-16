package behavioral.iterator.beans;

import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

public class BikeRepository implements Iterable<String> {
    private String[] bikes;
    private int index;

    public BikeRepository() {
        this.bikes = new String[2];
        this.index = 0;
    }

    public void addBike(String bike) {
        if (index == bikes.length) {
            String[] largerBikes = new String[bikes.length + 5];
            System.arraycopy(bikes, 0, largerBikes, 0, bikes.length);
            bikes = largerBikes;
            largerBikes = null;
            System.out.println("Increasing the size");
        }

        bikes[index] = bike;
        index++;
    }

    @Override
    public Iterator<String> iterator() {
        Iterator<String> it = new Iterator<String>() {

            private int currentIdx = 0;


            @Override
            public boolean hasNext() {
                return currentIdx < bikes.length && bikes[currentIdx] != null;
            }

            @Override
            public String next() {
                return bikes[currentIdx++];
            }

            @Override
            public void remove() {
                throw new UnsupportedOperationException("Unsupported operation");
            }
        };

        return it;
    }

}
