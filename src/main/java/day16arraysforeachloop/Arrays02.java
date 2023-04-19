package day16arraysforeachloop;

import java.util.Scanner;

public class Arrays02 {
    public static void main(String[] args) {
        //+-*/% islemlerini yapabilen bir hesap makinası yapiniz
        //kullanici q ya basmadigi surece islem yapabilsin
        /*
        1. kullanicidan data almak icin scanner olustur
        2. yapacagi islemi al
        3. iki tane sayi al
        4. tekrar tekrar islem yapabilmek icin loop kullanmaliyim
         */
        Scanner input = new Scanner(System.in);

        char opr = ' ';

        do{
            System.out.println("Please enter the operation among +, -, *, /, %");
            opr = input.next().toLowerCase().charAt(0);

            if(opr=='q'){
                System.out.println("See you again");
                break;
            }
            boolean r = opr=='+' || opr=='-' || opr=='*' || opr=='/' || opr=='%';

            if(!r){
                System.out.println("Undefined operation");
                break;
            }

            System.out.println("Enter the first number");
            int n1 = input.nextInt();

            System.out.println("Enter the second number");
            int n2 = input.nextInt();

            switch(opr){
                case '+':
                    System.out.println(n1 + "+" + n2 + "=" + (n1+n2));
                    break;
                case '-':
                    System.out.println(n1 + "-" + n2 + "=" + (n1-n2));
                    break;
                case '*':
                    System.out.println(n1 + "x" + n2 + "=" + (n1*n2));
                    break;
                case '/':
                    System.out.println(n1 + ":" + n2 + "=" + (n1/n2));
                    break;
                case '%':
                    System.out.println(n1 + "%" + n2 + "=" + (n1*n2)/100);
                    break;
                default:
                    System.out.println("Undefined operation");
            }

        }while(true);






    }//main
}//class
