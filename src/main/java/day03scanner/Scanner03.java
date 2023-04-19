package day03scanner;

import java.util.Scanner;

public class Scanner03 {

    public static void main(String[] args) {

        //kullanicidan adresini alınız ve ekrana yazdırınız
        Scanner input = new Scanner(System.in);

        System.out.println("Lutfen adresinizi giriniz...");
        //next() kullanıcıdan tek kelimeli stringi alır nextLine methodu kullanıcıdan coklu strini alır
        String address = input.nextLine();
        System.out.println(address);


    }
}
