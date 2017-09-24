package Arrays;
import java.lang.*;
import java.util.*;

//https://leetcode.com/contest/leetcode-weekly-contest-51/problems/baseball-game/


public class Baseball_Game {
	 public int calPoints(String[] ops) {
		  Stack<Integer> stack = new Stack<Integer>();
		     int sum = 0;
		     for(int i=0; i < ops.length; i++){
		    	 if(ops[i].equals("C")){
		    		 if(!stack.isEmpty()) {
		    			 sum -= stack.peek();
		    			 stack.pop();
		    		 }
		    	 } else if(ops[i].equals("D")){
		    		 if(!stack.isEmpty()) {
		    			 int elem = 2 * stack.peek();
		    			 sum += elem;
		    			 stack.push(elem);
		    		 }
		    	} else if(ops[i].equals("+")){
		    			 if(!stack.isEmpty()) {
		    				 int firstelem = stack.pop();
		    				 int secondelem = stack.peek();
		    				 int newelem = firstelem + secondelem;
		    				 sum  += newelem;
		    				 stack.push(firstelem);
		    				 stack.push(newelem);
		    			 }
		    	} else {// Integer in the form of string
		    			 sum += Integer.parseInt(ops[i]);
		    			 stack.push(Integer.parseInt(ops[i]));
		    		 }
		    	 }
		     return sum;
	    }
}
