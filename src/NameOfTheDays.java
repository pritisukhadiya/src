import java.util.Scanner;

public class NameOfTheDays {
    //WAP to print name of the days

    public static void main(String[]args){


        Scanner scanner = new Scanner(System.in);
        int week;
        System.out.println("Input week number 1 to 7 : ");
        week = scanner.nextInt();

        if(week == 1){
            System.out.println("Monday");
        }else if (week == 2){
            System.out.println("Tuesday");
        }else if (week == 3){
            System.out.println("Wednesday");
        }else if (week == 4){
            System.out.println("Thursday");
        }else if (week == 5){
            System.out.println("Friday");
        }else if (week == 6){
            System.out.println("Saturday");
        }else if (week == 7){
            System.out.println("Sunday");
        }else {
            System.out.println("Please enter valid week no between 1-7");
        }




    }
}
