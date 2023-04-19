package day35exceptions;

public class E03 {

    /*
        1)try block'dan sonra coklu catch block kullanilabilir.
          catch block'lar arasinda parent-child iliskisi yoksa catch block'lar istenildigi gibi siralanabilir.
          catch block'lar arasinda parent-child iliskisi varsa child ustte olmalidir
        2)"Exception Class"tum Exception'larin parent'idir.
           Coklu catch block kullanmak yerine sizden istenen fonksiyonu karsiladigi surece
           tek catch block'i "Exception Class" ile kullanabilirsiniz
        3)"try + 1 catch" olur - "try + cok catch" olur - "try"tek basina kullanilamaz
          "try" catch block olmadan kullanilabilir mi?
          "try + finally" olabilir.
     */
    public static void main(String[] args) {

        System.out.println(convertStringToInDivideByLength1("6"));

        System.out.println(convertStringToInDivideByLength2("6"));

        System.out.println(convertStringToInDivideByLength3("6"));

    }

    //ex1: Bir Stringi Integera ceviren ve bu Integeri Stringin lengthinin 1 eksigine bolen method olusturunuz.

    public static int convertStringToInDivideByLength1(String str){

        int result = 0;

        try {


            int a = Integer.valueOf(str);
            result = a / (str.length() - 1);
        }catch (NumberFormatException e){
            System.out.println("Non-digit character cannot be used in valueOf()");
        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }
        return result;
    }

    public static int convertStringToInDivideByLength2(String str){

        int result = 0;

        try {
            int a = Integer.valueOf(str);
            result = a / (str.length() - 1);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return result;
    }

    public static int convertStringToInDivideByLength3(String str) {

        int result = 0;

        try {
            int a = Integer.valueOf(str);
            result = a / (str.length() - 1);
        } catch (ArithmeticException e) {
            System.out.println("jump");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return result;
    }
}
