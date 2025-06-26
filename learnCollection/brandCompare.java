package learnCollection;

import java.util.Comparator;

public class brandCompare implements Comparator<Car>{

    @Override
    public int compare(Car o1, Car o2) {
        return o1.Brand.compareTo(o2.Brand);
    }
    
    
}
