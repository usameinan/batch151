package day33maps;

import java.util.HashMap;

public class HashMap01 {
    public static void main(String[] args) {
        String s = "Hello Henry!";
        System.out.println(getTheNumOfOccurrenceOfLetters(s));

    }//main

    //example1: verilen bir stringte hangi harfin kac defa kullanildigini veren method olusturunuz.
    //          "Hello Henry!" ==> H=2 e=2 l=2 o=1 n=1 r=1 y=1

    public static HashMap<String,Integer> getTheNumOfOccurrenceOfLetters(String s){
        //stringteki haf disi characterleri sil
        s = s.replaceAll("[^A-Za-z]", "");

        //gorunum sayilarini depolamak icin Map olustur.
        HashMap<String,Integer> numOfOccurrence = new HashMap<>();

        //Harfleri al.
        String letters[] = s.split("");

        //for-each loop
        for (String w : letters){
            Integer numOfOcc = numOfOccurrence.get(w);
            if (numOfOcc==null){
                numOfOccurrence.put(w,1);
            }else{
                numOfOccurrence.put(w, numOfOcc+1);
            }
        }
        return numOfOccurrence;
    }

}//class
