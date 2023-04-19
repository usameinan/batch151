package day36exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class E01 {
    /*
        1) Run Buttonuna bastiktan sonra consoleda alinan exceptionlara "Runtime Exception" denir.
           Arithmetic exception, NullPointerException, NumberFormatException, ArrayIndexOutOfBoundsException,
           StringIndexOutOfBoundsException, "Runtime Exceptions"a ornektir.
           "Runtime Exception"lara "Unchecked Exception"da denir.

        2) Code yazarken kirmizi alt cizgi seklinde alinan exceptionlar da vardir. Bunlara "Compiletime Exception" denir.
           FileNotFoundExceptions, IOException "Compiletime Exception"a ornektir.
        3) FileNotFoundException: javada bir dosyayi bul dedigimizde java "dosyanin adresi" ve "dosyanin varligi" konusunda
           hata olursa ne yapmasi gerektigini soylemenizi ister.
        4) IOException: "IO" input output demektir.
                        Note: IOException, FileNotFoundExceptionin parentidir.
        4) Javada hatalar temelde 2ye ayrilir.
           i)Exception'lar ii)Error'lar a)StackOverflow Error b)Out Of Memory Error c)Virtual Machine Error
     */

    public static void main(String[] args) throws IOException {

        //1. way:
        FileInputStream fis = new FileInputStream("src/main/java/day36exceptions/TextFile");

        int i = 0;

        while ((i = fis.read())!=-1){
            System.out.print((char)i);
        }





    }//main
}//class
