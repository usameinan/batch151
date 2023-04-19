package day18constructorsstatickeyword;

public class Student {
    /*
    1. static class memberlar (variabla + method + constructor + code blocks) tum objeler tarafindan paylasilir.
    2. static class memberlardaki degisiklikler tum objectler tarafindan otomatik olarak gorulur.
    3. static class memberlar GOKTEKİ AYİN DUNYAYA BAGLİ OLDUGU GBİ CLASSA baglidirlar
       bu yuzden static variablelere class variable de denir.
    4. static class memberlerin nasil calistigini anlamak icin cizim yapip olanlari classa olmayanlari objeye baglayarak
    dusunmek bu konuyu kolaylastirir.
    5. static class memberleri cagirmak icin object olusturmak gerekmez ve tavsiye edilmez
       non-static class memberleri cagirmak icin object olusturmak sarttır.
     */

    public static int numOfRegisteredStd = 0;
    public int num = 0;

    public Student() {
        numOfRegisteredStd++;
        num++;
    }

    public static void main(String[] args) {
        System.out.println(numOfRegisteredStd);

        Student s1 = new Student();
        System.out.println(numOfRegisteredStd);

        Student s2 = new Student();
        System.out.println(numOfRegisteredStd);

        Student s3 = new Student();
        System.out.println(numOfRegisteredStd);
        System.out.println(s1.num);


    }//main
}//class
