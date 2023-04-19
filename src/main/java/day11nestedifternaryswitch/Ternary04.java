package day11nestedifternaryswitch;

import java.util.Scanner;

public class Ternary04 {
    /*
    kullanicidan aldiginiz sayi cift ise yarisini ekrana yazdiriniz
    tek ise "Bu sayi ikiye bolunmez" yazdiriniz
     */
    /*
    1. ternaryde true ve false icin size verilen data typeları farkli ise olusturdugunuz containerin data typeini
    Object yapin
    2. object javada bir classtir
    object javadaki butun classlarin parentidir. yani babasidir.
    object classin parenti yoktur.
     */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter an integer...");
        int num = input.nextInt();

        Object result = num %2==0 ? num/2 : "Bu sayi ikiye bolunmez";
        System.out.println(result);

    }
}
