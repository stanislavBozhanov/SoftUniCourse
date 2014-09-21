import java.util.Scanner;

public class CountBeers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int stacks = 0;
        int beers = 0;
        while (true) {
            String line = input.nextLine();
            if (line.equals("End")) {
                break;
            }
            String[] tokens = line.split(" ");
            if (tokens[1].equals("beers")) {
                beers += Integer.parseInt(tokens[0]);
            } else {
                stacks += Integer.parseInt(tokens[0]);
            }

        }
        stacks += beers / 20;
        beers = beers % 20;
        System.out.printf("%s stacks + %s beers", stacks, beers );
    }
}