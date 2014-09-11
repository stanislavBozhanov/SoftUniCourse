class PointInsideFigureFunctions {
    // takes coordinates of bottom left corner, width and height and coords of point
    static boolean isInRectangle(double rX, double rY, double width, double height, double pointX, double pointY) {
        return (pointX > rX && pointX < (rX + width) && pointY > rY && pointY < (rY + height));
    }
}
public class PointInsideFigure {
    public static void main(String[] args) {

    }
}
