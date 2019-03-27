import java.util.Scanner;

public class VowelOrConsonant {
    //WAP to print vowel or consonant

    public static void main(String[] args){

        System.out.println("Enter charecter : ");

        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);

        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == ' '){
            System.out.println("Vowel");

        }else {
            System.out.println("Consonant");
        }
    }
}
