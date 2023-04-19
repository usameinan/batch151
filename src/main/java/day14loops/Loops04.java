package day14loops;

import com.sun.source.tree.WhileLoopTree;

import java.util.Scanner;

public class Loops04 {
    public static void main(String[] args) {
        //kullanici user name ve passwordu girsin
        //3 kereden fazla yanlıs girerse "Your account was bloked." mesaji alsin
        //3 kereye kadar yanlıs "Invalid username or password. try again" mesaji alsın
        //dogru girerse Wellcome to your account mesajı alsin

        Scanner input = new Scanner(System.in);
        int counter = 0;
        String validUserName = "techpro123";
        String validPassWord = "Education12?";

        do{
            if (counter==3){
                System.out.println("Your acoount was bloked");
                break;
            }
            System.out.println("Please enter your username.");
            String userName = input.next();

            System.out.println("Enter your password.");
            String passWord = input.next();
            counter++;
            if (userName.equals(validUserName)&&passWord.equals(validPassWord)){
                System.out.println("Welcome to your account");
                break;
            }else {
                System.out.println("Invalid username or password.");
                System.out.println((3-counter)+"right left");
            }

        }while (true);






    }//main
}//class
