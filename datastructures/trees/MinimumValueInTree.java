package datastructures.trees;
import java.util.*;

/*
 * The purpose of this class is to build a linkedlist with a given size using random numbers 
 * and return headNode
 */
public class MinimumValueInTree{

	public static void main(String[] args){
		TreeNode root = TreeFactory.getNewTree(10);
		System.out.println("The MinimumValueInTree for the tree : " + minValue(root));
		
		System.out.println();
	}

	public static int minValue(TreeNode root){
		if(root == null){
			return 0;
		} else if(root.getLeft() == null){
		 		return root.getData();		
		} 
		
	    return	minValue(root.getLeft());
	}

}