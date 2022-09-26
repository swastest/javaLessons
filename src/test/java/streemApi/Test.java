package streemApi;


public class Test {

    public static void main(String[] args) {
        System.out.println(	test("Hello World", '\u0000'));
        System.out.println(count("папа","п"));
        System.out.println(count("Hello World", "l"));

    }

    public static int test(String a, char b){
        String h= String.valueOf(b);

        int g =0;
        if(b== '\u0000'){
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


        public static int count(String str, String target) {
            return (str.length() - str.replace(target, "").length()) / target.length();
        }

}
