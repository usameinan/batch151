package day29collections;

import java.util.LinkedList;

public class LinkedList01 {
    /*
    1) LinkedList'ler node silme ve eklemede cok basarili olduklarini icin silme ve
       ekleme islemlerini coklukla yapacaginiz zaman LinkedList kullaniniz.
    2) ArrayListler indexleri adres gibi kullanir bu yuzden ArrayListler "search" islemlerinde cok basarilidrlar
    Note: ihtiyaciniz olan collection cogunlukla silme ve ekleme islemleri yapacaksa (muze ziyaretcileri gibi) LinkedList
          "search" islemleri yapacaksa (amerika eyaletleri gibi) ArrayList kullaniniz.
     */
    public static void main(String[] args) {

        LinkedList<String> s = new LinkedList<>();
        s.add("Esra");
        s.add("Steve");
        s.add("Ajda");
        s.add("Muge");
        s.add("Cuneyt");
        s.add("Esra");
        s.add(2,"Esen");
        s.addFirst("Kemal");
        s.addLast("Ajdar");
        System.out.println(s);

        s.remove(2);
        System.out.println(s);

        s.remove("Ajdar");
        System.out.println(s);

        s.remove();
        System.out.println(s);

        s.removeFirstOccurrence("Esra");
        System.out.println(s);

        s.removeLastOccurrence("Esra");
        System.out.println(s);

        /*
        Retrieves, but does not remove, the head (first element) of this list.
        Returns: the head of this list, or null if this list is empty
         */
        String r1 = s.peek();
        System.out.println(r1);

        String r2 = s.poll();
        System.out.println(r2);
        System.out.println(s);

        /*
        Retrieves, but does not remove, the head (first element) of this list.
        Returns: the head of this list
        Throws: NoSuchElementException – if this list is empty
        note: peek ile element ikisi de size ilk elemani silmeden verir.
              ama peek list bos oldugunda size "null" verir element ise "hata" verir.
         */
        String r3 = s.element(); //ilk elemani silmeden size verir.
        System.out.println(r3);
        System.out.println(s);

        /*
        Removes and returns the first element of this list.
        Returns: the element at the front of this list (which is the top of the stack represented by this list)
        Throws: NoSuchElementException – if this list is empty
        note: poll ile pop ikisi de size ilk elemani siler ve size verir.
              ama poll list bos oldugunda size "null" verir pop ise "hata" verir.
         */
        String r4 = s.pop();
        System.out.println(r4);
        System.out.println(s);


    }//main
}//class
