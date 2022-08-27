package streemApi;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Animal> listAnimals = new ArrayList<>();
        listAnimals.add(new Animal("Слон", 34, Classification.HERBIVORE));
        listAnimals.add(new Animal("Лев", 10, Classification.PREDATOR));
        listAnimals.add(new Animal("Гибон", 67, Classification.OMNIVOROUS));


        //старый подход через цикл
        List<Animal> predator = new ArrayList<>();
        for (Animal a : listAnimals) {
            if (a.getClassification().equals(Classification.PREDATOR)) {
                predator.add(a);
            }
        }
        // predator.forEach(System.out::println);


        //новый подход
        /*
        Filter
        Sort
        All match
        Any match
        None match
        Max
        Min
        Group
         */

        //Filter
        List<Animal> herbi = listAnimals.stream()
                .filter(animal -> animal.getClassification().equals(Classification.HERBIVORE))
                .collect(Collectors.toList());
        //herbi.forEach(System.out::println);


        //Sort
        System.out.println();
        List<Animal> sortAge = listAnimals.stream().sorted(Comparator.comparing(Animal::getAge))
                .collect(Collectors.toList());
        sortAge.forEach(System.out::println);

        System.out.println();

        List<Animal> sortAgeRevers = listAnimals.stream()
                .sorted(Comparator.comparing(Animal::getAge).reversed())
                .collect(Collectors.toList());

        sortAgeRevers.forEach(System.out::println);

        sortAgeRevers = listAnimals.stream()
                .sorted(Comparator.comparing(Animal::getAge)
                        //можно добавить еще одно условие для сортировки
                        .thenComparing(Animal::getClassification).reversed())
                .collect(Collectors.toList());

        //All match - это вопрос, кот возвращает булево. Все сущности удовлет-ют условию
        boolean allMatch = listAnimals.stream().allMatch(animal -> animal.getAge() > 9);

        //Any match - вопрос возвращает булево. Среди сущностей хотя бы 1 раз встречается заданное значение
        boolean anyMatch = listAnimals.stream().anyMatch(x -> x.getAge() == 15);

        //None match - вопрос возвращает булево. Среди сущностей нет заданного условия
        boolean noneMatch = listAnimals.stream().noneMatch(x -> x.getName().equals("Миша"));
        System.out.println(noneMatch);

        //Max Min - возвращают самое максимальное или самое минимальное значение - возвращают optional
        listAnimals.stream().max(Comparator.comparing(Animal::getAge)).ifPresent(System.out::println);
        listAnimals.stream().min(Comparator.comparing(Animal::getAge)).ifPresent(System.out::println);
        //Group - группировка через мапу, ключ значение
        Map<Classification, List<Animal>> collect1 =
                listAnimals.stream().collect(Collectors.groupingBy(Animal::getClassification));
        //вывод мапы на экран
        collect1.forEach((((classification, animals) -> {
            System.out.println(classification);
            animals.forEach(System.out::println);
        })));

        // чейнинг
        Optional<String> str =
                listAnimals.stream().filter(a -> a.getClassification().equals(Classification.PREDATOR))
                        .max(Comparator.comparing(Animal::getAge))
                        .map(Animal::getName);
        str.ifPresent(System.out::println);
    }


}
