package alishev;

import org.junit.jupiter.api.Test;

public class While {
    @Test
    void test00(){
        int value = 0;
        while(value<5){ //условие цикла, когда переменная value станет равна 5 = цикл прекратится
            System.out.println("Hello " + value);
            value++; // прибавляем +1 после каждого цикла
        }
    }
}
