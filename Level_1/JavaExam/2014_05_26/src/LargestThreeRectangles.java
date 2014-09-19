import java.util.Scanner;

public class LargestThreeRectangles {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String line = input.nextLine();
        String lineOnlyNumbers = line.replaceAll("[^\\d]+", " ");
        String[] arrayOfSides = lineOnlyNumbers.split(" ");
        int recOne = 0, recTwo = 0, recThree = 0;
        Integer[] areas = new Integer[(arrayOfSides.length - 1) / 2];
        for (int i = 0; i <areas.length; i++) {
            areas[i] = Integer.parseInt(arrayOfSides[i * 2 + 1]) * Integer.parseInt(arrayOfSides[i * 2 + 2]);
        }
        if (areas.length == 3) {
            System.out.println(areas[0] + areas[1] + areas[2]);
        }
        else {
            int biggestTriple = 0;
            for (int i = 0; i <= areas.length - 3 ; i++) {
                int tempTriple = 0;
                tempTriple = areas[i] + areas[i+1] + areas[i+2];
                if (tempTriple > biggestTriple) {
                    biggestTriple = tempTriple;
                }
            }
            System.out.println(biggestTriple);
        }
    }
}
