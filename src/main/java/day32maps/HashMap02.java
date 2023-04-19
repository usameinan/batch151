package day32maps;

import java.util.Arrays;
import java.util.HashMap;

public class HashMap02 {
    public static void main(String[] args) {

        //ex1: Type code to print the number of occurrence of words in a sentence
        //     verilen cumledeki kelimelerin gorunum sayisini veren codeu yaziniz.
        //"I like you, like like!" ==> I:1 like:3 you:1

        String s = "I like you you, like like!";
        System.out.println(s);

        //like ile like! i ayni yapabilmek icin tum noktalama isaetlerini silelim.
        s= s.replaceAll("\\p{Punct}", "");
        System.out.println(s);

        //ben kelimelerle calismaliyim. bu yuzden split(" ") kullanacagim,
        String words[] = s.split(" ");
        System.out.println(Arrays.toString(words));

        HashMap<String, Integer> occ = new HashMap<>();

        //"words" arrayindeki kelimeler birer birer mapde var mi yok mu dşye kontrol edecek
        //"words" arrayindeki kelimeler mapda yoksa mape valuesu " olarak yerleştirilecek
        //"words" arrayindeki kelimeler mapde varsa mape varolan valueu " artirilarak yerlesitirilecek

        for (String w : words){
            Integer numOfOccurrence = occ.get(w);
            if (numOfOccurrence==null){
                occ.put(w,1);
            }else{
                occ.replace(w,numOfOccurrence+1);
            }
        }
        System.out.println(occ);



    }//main
}//class
