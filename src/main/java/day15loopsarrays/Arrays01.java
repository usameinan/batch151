package day15loopsarrays;

import java.util.Arrays;

public class Arrays01 {

    /*
    1. array javanin coklu data depolamak icin olsuturdugu bir yapidir
    2. arrayler primitive data typleri veya reference lar ile calisir.
    3. arrayler super fastdir memoryde cok az yer kaplar.
     */
    public static void main(String[] args) {
        //array olusturma
        String stdNames[] = new String[5];
        //array yazdirma
        System.out.println(Arrays.toString(stdNames));
        //arraye eleman ekleme
        stdNames[0] = "Ajda";
        stdNames[3] = "Cuneyt";
        stdNames[2] = "Kemal";
        stdNames[1] = "Ayhan";
        stdNames[4] = "Filiz";
        System.out.println(Arrays.toString(stdNames));
        //arraydeki spesific bir elemanı nasıl alabiliriz.
        System.out.println(stdNames[3]);

        //ex: stdnames arrayindeki her ismin sonuna yildiz koyun

        //1. way
        for (int i=0; i<stdNames.length;i++){//length stringlerde parantezli arraylerde parantezsiz kullanilir
            System.out.println(stdNames[i]+"*");
        }
        System.out.println();
        //2.way: for-each loop ==> enhanced (zenginleştirilmiş) loop -mumkunse hep for-each loop kullanın degilse digerleri
        for (String w : stdNames){
            System.out.println(w+"*");
        }
        System.out.println();

        //ex: bir int array olusturunuz. 5 eleman ekleyiniz. toplamini bulup consolea yazdiriniz.

        int ages[] = new int[5];
        ages[0] = 12;
        ages[1] = 23;
        ages[2] = 9;
        ages[3] = 38;
        ages[4] = 27;
        int sum = 0;
        for (int w : ages){
            sum = sum + w;
        }
        System.out.println(sum);
        System.out.println();

        //ex: char array olusuturup 3 eleman ekleyin elemanlarin carpimini bulup consolea yazdirin.

        char initials[] = new char[3];
        initials[0] = 'J';
        initials[1] = 'P';
        initials[2] = 'A';
        int carpim = 1;
        for (char w : initials){
            carpim = carpim*w;
        }
        System.out.println(carpim);
        System.out.println();











    }//main
}//class
