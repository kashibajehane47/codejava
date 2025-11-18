package MINIPROJECT2;

import java.util.*;
        import java.util.concurrent.*;

public class LogAnalyzer {

    private final ExecutorService executor;
    private final ConcurrentHashMap<String, Integer> globalCount;

    public LogAnalyzer(int threadCount) {
        executor = Executors.newFixedThreadPool(threadCount);
        globalCount = new ConcurrentHashMap<>();
    }

    public void analyzeLogs(List<List<String>> allLogs) throws InterruptedException, ExecutionException {
        long start = System.currentTimeMillis();

        List<Future<Map<String, Integer>>> results = new ArrayList<>();

        // Submit each log file for analysis
        for (List<String> log : allLogs) {
            results.add(executor.submit(new LogTask(log)));
        }

        // Collect results from all threads
        for (Future<Map<String, Integer>> f : results) {
            Map<String, Integer> result = f.get(); // wait for thread to finish
            result.forEach((k, v) -> globalCount.merge(k, v, Integer::sum));
        }

        long end = System.currentTimeMillis();
        System.out.println("\nTotal Execution Time: " + (end - start) + " ms");
        System.out.println("Aggregated Keyword Counts: " + globalCount);

        executor.shutdown();
    }

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        // Sample fake log files
        List<String> log1 = Arrays.asList(
                "ERROR Failed to connect",
                "INFO Server started",
                "WARN Disk space low",
                "INFO User logged in",
                "ERROR Timeout occurred"
        );

        List<String> log2 = Arrays.asList(
                "INFO Backup completed",
                "ERROR Cannot read file",
                "WARN Memory low"
        );

        List<List<String>> allLogs = Arrays.asList(log1, log2);

        LogAnalyzer analyzer = new LogAnalyzer(2); // 2 threads
        analyzer.analyzeLogs(allLogs);
    }
}
