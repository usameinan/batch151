package day31collectionsmaps;

import java.util.*;

        /*
        MY NOTES:
            Map'lerde sozluklerdeki gibi kelime ve manasi seklinde bir kullanim vardir.
            "key" kismi tekrarsiz, "value" tekrarli olabilir.
            Map'ler "key" ve "value" structure'ini kullanir.
            Map'lerdeki elemanlara "Entry" denir.
            Elemanlarin tamanina ise "EntrySet" denilir.
            "Entry"ler tekrarsiz oldugu icin "EntrySet"denilir.
            "Key" ve "Value" lar ayri ayri data type'larinda olabilirler.
            "Map"'ler Collection degildir, farkli bir yapidir.
            HashMap'ler "entry"leri rastgele siralar, bu yuzden en hizli map'dir.
        */

public class HashMap01 {
    public static void main(String[] args) {

        HashMap<String, Integer> countryPopulation = new HashMap<>();
        countryPopulation.put("Germany", 83000000);
        countryPopulation.put("Albania", 3000000);
        countryPopulation.put("USA", 400000000);
        countryPopulation.put("Turkey", 83000000);
        countryPopulation.put("Netherland", 18000000);
        System.out.println(countryPopulation);

        //get() methodu "key" ile calisir ve "value" kismini veriri
        int usaPopulationa = countryPopulation.get("USA");
        System.out.println(usaPopulationa);

        //Butun keyleri nasil alabiliriz.
        Set<String> keys = countryPopulation.keySet();
        System.out.println(keys);

        //Butun valuelari nasil alabilirim?
        Collection<Integer> values = countryPopulation.values();
        System.out.println(values);

        //ex: countryPopulation mapindeki ulkelerin nufuslarinin ortalamasi nedir?
        Collection<Integer> value = countryPopulation.values();

        int sum = 0;
        for (Integer w : value){
            sum = sum + w;
        }
        System.out.println(sum/ value.size());

        //entrySet() entryleri kalip halinde alip size "Set"in icine koyarak verir.
        Set<Map.Entry<String, Integer>> entries = countryPopulation.entrySet();
        System.out.println(entries);

        //ex: countryPopulation mapindeki ulkelerin isimlerinin character sayisi ile nufuslarinin toplamini bulunuz?
        int toplam = 0;
        for (Map.Entry<String,Integer> w : entries){
            toplam = toplam + w.getKey().length() + w.getValue();
        }
        System.out.println(toplam);









    }//main
}//class
