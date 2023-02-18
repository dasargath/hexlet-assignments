package exercise;


import java.util.ArrayList;
import java.util.List;

// BEGIN
class App {
    public static boolean scrabble(String letters, String word) {
        letters = letters.toLowerCase();
        word = word.toLowerCase();
        char[] inputCharsArray = letters.toCharArray();
        char[] inputCharsWord = word.toCharArray();
        var alphabetAmount = 26;

        List<Integer> storageList = new ArrayList<>(alphabetAmount);
        for (int letter = 0; letter < alphabetAmount; letter++) {
            storageList.add(0);
        }

        for (char inputChar : inputCharsArray) {
            int index = inputChar - 'a';
            storageList.set(index, storageList.get(index) + 1);
        }

        for (char inputChar : inputCharsWord) {
            int index = inputChar - 'a';
            int count = storageList.get(index);
            if (count == 0) {
                return false;
            }
            storageList.set(index, count - 1);
        }
        return true;
    }

}
//END
