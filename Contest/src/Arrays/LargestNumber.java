package Arrays;
import java.lang.*;
import java.util.*;

//https://leetcode.com/problems/largest-number/description/

public class LargestNumber {
	 public String largestNumber(int[] nums) {
	        if(nums == null || nums.length == 0)
	        	return "";
	        
	        String result = "";
	        // Convert int array to String array, so we can sort later on
	        String []str =  new String[nums.length];
	        for(int i = 0; i < nums.length; i++)
	        	str[i] = String.valueOf(nums[i]);
	        
	     // Comparator to decide which string should come first in concatenation
	        Comparator<String> comp = new Comparator<String>(){
	        		@Override	
	        		public int compare(String s1, String s2){
	        				String first = s1 + s2;
	        				String second = s2 + s1;
	        				return second.compareTo(first); // reverse order here, so we can do append() later
	        			}
	        		};
	         Arrays.sort(str, comp);
	         
	        // An extreme edge case by lc, say you have only a bunch of 0 in your int array
             if(str[0].charAt(0) == '0')
                 return "0";
	         
	         for(int i = 0; i < str.length; i++)
	        	 result = result + str[i];
	         return result;
	   }
}
