import java.util.Scanner;

public class PythagoreanNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = Integer.parseInt(input.nextLine());
        Integer[] numbers = new Integer[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = Integer.parseInt(input.nextLine());
        }
        boolean isFound = false;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    if (numbers[i] <= numbers[j]) {
                        if (numbers[i] * numbers[i] + numbers[j] * numbers[j] == numbers[k] * numbers[k]) {
                            System.out.printf("%1$d*%1$d + %2$d*%2$d = %3$d*%3$d", numbers[i], numbers[j], numbers[k]);
                            System.out.println();
                            isFound = true;
                        }
                    }
                }
            }
        }
        if (!isFound) {
            System.out.println("No");
        }
    }
}
