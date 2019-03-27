import java.util.Scanner;

public class LeapYear {
    //WAP to find out it's a leap year or not

    //java main method

    public static void main(String[] args){
        System.out.println("Enter an int year to check its leap year or not");
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();

        if(year % 4 == 0)
        System.out.println("its a leap year");
        else
        System.out.println("its not a leap year");
    }
}
