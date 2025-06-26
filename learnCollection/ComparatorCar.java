package learnCollection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ComparatorCar{
    public static void main(String[] args) {

        List<Car> carlist =new ArrayList<>();

        carlist.add(new Car(1, "KIA"));
        carlist.add(new Car(2, "BMW"));
        carlist.add(new Car(4, "HONDA"));
        carlist.add(new Car(3, "TATA"));
        System.out.println(" First"+carlist);
        // carlist.sort();

        Collections.sort(carlist);
        System.out.println(" Second "+carlist);
        Collections.sort(carlist, new brandCompare());
        System.out.println(" Third "+carlist);

        
    }
    
    
}
