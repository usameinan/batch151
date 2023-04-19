package day25polymorphism;

public class Student {

    public String stdName = "Tom Hanks";
    public int age = 23;


    //Encapsulation nedir? data saklamaktir.(data hiding)
    //datayi nasil saklarsin? access modifierini private yaparak.

    private String stdId = "AC20203102T";
    private double gpa = 3.87;
    private boolean successful = false;

    //encapsulation yaptigimiz datayi istersek diger classlardan okuyabiliriz.
    //nasil okuruz? "get method" olusturarak encapsulate edilmiş datanin degerini okuyabiliriz.
    //i) get methodlari hep public olur
    //ii) get methodun return typei okudugu variablein return typei ile ayni olur.
    //iii) get method bir boolean variable icin olusturulduysa "is" ile baslar

    public String getStdId() {
        return stdId;
    }

    public double getGpa() {
        return gpa;
    }

    //encapsulation yapilan variiablenin data typei boolean ise get method ismi "is" ile baslar.
    public boolean isSuccessful() {
        return successful;
    }

    //encapsulation yaptigimiz datayi istersek diger classlardan nasil degistirebiliriz?
    //"set method" olusturarak encapsulate edilmis datanin degerini degistirebiliriz.
    //i) set methodlari hep public olur
    //ii) set methodun return typei hep void olur
    //iii) set method parametre kullanir parametrenin data typei variable ile ayni olur.
    //iv) set method kullanarak varolan object uzerinde degisiklikler yaparak o objecti sanki yeni bir objectmis gibi kullanabiliriz.
    //v) set methodlarin diger adi setter get methodlarin diger adi getterdir.

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public void setSuccessful(boolean successful) {
        this.successful = successful;
    }
}//class
