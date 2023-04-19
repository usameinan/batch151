package day05typecastingasciivaluestringmanipulations;

public class C01_MatematikselIslemler {
    /*
    -Javada farklı data typelari arasinda islem yapiliyorsa sonuc buyuk olan data typeinin turunde olur
    -karsilastirma operatorlerinde sonuc hep boolean doner
    <kucuktur
    >buyuktur
    == esittir
    != esit degildir
    <= kucuk esittir
    >= buyuk esittir
    && and ve operatoru
    || or veya operatoru
     */
    public static void main(String[] args) {
        System.out.println(6*16/8);

        double sonuc = 4*(2+5)/3;
        System.out.println("sonuc = " + sonuc);

        double sonuc2 = 4.0*(2+5)/3;
        System.out.println("sonuc2 = " + sonuc2);

        System.out.println(4*(1+5)/3);

        int sayi1 =5;
        int sayi2 =2;
        double sayi3 =2;

        System.out.println(sayi1/sayi2);
        System.out.println(sayi1/sayi3);
        System.out.println(sayi1+sayi3/sayi2);
        boolean first =2<4;
        boolean second =2+6 !=8;
        boolean third =2+3*5<20;

        System.out.println("first = " + first);
        System.out.println("second = " + second);
        System.out.println("third = " + third);

        System.out.println(first && second);
        System.out.println(first || second || third);



    }


}
