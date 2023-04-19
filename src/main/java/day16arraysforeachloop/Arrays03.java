package day16arraysforeachloop;

import java.util.Arrays;

public class Arrays03 {
    public static void main(String[] args) {

        //specific bir elemanin arrayde olup olmadigini anlamak icin gereken kodu yaziniz.

        String names[] = {"K", "C", "R", "A", "S"};

        String el = "E";
        //1. way:
        int counter = 0;

        for (String w: names){
            if (w.equals(el)){
                counter++;
                break;
            }
        }
        if (counter>0){
            System.out.println("Array has "+ el);
        }else {
            System.out.println("Array does not have "+ el);
        }

        //2. way: binarySearch() method hizli arama yapar
        //note1: binarySearch() methodunu sort() kullanmadan kullanmayiniz. cunku binarysearch mantıgı sıralı elemanlar
        //icin gecerlidir
        //note2: binarySearch methodu var olan elemanlar icin size o elemanin indexini verşr
        //note3: methoddan aldiginiz index 0 veya 0dan buyukse bu eleman o arrayde var demektir
        //note4: binarySearch() methodu olmayan elemanlar icin negatif tamsayi degeri verir
        //"-" işaretinin anlami o eleman yok demektir sayi ise o eleman olsaydi kacıncı eleman olurdu demektir

        Arrays.sort(names);
        int result = Arrays.binarySearch(names,el);
        System.out.println(result);
        if (result<0){
            System.out.println("Array does not have "+el);
        }else{
            System.out.println("Arrat has "+el);
        }





    }//main
}//class
