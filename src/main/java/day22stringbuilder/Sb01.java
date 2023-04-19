package day22stringbuilder;

public class Sb01 {

    /*
    1) "StringBuilder" string ureten bir classdir.
    2) String Class kullanarak string uretiriz. Java nicin "StringBuilder" classi da olusturdu?
       "String" Class "immutable"(degistirilemez) string uretir. "StringBuilder" class "mutable"(degistirilebilir) String uretir.
    3) "immutable" olmak demek orjinal degerin korunmasi, degistirilemez olmasi demektir.
       "mutable" olmak demek orjinal degerin degistirilebilir olmasi demektir.
    4) "capacity" javanin size verdigi data depolama yer sayisidir.
       Length ise size verilen data depolama yerinin kullanilan kismidir.
    5) java baslangic olarak size capacityi size 16 olarak verir.
       siz verilen capacityi asarsaniz java yeni capacityi var olanin 2 katinin 2 fazlasi olacak sekilde degistirir.
     */
    public static void main(String[] args) {

        String s = "Java";
        s = s + "!";

        String u = "Apex";
        String v = "Apex";
        String y = "C++";

        //StringBuilder nasil olusturulur?
        //1. way:
        StringBuilder t = new StringBuilder("Python");
        System.out.println(t);
        //StringBuilderlar nasil ekleme yapilabilir?
        t.append("...").append("!");
        System.out.println(t);

        //2. way:
        StringBuilder r = new StringBuilder();
        System.out.println(r);

        r.append('c');
        System.out.println(r);

        //"capacity" ve "lenght" arasindaki fark nedir?
        StringBuilder sb1 = new StringBuilder("Money");
        int capacity = sb1.capacity();
        System.out.println(capacity);
        int length = sb1.length();
        System.out.println(length);

        sb1.append("!").append(".................");

        int c = sb1.capacity();
        System.out.println(c);

        int ln = sb1.length();
        System.out.println(ln);

        //Default capacityi degistirebilir miyiz?
        StringBuilder sb2 = new StringBuilder(2);
        System.out.println(sb2.capacity());
        sb2.append("...");
        System.out.println(sb2.capacity());





    }//main
}//class
