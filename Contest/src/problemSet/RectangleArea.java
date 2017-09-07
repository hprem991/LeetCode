package problemSet;
import java.lang.*;
import java.util.*;

// https://leetcode.com/problems/rectangle-area/description/

// Find the total area covered by two rectilinear rectangles in a 2D plane.
// NOTE : Refer To the Image to have a better understading  

public class RectangleArea {
	int calculateOverlapping(int firstStart, int firstEnd, int secondStart, int secondEnd){
		if(firstEnd < secondStart || firstStart > secondEnd )
			return 0;
		return Math.min(firstEnd, secondEnd) - Math.max(firstStart, secondStart);
	}
	
	 public int computeArea(int A, int B, int C, int D, int E, int F, int G, int H) {
	        int areaRectABCD = (A - C) * (B - D);
	        int areaRecgEFGH = (E - G) * (F - H);
	        int areaOverLap = calculateOverlapping(A, C, E, G) * calculateOverlapping(B, D, F, H);
	        return areaRectABCD + areaRecgEFGH - areaOverLap;
	    }
}
