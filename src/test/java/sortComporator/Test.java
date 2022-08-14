package sortComporator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Car> list = new ArrayList<>();
        list.add(new Car(1954,"Volga"));
        list.add(new Car(1992,"Volkswagen"));
        list.add(new Car(1997,"Lada"));
        list.add(new Car(2010,"BMW"));
        list.add(new Car(2015,"Acura"));
        list.add(new Car(2020,"Reno"));

        Collections.sort(list,new SortByYear());
        Collections.sort(list,new SortByModel());

        for(Car car: list){
            System.out.println(car.getModel()+ " | " +car.getYear());
        }
    }


}
