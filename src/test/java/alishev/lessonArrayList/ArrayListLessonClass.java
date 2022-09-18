package alishev.lessonArrayList;

import java.util.*;

public class ArrayListLessonClass {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        for (int i =0; i<10; i++){
            list1.add(i);
        }
        list1.remove(5);
        System.out.println(list1.get(0)+ " "+ list1.get(4));
        System.out.println(list1);

        Collection collection = new ArrayList();
        collection.add(1);
        collection.add(2);
        collection.add(3);
        collection.remove(2);
        Iterator iterator = collection.iterator();
        for(Object i : collection){
            System.out.println("========"+i);
        }

        Map map = new HashMap<>();
        map.put("имя", "петрушка");
        map.put("fam", "Petya");
        map.put("tel", 1232445);
        System.out.println(map.size());

    }
}
