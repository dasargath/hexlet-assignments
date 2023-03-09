package exercise;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;

// BEGIN
class App {
    public static List<Map<String, String>> findWhere(List<Map<String, String>> bookList, Map<String, String> query) {
        List<Map<String, String>> result = new ArrayList<>();
        for (Map<String, String> book : bookList) {
            boolean match = true;
            for (Map.Entry<String, String> criteria : query.entrySet()) {
                String key = criteria.getKey();
                String value = criteria.getValue();
                if (!book.containsKey(key) || !book.get(key).equals(value)) {
                    match = false;
                    break;
                }
            }
            if (match) {
                result.add(book);
            }
        }
        return result;
    }
}
//END
