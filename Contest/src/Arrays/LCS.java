package Arrays;

//https://leetcode.com/problems/longest-continuous-increasing-subsequence/description/
//https://discuss.leetcode.com/topic/102999/java-c-clean-solution
//The idea is to use cnt to record the length of the current continuous increasing subsequence which ends with nums[i], and use res to record the maximum cnt.

public class LCS {
    public int findLengthOfLCIS(int[] nums) {
        int res = 0, cnt = 0;
        for(int i = 0; i < nums.length; i++){
            if(i == 0 || nums[i-1] < nums[i]) res = Math.max(res, ++cnt);
            else cnt = 1;
        }
        return res;
    }
}
