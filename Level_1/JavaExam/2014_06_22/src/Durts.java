import java.util.Scanner;

class FunctionsDurts {
    static Integer[] calcCoordinates(int crossX, int crossY, int radius) {
        Integer[] result = new Integer[8];
        result[0] = crossX - radius;
        result[1] = crossY - radius / 2;
        result[2] = crossX + radius;
        result[3] = crossY + radius / 2;
        result[4] = crossX - radius / 2;
        result[5] = crossY - radius;
        result[6] = crossX + radius / 2;
        result[7] = crossY + radius;
        return  result;
    }

    static boolean isInside(int Dx, int Dy, Integer[] arrayCross) {
        if (Dx >= arrayCross[0] && Dx <= arrayCross[2] && Dy >= arrayCross[1] && Dy <= arrayCross[3]) {
            return true;
        }
        else if (Dx >= arrayCross[4] && Dx <= arrayCross[6] && Dy >= arrayCross[5] && Dy <= arrayCross[7]){
            return true;
        }
        else {
            return false;
        }
    }
}

public class Durts {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String crossCnt = input.nextLine();
        int crossX = Integer.parseInt(crossCnt.split(" ")[0]);
        int crossY = Integer.parseInt(crossCnt.split(" ")[1]);
        int radius = Integer.parseInt(input.nextLine());
        int n = Integer.parseInt(input.nextLine());
        Integer[] crossArray = FunctionsDurts.calcCoordinates(crossX, crossY, radius);
        String shots = input.nextLine();
        String[] shotsSplit = shots.split("  ");
        for (int i = 0; i < n; i++) {
            int dX = Integer.parseInt(shotsSplit[i].split(" ")[0]);
            int dY = Integer.parseInt(shotsSplit[i].split(" ")[1]);
            boolean answer = FunctionsDurts.isInside(dX, dY, crossArray);
            if (answer){
                System.out.println("yes");
            }
            else {
                System.out.println("no");
            }
        }
    }
}
