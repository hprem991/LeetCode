package Trees;

import java.lang.*;
import java.util.*;
import LeetCode.TreeNode;


//https://leetcode.com/contest/leetcode-weekly-contest-48/problems/second-minimum-node-in-a-binary-tree/

/*
 * Given a non-empty special binary tree consisting of nodes with the non-negative value, 
 * where each node in this tree has exactly two or zero sub-node. If the node has two sub-nodes, then this node's value is the smaller value among its two sub-nodes.
 * Given such a binary tree, you need to output the second minimum value in the set made of all the nodes' value in the whole tree.
 * If no such second minimum value exists, output -1 instead.
 */


public class SecondMinimumInTree {
	int secondSmallest(TreeNode node, int smallest, int secondSmallest){
		if(node != null) {
				int val = node.val;
				if(val < smallest) {
					secondSmallest = smallest;
					smallest = val;
				} else if((smallest != val) && (val < secondSmallest)){
					secondSmallest = val;
				} else {
	                if(smallest == secondSmallest)
	                    secondSmallest = val;
	            }
				if(node.left != null)
					secondSmallest = secondSmallest(node.left, smallest, secondSmallest);
			    if(node.right != null)
				    secondSmallest = secondSmallest(node.right, smallest, secondSmallest);
			}
	       return secondSmallest;
		}
		
		
		
		public int findSecondMinimumValue(TreeNode root) {
			if(root != null){
			  int val =	secondSmallest(root, root.val, root.val);
	           System.out.println(val);
			  return val == root.val ? -1 : val;
			}
			return -1;
	    }
	
}
