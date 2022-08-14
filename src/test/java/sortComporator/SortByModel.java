package sortComporator;

import java.util.Comparator;

public class SortByModel implements Comparator<Car> {
    @Override
    public int compare(Car carName1, Car carName2) {
        if (carName1 == null || carName2 == null) {
            System.out.println("Пустое значение");
        }
        return carName1.getModel().compareTo(carName2.getModel());
    }
}
