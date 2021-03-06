import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.TreeSet;

public class LogsAggregator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();

        // Parse the input log files and aggregate them
        TreeMap<String, Integer> durations = new TreeMap<String, Integer>();
        HashMap<String, TreeSet<String>> ipAddresses = new HashMap<String, TreeSet<String>>();
        for (int i = 0; i < n; i++) {
            String logLine = scanner.nextLine();
            String[] logTokens = logLine.split(" ");
            String ip = logTokens[0];
            String user = logTokens[1];
            int duration = Integer.parseInt(logTokens[2]);

            // Aggregate the user's sessions durations
            Integer oldDuration = durations.get(user);
            if (oldDuration == null) {
                oldDuration = 0;
            }
            durations.put(user, oldDuration + duration);

            // Collect the IP addresses for the user
            TreeSet<String> ipSet = ipAddresses.get(user);
            if (ipSet == null) {
                ipSet = new TreeSet<String>();
            }
            ipSet.add(ip);
            ipAddresses.put(user, ipSet);
        }

        // Print the output in format <user>: <duration> [<IP1>, <IP2>, …]
        for (Entry<String, Integer> userAndDuration : durations.entrySet()) {
            String user = userAndDuration.getKey();
            int duration = userAndDuration.getValue();
            TreeSet<String> ipSet = ipAddresses.get(user);
            System.out.println(user + ": " + duration + " " + ipSet);
        }
    }

}
