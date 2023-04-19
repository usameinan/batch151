package day25polymorphism;

public class Animal {
     /*
        1) Parentteki method ile childda override edilen methodun access modifieri ayni olabilir.
        2) Childda override edilen methodun access modifieri parenttaki methodun access modifierinden dar olamaz.
        3) Parentteki methodun access modifieri childda override edilen methodun access modifierinden dar olabilir.
        4) Methodun return typei primitive ise overriding yapildiginda return type degistirilemez.
        5) Methodun return typei void ise overriding yapildiginda return type degistirilemez.
        6) <childda override edilen methodun return typei ile parenttaki methodun return typei arasinda "IS-A" iliskisi
        varsa return type degistirilebilir. aksi takdirde degistirilemez.
        mesela; Integer Wrapper Class ile Long Wrapper Class arasinda "IS-A" iliskisi yoktur. o yuzden return
        type Integer oldugunda Longa degistirilemez.
        7) return type wrapper class oldugunda overriding yaparken "return type" degistirilemez.
        8) "final method"lar override edilemezler.
           "final method"larin bodysi degistirilemez ama override ederken method bodysini degistirebiliriz. bu bir celiskidir.
           Bu yuzden java "final method"larin override edilmesine musade etmez.
        9) "static method"lar override edilemezler. cunku "static method"lar tum childlar icin ortak methodlardir.
           Bir child ortak methodu degistirdiginde diger childlar bundan etkilenir. bu etkilenme ummadik sonuclar
           ortaya cikarabilir. bu yuzden java "static method"larin override edilmesine musade etmez.
        10) "private method"lar override edilemez.
     */

    public void move(){
        System.out.println("Animals move...");
    }

    public int add(int a, int b){
        return a+b;
    }

    public Animal create(){
        return new Animal();
    }

    public Integer multiply(Integer a, Integer b){
        return a+b;
    }




}//class
