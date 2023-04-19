package day04scannerwrapperoperators;

public class WrapperClass {
    public static void main(String[] args) {
        //wrapper class  : Character - Boolean - Byte - Short - Integer - Long - Float - Double
        int n = 12;
        Integer m = 12;

        byte p = 13;
        Byte r = 13;

        // ornek 1 : short data typeının minimum ve maksimum degerlerini kod yazarak bulunuz.
        short maxShort = Short.MAX_VALUE;
        System.out.println(maxShort);

        short minShort = Short.MIN_VALUE;
        System.out.println(minShort);

        // ornek2 : int data typeinin min degeri ile byte data typeinin max degerinin toplamini bulun.

        int minInteger = Integer.MIN_VALUE;
        byte maxByte = Byte.MAX_VALUE;
        System.out.println(minInteger + maxByte);

        //ornek3 : i)primitive inti wrapper Integera ceviriniz

        int num = 13;
        Integer wrapperNum = num;
        //ii) wrapper Bytei primitive bytea ceviriniz

        Byte k = 33;
        byte primitiveK = k;

        //ornek4 : i) primitive chari wrapper Charactere ceviriniz

        char initial = 'T';
        Character initialWrapper = initial;

        //ii) wrapper Booleani primitive booleana ceviriniz

        Boolean isOld = true;
        boolean isOldpr = isOld;



    }
}
