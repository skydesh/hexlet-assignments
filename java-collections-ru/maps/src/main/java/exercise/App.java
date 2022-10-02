package exercise;

import java.util.HashMap;
import java.util.Map;

// BEGIN
public class App {
    public static Map<String, Integer> getWordCount(String sentence) {
        String[] wordArray = sentence.split(" ");
        Map<String, Integer> wordCount = new HashMap<>();
        if (sentence.isEmpty()) {
            return wordCount;
        }
        for (String word : wordArray) {
            if (!wordCount.containsKey(word)) {
                wordCount.put(word, 1);
            } else {
                wordCount.put(word, wordCount.get(word) + 1);
            }
        }
        return wordCount;
    }

    public static String toString(Map<String, Integer> collection) {
        if (collection.isEmpty()) {
            return "{}";
        }
        StringBuilder collectionString = new StringBuilder();
        collectionString.append("{\n");
        for (Map.Entry<String, Integer> entry : collection.entrySet()) {
            collectionString.append("  ").append(entry.getKey()).append(": ").append(entry.getValue()).append("\n");
        }
        collectionString.append("}");
        return collectionString.toString();
    }
}

//END
