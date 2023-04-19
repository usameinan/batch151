package day13loops;

public class Loops02 {
    public static void main(String[] args) {

        //verilen bir stringte kucuk harfleri yazmayiniz.
        //"Pwd12?Ab"

        String s ="Pwd12?Ab";
        for (int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if (ch>='a'&&ch<='z'){
                continue;
            }else {
                System.out.print(ch);
            }
        }
        System.out.println();
        //bir stringi ters ceviren kodu yaziniz.
        //"Java" ==> avaJ

        //1.way
        String t = "Apex";
        String ters = "";
        for (int i =t.length()-1;i>=0;i--){
            ters = ters + t.substring(i,i+1);
        }
        System.out.println(ters);
        System.out.println();
        //2.way
        String u = "Apex";
        String ters2 = "";
        for (int i =t.length()-1;i>=0;i--){
            ters2 = ters2 + t.charAt(i);
        }
        System.out.println(ters2);
        System.out.println();

        //bir tam sayinin rakamlarinin toplamını veren kodu yaziniz
        //578
        int sum = 0;
        int n = -578;
        n=Math.abs(n);
        for (int i =n;i>0;i=i/10){
            sum = sum+i%10;
        }
        System.out.println(sum);



    }//main
}//class
