package day21datetime;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class DateTime01 {
    public static void main(String[] args) {

        //anlik zamani nasil aliriz?
        LocalTime myCurrentTime = LocalTime.now();
        System.out.println(myCurrentTime);

        //anlik zamanda bilesenler nasil alinir?
        int hour = myCurrentTime.getHour();
        System.out.println(hour);

        int minute = myCurrentTime.getMinute();
        System.out.println(minute);

        int second = myCurrentTime.getSecond();
        System.out.println(second);

        int nano = myCurrentTime.getNano();
        System.out.println(nano);

        //gelecek ve gecmis zamana nasil gidilir?
        LocalTime next = myCurrentTime.plusMinutes(23).minusSeconds(11);
        System.out.println(next);

        //zaman formati nasil degistirilir?
        //"HH" 24luk saat sistemini "hh" 12lik saat sistemnini kullanir
        //"hh:mm a" ifadesindeki a 12lik saat sisteminde "AM" "PM" yazilmasini saglar
        //"ss" saniyeyi gosterir
        //"mm" minute "MM" month demektir.
        DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("hh:mm a");
        String formattedMyCurrentTime = dtf1.format(myCurrentTime);
        System.out.println(formattedMyCurrentTime);

        //Date formati nasil degistirilir?
        LocalDate myCurrentDate = LocalDate.of(2022,8,25);
        System.out.println(myCurrentDate);//2022-08-25

        //Tarihi Ay/gun/Yıl sekline ceviriniz.
        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        String formattedMyCurrentDate1 = dtf2.format(myCurrentDate);
        System.out.println(formattedMyCurrentDate1);

        //Tarihi Gun/Ay isminin ilk 3 harfi/Yil sekline ceviriniz.
        DateTimeFormatter dtf3 = DateTimeFormatter.ofPattern("dd/MMM/yy");
        String formattedMyCurrentDate2 = dtf3.format(myCurrentDate);
        System.out.println(formattedMyCurrentDate2);

        //Tarihi Gun/Ay ismi/Yil sekline ceviriniz.
        DateTimeFormatter dtf4 = DateTimeFormatter.ofPattern("dd/MMMM/yyyy");
        String formattedMyCurrentDate3 = dtf4.format(myCurrentDate);
        System.out.println(formattedMyCurrentDate3);

        //Baska bir zaman dilimindeki tarih ve zamani nasil aliriz?
        //Tokyoda ayin kaci?
        LocalDate dateInTokyo = LocalDate.now(ZoneId.of("Asia/Tokyo"));
        System.out.println(dateInTokyo);

        LocalDate dateInTaskent = LocalDate.now(ZoneId.of("Asia/Tashkent"));
        System.out.println(dateInTaskent);

        //tokyoda saat kac?
        LocalTime timeInTokto = LocalTime.now(ZoneId.of("Asia/Tokyo"));
        System.out.println(timeInTokto);









    }//main
}//class
