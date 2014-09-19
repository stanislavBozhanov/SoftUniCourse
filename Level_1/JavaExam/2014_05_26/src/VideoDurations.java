import java.util.Scanner;

public class VideoDurations {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int hours = 0;
        int minutes = 0;
        while (true) {
            String line = input.nextLine();
            if (line.equals("End")) {
                break;
            }
            String[] tokens = line.split(":");
            hours += Integer.parseInt(tokens[0]);
            minutes += Integer.parseInt(tokens[1]);
            hours += minutes / 60;
            minutes %= 60;
        }
        System.out.printf("%s:%02d", hours, minutes);
    }
}
