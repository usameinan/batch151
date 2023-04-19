package day03scanner;

public class Runner {

    public static void main(String[] args) {
        //object nasil olusturulur
        //Class ismi + object ismi + atama operatoru + "new" + Constructor
        Car myCar = new Car();
        System.out.println(myCar.fiyat);
        System.out.println("myCar.model = " + myCar.model);
        myCar.hareket();
        myCar.dur();

        Student tomHanks = new Student();
        System.out.println("tomHanks.name = " + tomHanks.name);
        System.out.println("tomHanks.address = " + tomHanks.address);
        System.out.println("tomHanks.grade = " + tomHanks.grade);
        tomHanks.feed();
        tomHanks.study();


    }
}
