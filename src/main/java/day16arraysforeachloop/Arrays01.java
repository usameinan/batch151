package day16arraysforeachloop;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays01 {
    public static void main(String[] args) {

        //kullanicinin coklu datayı bir arraye yerlestirebilmesi icin gereken kodu yazin
        /*
        1. kullanicidan data almak icin scanner object olusturmaliyiz.
        2. coklu datayı yerlestirmek icin bir array olusturmaliyim
        3. array olsuturabilmek icin kullanicidan arraye kac eleman koyacagini almaliyim
        4. loop olusturup eleman ekleme islemini tekrar yapabilmeliyim
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the number of elements you want to add.");
        int numOfElements = input.nextInt();
        String studentNames[] = new String[numOfElements];
        System.out.println("To stop adding press 'q'");
        for (int i=0; i<studentNames.length;i++){
            System.out.println("Enter the "+(i+1)+". student name");
            String name = input.next();
            if (name.equalsIgnoreCase("q")){
                break;
            }else {
                studentNames[i]=name;
            }

        }
        System.out.println(Arrays.toString(studentNames));






    }//main
}//class
