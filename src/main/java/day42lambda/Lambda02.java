package day42lambda;

import day41lambda.Utils;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class Lambda02 {
    public static void main(String[] args) {

        System.out.println(getSumInTheGivenRange(7,10));
        System.out.println(getMultiplicationInTheGivenRange(7,10));
        System.out.println(getSumOfDigitsInTheGivenRange(45,47));

    }

    //swat icin bir tane private method olustur.
    private static List<Integer> swap(int starting, int ending){
        List<Integer> list = new ArrayList<>();
        if (starting>ending){
            starting=starting+ending;
            ending=starting-ending;
            starting=starting-ending;
        }
        list.add(starting);
        list.add(ending);
        return list;
    }

    //ex1: 7den 10a kadar tam sayilarin toplamini hesaplayan methodu olusturunuz.
    public static int getSumInTheGivenRange(int starting, int ending){
        List<Integer> list = swap(starting, ending);
        return IntStream.
                rangeClosed(list.get(0), list.get(1)).
                sum();
    }

    //ex2: 7den 10a kadar tam sayilarin carpimini hesaplayan methodu olusturunuz.
    public static int getMultiplicationInTheGivenRange(int starting, int ending){
        return IntStream.
                rangeClosed(starting, ending).
                reduce(Math::multiplyExact).
                getAsInt();
    }

    //ex3: 45den 47ye kadar tam sayilarin rakamlari toplamini hesaplayan methodu olusturunuz.
    public static int getSumOfDigitsInTheGivenRange(int starting, int ending){
        return IntStream.
                rangeClosed(starting, ending).
                map(Utils::getSumOfDigits).
                sum();
    }
}//class
