package my;

public class HexletLesson19 {
    public static int sum(int x, int y){
        return x + y;
    }

    public static int sum(int x){
        return sum(x,10);
    }

    public static void main(String[] args) {
        System.out.println(sum(10));
        System.out.println(sum(10,20));
    }
}
