import java.util.*;

class Solution {
    static ArrayList<Integer> subarraySum(int[] arr, int target) {

        ArrayList<Integer> ans = new ArrayList<>();
        int start = 0;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
            while (sum > target) {
                sum = sum - arr[start];
                start++;
            }
            if (sum == target) {
                ans.add(start + 1); 
                ans.add(i + 1);
                return ans;
            }
        }
        ans.add(-1);
        return ans;
    }
}