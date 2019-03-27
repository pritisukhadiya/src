import java.util.Scanner;

public class OddOrEven {
    //WAP to find out odd or even number

    //main method
    public static void main(String[] args){


        System.out.println("Enter an integer to check if it's odd or even");
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();

        if (x % 2 == 0)
            System.out.println("the number is even");
        else
            System.out.println("the number is odd");


    }
}
