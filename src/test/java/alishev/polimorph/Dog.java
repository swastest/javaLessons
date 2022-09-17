package alishev.polimorph;

public class Dog extends Animal {
    @Override
    public void eat(){
        System.out.println("Dog is eateng");
    }

    public void bark(){
        System.out.println("Dog is barking");
    }
}
