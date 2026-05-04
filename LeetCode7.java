public class LeetCode7 {

    public static void main(String[] args){
        int x = 123;
        Solution sol = new Solution();
        System.out.println(sol.reverse(x));
    }
}

class Solution {
    public int reverse(int x) {
        boolean neg = x < 0;
        if (neg){
            x = x * -1;
        }
        int ans = 0;
        int count = count (x);
        while (x > 0){
            int rem = x%10;
            ans = ans + (int) Math.pow(10, count - 1) * rem;
            count = count - 1;
            x = x / 10;
        }
        return ans;
    }

    public int count (int x){
        int count = 0;
        while (x > 0){
            count = count + 1;
            x = x / 10;
        }
        return count;
    }
}