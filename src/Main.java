import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Enter a Int:");
        try {
            int userInputInt = input.nextInt();
            System.out.println(userInputInt);
        } catch (InputMismatchException e) {
            System.out.println("That is not an Integer");
        }
        System.out.println("Enter a Double:");
        try {
            input.nextDouble();
            double userInput = input.nextDouble();
            System.out.println(userInput);
        } catch (InputMismatchException e) {
            System.out.println("That is not a Double");
        }
    }
    static void detectString(){

    }
}