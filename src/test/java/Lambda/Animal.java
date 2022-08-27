package Lambda;

public class Animal {
    private String animalName;
    private boolean swim;
    private boolean hopper;

    public Animal(String animalName, boolean swim, boolean hopper) {
        this.animalName = animalName;
        this.swim = swim;
        this.hopper = hopper;
    }

    public boolean canSwim(){
        return swim;
    }

    public boolean canHopper(){
        return hopper;
    }

    @Override
    public String toString() {
        return animalName;
    }
}
