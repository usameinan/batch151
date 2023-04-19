package day13loops;

public class Loops01 {
    public static void main(String[] args) {

        //21den 180e kadar hem 4 hem de 6 ile bolunebilen tam sayilari consolea yazdiran kodu yaziniz

        for (int i =21;i<181;i++){
            if (i%4==0 && i%6==0){
                System.out.print(i);
            }
        }
        System.out.println();
        //size verilen kucuk hafle yazilmis stringin indexi cift sayi olan karakterlerini buyuk harfe donustur
        //miami ==> MiAmI
        String s = "miami";
        for (int i =0;i<s.length();i++){
            String ch = s.substring(i,i+1);
            if (i%2==0){
                System.out.println(ch.toUpperCase());
            }else {
                System.out.println(ch);
            }
        }
        System.out.println();
        //verilen bir stringte ilk a harfinden onceki tum karakterleri conselea yazdiriniz
        //Hello Java ==> Hello J

        String t = "Hello Java";
        for (int i = 0; i<t.length();i++){
            char ch = t.charAt(i);
            if (ch=='a'){
                break;
            }else{
                System.out.print(ch);
            }
        }
        System.out.println();
        //verilen bir stringte son a dan sonraki tum karakterleri ters sırada yazdiriniz.
        //Tokatci
        String u = "Tokatci";
        for (int i =u.length()-1;i>=0;i--){
            char ch = u.charAt(i);
            if (ch=='a'){
                break;
            }else{
                System.out.print(ch);
            }
        }


    }//main
}//class
