package day43lambda;

import javax.swing.plaf.IconUIResource;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Lambda01 {
    public static void main(String[] args) {

        Course turkishDay = new Course("Turkish DayTime QA", 213, "Spring", 97);
        Course turkishNight = new Course("Turkish NightTime QA", 245, "Winter", 98);
        Course englishDay = new Course("English DayTime Dev", 121, "Spring", 91);
        Course englishNight = new Course("English NightTime Dev", 137, "Winter", 95);

        List<Course> courseList = new ArrayList<>();
        courseList.add(turkishDay);
        courseList.add(turkishNight);
        courseList.add(englishDay);
        courseList.add(englishNight);

        System.out.println(isAverageScoreGreaterThanANumber(courseList, 90));
        System.out.println(isAnyCourseNameContainsQa(courseList, "QA"));
        System.out.println(getCourseNameWhoseAvgMax(courseList));
        System.out.println(getCourseBetterThanLastTwo(courseList));
        System.out.println(getHighersThird(courseList));
        System.out.println(getCourseWhoseRegisteredStdLessThanNumber(courseList, 150));
    }

    //ex1: tum average scorelarin 90dan buyuk olup olmadigini kontrol eden methodu olusturunuz.
    public static boolean isAverageScoreGreaterThanANumber(List<Course> courseList, int avg){
        return courseList.
                stream().
                allMatch(t->t.getAverageScore()>avg);
    }

    //ex2: En az 1 kurs isminin QA icerip icermedigini kontrol eden methodu olusturunuz.
    public static boolean isAnyCourseNameContainsQa(List<Course> courseList, String word){
       return courseList.stream().anyMatch(t->t.getCourseName().contains(word));
    }

    //ex3: En yuksek average scorea sahip kurs ismini veren codeu yaziniz.
    public static String getCourseNameWhoseAvgMax(List<Course> courseList){
        return courseList.
                stream().
                sorted(Comparator.comparing(Course::getAverageScore).reversed()).
                findFirst().
                get().
                getCourseName();
    }

    //ex4: Average scoreu en dusuk olan ilk iki kurs disindaki tum kurslari return eden methodu olusturunuz.
    public static List<Course> getCourseBetterThanLastTwo(List<Course> courseList){
        return courseList.
                stream().
                sorted(Comparator.comparing(Course::getAverageScore)).
                skip(2).
                collect(Collectors.toList());
    }

    //ex5: Average scoreu ustten ucuncu olan kursu veren methodu olusturunuz.
    public static Course getHighersThird(List<Course> courseList){
        return courseList.
                stream().
                sorted(Comparator.comparing(Course::getAverageScore).reversed()).
                skip(2).
                limit(1).
                collect(Collectors.toList()).
                get(0);
    }

    //ex6: ogrenci sayisi 150den az olan kurslari return eden methodu olusturunuz.
    public static List<Course> getCourseWhoseRegisteredStdLessThanNumber(List<Course> courseList, int numOfStd){
        return courseList.
                stream().
                filter(t->t.getNumOfStudents()<numOfStd).
                collect(Collectors.toList());
    }



}//class
