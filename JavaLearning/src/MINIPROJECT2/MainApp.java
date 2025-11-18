package MINIPROJECT2;

import java.util.*;

public class MainApp {

    public static void main(String[] args) throws Exception {
        // Simulated log files (each list = one file)
        List<List<String>> allLogs = new ArrayList<>();
        allLogs.add(Arrays.asList("error at startup", "warning config", "task failed"));
        allLogs.add(Arrays.asList("error connection lost", "system failed", "warning ignored"));
        allLogs.add(Arrays.asList("no issue", "error recovered", "task success"));

        // Initialize analyzer with 3 threads
        LogAnalyzer analyzer = new LogAnalyzer(3);
        analyzer.analyzeLogs(allLogs);
    }
}
