package Lambda;

import java.util.ArrayList;
import java.util.List;

public class TestLambdaClass {

    public static void main(String[] args) {
        Animal a1 = new Animal("Крокодил", true, false);
        Animal a2 = new Animal("Зайчик", false, true);
        Animal a3 = new Animal("Рыбка", true, false);
        Animal a4 = new Animal("Кенгуру", false, true);

        List<Animal> listAnimal = new ArrayList<Animal>();
        listAnimal.add(a1);
        listAnimal.add(a2);
        listAnimal.add(a3);
        listAnimal.add(a4);

        print(listAnimal,x->x.canSwim());

    }

    private static void print(List<Animal> listAnimal, InterfaseChek cheker){
        for(Animal animal: listAnimal){
            if(cheker.test(animal)){
                System.out.println(animal);
            }
        }
    }


}
