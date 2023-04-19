package day27Interface;

/*
    1) "interface" icine "concrete method" konulamaz.
    2)"interface" icindeki methodlarin abstract oldugunu java bilir
    bu yuzden interface icindeki abstract methodlarda "abstract" keyword kullanmaya gerek yoktur.
    3) "interface" icindeki abstract methodlarin tamami publictir.
    bu yüzden "interface" icinde abstract method olustururken "access modifier" yazmaya gerek yoktur.
    4) bir "interface"i bir "class"in parenti yapmak istedigimizde "extends" keyword yerine "implements" keyword
    kullaniriz.
    5) "Concrete Child Class"lar parent interfacedeki abstract methodlari override etmek zorundadirlar.
    6) "interface"ler bir aplicationda concrete child classlarin yapmak zorunda olduklari fonksiyonlari barindirirlar.
    bu yuzden "interface"lere "to-do list"de denir.
    7) birden fazla "parent interface" icinde ayni isimli abstract methodlar olusturabilirsiniz.
    abstract methodlarin bodysi olmadigi icin child classlar ayni isimli methodlardan herhangi birini override ederek
    kullanabilirler.
    8) birden fazla "parent interface" icinde ayni isimli abstract methodlar olusturdugunuzda bu methodlarin
    "return type"lari ayni olmak zorundadir.
    9) normalde "interface" icine concrete method konulamaz ama bazi ozel durumlarda "concrete method" koymamiz
    gerekirse;
        i) "default" keywordunu asagidaki gibi kullanarak interface icine concrete method koyabiliriz.
        ii) ii) "static" keyword unu asagidaki gibi kullanarak "interface" icine "concrete method"
            koyabiliriz.
    10) "default" veya "static" keywordunu kullanarak olusturdugunuz "concrete method"larin "concrete child class"
    tarafindan kullanilma zorunlulugu yoktur.
    11) "default" keywordunu kullanarak olusturdugunuz "concrete method"lara "object" olusturarak ulasilabilir.
        "static" keywordunu kullanarak olusturdugunuz "concrete method"lara ulasmak icin "object" olusturmaya gerek
        yoktur. "interface" ismi yeterlidir.
    12) "interface"lerden object olusturulamaz. "interface"lerin "constructor"u yoktur.
 */

public interface Engine {

    void start();
    void payment();

    default void eco(){
        System.out.println("Uses gas less...");
    }
    static void stop(){
        System.out.println("Stops securely...");
    }


}//interface
