import java.util.Scanner;

public class EligibleToVote {
    //Wap to find out person is eligible to vote or not

    public static void main(String[] args){

        System.out.println("enter your age");

        Scanner scanner = new Scanner(System.in);
       int age = scanner.nextInt();

        if(age >= 18){
            System.out.println("Eligible for vote");
        }else{
            System.out.println("Not Eligible for vote");
        }




    }
}
