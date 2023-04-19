package practices;

public class Q04_Hiponus {

    public static void main(String[] args) {

        System.out.println(hipotenusHesaplama(3, 4)*3);
    }
    public static double hipotenusHesaplama(double dikKenar1, double dikKenar2){

       double hipotenus = Math.sqrt(dikKenar1*dikKenar1+dikKenar2*dikKenar2);
       return hipotenus;

    }
}
