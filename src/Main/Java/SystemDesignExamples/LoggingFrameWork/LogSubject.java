package Main.Java.SystemDesignExamples.LoggingFrameWork;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LogSubject {
    Map<Integer, List<LogObserver>> logObservers = new HashMap<>();
    void AddObserver(int level, LogObserver logObserver) {
        List<LogObserver> logObserverList = logObservers.getOrDefault(level, new ArrayList<>());
        logObserverList.add(logObserver);
        logObservers.put(level, logObserverList);
    }

    void NotifyAllObserver(int level, String msg) {
        for (Map.Entry<Integer, List<LogObserver>> entry : logObservers.entrySet()) {
             if (entry.getKey() == level) {
                 entry.getValue().forEach(observers -> observers.log(msg));
             }
        }
    }
}
