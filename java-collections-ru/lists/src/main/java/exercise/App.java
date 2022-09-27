package exercise;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

// BEGIN
public class App {
    public static boolean scrabble(String letters, String word) {
        if (letters.length() < word.length()) {
            return false;
        }
        if (letters.equalsIgnoreCase(word)) {
            return true;
        }
        String[] lettersArray = letters.toLowerCase().split("");
        String[] wordArray = word.toLowerCase().split("");
        List<String> lettersCollection = new ArrayList<>(Arrays.asList(lettersArray));
        for(String letter : wordArray) {
            if (lettersCollection.contains(letter)) {
                lettersCollection.remove(letter);
            } else {
                return false;
            }
        }
        return true;
    }

}
//END
