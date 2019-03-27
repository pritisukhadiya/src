import java.util.Scanner;

public class NumAlphaSymb {
    //WAP to find out the character
   public static void main(String [] args){
       System.out.println("Check the character ");
       char input_char;
Scanner scanner = new Scanner(System.in);
input_char = scanner.next().charAt(0);
        //checking for alphabet
        if((input_char >= 65 && input_char <=90) ||(input_char >=97 && input_char <= 122)){
            System.out.println("Alphabet");
          //checking for digits
        }else if(input_char >= 48 && input_char <= 57){
            System.out.println("Number");
        }else {
            System.out.println("Symbol");
        }
    }
}
