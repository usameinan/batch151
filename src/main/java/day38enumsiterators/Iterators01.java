package day38enumsiterators;

import java.util.*;

public class Iterators01 {

    /*
        1) Iteratorlar looplarin yaptigi ayni isi yapar.
        2) Iteratorlarda sonsuz loop olusma ihtimali yoktur.
        3) Iteratorlar ile looplar arasinda performans farki yoktur.
        4) Iteratorlar bir collectiondan eleman silme ve bir collectiondaki elemani degistirme konusunda daha basarilidir.
        5) Iki tip iterator var. i) Iterator: Bu sadece eleman silmede kullanilir.
                                              eleman eklemek veya elemani degistirmek mumkun degildir.
                                 ii) ListIterator: Bu eleman silebilir, ekleyebilir ve degistirebilir.
                                 Note: "Iterator" sadece soldan saga(ilk elemandan son elemana) calisir.
                                       "ListIterator" ise iki yonlu calisabilir.
     */
    public static void main(String[] args) {

        List<String> myList = new ArrayList<>();
        myList.add("Tom");
        myList.add("Jim");
        myList.add("Clara");
        myList.add("Angie");
        myList.add("Mark");
        System.out.println(myList);

        //"Iterator" kullanimi:
        Iterator<String> myItr = myList.iterator();

        while (myItr.hasNext()){//hasNext(); pointer'a "Senden sonra eleman var mi?" diye sorar.
                                //Eleman varsa "true" yoksa "false" return eder.
            myItr.next();//next() pointer'i bir sonraki elemanin onune tasir ve ustunden atladigi elemani return eder.
            myItr.remove();//next() methodunun retrn ettigi elemani siler.
        }
        System.out.println(myList);

        //ListIterator kullanimi:
        List<String> yourList = new ArrayList<>();
        yourList.add("Tom");
        yourList.add("Jim");
        yourList.add("Clara");
        yourList.add("Angie");
        yourList.add("Mark");
        System.out.println(yourList);

        ListIterator<String> yourListItr = yourList.listIterator();

        while (yourListItr.hasNext()){
            String el = yourListItr.next();
            yourListItr.set(el + "!");
        }
        System.out.println(yourList);

        //hasPrevious() ve previous() nasil kullanilir?
        while (yourListItr.hasPrevious()){
            String el = yourListItr.previous();
            System.out.println(el);
            yourListItr.set("?" + el);
        }
        System.out.println(yourList);

        //En sondan en basa nasil iterate edebiliriz?
        LinkedList<String> ourList = new LinkedList<>();
        ourList.add("Tom");
        ourList.add("Jim");
        ourList.add("Clara");
        ourList.add("Angie");
        ourList.add("Mark");
        System.out.println(ourList);

        Iterator<String> ourListItr = ourList.descendingIterator();// ancak linkedlist ile kullanilabilir.

        while (ourListItr.hasNext()){

            String el = ourListItr.next();

            System.out.println(el);

        }
    }
}
