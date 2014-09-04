import java.util.Scanner;

public class SumTwoNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int firstInt = input.nextInt();
        int secondInt = input.nextInt();
        System.out.println("Result: " + (firstInt + secondInt));
    }
}
