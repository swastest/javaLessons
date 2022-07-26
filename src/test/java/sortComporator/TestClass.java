package sortComporator;


import org.apache.commons.lang3.builder.EqualsBuilder;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.*;


public class TestClass {
    public static void main(String[] args) {

        List<Car> list = new ArrayList<>();
        list.add(new Car(1954, "Volga"));
        list.add(new Car(1992, "Volkswagen"));
        list.add(new Car(1997, "Lada"));
        list.add(new Car(2010, "BMW"));
        list.add(new Car(2015, "Acura"));
        list.add(new Car(2020, "Reno"));
        list.add(new Car(2020, "Reno"));

        Collections.sort(list, new SortByYear());
        for (Car car : list) {
            System.out.println(car.getModel() + " | " + car.getYear());
        }
        System.out.println("===========");

        Collections.sort(list, new SortByModel());
        for (Car car : list) {
            System.out.println(car.getModel() + " | " + car.getYear());
        }

        Object[] arr = list.toArray();

        ////
        Car car1 = new Car(100, "Фмодель");
        Car car2 = new Car(50, "Бмодель");
        Car car3 = new Car(67, "Жмодель");
        Car car4 = new Car(3, "Амодель");
        Car car5 = new Car(100, "Фмодель");

        ///Ниже сравнение классов
        Assertions.assertTrue(EqualsBuilder.reflectionEquals(car1,car5));

        //Можно засунуть объекты классов в массив тоже
        Car[] carArray = {car1, car2, car4, car3};
        System.out.println(carArray);
        // потом переключиться
        List<Car> carList1 = new ArrayList<>(Arrays.asList(carArray));
        System.out.println(carList1);


    }


    @Test
    void test91() {
        Map<String, Object> map = new HashMap<>();
        map.put("name", "Alex");
        map.put("surname", "Yegorov");
        map.put("age", 24);

        Map<String, Object> map1 = new HashMap<>();
        map1.put("name", "Alex");
        map1.put("surname", "Yegorov");
        map1.put("age", 24);

        Assertions.assertEquals(map1,map);
        Assertions.assertTrue(map.equals(map1));
        //Ниже сравнение через Билдер - позволяет сравнивать классы возвращает булево
        Assertions.assertTrue(EqualsBuilder.reflectionEquals(map1,map));

    }

}

