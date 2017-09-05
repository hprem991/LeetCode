package Arrays;
import java.lang.*;
import java.util.*;

// https://leetcode.com/problems/maximum-product-subarray/description/

public class MaximumProductSubarray {
	 public int maxProduct(int[] nums) {
		   int res = nums[0];
		 	int max = nums[0];
		 	int min = nums[0]; 
		    // imax/imin stores the max/min product of
		    // subarray that ends with the current number A[i]
		 	for(int i = 1; i < nums.length; i++){
		 		// multiplied by a negative makes big number smaller, small number bigger
		        // so we redefine the extremums by swapping them
		 		 if(nums[i] < 0) // if its is negative, swap it
		 		  {
		 			  int temp = max;
		 			  max = min;
		 			  min = temp;
		 		  } 
		 		  
    		 // max/min product for the current number is either the current number itself
             // or the max/min by the previous number times the current one
		 	 min = Math.min(nums[i], min * nums[i]);
		 	 max = Math.max(nums[i], max * nums[i]);
		 	 
		     // the newly computed max value is a candidate for our global result
		 	 res = Math.max(max, res);		  
		 	}
		 	return res;
	    }
}
