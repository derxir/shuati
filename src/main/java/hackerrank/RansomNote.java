package hackerrank;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by justin on 6/26/18.
 */
public class RansomNote {


    // Complete the checkMagazine function below.
    static boolean checkMagazine(String[] magazine, String[] note) {

        Map<String, Integer> map = new HashMap<>();

        for (String word : magazine) {
            if (map.keySet().contains(word)) {
                map.put(word, map.get(word) + 1);
            } else {
                map.put(word, 1);
            }
        }

        for (String word : note) {
            if (map.keySet().contains(word)) {
                Integer count = map.get(word) -1;
                if (count < 0) return false;
                map.put(word, count);
            } else {
                return false;
            }

        }
        return true;
    }

    public static void main(String[] args) throws IOException {
        String[] magazine = "o l x imjaw bee khmla v o v o imjaw l khmla imjaw x".split(" ");
        String[] note = "imjaw l khmla x imjaw o l l o khmla v bee o".split(" ");
        System.out.println(checkMagazine(magazine, note));
    }
}
