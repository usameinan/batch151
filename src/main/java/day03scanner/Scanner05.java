package day03scanner;

import java.util.Scanner;

public class Scanner05 {

    public static void main(String[] args) {
        //kullanicidan bir dikdortgenin iki kenar uzunlugunu alınız
        //1 alanını hesaplayınız
        //2 cevresini hesaplayınız

        Scanner input  = new Scanner(System.in);
        System.out.println("Lutfen dikdortgenin kisa kenar uzunlugunu giriniz...");
        double shortSide = input.nextDouble();
        System.out.println("Lutden dikdortgenin uzun kenar uzunlugunu giriniz...");
        double longSide = input.nextDouble();

        System.out.println("Alan = " + (shortSide*longSide));
        System.out.println("Cevre = " + (2*shortSide+2*longSide));

        double alan = shortSide*longSide;


    }
}
