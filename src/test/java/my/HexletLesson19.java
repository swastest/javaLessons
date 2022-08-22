package my;

import org.junit.platform.commons.util.StringUtils;

import java.nio.charset.Charset;

public class HexletLesson19 {
    public static int sum(int x, int y){
        return x + y;
    }

    public static int sum(int x){
        return sum(x,10);
    }

    public static boolean isPalindrome(String value){
    return value.equalsIgnoreCase(new StringBuilder(value).reverse().toString());
    }

    public static boolean isLeapYear(int year){
        return year % 400 ==0 || (year % 4 ==0 && year %100 != 0 );
    }

    //Неправильный метод, так как вылетает ошибка, если подставляем пустую строку
    public static String convertString1(String value){
        char a = value.charAt(0);
        if (Character.isLowerCase(a)){
            String s = new StringBuilder(value).reverse().toString();
            return s;
        }
        else if(Character.isUpperCase(a)){
            return value;
        }
       return null;
    }

    // Правильный метод с тернарным оператором
    public static String convertString(String str) {
        if (str.equals("")) {
            return "";
        }

        return Character.isUpperCase(str.charAt(0)) ? str : new StringBuilder(str).reverse().toString();
    }

    public static String getNumberExplanation(int value){
        switch (value){
            case 666 :
              return  "devil number";
            case 42 :
                return "answer for everything";
            case 7 :
                return "prime number";
            default:
                return null;
        }
    }

//    public static String card(String cardValue){
//           String a = cardValue.substring(cardValue.length()-4);
//        String b = "*";
//        String t = b.repeat(cardValue.length() - 4);
//        return null;
//    }
//
//    public static String getHiddenCard(String cardNumber, int starsCount) {
//        var visibleDigitsLine = cardNumber.substring(12);
//        return "*".repeat(starsCount) + visibleDigitsLine;
//    }
//
//    public static String getHiddenCard(String cardNumber) {
//        return App.getHiddenCard(cardNumber, 4);
//    }

    public static void main(String[] args) {
        System.out.println(sum(10));
        System.out.println(sum(10,20));
        System.out.println();
        System.out.println(isPalindrome("ШаЛаш"));
        System.out.println("===="+isLeapYear(2016));
        System.out.println(convertString("привеТ"));
    }
}
