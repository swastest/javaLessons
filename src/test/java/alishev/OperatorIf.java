package alishev;

import org.junit.jupiter.api.Test;

public class OperatorIf {
    @Test
    void test01(){
        if(5<4){ // В круглых скобках задается условие выполнения, если там true - тогда выполняется тело в фигурных скобках
            System.out.println("да, верно");
        } else { // если же вернулось false тогда выполняется действие в фигурных скобках после else
            System.out.println("нет");
        }
    }

    @Test
    void test02(){
        int myInt = 15;
        if (myInt<10){
            System.out.println("yES");
        } else if(myInt>20){
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
    @Test
    void test03(){
        int myInt = 5;
        if (myInt<10){  // в этом случае выполнится только первое условие
            System.out.println("yES 01");
        } else if(myInt<20){
            System.out.println("yes 02");
        } else {
            System.out.println("no");
        }
    }

    @Test
    void test04(){
        String testText = "НоСОрОго";
        for(int i =0; i<testText.length(); i++){
            char letter = testText.charAt(i);
            if(letter =='о'|| letter == 'О'){
                System.out.println(letter);
            }
        }
        int b = testText.length();
        System.out.println(b);
    }
}
