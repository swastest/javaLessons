package whiteRabbit.enums;

public class Main {
    public static void main(String[] args) {
        Music ms = Music.ROCK;
        System.out.println(ms.getS());
        System.out.println("=======");

        for(Music element: Music.values()){
            System.out.println(element.getS());
        }
        System.out.println("========");

        Music ms2 = Music.valueOf(Music.class,"ROCK");
        System.out.println(ms2);
        System.out.println("==========");

    }
}
