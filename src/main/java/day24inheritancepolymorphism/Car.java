package day24inheritancepolymorphism;

/*
    1) Inheritanceda object olustururken constructorlar yukaridan(parent) asagiya (child) dogru calisir.
    2) Parent ve super es anlamlidir. child ve sub es anlamlidir.
    3) super() her constructorun ilk satirinda gorunmez olarak bulunur
       isterseniz gorunuz olarak yazilabilir.
    4) super() sizi parent classtaki constructora tasir.
    5) this() sizi ayni class icindeki constructorlar arasinda gezdirir.
    6) "this" icinde bulundugunuz classtaki variableleri cagirmaya yarar
       "super" parent classdaki variableleri cagirmaya yarar.
    7) Eger data typelari arasinda "IS-A" ve "HAS-A" iliskisi varsa bu data typelarina "COVARIANT" denir.
 */
/*
    1) polymorphism ==> coklu sekil demektir.
       bir methodun farkli sekillerde karsimiza cikmasi demektir.
       polymorphism = overloading + overriding
    2) overriding parent classdaki methodu child classin ihtiyaclarina gore ozellestirerek kullanmak demektir.
    3) overridingde methodun bodysi degistirilir.
    4) overridingde method signaturea dokunulmaz. dokunursaniz java kizar.
 */
public class Car {
    public void move(){
        System.out.println("Cars move...");
    }

    public void getBreak(){
        System.out.println("Cars break...");
    }

    public void engine(){
        System.out.println("Cars have engine...");
    }

    public String model = "Car";
    public int price = 0;

    public Car(){
        System.out.println("Car constructor 1");
    }

    public Car(int i){
        this();
        System.out.println("Car constructor 2");
    }




}//class
