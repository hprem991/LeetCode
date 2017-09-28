package Trees;

import java.lang.*;
import java.util.*;


//https://leetcode.com/problems/count-complete-tree-nodes/description/


//Soln -> https://discuss.leetcode.com/topic/15533/concise-java-solutions-o-log-n-2

class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode(int x) { val = x; }
 }

public class countNodes {
	
	 	int height(TreeNode root) {
	        return root == null ? -1 : 1 + height(root.left);
	    }
	    public int countNodes(TreeNode root) {
	        int h = height(root);
	        return h < 0 ? 0 :
	               height(root.right) == h-1 ? (1 << h) + countNodes(root.right)
	                                         : (1 << h-1) + countNodes(root.left);
	    }
	    
	    
	    
	public int Myheight(TreeNode node){
		if(node == null)
			return 0;
		return 1 + height(node.right); 
	}
	
	public int countNodesBuggy(TreeNode root) {
		int height = Myheight(root);
		if(height == height(root.right)){
			return  1 << height + countNodes(root.right);
		} else {
			return 1 << (height - 1) + countNodes(root.left);
		}
	}
	
	
	 // This is O(n) solution which wont get accepted due to time issue
	 public int countNodesON(TreeNode root) {
		 	if(root == null)
		 		return 0;
		 	if(root.left == null && root.right == null)
		 		return 1;
		 	return countNodes(root.left) + countNodes(root.right) + 1;
	    }
}
