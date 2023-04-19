package practices;

public class Q01_Variables {

    public static void main(String[] args) {

    // bir variable baslat
    int age = 15;
    int number = 43;
    String isim = "Ali";
        System.out.println(age);
        System.out.println("number = " + number);
        System.out.println("isim = " + isim);

    //variable degerini kopyala
    int myAge = age;
        System.out.println("myAge = " + myAge);
    String onunIsmi = "Ali";
        System.out.println("onunIsmi = " + onunIsmi);

    //ayni satirda coklu variable deklare et
    int year = 2022, month =3, day = 15;
        System.out.println("month = " + month);
        System.out.println("year = " + year);
        System.out.println("day = " + day);

    //variable degerini guncelle
    year = 2023;
        System.out.println("year = " + year);
    isim = "Veli";
        System.out.println("isim = " + isim);
        System.out.println("onunIsmi = " + onunIsmi);

    //bir variable deklare et x
    double x;

    //bir variable deklare et y
    double y =55.6;

    //bir variable deklare et z
    double z = 10;

    //x degiskenini y degiskeni ile baslat
    x = y;

    //variablei guncelle
    x = 15.3;

    //degiskenleri yazdir
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("z = " + z);


    }


}
