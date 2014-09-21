import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class CognateWords {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String line = input.nextLine();
        String[] newLine = line.split("[^a-zA-Z]+");
        boolean isFound = false;
        Set<String> set = new HashSet<String>();
        for (int i = 0; i < newLine.length ; i++) {
            for (int j = 0; j < newLine.length  ; j++) {
                if (i != j) {
                    for (int k = 0; k < newLine.length; k++) {
                        if ((newLine[i] + newLine[j]).equals(newLine[k])) {
                            set.add(newLine[i] + "|" + newLine[j] + "=" + newLine[k]);
                            isFound = true;
                        }
                    }
                }
            }
        }
        for (String item : set) {
            System.out.println(item);
        }
        if (!isFound){
            System.out.println("No");
        }
    }
}