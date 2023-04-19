package day14loops;

import java.util.Scanner;

public class Loops02 {
    public static void main(String[] args) {
        //3ten 8e kadar tum tam sayilari consolea yazdiran kodu yaziniz.

        //1.way:
        for (int i = 3;i<9;i++){
            System.out.print(i+" ");
        }

        //2. way:
        int i = 3;
        while (i<9){
            System.out.print(i+" ");
            i++;}

        //21 den 180 e kadar hem 4 hem de 6 ile bolunebilen tamsayilari console'a yazdiran kodu yaziniz

        //1. way:
        for(int k=21; k<181; k++){
            if(k%4==0 && k%6==0){
                System.out.print(k + " ");
            }
        }
        System.out.println();

        //2. way:
        int k = 21;
        while (k<181){
            if (k%4==0 && k%6==0){
            }
            k++;
        }

        //Size verilen kucuk harfle yazilmis String'in index'i cift sayi olan character'lerini buyuk harfe donusturunuz
        // miami ==> MiAmI

        String s = "miami";
        int m=0;
        while (m<s.length()){
            String ch = s.substring(m,m+1);
            if (m%2==0){
                System.out.print(ch.toUpperCase());
            }else{
                System.out.print(ch);
            }
            m++;
        }
        System.out.println();

        //verilen tam sayinin rakamlari toplamini consolea yazdiran kodu yaziniz.

        int r = 578;
        r = Math.abs(r);
        int sum = 0;

        while (r>0){
            sum = sum + r%10;

            r=r/10;
        }
        System.out.println(sum);

        //kullanicidan aldiginiz sayi icin carpim tablosu olusturan kodu yaziniz.
        //3*1 3*2 3*3 3*4 3*5....

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number..");
        int n = input.nextInt();

        int u = 1;

        while (u<11){
            System.out.println(n+"x"+u+"="+(n*u));

            u++;
        }

        //kullanicidan aldiginiz Stringdeki sessiz harfleri consolea yazdiran kodu yaziniz
        //Alabama==> lbm

        System.out.println("Please enter a word...");
        String y = input.next();
        int z = 0;
        while (z<y.length()){
            char ch=y.charAt(z);
            boolean x = ch=='a'||ch=='e'||ch=='i'||ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U';
            if (!x){
                System.out.print(ch);
            }
            z++;
        }







    }//main
}//class
