package day17multidimensionelarraypassbyvalue;

import java.util.Arrays;

public class MultiDimensionalArray01 {
    public static void main(String[] args) {

        /*
        bir arrayin elemanlari da array olursa bu tarz arraylere multidimensional array deniir
         */

        //nasil olusturulur

        String names [][] = new String[3][2];
        names[1][0]="P";
        names[2][1]= "Z";
        names[0][0]="A";
        names[0][1]= "K";
        names[1][1]= "M";
        names[2][0]= "C";
        System.out.println(Arrays.deepToString(names));

        //multidimensional arrayleri consolea yazdirmak icin deepToStrsing methodunu kullanmalısınız.
        //multidimensional array icinden specific bir eleman yazdır
        System.out.println(names[1][1]);

        //multidimensional array icinde bir arrayi yazdirmak
        System.out.println(Arrays.toString(names[0]));
        System.out.println(Arrays.toString(names[1]));

        //kisa yoldan multidimensional array nasıl olsuturulur

        String students[][]= {{"Ali","Kemal", "Cemal"},{"Ayah","Beyhan", "Seyhan"},{"Ceyhan","Kayahan"}};
        //ex: yukaridaki students arrayinde toplam kaç isim oldugunu bulunuz.
        int sum = 0;

        for (String[] w: students){
            sum = sum + w.length;
        }
        System.out.println(sum);

        //ex: yukaridaki students arrayinde icinde m olan isimleri yazdiriniz

        for (String[] w: students){
            for (String k: w){
                if (k.contains("m")){
                    System.out.println(k);
                }
            }
        }
        //bir integer multidimensional array olsuturunuz tum elemanların carpimini hesaplayiniz
        int nums[][]={{5,4},{2,3,2},{7}};
        int result = 1;
        for (int[] w:nums){
            for (int k:w){
                result =result*k;
            }
        }
        System.out.println(result);

        //ex iki boyutlu bir arrayi tek boyutlu bir arraya cevirin

        int numbers[][]={{5,4},{2,3,2},{7}};

        //1. step iki boyutlu arrayda kac eleman oldugunu bulan kodu yaz
        int toplamElemanSayisi = 0;
        for (int[] w:numbers){
            toplamElemanSayisi = toplamElemanSayisi+w.length;
        }
        //2. step: tek boyutlu arrayi iki boyutlu arrayin eleman sayisini kullanarak olusturmaliyiz
        int newArr[] = new int[toplamElemanSayisi];

        //3. step: iki boyutlu arraydeki elemanlari tek boyutlu arraye transfer etmeliyim

        int idx = 0;
        for (int[] w: numbers){
            for (int k : w){
                newArr[idx] = k;
                idx++;
            }
        }
        System.out.println(Arrays.toString(newArr));

        //Example 5: Bir integer multidimensional array'deki en kucuk ve en buyuk elemanin toplamini bulunuz.

        int ages[][] = { {15, 4}, {12, 43, 21},}; // ==> 4 + 43 = 47

        int small = ages[0][0];
        int big = ages[0][0];
        // { {15, 4}, {12, 43, 21} }
        for(int[] w : ages){

            for(int k : w){
                small = Math.min(small, k);
                big = Math.max(big, k);
            }
        }
        System.out.println(small + big);







    }//main
}//class
