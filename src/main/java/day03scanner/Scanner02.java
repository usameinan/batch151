package day03scanner;

import java.util.Scanner;

public class Scanner02 {

    //kullanicidan ilk ismini ve soy ismin alıp ikisini ayni satırda ekrana yazdırınız

    public static void main(String[] args) {

        //1. adim scanner classdan object olustur
        Scanner input = new Scanner(System.in);

        //2. adim kullaniciya ne istedihimize dair mesaj veriniz
        System.out.println("Ilk isminizi giriniz...");
        String firstName = input.next();
        System.out.println("Soy isminizi giriniz...");
        String lastName = input.next();

        System.out.println(firstName + " " + lastName);


    }
}
