package DP;
import java.lang.*;
import java.util.*;

//Given a 2D binary matrix filled with 0's and 1's, find the largest square containing only 1's and return its area.

//https://leetcode.com/problems/maximal-square/description/

//Sol : https://discuss.leetcode.com/topic/15328/easy-dp-solution-in-c-with-detailed-explanations-8ms-o-n-2-time-and-o-n-space

public class MaxSquare {
	 public int maximalSquare(char[][] matrix) {
		 if(matrix.length <= 0)
             return 0;
         int dp[][] =  new int [matrix.length + 1][matrix[0].length + 1];
	        int result = 0; 
	        for(int i = 1; i <= matrix.length; i++){
	        	for(int j = 1; j <= matrix[0].length; j++){
	        		if(matrix[i - 1][j - 1] == '1'){
	        			dp[i][j] = Math.min(Math.min(dp[i - 1][j], dp[i][j - 1]), dp[i - 1][j - 1]) + 1;
	        			result = Math.max(result, dp[i][j]);
	        		}
	        	}
	        }
	        return result * result;
	   }
}


