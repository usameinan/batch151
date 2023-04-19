package day19arraylists;

import javax.swing.plaf.IconUIResource;
import java.util.ArrayList;
import java.util.List;

public class ArrayList02 {

    /*
        Bir method'u ogrenirken asagidaki 3 seyi ogrenin;
        1) O method ne iş yapar?
        2) O method nasıl kullanılır?
        3) O method size neyi verir?
     */

    public static void main(String[] args) {

        ArrayList<String> cities = new ArrayList<>();
        cities.add("Miami");
        cities.add("Giresun");
        cities.add("Yozgat");
        cities.add("Barcelona");
        cities.add("Miami");
        cities.add("Giresun");
        cities.add("Giresun");
        cities.add("Yozgat");
        System.out.println(cities);// [Miami, Giresun, Yozgat, Barcelona, Miami, Giresun]

        //ArrayList'te bir elemanin "ilk gorunumu" nasil silinir?
        System.out.println(cities.remove("Miami"));//true
        System.out.println(cities);// [Giresun, Yozgat, Barcelona, Miami, Giresun]

        //ArrayList'te bir eleman index'i kullanilarak nasil silinir?
        System.out.println(cities.remove(2));// Barcelona
        System.out.println(cities);// [Giresun, Yozgat, Miami, Giresun]

        //ArrayList olustururken an basa ArrayList yerine List de yazabilirsiniz. Sebebini Collections konusunda gorecegiz
        List<Integer> ages = new ArrayList<>();
        ages.add(23);
        ages.add(12);
        ages.add(7);
        ages.add(4);

        //Example 1: 12 elemanini ages List'ten siliniz
        ages.remove((Integer)12);
        System.out.println(ages);//[23, 7, 4]

        //Bir ArrayList'teki bir elemanin tum gorunumlerini nasil sileriz?
        List<String> citiesToRemove = new ArrayList<>();
        citiesToRemove.add("Giresun");
        citiesToRemove.add("Yozgat");

        System.out.println(cities.removeAll(citiesToRemove));//true
        System.out.println(cities);// [Miami]

        //iki arrayin birbirine esit olup olmadigini nasil anlariz?

        //kisa yoldan bir list olusturmak icin asagidaki List.of methodu kullanilabilir.
        List<Character> initials = List.of('a',  'k', 'c', 'd', 'k');
        System.out.println(initials);

        List<Character> letters = List.of('a', 'k', 'c', 'd', 'k');
        System.out.println(letters);

        //iki ArrayListin birbirine esit olup olmadigini nasil anlariz?
        //equals() methodu ayni elemanlar ayni indexte oldugu surece true verir.
        boolean r1 = initials.equals(letters);
        System.out.println(r1);

        int r2 = initials.indexOf('k');
        System.out.println(r2);

        int r3 = initials.lastIndexOf('k');
        System.out.println(r3);

        //ex1: Bir listteki tekrarsiz elemanlari consolea yazdiran kodu yaziniz.
        List<Double> prices = List.of(2.5, 1.25, 2.5, 3.75, 1.25, 4.0);

        for (Double w : prices){
            if (prices.indexOf(w) == prices.lastIndexOf(w)){
                System.out.println(w + "");
            }
        }

        //ex2: Bir listte tekrarli eleman olup olmadigini gosteren kodu yaziniz.
        List<Double> heights = List.of(2.5, 1.25, 2.5, 3.75, 1.25, 4.0);

        int counter = 0;
        for (Double w : heights){
            if (heights.indexOf(w) == heights.lastIndexOf(w)){
                counter++;
            }
        }
        if (counter==0){
            System.out.println("All elements are unique in the list");
        }else{
            System.out.println("At least one element is not unique in the list");
        }



    }//main

}//class



