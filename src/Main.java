import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        promptString();
        promptInt();
        promptDouble();
    }
    static void promptString(){
        System.out.println("Enter a String:");
        String userInput = input.nextLine();
        try {
            Double.parseDouble(userInput);
            System.out.println("This is not a String");
        } catch (NumberFormatException e) {
            System.out.println(userInput);
        }
    }
    static void promptInt(){
        System.out.println("Enter a Int:");
        try {
            int userInputInt = input.nextInt();
            System.out.println(userInputInt);
        } catch (InputMismatchException e) {
            System.out.println("That is not an Integer");
        }
        input.nextLine();
    }
    static void promptDouble(){
        System.out.println("Enter a Double:");
        try {
            input.nextDouble();
            double userInput = input.nextDouble();
            System.out.println(userInput);
        } catch (InputMismatchException e) {
            System.out.println("That is not a Double");
        }
    }

}