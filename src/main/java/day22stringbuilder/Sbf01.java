package day22stringbuilder;

public class Sbf01 {

    /*
    1) StringBuffer Javada String ureten bir classdir.
    2) StringBuffer StringBuildere cok benzer ikisi de mutable String uretir.
    3) StringBuffer "multi-thread"dir ama StringBuilder "multi-thread" degildir.
    4) Java StringBufferi StringBuilderdan once olusturdu.
    5) StringBuilder "multi-thread" olmadigi icin StringBufferdan daha hizli calisir.
    6) Multi-thread yapilirken yapilan islerin siralamasi onem arzeder.
       yapilan isleri mantikli bir siraya koymak "synchronization" olarak adlandirilir.
       StrinBuffer multi-thread oldugu icin ayni zamanda "synchronized"dir.

    3 tane String olusturan class ogrendik;
    1)immutable string lazimsa; String Class
    2)mutable string lazimsa StringBuilder veya StringBuffer
                             i)  StringBuilderi multi-thread gerekmezse kullaniriz.
                             ii) StringBufferi multi-thread gerekirse kullaniriz.
     */
    public static void main(String[] args) {

        StringBuffer sbf1 = new StringBuffer("Java");

    }//main
}//class
