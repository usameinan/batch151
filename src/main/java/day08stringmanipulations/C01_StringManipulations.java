package day08stringmanipulations;

public class C01_StringManipulations {
    public static void main(String[] args) {

        /*
        replaceFirst () replace ile aynı isi yapmakla birlikte ilk gordugu datayi degistirir.
         */

        String str = "Bizimle Java Ogrenmek Cok Kolay";

        //ex: str stringindeki ilk "i" harflerinin yerini e harfi yerlesitiriniz

        String str1 = str.replaceFirst("i","e");
        System.out.println("str1 :=" + str1);

        String isim = "   Mehmet Fatih Yildirim  ";

        //isim stringindeki bas ve sondaki boslukları siliniz

        String isim1 = isim.trim();
        System.out.println("isim1 := " + isim1);
        System.out.print("********************");
        System.out.print(isim);
        System.out.print("********************");
        String trimIsim = isim.trim();
        System.out.print("trimIsim =" + trimIsim);
        System.out.print("********************");

        //ex asagida fiyatlari verilen urunlerin toplam fiyatini bulunuz

        String tv = "599.99 $";
        String laptop = "299.99 $";

        String tv2 = tv.replace("$","");

        String laptop2 = laptop.replace("$","");

        System.out.println("tv2 := " + tv2);

        System.out.println("laptop2 := " + laptop2);

        Double totalPrice = Double.valueOf(tv2)+Double.valueOf(laptop2);
        System.out.println("totalPrice = " + totalPrice);

        //valueOf() bize string bir datayi sayisal bir degere cevirir

        String tamIsim = "  mehmet fatih  ";
        //verilen tamIsim stringinin icindeki ilk ismin ilk harfi ile son ismin ilk harfini
        //buyuk harf olarak yanyana yazdiriniz

        char first = tamIsim.trim().toUpperCase().charAt(0);
        char second = tamIsim.trim().toUpperCase().split(" ")[1].charAt(0);
        System.out.println("first+second := " + first+second);


    }//main
}//class
