package day15loopsarrays;

import java.util.Arrays;

public class Arrays02 {
    /*
    1)Application'larda "data" ile bu data'lari isleyen kod'lar(Logic) birbirinden ayrilir.
  Yani; logic data'ya bagimli olmamalidir.
  Data'ya bagimli olarak yazilan kod'lara "hard code" denir.
  "hard code" hatali kod demektir.

  Asagidaki grades array'inde son elemani almak icin "4" veya "grades.length-1" kullanilabilir.
  "4" kullanirsaniz array'e bir eleman eklendiginde kodunuz yanlis cikti verir ama "grades.length-1"
  kullanirsaniz hep dogru sonucu alirsiniz
     */
    public static void main(String[] args) {

        //arrayleri kısa yoldan nasıl olusturabiliriz
        int grades[] = {67, 98, 100, 34, 76};
        System.out.println(Arrays.toString(grades));

        //ex1:grades arrayindeki en kucuk ve en buyuk gradein toplamını yazdirin
        Arrays.sort(grades);
        System.out.println(Arrays.toString(grades));
        System.out.println(grades[0]+grades[grades.length-1]);
        System.out.println();

        //ex2: size verilen bir string arraydeki isimlerden 5 karakterden az karakter icerenleri consolea yazdiriniz.

        String stdNames[] = new String[5];
        stdNames[0] = "Ajda";
        stdNames[3] = "Cuneyt";
        stdNames[2] = "Tom";
        stdNames[1] = "Ayhan";
        stdNames[4] = "Filiz";

        for (String w : stdNames){
            if (w.length()<5){
                System.out.println(w);
            }
        }
        System.out.println();

        //ex3: size verilen bir string arraydeki isimleri alfabetik sıraya koyduktan sonra T ile
        // başlayan isilerden onceki isimleri consolea yazdiriniz

        Arrays.sort(stdNames);

        for (String w:stdNames){
            if (w.startsWith("T")){
                break;
            }
            System.out.println(w);
        }
        System.out.println();

        //ex5: size verilen bir string arraydeki isimleri alfabetik sıraya koyduktan sonra F ile
        //başlayan isimlerden haric diger isimleri consolea yazdiriniz

        Arrays.sort(stdNames);
        for (String w:stdNames) {
            if (w.startsWith("F")) {
                continue;
            } else {
                System.out.println(w);
            }
        }





    }//main
}//class
