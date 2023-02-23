package exercise;

import java.util.HashMap;
import java.util.Map;

// BEGIN
class App {
    public static Map<String, Integer> getWordCount(String sentence) {
        Map<String, Integer> wordCount = new HashMap<>();

        if (sentence.isEmpty()) {
            return wordCount;
        }

        String[] words = sentence.split(" ");
        for (String word : words) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }
        return wordCount;
    }

    public static String toString(Map<String, Integer> wordCount) {
        if (wordCount.isEmpty()) {
            return "{}";
        }
        StringBuilder mapAsString = new StringBuilder("{\n");
        for (String word : wordCount.keySet()) {
            if (word.isEmpty()) {
                continue;
            }
            mapAsString.append("  ").append(word).append(": ").append(wordCount.get(word)).append("\n");
        }
        if (mapAsString.charAt(mapAsString.length() - 1) == '\n') {
            mapAsString.deleteCharAt(mapAsString.length() - 1);
        }
        mapAsString.append("\n}");
        return mapAsString.toString();
    }
}
//END
