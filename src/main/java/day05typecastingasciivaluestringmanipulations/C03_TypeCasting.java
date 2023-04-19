package day05typecastingasciivaluestringmanipulations;

public class C03_TypeCasting {
    public static void main(String[] args) {

        /*
        Numeric data typelarinin birbirine donusturulmesine type casting denir
        numeric data typlari byte<short<int<long<float<double

        kucuk data typlarinin buyuk data typelarina donusturulmesine auto widening (otomatik genisletme) denir
        buyuk data typlarinin kucuk data typelarina donusturulmesinde java sorumlulugu kabul etmez data kaybı
        olabilecegi icin codeu yazana birakir buna explicit narrowing (aciktan daraltma) denir
         */
        byte age = 13;
        int ageInt = age;//auto widening otomatik genisletme

        long population = 1234;
        short populationShort = (short) population;//explicit narrowing aciktan daraltma

        int boy =170;
        float boyFloat = boy;


    }//main
}//class
