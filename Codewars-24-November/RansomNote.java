//https://www.codewars.com/kata/59cc2829a7deeb33710005ef/

import java.util.HashMap;
import java.util.Map;

public class Ransom {
    public static boolean canMakeNote(String note, String magazine) {

        String niqqa = magazine.toLowerCase().replaceAll(" ", "");
        String nikka = note.toLowerCase().replaceAll("[^a-z'0-9]", "");

        Map<String, String> map = new HashMap<>();
        map.put("a", "4");
        map.put("e", "3");
        map.put("i", "1");
        map.put("o", "0");
        map.put("s", "5");
        map.put("z", "2");

        for (int i = 0; i < nikka.length(); i++) {

            String s = "" + nikka.charAt(i);

            if (!niqqa.contains(s)) {
                s = map.getOrDefault(s, s);
            }

            if (!niqqa.contains(s)) {
                return false;
            }

            niqqa = niqqa.replaceFirst(s, "");
        }
        return true;
    }
}
