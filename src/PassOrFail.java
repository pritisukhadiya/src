import java.util.Scanner;

public class PassOrFail {
    //java program to see student pass or fail
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter percentage to see pass or fail ");
        int num = scanner.nextInt();

        if(num>=35){
            System.out.println("pass");

        }else {
            System.out.println("fail");
        }


        }


    }

