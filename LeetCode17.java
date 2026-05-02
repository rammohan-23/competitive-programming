import java.util.*;

public class LeetCode17 {

    // Function to generate letter combinations
    public static List<String> letterCombinations(String digits) {
        List<String> ans = new ArrayList<>();

        if (digits.length() == 0) {
            return ans;
        }

        ans.add("");

        String[] d = new String[] {
            "abc", "def", "ghi", "jkl",
            "mno", "pqrs", "tuv", "wxyz"
        };

        for (char i : digits.toCharArray()) {
            String s = d[i - '2'];
            List<String> t = new ArrayList<>();

            for (String a : ans) {
                for (String b : s.split("")) {
                    t.add(a + b);
                }
            }

            ans = t;
        }

        return ans;
    }

    // Main method
    public static void main(String[] args) {
        String digits = "23";

        List<String> result = letterCombinations(digits);

        System.out.println("Letter Combinations:");
        for (String str : result) {
            System.out.print(str + " ");
        }
    }
}