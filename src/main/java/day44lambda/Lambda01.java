package day44lambda;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Lambda01 {
    public static void main(String[] args) throws IOException {

        //ex1: verilen text file icindeki texti consolea yazdiran codeu yaziniz.
        Files.
                lines(Paths.get("src/main/java/day44lambda/MyTextFile.txt")).
                forEach(System.out::print);

        //ex2: verilen bir text file icindeki texti buyuk harflerle consolea yazdiran codeu yazdiriniz.
        Files.
                lines(Paths.get("src/main/java/day44lambda/MyTextFile.txt")).
                map(String::toUpperCase).
                forEach(System.out::println);

        //ex3: Verilen text file icindeki text'i "Java" kelimesinin olup olmadigini kontrol eden code u yaziniz
        boolean r1 = Files.
                lines(Paths.get("src/main/java/day44lambda/MyTextFile.txt")).
                anyMatch(t->t.contains("Java"));
        System.out.println(r1);

        //ex4: verilen text file icindeki textlerde kullanilan farklı kelimeleri bir list icine return ediniz.
        List<String> words = Files.
                lines(Paths.get("src/main/java/day44lambda/MyTextFile.txt")).
                map(t->t.replaceAll("\\p{Punct}","").split(" ")).
                flatMap(Arrays::stream).
                distinct().
                collect(Collectors.toList());
        System.out.println(words);

        //ex5: Verilen text file icindeki text'de toplam kac harf kullanildigini gosteren kodu yaziniz.
        long numOfLetters = Files.
                lines(Paths.get("src/main/java/day44lambda/MyTextFile.txt")).
                map(t->t.replaceAll("[^a-zA-Z]", "")).
                map(t->t.split("")).
                flatMap(Arrays::stream).
                count();
        System.out.println(numOfLetters);



    }
}//class
