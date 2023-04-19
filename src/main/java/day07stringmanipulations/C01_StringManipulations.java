package day07stringmanipulations;

public class C01_StringManipulations {
    public static void main(String[] args) {
        String s = "Learn Java Earn Money";

        //ex : s stringinin money ile bitip bitmedigini kontrol ediniz.

        boolean isEnd =s.endsWith("Money");
        System.out.println("isEnd : = " + isEnd);

        String s2 = "Learn Money Java Earn";
        boolean iceriyorMu = s2.contains("Money");
        System.out.println("iceriyorMu := " + iceriyorMu);

        //ex : s stringindeki money kelimesini dollar kelimesi ile degistirin
        String s1 =s.replace("Money","Dollar");
        System.out.println("s1 := " + s1);

        //ex: s stringindeki earn kelimesini win ile degistirin

        String s3 = s.replace("Earn", "Win");
        System.out.println("s3 := " + s3);

        //ex: s stringindeki a harfini * ile degistiriniz

        String s4 = s.replace('a','*');
        System.out.println("s4 := " + s4);

        //ex: s stringindeki L harfini 3* ile degistiriniz.

        String s6 = s.replace("L","***");
        System.out.println("s6 := " + s6);

        //ex: s stringindeki e harflerini siliniz.

        String s7 = s.replace("e","");
        System.out.println("s7 := " + s7);

        //ex: earn kelimesini siliniz

        String s8 = s.replace("Earn","");
        System.out.println("s8 := " + s8);

        String t ="Dolma Kalem";

        //ex: t stringindeki "Kalem" yerine biber yaziniz.

        String t1 = t.replace("Kalem","Biber");
        System.out.println("t1 = " + t1);


    }//main
}//class
