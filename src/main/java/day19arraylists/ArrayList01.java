package day19arraylists;

import java.util.ArrayList;

public class ArrayList01 {

    /*
    1) ayni data typeindeki coklu datalari depolamak icin Array kullanilir.
    2) Arraylerin bir negatif yonu var. icine koyacaginiz eleman sayisini en basta belirlemek zorundasiniz.
    3) Arrayler eleman sayisinda esnek degildirler. Bu yuzden java "ArrayList" adli yeni bir yapi olusturdu.
       Bu yapi eleman sayisinda esnektir. Hic eleman koymazsaniz eleman sayisini sifir olarak ayarlar. 1000 eleman
       koyarsaniz eleman sayisini 1000 olarak ayarlar.
    4) "ArrayList" yerine sadece "List" de diyebiliriz.
    5) Java "ArrayList"leri olsuturduktan sonra Arrayleri iptal etmedi cunku;
       i.  Arrayler super hizlidir.
       ii. Arrayler memoryde coook az yer kaplar.
    6) Arrayler primitive data typelari ve referencelari depolayabilir ama "ArrayList"ler "non-primitive" data typelarini
       depolar bu yuzden "ArrayList"ler arraylerden daha cok yer kaplar.
     */

    public static void main(String[] args) {
        //ArrayList nasil olsuturulur?
        ArrayList<Integer> ages = new ArrayList<>();

        //ArrayList consolea nasil yazdirilir?
        System.out.println(ages);

        //ArrayListe eleman nasıl eklenir?
        //1. way:
        ages.add(12);
        ages.add(24);
        ages.add(9);// add() methodu elemanlari giris sirasina(insertion order) gore liste yerlestirir.
        System.out.println(ages);

        //2. way:
        ages.add(1,99);
        System.out.println(ages);

        ArrayList<Integer> price = new ArrayList<>();
        price.add(23);
        price.add(33);

        //3. way: addAll() methodu bir listi diger listin icine yerlestirir.
        ages.addAll(price);
        System.out.println(ages);

        //4. way:
        ages.addAll(3,price);
        System.out.println(ages);

        //ArrayListte eleman sayisi nasil bulunur?
        int numOfElement = ages.size();// size() methodu bir listteki eleman sayisini verir.
        System.out.println(numOfElement);

        //ArrayListte specific bir eleman nasil alinir?
        int el1 = ages.get(3);//get() methodu index kullanarak istedigimiz elemani almaya yarar.
        System.out.println(el1);

        //ArrayListte specific bir eleman nasil degistirilir?
        ages.set(6, 111);
        System.out.println(ages);

        //ArrayListte specific bir elemanin var olup olmadigini nasil anlariz?
        boolean r1 = ages.contains(99);
        System.out.println(r1);

        //ArrayListin bos olup olmadigini nasil kontrol ederiz?
        boolean r2 = ages.isEmpty();
        System.out.println(r2);

        //ArrayListteki tum elemanlari nasil sileriz?
        ages.clear();
        System.out.println(ages);

        boolean r3 = ages.isEmpty();
        System.out.println(r3);

        //ex1: Bir listin bos olup olmadigini kontrol eden kodu yaziniz.
        ArrayList<String> names = new ArrayList<>();
        names.add("Ajda");
        names.add("Cuneyt");
        names.add("Angelina");
        names.add("Brad");

        //1. way
        if (names.size()==0){
            System.out.println("List is empty");
        }else{
            System.out.println("List has at least 1 element");
        }

        //2. way: recommended
        if (names.isEmpty()){
            System.out.println("List is empty");
        }else{
            System.out.println("List has at least 1 element");
        }








    }//main
}//class
