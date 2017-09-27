package Arrays;

//https://discuss.leetcode.com/topic/32929/o-n-o-1-after-median-virtual-indexing

//https://discuss.leetcode.com/topic/32920/o-n-time-o-1-space-solution-with-detail-explanations

/*
 * 
 * dea 1.

As @whnzinc pointed out in this thread, all elements in nums can be classified into three categories:

(1) Larger than the median;

(2) Equal to the median;

(3) Smaller than the median.

Note that it's possible to find the median within O(n)-time and O(1)-space.

Note: We can use nth_element to find the median, but it's not O(n)-time and O(1)-space. For the sake of simplicity, I might use nth_element as well.

Idea 2.

As @StefanPochmann pointed out in this thread, we can arrange the elements in the three categories in a deterministic way.

(1) Elements that are larger than the median: we can put them in the first few odd slots;

(2) Elements that are smaller than the median: we can put them in the last few even slots;

(3) Elements that equal the median: we can put them in the remaining slots.

Update: According to @StefanPochmann's thread, we can use a one-pass three-way partition to rearrange all elements. His idea is to re-map the indices into its destined indices, odd indices first and even indices follow.
 */


//Look at this post -> https://discuss.leetcode.com/topic/41464/step-by-step-explanation-of-index-mapping-in-java

public class WiggleSort {
	   public void wiggleSort(int[] nums) {
	        int median = findKthLargest(nums, (nums.length + 1) / 2);
	        int n = nums.length;

	        int left = 0, i = 0, right = n - 1;

	        while (i <= right) {

	            if (nums[newIndex(i,n)] > median) {
	                swap(nums, newIndex(left++,n), newIndex(i++,n));
	            }
	            else if (nums[newIndex(i,n)] < median) {
	                swap(nums, newIndex(right--,n), newIndex(i,n));
	            }
	            else {
	                i++;
	            }
	        }
	    }

	    private int newIndex(int index, int n) {
	        return (1 + 2*index) % (n | 1);
	    }
}
