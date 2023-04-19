package day09stringmanipulations;

public class C01_StringManipulations {
    public static void main(String[] args) {

        /*
        isEmpty() bos mu dolu mu diye bakar 
         */
        
        //bir stringin hic karakter icermedigini kontrol eden kodu yaziniz.
        
        String str = "";
        
        //1.yol
        boolean bosMu = str.length()==0;
        System.out.println("bosMu = " + bosMu);
        
        //2. yol
        boolean bosMu2 = str.isEmpty();
        System.out.println("bosMu2 = " + bosMu2);

        //ex stringin bosluk haric hicbir karakter icermedigini kontrol eden kodu yaziniz.

        String str2 = "  ";
        
        //1. yol
        
        boolean result = str2.replace(" ","").length()==0;
        System.out.println("result = " + result);
        
        //2. yol

        boolean result2 = str2.replace(" ","").isEmpty();
        System.out.println("result2 = " + result2);
        
        //ex "*" haric hicbir karakter icermedigini gosteren kodu yaziniz
        
        String str3 = "*";
        boolean result3 = str3.replace("*","").isEmpty();
        System.out.println("result3 = " + result3);

        /*
        isblank() kodu string bir datada space+hicli icin true dondurur.
        bos mu dolu mu oldugunu kontrol eder . boolean bir deger dondurur
        isemptyden farki bosluk space varsa bos mu dolu mu diye soruldugunda isblank bos der
        isempty dolu der
         */
        
        boolean result4 = str2.isBlank();
        System.out.println("result4 = " + result4);
        boolean result5 = str2.isEmpty();
        System.out.println("result5 = " + result5);

        /*
        indexOf() kodu verilen karakter veya karakterlerin ilk gorunumunun indexini verir.
        tekli karakter ve coklu karakter icin gecerlidir.
         */

        //ex bir stringde a i e karakterlerini indexleri toplamini yazdirin.

        String r = "Java is easy to learn";
        int aIdx = r.indexOf('a');
        System.out.println("aIdx = " + aIdx);
        int iIdx = r.indexOf('i');
        System.out.println("iIdx = " + iIdx);
        int eIdx = r.indexOf('e');
        System.out.println("eIdx = " + eIdx);
        System.out.println("total: = " + (aIdx+iIdx+eIdx));
        
        //ex: bir strinde java kelimesinin ilk olarak kacinci indexte kullanildigini gosteren kodu yaziniz.
        String u = "Ah Java vah Java sen ne guzel seysin Java";
        int javaIdx = u.indexOf("Java");
        System.out.println("javaIdx = " + javaIdx);
        int idxPhyton = u.indexOf("Phyton");
        System.out.println("idxPhyton = " + idxPhyton);
        
        /*
        lastIndexOf() karakterlerin son gorunumunu gosterir olmayan icin -1 dondurur. (int)
         */
        //ex: bir stringde a i e karakterlerini indexleri toplamini yazdirin.
        int aLdx = r.lastIndexOf('a');
        System.out.println("aLdx = " + aLdx);
        int iLdx = r.lastIndexOf('i');
        System.out.println("iLdx = " + iLdx);
        int eLdx = r.lastIndexOf('e');
        System.out.println("eLdx = " + eLdx);
        System.out.println("Toplam: = "+ (aLdx+iLdx+eLdx));

        //interwiew:
        

    }//main
}//class
