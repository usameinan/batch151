package day23inheritance;

public class Animal {

    /*
    1) eat() methodu gibi bir cok classin kullanmasi gereken methodlari her classa ayri ayri
    yazarsak;
      i) Tekrar yapmis oluruz, tekrar ideal codeda olmamalidir
      ii) Ayni methodu tekrar tekrar yazmak zaman kaybidir.
      iii) Tekrar tekrar yazilan methodun tamiri cok zaman alir.
      iV) Tekrar tekrar yazilan methodun gelistirilmesi cok zaman alir
      v) Methodu tekrar tekrar yazmak "atomic yapi"ya terstir.
    2) Private class memberlar child classlar tarafindan kullanilamaz.
       Default class memberlar ayni packagede child classlar tarafindan kullanilabilirler.
       protected class memberlar farkli ppackagede de olsalar child classlar tarafindan kullanilabilir.
    3) Javada bir Classin sadece bir tane parenti olabilir.
       Coklu parenta "Multiple Inheritance" derler, tekli parenta "Single Inheritance" derler.
       Java "Multiple Inheritance"i desteklemez, java "Single Inheritance" kullanir.
    4) Apartman seklindeki inheritance yapisina "Multilevel Inheritance" denir.
       Java "Multilevel Inheritance"i destekler.
     */

    protected void eat(){
        System.out.println("Animals eat...");
    }
    public void drink(){
        System.out.println("Animals drink...");
    }


}//class
