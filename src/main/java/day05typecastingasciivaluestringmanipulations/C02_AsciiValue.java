package day05typecastingasciivaluestringmanipulations;

public class C02_AsciiValue {
    public static void main(String[] args) {

        //'A' karakterinin ascii degerini hesaplatan kodu yaziniz
        int asciiA = 'A';
        System.out.println(asciiA);
        
        int asciia = 'a';
        System.out.println("asciia = " + asciia);
        
        int asciiUnlem = '!';
        System.out.println("asciiUnlem = " + asciiUnlem);
        
        int asciiSpace = ' ';
        System.out.println("asciiSpace = " + asciiSpace);
        
        int asciiSymbol = '*';
        System.out.println("asciiSymbol = " + asciiSymbol);

        String isim = "Zeki";
        char ch = 'Z';
        char sembol = '*';
        char isaret = '?';
        char space = ' ';
        char rakam = '9';

        // 149.9999TL *2
        int deger = 20;
        char smbl = '$';

        System.out.println(deger+smbl);

        int deger2=0;
        char smbl2='+';
        System.out.println("deger2+smbl2 = " + (deger2 + smbl2));

        String name = "123";
        int number = 45;
        System.out.println(name+number);

        String str1= "Java";
        char ch3= 'G';
        int sayi1=5;
        System.out.println(str1+(ch3+sayi1));

        char rakam1 = '1';
        System.out.println("rakam1 = " + rakam1);
        char rakam2 = '2';
        System.out.println("rakam2 = " + rakam2);
        char rakam3 = '3';
        System.out.println("rakam3 = " + rakam3);
        char rakam4 = '4';
        System.out.println("rakam4 = " + rakam4);

        System.out.println("rakam1+rakam2+rakam3+rakam4 = "+ rakam1+rakam2+rakam3+rakam4);
        System.out.println("rakam1+rakam2+rakam3+rakam4 = "+ (rakam1+rakam2+rakam3+rakam4));

        int asciiH ='h';
        System.out.println("asciiH = " + asciiH);
        int ascii5 = '5';
        System.out.println("ascii5 = " + ascii5);

        byte b = 5;
        char ch2 = 'h';

        System.out.println("b>ch2 = " + (b>ch2));

        long l=542168784578L;
        System.out.println("ch2>l : "+(ch2>l));
        float f = 2.45648f;
        double d = 2.19658;
        System.out.println("f>d :" + (f>d));

        int sayiInt = 100;
        long sayiLong = 100L;
        System.out.println("sayiInt>=sayiLong :"+(sayiInt>=sayiLong));

        int sayiInt2 = 200;
        System.out.println("sayiInt2>=sayiLong :"+(sayiInt2>=sayiLong));

        int sayiInt3=9;
        char sayiChar='9';
        System.out.println("sayiInt3>=sayiChar: " + (sayiInt3>=sayiChar));


    }//main

}//class
