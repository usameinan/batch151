package day18constructorsstatickeyword;

import java.time.LocalDate;

/*
1. static blocklar static variablelara ilk degerlerini atamak(initialiize) icin kullanilir.
2. static bir variable deger atamak icin kod yazmaniz gerekirse static block kullaniniz
3. static bir variablea deger atamak icin yazilmasi gereken kod main method icine de yazilabilir ama static block icine
yazilan kod main method icine yazilandan once calistirilir.
4. bir classda birden fazla static block varsa ustteki once calistirilir
 */
public class StaticNonStaticBlocks01 {

    //static variableler static block kullanilmadan da initialize edilebilirler
    public static double pi = 3.14;

    //asagidaki gibi static bir variable deger atamak icin kod yazmaniz gerekirse static block kullaniniz
    public static double price;
    static{
        System.out.println("Hey i am a static block 1");
        LocalDate d = LocalDate.now();
        if (d.getMonthValue()==3) {
            price = 1000;
        }else{
            price = 1200;
        }
    }

    public static void main(String[] args) {
        System.out.println("Hey i am a main method.");
        LocalDate d = LocalDate.now();
        if (d.getMonthValue()==3) {
            price = 1000;
        }else{
            price = 1200;
        }
    }

    static{
        System.out.println("Hey i am a static block 2");
    }


}//class
