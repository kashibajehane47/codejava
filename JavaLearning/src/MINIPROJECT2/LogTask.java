package MINIPROJECT2;

import java.util.*;
import java.util.concurrent.Callable;

public class LogTask implements Callable<Map<String, Integer>> {
    private final List<String> logLines;  // content of a log file

    public LogTask(List<String> logLines) {
        this.logLines = logLines;
    }

    @Override
    public Map<String, Integer> call() {
        Map<String, Integer> keywordCount = new HashMap<>();

        for (String line : logLines) {
            line = line.toLowerCase(); // case-insensitive

            if (line.contains("error")) {
                keywordCount.merge("error", 1, Integer::sum);
            }
            if (line.contains("warning")) {
                keywordCount.merge("warning", 1, Integer::sum);
            }
            if (line.contains("failed")) {
                keywordCount.merge("failed", 1, Integer::sum);
            }
        }

        // Print which thread processed this "file"
        System.out.println(Thread.currentThread().getName() + " analyzed a log file ✅");

        return keywordCount;
    }
}
