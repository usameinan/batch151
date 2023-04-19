package day09stringmanipulations;

public class C02_IfStatement {
    public static void main(String[] args) {

        //interwiew
        //bir stringteki tekrarsiz karakterleri ekrana yazdiriniz.
        // String y = "abbccdc"

        String y = "aac";
        char ch = y.charAt(0);
        if(y.indexOf(ch) == y.lastIndexOf(ch)){
            System.out.println(ch);
        }//if  body iki curly braces arasi
        char ch1 = y.charAt(1);
        if (y.indexOf(ch1) == y.lastIndexOf(ch1)){
            System.out.println(ch1);
        }//if body

        char ch2 = y.charAt(2);
        if (y.indexOf(ch2)== y.lastIndexOf(ch2)) {
            System.out.println(ch2);
        }

        //ex: verilen sayi pozitif ise ekrana "Sayi Pozitif" yazdiran kodu yaziniz.

        int num = -65;
        if (num>0){
            System.out.println("Sayi Pozitif");
        }

        //ex: sayi -1 ile 10 arasında ise ekrana verilen data rakamdır yazdıran kodu yaziniz.
        int rakam = 33;
        if (rakam>-1 && rakam<10){
            System.out.println("Verilen Data Rakamdir");
        }

        //ex: sayi uc basamakli ise verilen data 3 basamaklidir yazdiran kodu yaziniz.
        int sayi = 0;
        sayi =Math.abs(sayi);
        if (sayi>99 && sayi<1000){
            System.out.println("Data 3 Basamaklidir");
        }

    }//main
}//class
