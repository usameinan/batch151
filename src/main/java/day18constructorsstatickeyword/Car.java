package day18constructorsstatickeyword;

/*
1.Constructor nasil olsuturulur.
    Access Modifier + Class Name + () + {}
2. Method ile Constructor arasindaki farklar nelerdir.
    i. methodlarda return type olur. constructorlarda olmaz.
    ii. methodlar yaptiklari ise gore isimlendirilirler. constructorlar ise her zaman "Class ismi" ile isimlendirilirler
    iii. methodlar bir aksiyon yapmak icin olsuturulur. constructorlar object olusturmak icindir
    iiii. method isimleri kucuk harfle baslar constructor isimleri class ismine gore buyuk harfle baslar.
3. parametreli constructorlar olsuturarak ayni classtan farkli ozelliklere sahip objeler olusturabiliriz.
 */
public class Car {
    String make = "Honda";
    String model = "Accord";
    int year = 2021;
    int price = 18000;

    //Default Constructor
    //Default Constructor'lar "parametre" kullanmazlar
    //Default Constructor'larin body'si bostur
    //Java kiskanc'dir. Siz "default constructor"i elle yazdiginizda
    //Java Object Class icindeki default constructor'i kullandirtmaz.
    public Car(){

    }

    //Custom Constructor
    public Car(String make, String model, int year, int price) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.price = price;
    }

    public Car(String make) {
        this.make = make;
    }

    public Car(String make, int price) {
        this.make = make;
        this.price = price;
    }






}//class
