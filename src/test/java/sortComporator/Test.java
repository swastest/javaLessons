package sortComporator;

import io.restassured.http.ContentType;
import org.junit.jupiter.api.DisplayName;

import java.util.*;

import static io.restassured.RestAssured.given;

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
        for(Car car: list){
            System.out.println(car.getModel()+ " | " +car.getYear());
        }
        System.out.println("===========");

        Collections.sort(list,new SortByModel());
        for(Car car: list){
            System.out.println(car.getModel()+ " | " +car.getYear());
        }


        ////
        Car car1 = new Car(100,"Фмодель");
        Car car2 = new Car(50,"Бмодель");
        Car car3 = new Car(67,"Жмодель");
        Car car4 = new Car(3,"Амодель");

        //Можно засунуть объекты классов в массив тоже
        Car[] carArray = {car1, car2, car4, car3};
        System.out.println(carArray);
        // потом переключиться
        List<Car> carList1 = new ArrayList<>(Arrays.asList(carArray));
        System.out.println(carList1);
        }

    }

