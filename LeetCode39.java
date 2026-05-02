import java.util.*;

class LeetCode39 {
    private final List<List<Integer>> ans = new ArrayList<>();
    private final List<Integer> t = new ArrayList<>();
    private int[] candidates;

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates);
        this.candidates = candidates;
        dfs(0, target);
        return ans;
    }

    private void dfs(int i, int s) {
        if (s == 0) {
            ans.add(new ArrayList<>(t));
            return;
        }

        if (i >= candidates.length || s < candidates[i]) {
            return;
        }

        for (int j = i; j < candidates.length; ++j) {
            t.add(candidates[j]);
            dfs(j, s - candidates[j]);
            t.remove(t.size() - 1);
        }
    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter number of elements: ");
            int n = sc.nextInt();
            
            int[] candidates = new int[n];
            System.out.println("Enter elements:");
            for (int i = 0; i < n; i++) {
                candidates[i] = sc.nextInt();
            }
            
            System.out.print("Enter target: ");
            int target = sc.nextInt();
            
            LeetCode39 sol = new LeetCode39();
            List<List<Integer>> result = sol.combinationSum(candidates, target);
            
            System.out.println("Combinations:");
            for (List<Integer> list : result) {
                System.out.println(list);
            }
        }
    }
}