package datastructures.trees;
import java.util.*;

/*
 * The purpose of this class is to build a linkedlist with a given size using random numbers 
 * and return headNode
 */
public class MaximumValueInTree{

	public static void main(String[] args){
		TreeFactory factory = new TreeFactory(10);
		TreeNode root = factory.buildNewTree();
		System.out.println("The MaximumValueInTree for the tree : " + maxValue(root));
		
		System.out.println();
	}

	public static int maxValue(TreeNode root){
		if(root == null){
			return 0;
		} else if(root.getRight() == null){
		 		return root.getData();		
		} 
		
	    return	maxValue(root.getRight());
	}

}