package my;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class Lesson {
    List<String> str = new ArrayList<>();

    void addedStr() {
        str.add("Tanya");
        str.add("Danya");
        str.add("Vlad");
        str.add("Ivan");
        str.add("Mariia");
    }

    @Test
    void test() {
        addedStr();
        String s = "Vlad";

        switch (s){
            case"Vlad":
                System.out.println("Привет влад");
                break;
            case "Tanya":
                System.out.println("Привет Таня");
                break;
            default:
                System.out.println("Покаааа!");

        }

    }
}
