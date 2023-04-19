package day22stringbuilder;

public class Sb02 {
    public static void main(String[] args) {

        StringBuilder sb1 = new StringBuilder("Java is easy");
        System.out.println(sb1);

        sb1.reverse();//Stringin ters cevrilmesi looplar ile de yapilir bu kisa yoldur.
        System.out.println(sb1);

        sb1.deleteCharAt(6);//verilen indexteki characteri siler
        System.out.println(sb1);

        sb1.delete(4,7);//baslangic indexiden (dahil) bitis indexine(haric) kadar siler
        System.out.println(sb1);

        sb1.replace(3,6,"X");//baslangic indexinden (dahil) biris indexine(haric) kadar olan kismi degistirir.
        System.out.println(sb1);

        sb1.insert(3,"2023");
        System.out.println(sb1);

        StringBuilder sb2 = new StringBuilder("java");
        StringBuilder sb3 = new StringBuilder("Java");
        int r1 = sb2.compareTo(sb3);//alphabetic olarak karsilastirmaya yarar
        System.out.println(r1);     // sonuc -3 ise sb1 sb2den alphabetic olarak 3 onde demektir.
                                    // sonuc 3 ise sb1 sb2den alphabetic olarak 3 sonra demektir.

        //StringBuilder nasil stringe cevrilir?
        String str = sb1.toString().toUpperCase();
        System.out.println(str);
        //String nasil StringBuildere cevrilir?
        StringBuilder newSb1 = new StringBuilder(str);
        System.out.println(newSb1);


    }//main
}//clas

