package day27Interface;

public class CarRunner {
    public static void main(String[] args) {

        Engine.stop();//stop() methodu static oldugundan "interface" ismi ile ulastım.
        Honda h = new Honda();
        h.eco();//eco methodu static olmadigindan ebject ile ulastim.



    }//main
}//class
