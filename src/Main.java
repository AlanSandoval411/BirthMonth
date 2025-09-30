import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter your birthdate month (1-12)");
        int month = input.nextInt();

        if ( month <= 1 || month <= 12) {
            System.out.println("Your birthdate month is: " + month);}
        else {System.out.printf("you entered a invalaid number: " + month);}
            input.close();
    }
}