package day34exceptions;

public class E01 {
    /*
        1) "Exception" beklenmedik problem demektir.
        2) "Exception"lari halledebilmek icin iki temek yol vardir;
           i)  "Exception"a uygun cozumler uretebilirsiniz.
           ii) "Exception" olustugunda bunu ilan eder ve geri cekilirsiniz. Buna da "Throw Exception" denir.
     */
    public static void main(String[] args) {

        System.out.println(divide1(12,3));

        System.out.println(divide2(6,0));

    }

    //1. way: Exceptioni handle etmede ilk yol.
    public static int divide1(int a, int b){
        if (b==0){
            return 0;
        }else{
            return a/b;
        }
    }

    //2. way: Exception'i handle etmede harika yol
    public static int divide2(int a, int b){
        int result = 0;
        try {
            result = a/b;
        }catch (ArithmeticException e){
            System.out.println("Do not divide any number by zero");
        }
        return result;
    }

}
