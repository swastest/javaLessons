package hasMapLessons;

import org.junit.jupiter.api.Assertions;

import java.util.HashMap;
import java.util.Map;

public class HashMapLesson {
    public static void main(String[] args) {
        Map<String,Object> map1 = new HashMap<>();
        Map<String,Object> map2 = new HashMap<>();

        map1.put("Возраст", "31");
        map1.put("Имя", "Таня");

        map2.put("Имя", "Таня");
        map2.put("Возраст", "31");
        Assertions.assertEquals(map1,map2);
        System.out.println(map1.equals(map2));
    }



}
