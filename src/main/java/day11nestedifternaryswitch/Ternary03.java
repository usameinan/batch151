package day11nestedifternaryswitch;

import java.util.Scanner;

public class Ternary03 {
    /*
    verilen yilin "Artik yil" (Leap Year) olup olmadigini kontrol eden kodu yaziniz.
    1) yil 100e bolunurse 400e de bolunmelidir. 1600==> Leap 1800==> Leap degil
    2) yil 100e bolunmuyorsa 4e bolunmelidir. 2004==> Leap 2005==> Leap degil
     */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a year...");
        int year = input.nextInt();

        //1. way: Nested ternary
        String result = year%100==0 ? (year%400==0 ? "Leap" : "Not Leap") : (year%4==0 ? "Leap" : "Not Leap");
        System.out.println(result);

        //2. way:
        if (year%100==0) {
            if (year % 400 == 0) {
                System.out.println("Leap");
            } else {
                System.out.println("Not Leap");
            }
        }else{
            if (year%4==0){
                System.out.println("Leap");
            }else{
                System.out.println("Not Leap");
            }
        }


    }//main
}//class
