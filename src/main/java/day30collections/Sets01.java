package day30collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Sets01 {

    /*
        1)Set'ler tekrarsiz eleman(unique) depolamak icin kullanilir
        2)3 tane Set Class vardir bunlardan birinicisi
          i)HashSet Class:
                  "Hash" benzersiz id olusturma teknigidir, bu teknige "Hashing Technique" denir.
                  "HashSet" elemanlari rastgele siralar.
                  "HashSet" elemanlari siralamadigindan cok hizli calisir.
                  "HashSet"ler "null"i eleman olarak kabul eder.
          ii)LinkedHashSet Class:
                  "LinkedHashSet"ler elemanlari sizin verdiginiz siraya gore dizdiklerinden
                  "HashSet"lere gore yavastirlar.
                  "LinkedHashSet" tekrarsiz eleman depolamak icindir.
          iii)TreeSet Class:
                  "TreeSet"ler elemanlari natural oldera gore dizerler.
                  "TreeSet"ler elemanlari natural ordera gore dizdiklerinden cooook yavastir.
                  en yavas Set "TreeSet"tir.
        3)TreeSet cok yavas oldugundan mumkun oldugu kadar treeset kullanmamaya calisiriz.
     */
    public static void main(String[] args) {

        HashSet<String> hs = new HashSet<>();
        hs.add("Ajda");
        hs.add("Cuneyt");
        hs.add("Esra");
        hs.add("Zeki");
        hs.add("Ezel");
        hs.add("Cuneyt");//Tekrarli eleman eklediginizde hata vermez ama tekrarli elemani sadece bir kere ekler
        hs.add(null);
        System.out.println(hs);
        System.out.println(hs.hashCode());

        LinkedHashSet<Integer> lhs = new LinkedHashSet<>();
        lhs.add(234);
        lhs.add(87);
        lhs.add(-32);
        lhs.add(124);
        System.out.println(lhs);

        LinkedHashSet<Integer> ls = new LinkedHashSet<>();
        ls.add(451);
        ls.add(87);
        ls.add(231);
        ls.add(124);

        lhs.retainAll(ls);
        System.out.println(lhs);//ilk LinkedHashSetteki farkli elemanlar silindi
        System.out.println(ls);

        TreeSet<Character> ts = new TreeSet<>();
        ts.add('G');
        ts.add('A');
        ts.add('Z');
        ts.add('R');
        ts.add('U');
        System.out.println(ts);//treesetlere null eklenmez
        System.out.println(ts.first());
        System.out.println(ts.lower('R'));
        System.out.println(ts.higher('K'));
        System.out.println(ts.headSet('R'));
        System.out.println(ts.tailSet('G'));
        System.out.println(ts.headSet('R',true));
        System.out.println(ts.ceiling('R'));// eleman setin icinde varsa elemanin kendisi return eder
        System.out.println(ts.ceiling('K'));//eleman setin icinde yoksa sonraki eleman return eder
        System.out.println(ts.floor('G'));// eleman setin icinde varsa elemanin kendisi return eder
        System.out.println(ts.floor('J'));//eleman setin icinde yoksa onceki elemani return eder.
        System.out.println(ts.subSet('G', 'V'));
        System.out.println(ts.subSet('G', false,'Z', true));





    }//main
}//class
