package problemSet;

import java.util.*;

//https://leetcode.com/problems/gray-code/description/
//https://discuss.leetcode.com/topic/8557/an-accepted-three-line-solution-in-java


// Logic :- The idea is simple. G(i) = i^ (i/2).

public class grayCode {
	public List<Integer> grayCode(int n) {
	    List<Integer> result = new LinkedList<>();
	    for (int i = 0; i < 1<<n; i++) result.add(i ^ i>>1);
	    return result;
	}
}
