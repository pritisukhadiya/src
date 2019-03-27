import java.util.Scanner;

public class EmployeeId {
    //WAP to input employee details

    public static void main(String[] args){
        int emp_id;
        String emp_name;
        float basic_salary,HRA ,DA,TA,PF,Gross;

        Scanner scanner = new Scanner(System.in);
        emp_id = scanner.nextInt();
        System.out.println("Input employee id : ");

        emp_name = scanner.next();
        System.out.println("Input employee name: ");

        basic_salary = scanner.nextFloat();
        System.out.println("Input employee basic salary");
        HRA = (basic_salary*10)/100;
         DA = (basic_salary*8)/100;
        TA = (basic_salary*9)/100;
       PF = (basic_salary*20)/100;
       Gross = (basic_salary + HRA + TA + DA - PF);

        System.out.println("HRA 10% of basic salary:" +HRA);
        System.out.println("DA 8% of basic salary:" +DA);
        System.out.println("TA 9% of basic salary:" +TA);
        System.out.println("PF 20% of basic salary:" +PF);
        System.out.println("Gross basic salary + HRA + DA + TA - PF :" + Gross);


    }
}

