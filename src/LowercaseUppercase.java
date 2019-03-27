import java.util.Scanner;

public class LowercaseUppercase {

    //WAP to convert a string to lowercase and uppercase

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a String");
        String userInputString = scanner.nextLine();

        //print uppercase string
        System.out.println("Uppercase string " + userInputString.toUpperCase());

        //print lower case string
        System.out.println("Lowercase string "
                 +userInputString.toLowerCase());
    }
}
