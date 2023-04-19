package day03scanner;

//javanın util kutuphanesinden scanner class inport edildi demek
import java.util.Scanner;

public class Scanner01 {

    public static void main(String[] args) {

        //1. adim scanner classdan bir obje olustur.
        Scanner input = new Scanner(System.in);

        //2. adim kullaniciya ne istediginize dair mesaj veriniz
        System.out.println("Lutfen yasinizi giriniz...");

        //3. adim uygun methodu kullanarak kullanicinin verdigi datayi memoryye yerlesitiriniz
        byte age = input.nextByte();
        System.out.println(age);

    }
}
