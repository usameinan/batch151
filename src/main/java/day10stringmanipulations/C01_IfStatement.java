package day10stringmanipulations;

import java.util.Scanner;

public class C01_IfStatement {
    public static void main(String[] args) {

        //ex: verilen bir karakterin buyuk harf ise ekrana "Buyuk Harf" yazdıran kodu yaziniz.

        char ch = 'A';
        if (ch>='A' && ch<='Z'){
            System.out.println("Buyuk Harf");
        }

        char ch1 = '*';
        if (ch1>='A' && ch1<='Z'){
            System.out.println("Buyuk Harf");
        }

        char ch2 = 'h';
        if (ch2>='A' && ch2<='Z'){
            System.out.println("Buyuk Harf");
        }

        //ex: verilen bir sayi cift sayi ise ekrana "Cift Sayi" yazdiran kodu yaziniz.

        byte sayi = 24;
        if (sayi %2 == 0){
            System.out.println("Cift Sayi");
        }

        //ex: verilen bir sayi 300den kucuk veya 1200den buyuk ise "Harika Sayi" yazdiran kodu yaziniz

        int number = 506;
        if (number<300 || number>1200){
            System.out.println("Harika Sayi");
        }

        //ex: kullanicidan alinan datanin tek mi cift mi oldugunu yazdiran kodu yaziniz

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz");
        int num = input.nextInt();
        //1. yol
        if (num%2 ==0){
            System.out.println("Cift Sayi");
        }
        if (num%2 !=0){
            System.out.println("Tek Sayi");
        }
        //2. yol
        if (num%2 ==0){
            System.out.println("Cift Sayi");
        }else {
            System.out.println("Tek Sayi");
        }



        //ex: verilen sayinin negatif pozitif ya da nötr oldugunu soyleyen kodu yaziniz.

        int numara = 0;
        if (numara<0){
            System.out.println("3lu kontrol negatif sayi");
        } else if(numara == 0){
            System.out.println("3lu kontrol notr sayi");
        }else {
            System.out.println("3lu kontrol pozitif sayi");
        }


    }//main
}//class
