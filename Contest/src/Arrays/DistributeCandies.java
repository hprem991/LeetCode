package Arrays;
import java.lang.*;
import java.util.*;


//https://leetcode.com/problems/distribute-candies/description/

public class DistributeCandies {
	 public int distributeCandies(int[] candies) {
	        int max = 0;
	        HashSet<Integer> candy =  new HashSet<Integer>();
	        for(int i=0; i< candies.length; i++){
	        	if(!candy.contains(candies[i])){
	        		candy.add(candies[i]);
	        		max++;
	        	}
	        }
	        return max;
	    }
}
