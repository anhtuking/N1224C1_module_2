package set_map.exercise2;

import java.util.HashMap;
import java.util.Map;

public class Map1 {
    public static void main(String[] args) {
        String text = "VIÊT NAM VÔ ĐỊCH, thái lan tuổi l !!";

        Map<String, Integer> map = new HashMap<>();

        String[] words = text.split(" ");

        for (String word : words) {
            word = word.toLowerCase();

            if (map.containsKey(word)) {
                int count = map.get(word);
                map.put(word, count + 1);
            } else {
                map.put(word, 1);
            }
        }

        for (String word : map.keySet()) {
            int count = map.get(word);
            System.out.println(word + "\t" + count);
        }
    }
}