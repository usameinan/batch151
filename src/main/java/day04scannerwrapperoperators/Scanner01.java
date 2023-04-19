package day04scannerwrapperoperators;

import java.util.Scanner;

public class Scanner01 {

    public static void main(String[] args) {
        //kullanicidan alacaginiz 5 basamakli bir sayinin ilk iki ve son iki basamagindaki
        //rakamların toplamini yazdiran kodu yaziniz

        Scanner input = new Scanner(System.in);

        System.out.println("Lutfen 5 basamakli bir sayi giriniz...");

        int number = input.nextInt();

        //son rakami al
        int lastDigit = number%10;
        //sayiyi kucult
        number = number/10;
        //sondan ikinci rakami al
        int lastSecondDigit = number%10;
        //sayiyi kucult
        number = number/10;
        //sondan ucuncu rakami al
        int lastThirdDigit = number%10;
        //sayiyi kucult
        number = number/10;
        //sondan dorduncu rakami al
        int lastFourthDigit = number%10;
        //sayiyi kucult
        number = number/10;
        //sondan besinci rakami al
        int lastFifthDigit = number%10;
        //sayiyi kucult
        number = number/10;

        System.out.println(lastDigit + lastSecondDigit + lastThirdDigit + lastFourthDigit + lastFifthDigit);



    }
}
