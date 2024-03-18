package part_2;

import java.util.HashMap;

public class Q8 {
    public static void main(String[] args) {
        String str1 = "ABCD";
        String str2 = "DBAC";
        HashMap<Character, Integer> map = new HashMap<>();
        HashMap<Character, Integer> mapT = new HashMap<>();
        for (char ch : str1.toCharArray()) {
            if (!map.containsKey(ch)) {
                map.put(ch, 1);
            } else {
                map.put(ch, map.get(ch) + 1);
            }
        }
        for (char ch : str2.toCharArray()) {
            if (!mapT.containsKey(ch)) {
                mapT.put(ch, 1);
            } else {
                mapT.put(ch, mapT.get(ch) + 1);
            }
        }
        Q8 ob = new Q8();
        System.out.println("Is Anagram:" + ob.isAnagram(map, mapT));

    }

    public boolean isAnagram(HashMap<Character, Integer> map, HashMap<Character, Integer> mapT) {
        if (map.size() != mapT.size())
            return false;
        for (char ch : map.keySet()) {
            if (mapT.get(ch) != map.get(ch)) {
                return false;
            }
        }
        return true;
    }
}
