package List;
import java.lang.*;
import java.util.*;

class BusinessInfo {
	  int businessId;
	  int numReviews;

	  public BusinessInfo(int businessId, int numReviews){
	    this.businessId = businessId;
	    this.numReviews = numReviews;
	  }
	}

public class MergeList {
	 public static List<BusinessInfo> mergeSortedBusinesses(List<BusinessInfo> trendyBusinesses, List<BusinessInfo> favoriteBusinesses){
		    List<BusinessInfo> result = new ArrayList<BusinessInfo>();
		    int i = 0;
		    int j = 0;
		    
		    while((i < trendyBusinesses.size()) && (j < favoriteBusinesses.size())){
		    	if(favoriteBusinesses.get(i).businessId < trendyBusinesses.get(j).businessId){
		    		result.add(favoriteBusinesses.get(i));
		    		i++;
		    	} else {
		    		result.add(trendyBusinesses.get(j));
		    		j++;
		    	}
		    }
		    while(i < trendyBusinesses.size())
		    	result.add(trendyBusinesses.get(j++));
		    
		    while(j < favoriteBusinesses.size())
		    	result.add(favoriteBusinesses.get(i++));
		    	
		    return result;
	 }
}
