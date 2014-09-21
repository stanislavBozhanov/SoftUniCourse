import java.util.Scanner;

public class StuckNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = Integer.parseInt(input.nextLine());
        String line = input.nextLine();
        String[] numbers = line.split(" ");
        boolean isFound = false;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    for (int l = 0; l < n; l++) {
                        if (i != j && i != k && i != l && j != k && j != l && k != l) {
                            if ((numbers[i] + numbers[j]).equals(numbers[k]+ numbers[l]))  {
                                System.out.printf("%s|%s==%s|%s", numbers[i], numbers[j], numbers[k], numbers[l]);
                                System.out.println();
                                isFound = true;
                            }
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
