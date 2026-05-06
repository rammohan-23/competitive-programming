
import java.util.*;

class Leetcode49 {

    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> anagramMap = new HashMap<>();

        for (String str : strs) {
            char[] charArray = str.toCharArray();
            Arrays.sort(charArray);
            String sortedStr = new String(charArray);

            anagramMap.computeIfAbsent(sortedStr, k -> new ArrayList<>()).add(str);
        }

        return new ArrayList<>(anagramMap.values());
    }

    public static void main(String[] args) {
        Leetcode49 sol = new Leetcode49();

        String[] input = {"eat", "tea", "tan", "ate", "nat", "bat"};

        List<List<String>> result = sol.groupAnagrams(input);

        System.out.println("Output: " + result);
    }
}
