import java.util.Scanner;

public class StudentResult {
    //WAP about calculating student's percentage and grade
    // for three subject

    //java main method
    public static void main(String[] args) {
        String name;
        int role_no;
        int english, maths, computer;
        float total, percentage;

        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter role no : ");
        role_no = scanner.nextInt();

        System.out.println("please enter student name : ");
        name = scanner.next();

        System.out.println("please enter 3 subject marks : ");
        english = scanner.nextInt();
        maths = scanner.nextInt();
        computer = scanner.nextInt();

        total = english + maths + computer;
        percentage = (total / 300) * 100;

        System.out.println("total Marks = " + total);
        System.out.println("percentage = " + total / 300 * 100);
        System.out.println("enter grade:");
        char grade;

        if (percentage >= 80) {
            grade = 'O';

        } else if (percentage >= 60 && percentage < 80) {
            grade = 'A';

        } else if (percentage >= 50 && percentage < 60) {
            grade = 'B';

        } else if (percentage >= 35 && percentage < 50) {
            grade = 'c';

        } else {
            grade = 'D';

        }

    }

}