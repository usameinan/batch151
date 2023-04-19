package day18constructorsstatickeyword;

import java.util.Arrays;

public class StudentRunner {
    public static void main(String[] args) {

        //static olan numOfregisteredStd variablesini cagirmak icin sadece class ismini kullandik object olusturmadik.
        System.out.println(Student.numOfRegisteredStd);
        //static olmayan num variablesini cagirmak icin object olsuturduk
        Student s1 = new Student();
        System.out.println(s1.num);

        //static olan variableye object uzerinden de ulasabilirsiniz ama bu hatadir
        System.out.println(s1.numOfRegisteredStd);





    }//main
}//class
