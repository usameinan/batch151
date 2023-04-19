package day28interface;

/*
        child       parent
    1) Class ==> Class : extends
       interface ==> interface : extends
       Class ==> interface : implements
       interface ==> Class : olamaz
       Ayni ise "extends" farkli ise "implements" kullan
       interfacei classin childi yapma
 */
/*
    abstract class ile interface arasindaki farklar:
    1) Abstract Class'lar hem "abstract" hem de "concrete" methodlar icerebilir fakat interfaceler sadece "abstract" method icerir.
       Ama interface'lerde istersek "default" ve "static" keywordlerini kullanarak "concrete" method uretebiliriz.
    2) Abstract Class'lar multiple inheritancei desteklemez ama interfaceler destekler
    3) Abstract Class2lar icinde her turlu variable olusturulabilir. interfaceler icindeki variablelara public, static, ve final olmak zorundadir.
    4) "interface" classin childi olamaz ama "abstract class" classin childi olabilir.
    5) abstract classlarda constructor vardir ama object uretemez. interfacelerde constructor yoktur bu yuzden object uretilemez.
 */

public interface Mammal extends Animal{

    String feedBaby = "Milk";
    int age = 6;


}//int
