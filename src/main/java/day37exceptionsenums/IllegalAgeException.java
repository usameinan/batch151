package day37exceptionsenums;

public class IllegalAgeException extends RuntimeException{
    /*
        1)Eger Runtime Custom Exception uretmek isterseniz RuntimeException Classa extend etmelisiniz
     */
    public IllegalAgeException(){
        super();
    }

    public IllegalAgeException(String message){
        super(message);
    }
}//class
