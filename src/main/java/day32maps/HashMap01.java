package day32maps;

import java.util.HashMap;

public class HashMap01 {
    public static void main(String[] args) {

        HashMap<String, Integer> stdAges = new HashMap<>();

        stdAges.put("Ajda", 77);
        stdAges.put("Ezel", 38);
        stdAges.put("Tom", 76);
        stdAges.put("Brad", 58);
        stdAges.put("Angelina", 58);
        //keyi tekrarli kullandigimizda hata vermez, en son verilen entrynin degerini kabul eder.
        //bu yontem value guncellemede kullanilabilir, buna "overwrite" denir
        stdAges.put("Tom", 83);

        //hashmapler entryleri rastgele siralar bu yuzden cok hizli calisir.
        //mapler entryleri siralarken keylere bakarak siralama yapar.
        System.out.println(stdAges);

        //replace methodu valueleri keyleri kullanarak update etmeye yarar.
        stdAges.replace("Exel", 39);
        System.out.println(stdAges);

        stdAges.replace("Angelina", 58, 61);
        System.out.println(stdAges);

        stdAges.putIfAbsent("Ali", 60);
        System.out.println(stdAges);

        System.out.println(stdAges.get("Tom"));
        System.out.println(stdAges.getOrDefault("Tom", 0));

        System.out.println(stdAges.containsValue(77));
        System.out.println(stdAges.containsKey("Ali"));

        stdAges.remove("Ali");
        System.out.println(stdAges);

        stdAges.remove("Tom", 81);
        System.out.println(stdAges);

        HashMap<String, Integer> kidsAge = new HashMap<>();
        kidsAge.put("John", 12);
        kidsAge.put("Jim", 22);
        kidsAge.put("Jack", 32);

        stdAges.putAll(kidsAge);
        System.out.println(stdAges);



    }//main
}//class
