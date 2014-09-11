import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Integer[] crd = new Integer[6];
        for (int i = 0; i < 6; i++) {
            crd[i] = input.nextInt();
        }
        // 0,1 = Ax,Ay 2,3 = Bx,By 4,5 = Cx,Cy
        double area = Math.abs((crd[0]*(crd[3]-crd[5]) + crd[2]*(crd[5]-crd[1]) + crd[4]*(crd[1]-crd[3])) / 2.0);
        System.out.println(area);
    }
}
