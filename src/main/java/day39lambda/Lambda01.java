package day39lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Lambda01 {
    public static void main(String[] args) {

        List<String> myList = new ArrayList<>();
        myList.add("Tom");
        myList.add("Jim");
        myList.add("Clara");
        myList.add("Tom");
        myList.add("Clara");
        myList.add("Angelina");


        printElements(myList);
        System.out.println();
        printEl(myList);
        System.out.println();
        printElExceptStartsWithT(myList);
        System.out.println();
        printEllengtLessThanFour(myList);
        System.out.println();
        printEllengthLessThanFourWithUpper(myList);
        System.out.println();
        printEllengthMoreThanFourUniqueLowerCase(myList);
        System.out.println();
        printElUniqueToUpperCaseSorted(myList);
        System.out.println();
        printElUniqueLowerCaseSortWithLength(myList);


    }

    //ex1: Bir Listteki elemanlari consolea yazdiran methodu olusturunuz.

    //1. way:
    public static void printElements(List<String> myList){

        for (String w : myList){
            System.out.print(w + " ");
        }
    }

    //2. way: LAMBDA EXPRESSİON
    public static void printEl(List<String> myList){

        myList.stream().forEach(t-> System.out.print(t + " "));
    }

    //ex2: Bir Listteki T ile başlayanlar haric tum elemanlari consolea yazdiran methodu olusturunuz.

    public static void printElExceptStartsWithT(List<String> myList){
        myList.stream().filter(t->!t.startsWith("T")).forEach(t-> System.out.print(t+ " "));
    }

    //ex3: Bir Listte character sayisi 4ten az olan tum elemanlari consolea yazdiran methodu olusturunuz.

    public static void printEllengtLessThanFour(List<String> myList){
        myList.stream().filter(t->t.length()<4).forEach(t-> System.out.println(t+ " "));
    }

    //ex3: Bir Listte character sayisi 4ten cok olan tum elemanlari buyuk harflerle consolea yazdiran methodu olusturunuz.

    public static void printEllengthLessThanFourWithUpper(List<String> myList){
        myList.stream().filter(t->t.length()>4).map(t->t.toUpperCase()).forEach(t-> System.out.print(t+ " "));
    }

    //ex4:Bir Listte character sayisi 4ten cok olan tum elemanlari tekrarsiz olarak kucuk harflerle consolea yazdiran
    // methodu olusturunuz.

    public static void printEllengthMoreThanFourUniqueLowerCase(List<String> myList){
        myList.
                stream().
                distinct().
                filter(t->t.length()>4).
                map(t->t.toLowerCase()).
                forEach(t-> System.out.print(t +" "));
    }

    //ex6: Bir List'teki elemanlari tekrarsiz olarak buyuk harflerle alfabetik sirada console'a yazdiran method'u olusturunuz.

    public static void printElUniqueToUpperCaseSorted(List<String> myList){
        myList.
                stream().
                distinct().
                map(t->t.toUpperCase()).
                sorted().
                forEach(t-> System.out.print(t +" "));
    }

    //Example 7: Bir List'teki elemanlari tekrarsiz olarak kucuk harflerle uzunluklarina kucukten buyuge siralayarak console'a yazdiran method'u olusturunuz.

    public static void printElUniqueLowerCaseSortWithLength(List<String> myList){
        myList.
                stream().
                distinct().
                map(t->t.toLowerCase()).
                sorted(Comparator.comparing(t->t.length())).
                forEach(t-> System.out.print(t +" "));
    }

}//class
