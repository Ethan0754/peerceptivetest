import java.util.InputMismatchException;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Hello and welcome!\n");
        int age = 0;
        try {
            age = scan.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Please enter a number");
        }
        System.out.println("You are " + age + " years old");

    }
}

