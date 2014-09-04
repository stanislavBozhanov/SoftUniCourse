import java.util.Arrays;
import java.util.Scanner;

public class SortArrayOfStrings {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numberOfStrings = Integer.parseInt(input.nextLine());
        String[] myArray = new String[numberOfStrings];
        for (int i = 0; i < myArray.length; i++ ) {
            myArray[i] = input.nextLine();
        }
        Arrays.sort(myArray);
        System.out.println("Sorted: ");
        for (int i = 0; i < myArray.length; i++) {
            System.out.println(myArray[i]);
        }
    }
}
