public class FormattingNumbers {
    public static String padRight(String s, int n) {
        return String.format("%1$-" + n + "s", s);
    }

    public static String padLeft(String s, int n) {
        return String.format("%1$" + n + "s", s);
    }
    static String formatNums(int a, double b, double c) {
        String hex = Integer.toHexString(a);
        String bin = String.format("%010d", Integer.parseInt(Integer.toBinaryString(a)));
        String twoDigits = String.format("%.2f", b);
        String threeDigits = String.format("%.3f", c);
        String result = "|" + padRight(hex, 10) + "|" + bin + "|" +
                        padLeft(twoDigits, 10) + "|" + padRight(threeDigits, 10) + "|";
        return result;
    }
    public static void main(String[] args) {
        System.out.println(formatNums(254, 11.6, 0.5));
        System.out.println(formatNums(499, -0.5559, 10000));
        System.out.println(formatNums(0, 3, -0.1234));
        System.out.println(formatNums(444, -7.5, 7.5));
    }
}