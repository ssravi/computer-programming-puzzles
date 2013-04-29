package datastructures.trees;
import java.util.*;

/*
 * The purpose of this class is to build a linkedlist with a given size using random numbers 
 * and return headNode
 */
public class IsBinarySearchTree{

	public static void main(String[] args){
		TreeFactory factory = new TreeFactory(10);
		TreeNode root = factory.buildNewTree();
		System.out.println("The given tree is" + (isBST(root)? " a " : " not a ") + " BST ");
	}

	public static boolean isBST(TreeNode root){
		if(root == null){
			return true;
		}

		TreeNode previous = null;
		if(!isBST(root.getLeft())){
			return false;
		}

		if(previous != null && root.getData() <= previous.getData()){
			return false;
		}
		previous = root;

		return isBST(root.getRight());

	}

}