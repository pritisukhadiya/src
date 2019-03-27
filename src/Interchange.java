import java.util.Scanner;

public class Interchange {
    //java program to interchange the value
    public static void main(String[] args){
        int a, b, temp; //to interchange two numbers, make a variable say temp of the same type

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of  A and B : \n");
        System.out.println("A = ");
        a = scanner.nextInt();
        System.out.println("B = ");
        b = scanner.nextInt();

        temp = a;  //place the first number to the temp
        a = b;     //place the second number to the first
        b = temp;  //place temp to the second

        System.out.println("number interchange successfully..!!\n");
        System.out.println("A = " +a);
        System.out.println("B = " +b);
    }
}
