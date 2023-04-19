package day14loops;

import java.util.Scanner;

public class Loops03 {
    public static void main(String[] args) {
        int i = 1;
        while (i<1){//while loopda loop bodysinin hic calismaması mumkundur.(zero execution is possible)
            System.out.println("While loop");
            i++;
        }

        //do-while loop
        int k=1;
        do{
            System.out.println("do-while loop");
            k++;
        }while (k<1);

        //kullanicini girdigi sayi 100den kucuk ise kullanici "Kazandiniz" mesajı alsın
        //diger durumlarda "Kaybettiniz" mesajı alsın

        Scanner input = new Scanner(System.in);

        do{//loop bodysi en az bir kere calisir
            System.out.println("Please enter an integer...");
            int n = input.nextInt();
            if (n<100){
                System.out.println("won!");
            }else{
                System.out.println("lost!");
                break;
            }
        }while (true);

        //kullanicidan alinan bir cumlenin buyuk hafle baslayıp nokta ile bittigini kontrol eden kodu yaziniz.

        do{
            System.out.println("Please enter a sentence.");
            String s = input.nextLine();
            if (s.endsWith(".") && (s.charAt(0)>='A' && s.charAt(0)<='Z')){
                System.out.println("Your sentence is correct grammatically");
            }else {
                System.out.println("Your sentence has grammatically mistake");
                break;
            }
        }while (true);





    }//main
}//class
