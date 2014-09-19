import java.util.Scanner;

public class SymmetricNumbers {
    public static boolean isSymmetric(int num) {
        if (num / 10 == 0) return true;
        String numString = Integer.toString(num);
        String reverseNumString = new StringBuilder(numString).reverse().toString();
        if (numString.equals(reverseNumString))
            return true;
        return false;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int lowerMargin = input.nextInt();
        int upperMargin = input.nextInt();
        for (int i = lowerMargin; i <= upperMargin ; i++) {
            if (isSymmetric(i)) System.out.println(i);
        }
    }
}
