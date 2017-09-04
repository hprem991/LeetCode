package Arrays;
import java.lang.*;
import java.util.*;

//https://discuss.leetcode.com/topic/102083/java-o-n-time-o-n-space-w-explanation

public class SwappingMax {
	  public int maximumSwap(int num) {
	        int maxSeen = 0, maxIdx = -1, power = 0, swapIdx1 = 0, swapIdx2 = 0;
	        List<Integer> list = new ArrayList<>();
	        while(num > 0){
	            int digit = num % 10;
	            list.add(digit);
	            if(maxSeen > digit){
	                swapIdx1 = power;
	                swapIdx2 = maxIdx;
	            }
	            else if(digit > maxSeen){
	                maxSeen = digit;
	                maxIdx = power;
	            }
	            num = num/10;
	            power++;
	        }
	        
	        Collections.swap(list, swapIdx1, swapIdx2);

	        int result = 0;
	        for(int i = 0; i < list.size(); i++){
	            result += (int)(Math.pow(10, i) * list.get(i));
	        }
	        return result;
	    }
}
