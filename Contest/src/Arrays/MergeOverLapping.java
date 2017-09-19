package Arrays;
import java.lang.*;
import java.util.*;


class Interval {
     int start;
     int end;
     Interval() { start = 0; end = 0; }
     Interval(int s, int e) { start = s; end = e; }
}

public class MergeOverLapping {
	 public List<Interval> merge(List<Interval> intervals) {
		    if (intervals.size() <= 1)
		        return intervals;
		    Collections.sort(intervals, new Comparator<Interval>() { 
		    								public int compare(Interval first, Interval second){
		    											return first.start - second.start > 0 ? 1 : 0;
		    									}});
	        
		    List<Interval> result = new LinkedList<Interval>();
		    int start = intervals.get(0).start;
		    int end = intervals.get(0).end;
		    
		    for (Interval interval : intervals) {
		        if (interval.start <= end) // Overlapping intervals, move the end if needed
		            end = Math.max(end, interval.end);
		        else {                     // Disjoint intervals, add the previous one and reset bounds
		            result.add(new Interval(start, end));
		            start = interval.start;
		            end = interval.end;
		        }
		    }
		    
		    // Add the last interval
		    result.add(new Interval(start, end));
		    return result;
	    }
}
