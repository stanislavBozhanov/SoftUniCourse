import java.util.Arrays;

public class SmallestNumber {
    static double smallestNumber(double a, double b, double c) {
        double[] number = new double[] {a, b, c};
        Arrays.sort(number);
        return number[0];
    }
    public static void main(String[] args) {
        System.out.println(smallestNumber(5,2,2));
        System.out.println(smallestNumber(2,2,1));
        System.out.println(smallestNumber(22,4,13));
        System.out.println(smallestNumber(0,-2.5,-5));
        System.out.println(smallestNumber(-1.1,-0.5,-0.1));
    }
}
