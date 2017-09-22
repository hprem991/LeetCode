package Arrays;
import java.lang.*;
import java.util.*;


//https://leetcode.com/problems/continuous-subarray-sum/description/


//Soln - https://discuss.leetcode.com/topic/80793/java-o-n-time-o-k-space/2

/*
 * Logic :- (a+(n*x))%x is same as (a%x)
		 For e.g. in case of the array [23,2,6,4,7] the running sum is [23,25,31,35,42] and the remainders are [5,1,1,5,0].
 		 We got remainder 5 at index 0 and at index 3.
 		 That means, in between these two indexes we must have added a number which is multiple of the k. Hope this clarifies your doubt :)
 * 
 */

public class ContinuousSubarraySum {
	public boolean checkSubarraySum(int[] nums, int k) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		int runningSum = 0;
		for(int i = 0 ; i < nums.length; i++){
			runningSum = nums[i];
			if(k != 0)
				runningSum = runningSum % k;
			if(map.containsKey(runningSum)){
				return true;
			} else {
				map.put(runningSum, i);
			}
		}
		return false;
    }
}
