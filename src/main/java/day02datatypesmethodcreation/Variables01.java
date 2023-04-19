package day02datatypesmethodcreation;

import java.sql.SQLOutput;

public class Variables01 {
    /*
    javada iki çeşit data type vardir
    1) primitive
        char, boolean, byte, short, long, int, float, double
    2) non-primitive
        string
     */
    /*
    note1. primitive data typeların isimlerinde sadece kucuk harf kullanılır
    note2. primitve datalar iclerinde sadece sizin atadiginiz degerleri barindirirlar
     */
    public static void main(String[] args) {
       String cityName = "Angara" ;
        System.out.println(cityName);

        int a =13;

        /*
        Interview sorusu: "primitive ve "non-primitive" data typelar arasındaki farklar nedir?
        1. primitiveler sadece bizim atadığımız değerleri içerir
           non-primitiveler bizim atadığımız değer ve methodlar içerir
        2. primitiveler kucuk harfle baslar non-primitiveler buyuk harfle baslar
        3. primitiveler memoryde data typeina gore yer kaplar
            non-primitiveler data typelerın tamamı için java memoryde aynı miktarda yer ayirir
         */
    }
}
