package alishev.polimorph;

public class Test {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Dog dog = new Dog();
        Cat cat = new Cat();
        test(animal);
        test(cat);
        test(dog);
    }


    public static void test(Animal animal){
        animal.eat();
    }

}
