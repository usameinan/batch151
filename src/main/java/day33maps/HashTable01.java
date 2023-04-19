package day33maps;

import java.util.Hashtable;

public class HashTable01 {
    /*
        "HashMap" ile "HashTable" arasindaki fark nedir?
        1) "HashMap" "thread-safe" degildir "HashTable" "thread-safe"dir.
           "HashMap" "synchronized" degildir "HashTable" "synchronized"dir.
        2) "HashMap"ler bir tane "null" keye ve istediginiz kadar "null" value'a musade eder.
           "HashTable" keylerde de valuelarda da "null" kullanilmasina musade etmez.
        3) "HashMap" hizlidir "HashTable" "Hashmap"a gore yavastir.
     */
    public static void main(String[] args) {

        Hashtable<String, Integer> stdAges = new Hashtable<>();
        stdAges.put("Tom", 43);
        stdAges.put("Jim", 52);
        stdAges.put("Jack", 21);
        stdAges.put("Henry", 43);
        stdAges.put("Walker", 85);

        System.out.println(stdAges);




    }
}
