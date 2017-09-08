package String;
import java.lang.*;
import java.util.*;

//https://discuss.leetcode.com/topic/30508/easiest-java-solution-with-graph-explanation/5

public class StringMultiplication {
	 public String multiply(String num1, String num2) {
		 	String result = "";
	        int num[] = new int[num1.length() + num2.length()];
	        
	        
	        //Start from right to left, perform multiplication on every pair of digits, and add them together. 
	        //Let's draw the process! From the following draft, we can immediately conclude:
	        //`num1[i] * num2[j]` will be placed at indices `[i + j`, `i + j + 1]`
	        
	        for(int i = num1.length() - 1; i >=0; i--){
		        for(int j = num2.length() - 1; j >=0; j--){
		        	int muldigits = (num1.charAt(i) - '0') * (num2.charAt(j) - '0');
		        	int pos1 = i + j;
		        	int pos2 = i + j + 1;
		        	int sum = muldigits + num[pos2];
		        	
		        	num[pos1] = num[pos1] + sum / 10;
		        	num[pos2] = sum % 10;
		        }
	        }
	        
	        // Recreate the String back using either String Builder or String
	        
	        // This StringBuilder result creation is for the crazy leetcode '00' case
	        //StringBuilder sb = new StringBuilder();
	        //for(int p : num) if(!(sb.length() == 0 && p == 0)) sb.append(p);
	        //return sb.length() == 0 ? "0" : sb.toString();
	        
	        for(int i = 0 ; i < num.length; i++){
	        	result = result + num[i];
	        }
	        return result;
	   }
}
