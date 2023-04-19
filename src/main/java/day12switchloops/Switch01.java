package day12switchloops;

import java.util.Scanner;

public class Switch01 {
    public static void main(String[] args) {
        //ex1: ay numarasini soyleyince numarasi verilen aydan baslayip 12. aya kadartum aylarin isimlerini
        //yazdiran kodu yazdiriniz

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen baslangic ayini kacinci ay oldugunu giriniz...");
        int numOfMonths = input.nextInt();
        switch (numOfMonths){
            case 1 :
                System.out.println("January");
            case 2 :
                System.out.println("February");
            case 3 :
                System.out.println("March");
            case 4 :
                System.out.println("April");
            case 5 :
                System.out.println("May");
            case 6 :
                System.out.println("June");
            case 7 :
                System.out.println("July");
            case 8 :
                System.out.println("August");
            case 9 :
                System.out.println("September");
            case 10 :
                System.out.println("October");
            case 11 :
                System.out.println("November");
            case 12 :
                System.out.println("December");
                break;
            default:
                System.out.println("gecerli ay numarası veriniz");
        }
        //note: "switch" condition parantezi icerisinde 1.string 2. int 3. byte 4. short 5. char kullanilabilir.
        //note: switch condition parantezi icerisinde 1.long 2. boolean 3. float 4.double kullanılmaz.



    }//main
}//class
