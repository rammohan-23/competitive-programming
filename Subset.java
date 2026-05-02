import java.util.*;
public class Subset {
    public static void main(String[] args){
        int[] nums = {1,2,2};
        System.out.println(subSets(nums));
    }

     static List<List<Integer>> subSets(int[] nums){
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());
        for (int num : nums){
            int n = outer.size();
            for (int i = 0; i < n; i++) {
                List<Integer> inner = new ArrayList<>(outer.get(i));
                inner.add(num);
                if (!outer.contains(inner))
                    outer.add(inner);
            }
        }
        return outer;
    }
}