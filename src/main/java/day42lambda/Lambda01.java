package day42lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Lambda01 {

    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.add("Tom");
        names.add("Alex");
        names.add("Jim");
        names.add("Michael");
        names.add("Mary");
        names.add("Alexander");
        names.add("Alex");

        System.out.println(sortWithLastCharDistinctUpperInList(names));
        System.out.println(sortWithLengthReversedSameLengthInNaturalLowerInList(names));
        System.out.println(isLengthMoreThanTwo(names));
        System.out.println(noLengthLessThanThree(names));
        System.out.println(atLeastOneLengthLessThanFour(names));


    }

    //ex1: List elemanlarini son harflerine gore natural orderda tekrarsiz olarak buyuk harfle bir listin icinde return ediniz.
    //1.way
    public static List<String> sortWithLastCharDistinctUpperInList(List<String> names){
        return names.
                stream().
                distinct().
                map(String::toUpperCase).
                sorted(Comparator.comparing(t->t.charAt(t.length()-1))).
                collect(Collectors.toList());//normalde distinct elemanlari depolamak icin "Set" kullanilir.
                                             // ama lambdadaki toSet() methodu elemanlari rastgele siralar.
                                             //halbuki bu soruda rastgele siralama kabul edilmiyor.
                                             //bu yuzden mecburen collect(collectors.toList()); kullandik
    }

    //ex2: List elemanlarini character sayilarina gore ters sirada kucuk harfle bir listin icinde return ediniz.
    //ayni character sayisina sahip elemanlar kendi icinde alfabetik sirada olsun

    public static List<String> sortWithLengthReversedSameLengthInNaturalLowerInList(List<String> names){
        return names.
                stream().
                map(String::toLowerCase).
                sorted(Comparator.comparing(String::length).reversed().thenComparing(t->t.charAt(0))).
                collect(Collectors.toList());
    }

    //ex3: List elemanlarinin tamaminin character sayisinin 2den buyuk olup olmadigini kontrol eden methodu olusturunuz.
    public static boolean isLengthMoreThanTwo(List<String> names){
        return names.
                stream().
                allMatch(t->t.length()>2);
    }

    //ex4: List elemanlarinin hicibirisinin character sayisinin 3den kucuk olup olmadigini kontrol eden methodu olusturunuz.
    public static boolean noLengthLessThanThree(List<String> names){
        return names.
                stream().
                noneMatch(t->t.length()<3);
    }

    //ex5: List elemanlarinin en az birinin character sayisinin 4ten kucuk olup olmadigini kontrol eden methodu olusturunuz.
    public static boolean atLeastOneLengthLessThanFour(List<String> names){
        return names.
                stream().
                anyMatch(t->t.length()<4);
    }



}//class
