package alishev;

import org.junit.jupiter.api.Test;

public class For {
    @Test
    void test01(){
        // условие разбито на 3 части:
        // 1 - задается счетчик, традиционно обозначается переменной i
        // 2 - задается условие, до какого момента будет повторяться цикл
        // 3 - задается логика после выполнения первой итерации
        for(int i = 0; i<=10; i++){
            System.out.println("Hello " + i);
        }
    }
    @Test
    void test02(){
        for(int i = 10; i>=-10; i--){
            System.out.println("Hello " + i);
        }
    }

    @Test
    void test03(){
        String s = "Привет";
        String result = "";
        for(int i = s.length()-1; i>=0; i--){
           result = result+s.charAt(i);
        }
        System.out.println(result);
    }
}
