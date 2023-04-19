package day20arraylistsdatetime;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.util.Scanner;

public class DateTime01 {
    public static void main(String[] args) {

        //icinde bulundugumuz zaman dilimindeki tarihi nasil aliriz?
        LocalDate myCurrentDate = LocalDate.now();
        System.out.println(myCurrentDate);

        //tarihten istedigimiz bileseni nasil aliriz?
        int monthValue = myCurrentDate.getMonthValue();
        System.out.println(monthValue);

        int yearValue = myCurrentDate.getYear();
        System.out.println(yearValue);

        int dayValue = myCurrentDate.getDayOfMonth();
        System.out.println(dayValue);

        //asagidaki month bir enumdir.
        //enum javada sabit degerleri (ay gun sehir isimleri) depolamak icin kullanilir.
        Month monthName = myCurrentDate.getMonth();
        System.out.println(monthName);

        DayOfWeek dayName = myCurrentDate.getDayOfWeek();
        System.out.println(dayName);

        //ilerideki bir tarihe nasıl gidilir?
        System.out.println(myCurrentDate.plusDays(5).plusMonths(2).plusYears(4));

        //geçmis tarihe nasil gidilir?
        System.out.println(myCurrentDate.minusYears(30).minusMonths(2).minusDays(18));

        //specific bir tarih objesi nasil olusturulur?
        LocalDate gokhanDob = LocalDate.of(1986, 6, 10);
        LocalDate fatihDob = LocalDate.of(1985,2,25);

        boolean r1 =gokhanDob.isAfter(fatihDob);
        System.out.println(r1);

        boolean r2 = fatihDob.isBefore(gokhanDob);
        System.out.println(r2);

        boolean r3 = gokhanDob.isEqual(fatihDob);
        System.out.println(r3);

        //ex 1 : kullanicidan aldiginiz tarih gecmise it ise "Gecersiz tarih girdiniz." mesaji veriniz.
        //       kullanicidan aldiginiz tarih gelecege it ise "Zamani girebilirsiniz." mesaji veriniz.

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter year, month and day numbers in order");
        int year = input.nextInt();
        int month = input.nextInt();
        int day = input.nextInt();

        LocalDate givenDate = LocalDate.of(year, month, day);

        if (givenDate.isBefore(LocalDate.now())){
            System.out.println(givenDate + "Invalid date");
        }else{
            System.out.println("Enter time for the ticket");
        }

        int lengthOfMonth = myCurrentDate.lengthOfMonth();
        System.out.println(lengthOfMonth);

        //ex2: Kullanicinin girdigi tarihin gun ismini bulan kodu yaziniz.
        System.out.println("Please enter year, month and day numbers in order");
        int y = input.nextInt();
        int m = input.nextInt();
        int d = input.nextInt();

        LocalDate date = LocalDate.of(y, m, d);

        System.out.println(date.getDayOfWeek());





    }//main
}//class
