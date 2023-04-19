package day22stringbuilder;

public class Student {

    //stdName "public" oldugu icin diger classlardan ulasilabilir.
    public String stdName = "Ali Can";

    //access modifieri default olan ile public olan class memberlar ayni package icinde kullanildiklarinda
    //ayni özellikleri gosterirler
    //fakat farklı package e gectiginizde public olanlara ulasilabilir, default olanlara ulasilamaz.
    int age = 23;

    //access modifieri "private" olan class memberlar olsuturduklari class icinden gorulebilirler
    //olusturulduklari classin disina ciktiginizda gorulmez ulasilmaz olurlar.
    private String healthCondition = "Cancer";

    //access modifieri "protected" olan class memberlar ayni package icinde iken "public" gibi davranirlar.
    //farkli packagee gectiginizde "protected" olanlar sadece child classlardan gorulebilir.
    protected int salary = 3000;

    //note: classlar public ve default olabilir ama private ve protected olamaz







}//class
