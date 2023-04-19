package day21datetime;

public class Varargs01 {
    public static void main(String[] args) {

        System.out.println(add(5, 2, 4, 3));
        System.out.println(add(5, 2));
        getInitials("Ali Can", "Kemal Han", "Tuncay Cinar", "İbrahim Catal");

    }//main
    //ex1: toplama islemi yapan bir method olustur.
    public int add(int a, int b){
        return a+b;
    }

    public int add(int a, int b, int c){
        return a+b+c;
    }

    //Java farkli sayidaki parametrelerin hepsini kabul eden bir yapi olusturdu.
    //bu yapıya "Varargs" denir.
    //varrargs arkada array yapisini kullanir

    /*
    1) Bir method parantezinde birden fazla varargs kullanilamaz.
    2) bir method parantezinde birden fazla parametre kullanilacaksa varargs en sonra olmalidir.
     */
    public static int add(int... a){

        int sum = 0;
        for (int w : a){
            sum = sum + w;
        }
        return sum;
    }

    //ex2: verilen isimlerin ilk harflerini consolea yazdiran methodu olusturunuz.
    public static void getInitials(String... s){
        String initials = "";
        for (String w : s){

            initials = initials + w.charAt(0) + w.split(" ")[1].charAt(0);
            System.out.println(initials);
            initials = "";


        }
    }



}//class
