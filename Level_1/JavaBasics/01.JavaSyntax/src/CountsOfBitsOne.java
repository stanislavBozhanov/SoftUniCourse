public class CountsOfBitsOne {
    public static int countBits(int a) {
        int result = 0;
        while (a > 0) {
            result += a & 1;
            a>>=1;
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println(countBits(5));
        System.out.println(countBits(0));
        System.out.println(countBits(15));
        System.out.println(countBits(5343));
    }
}
