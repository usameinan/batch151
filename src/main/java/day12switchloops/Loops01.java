package day12switchloops;

public class Loops01 {
    public static void main(String[] args) {

        //ex1: ekrana 5 kere "Hi" yazdiriniz.

        //ayni adimlar tekrar tekrar yapilması gerektiginde loops kullanilir.
        //4 adet loop var 1. for-loop 2. while-loop 3. do-while loop 4. for-each loop

        //1. for-loop
        /*
        for (baslangic deger ; calisma sarti ; artirma/eksiltme){
            //calisma kodlar
        }
         */
        for (int i = 1; i<6 ; i++){
            System.out.println("Hi.");
        }

        //ex2: 11den 14e kadar tum sayilari ekrana yazdirin

        for (int i = 11; i<15; i++){
            System.out.println(i);
        }

        //ex3: 40dan 23e kadar tum cift sayilari ekrana yazdiriniz
        for (int i = 40 ; i>22 ; i--){
            if (i%2==0){
                System.out.println(i);
            }
        }

        //ex4: 18den 56ya kadar tum tek sayilari yazdirin
        for(int i = 18; i<57 ; i++) {
            if (i%2!=0){
                System.out.print(i+" ");
            }
        }


    }//main
}//class
