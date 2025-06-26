package learnCollection;

import java.util.Comparator;

public class Car implements Comparable<Car> {
    int id;
    String Brand;

    public Car(int carId, String brand) {
        this.id = carId;
        Brand = brand;
    }

    @Override
    public String toString() {
        return "Car [carId=" + id + ", Brand=" + Brand + "]";
    }

    // @Override
    // public int compareTo(Car o) {
    // if (this.id == o.id) {
    // return 0;
    // } else if (this.id > o.id) {
    // return -1;
    // } else {
    // return 1;
    // }
    // }
    @Override
    public int compareTo(Car o) {
    if (this.id == o.id) {
        return 0;
    } else if (this.id > o.id) {
        return 1;
    } else {
        return -1;
    }
    }

    // @Override
    // public int compare(Car o1, Car o2) {
    //     if(o1.Brand.equals(o2.Brand))
    //     return 0;
    // }

}
