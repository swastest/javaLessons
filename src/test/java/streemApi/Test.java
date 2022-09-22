package streemApi;


public class Test {

    public static void main(String[] args) {
        System.out.println(	test("Hello World", 'd'));

    }

    public static int test(String a, char b){
        String h= String.valueOf(b);

        int g =0;
        if(h== ""){
            System.out.println("Введите знач-е");
        }
        else if (h!=""){
            for(int i =0; i<a.length(); i++){
                if(a.charAt(i)==b){
                    g += 1;
                }
            }
        }
        return g;
    }
}
