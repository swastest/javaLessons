package alishev;

import org.junit.jupiter.api.Test;

import java.util.Locale;

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

    Integer test022(String str, char ch){
        int count = 0;
        str = str.toLowerCase(Locale.ROOT);
        ch = Character.toLowerCase(ch);
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i) == ch){
                count = count+1;
            }
        }
        return count;
    }

    Integer test023(String str, char ch){
        int count = 0;
        str = str.toLowerCase(Locale.ROOT);
        ch = Character.toLowerCase(ch);
        int i = 0;
        while (i<str.length()){
            if(str.charAt(i) == ch){
                count = count+1;
            }
            i++;
        }
        return count;
    }

    Integer test024(String str, char ch){
        int i = 0;
        int count = 0;
        while (i < str.length()) {
            char currentChar = Character.toLowerCase(str.charAt(i));
            if (currentChar == Character.toLowerCase(ch)) {
                count = count + 1;
            }
            i = i + 1;
        }

        return count;
    }

    void test002(String txt){
        int i = 0;
        while (i < txt.length()){
            System.out.println(txt.charAt(i));
            i++;
        }
    }

    private String test003(int start, int finish){
        int i = start;
        String a = "";
        while (i<=finish){
            a = a+i;
            i++;
        }
        return a;
    }

    public static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }

        int divider = 2;

        while (divider <= number / 2) {
            if (number % divider == 0) {
                return false;
            }

            divider += 1;
        }

        return true;
    }

    String test001(String str){
        String result = "";
        for (int i = 0; i < str.length(); i += 2) {
            String nextSymbol = (i + 2 > str.length()) ? "" : str.substring(i + 1, i + 2);
            result = result + nextSymbol + str.charAt(i);
        }

        return result;
    }

    @Test
    void test03(){
        test002("носОрогО");
        System.out.println(isPrime(10));
        System.out.println(test024("НоСоРоГО", 'О'));
    }
}
