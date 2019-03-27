import java.util.Scanner;

public class PositiveNegative {
    //WAP to check the number is positive,negative or zero

    // java main method
    public static void main(String[] args){
        int n;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number you want to check is positive or negative or zero");
        n = s.nextInt();

        if(n > 0){
            System.out.println("Positive");
        }
        else if(n < 0){
            System.out.println("Negative");
        }
        else{
            System.out.println("Zero");
        }

    }
}
