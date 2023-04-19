package day06typecastingstringmanipulation;

public class C01_StringManipulation {
    public static void main(String[] args) {
        
        String a = "Benim Tek Rakibim Dunku Ben.";

        //harfleri buyut
        String aUpper = a.toUpperCase();
        System.out.println("aUpper = " + aUpper);
        //harfleri kucult
        String aLower = a.toLowerCase();
        System.out.println("aLower = " + aLower);

        System.out.println("ilk karakter = " + a.charAt(0));
        System.out.println("onuncu karakter = " + a.charAt(10));

        //a stringindeki bastan ikinci ve sondan ikinci karakteri alip yanyana yazdiriniz.
        char firstChar =a.charAt(1);
        char lastSecondChar =a.charAt(20);
        System.out.println("firstChar + lastSecondChar: = " + firstChar+" "+lastSecondChar);

        //a stringinde bulunan karakter sayisini bulun
        System.out.println(a.length());

        //a stringindeki ilk 4 datayi aliniz
        System.out.println("ilk 4 karakteri yaziniz: = " + a.substring(0,4));

        //a stringindeki 4. index dahil 7. index haric yazdiriniz.
        System.out.println(a.substring(4,7));

        // a stringindeki  "rakib" kelimesini aliniz.
        System.out.println(a.substring(10,15));

        System.out.println(a.substring(10));

        //a stringinde "bim" kelimesinin olup olmadigini kontrol ediniz.
        boolean varMi = a.contains("bim");
        System.out.println("varMi : = " + varMi);

        //a stringinin t harfiyle basslayıp baslamadigini kontrol ediniz.
        System.out.println(a.startsWith("T"));
        System.out.println(a.startsWith("Tek", 6));

        //universite numaralari yil + bolum kodu + giris sirasi olarak duzenlenen bir okulda
        // ogrenci umranin hukuk fakultesinde okuyup okumadigini gosteren kodu yaziniz
        /*
        sinif ogretmenligi 22 hukuk 33 bilgisayar 44 eczacilik 55 maliye 66 kimya muhendisligi 77
         */

        String str = "20105501";
        System.out.println(str.startsWith("33", 4));



    }//main
}//class
