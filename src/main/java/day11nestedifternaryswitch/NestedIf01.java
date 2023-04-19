package day11nestedifternaryswitch;

import java.util.Scanner;

public class NestedIf01 {

    /*
    kullanicidan 0dan kucuk 120den buyuk deger giremeyecek sekilde datalari aldıktan sonra
    eger calisan kadinsa 60 yasindan buyukse "Emekli Olabilir" yazdirin
    eger calisan erkek ise 65 yasindan buyukse "Emekli Olabilir" yazdiran kodu olusturunuz.
     */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your age...");
        int age = input.nextInt();

        System.out.println("Please enter your gender...");
        String gender = input.next();

        if (age<0 || age>120){
            System.out.println("Negative ages or ages greater than 120 are invalid");
        }else if (gender.equalsIgnoreCase("male")){
            if (age>65){
                System.out.println("Can be retired");
            }else{
                System.out.println("Should work");
            }

        }else if (gender.equalsIgnoreCase("female")){
            if (age>60){
                System.out.println("Can be retired");
            }else{
                System.out.println("Should work");
            }

        }else {
            System.out.println("Undefined gender");
        }



    }//main
}//class
