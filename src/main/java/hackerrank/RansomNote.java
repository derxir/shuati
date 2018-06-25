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
                Integer t = map.get(word) + 1;
                map.put(word, t);
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
        String[] magazine = new String[]{"give", "me", " one", "grand", "today ", "night"};
        String[] note = new String[]{"give", " one", "grand", "today ","a"};
        System.out.println(checkMagazine(magazine, note));
    }
}
