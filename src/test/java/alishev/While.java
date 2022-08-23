package alishev;

import org.junit.jupiter.api.Test;

public class While {
    @Test
    void test00() {
        int value = 0;
        while (value < 5) { //условие цикла, когда переменная value станет равна 5 = цикл прекратится
            System.out.println("Hello " + value);
            value++; // прибавляем +1 после каждого цикла
        }
    }


    void test01(Integer value) {
        int i = value;
        while (i >= 0) {
            System.out.println(i);
            i--;
        }
        System.out.println("finished!");
    }

    void test02(String txt){
        for(int i=0; i<txt.length(); i++){
            if(txt.charAt(i)=='о'||txt.charAt(i)=='О'){
                System.out.println(txt.charAt(i));
            }
        }
    }

    void test002(String txt){
        int i = 0;
        while (i < txt.length()){
            System.out.println(txt.charAt(i));
            i++;
        }
    }

    @Test
    void test03(){
        test002("носОрогО");
    }
}
