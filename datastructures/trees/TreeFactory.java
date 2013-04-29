package datastructures.trees;
import java.util.*;

/*
 * The purpose of this class is to build a linkedlist with a given size using random numbers 
 * and return headNode
 */
public class TreeFactory{
	private static int MAX_NUM = 500;

	public static TreeNode getNewTree(int size){
		Random randomGen = new Random();
		TreeNode root = new TreeNode(randomGen.nextInt(MAX_NUM));
		int count = 0;

		while(count ++ < size){
			int data =  randomGen.nextInt(MAX_NUM);
			buildTree(root, data);
		}		
		System.out.println("Built tree  for root- > " + root.getData());

		printTree(root);
		System.out.println();
	  	return root;
	}

	private static void printTree(TreeNode root){
		if(root == null){
			return;
		}
		printTree(root.getLeft());
		System.out.print(root.getData() + ",  ");
		printTree(root.getRight());
	}

	private static TreeNode buildTree(TreeNode root, int data){
		if(root == null){
			return new TreeNode(data);
		}

		if(data <= root.getData()){
			root.setLeft(buildTree(root.getLeft(), data));
		} else {
			root.setRight(buildTree(root.getRight(), data));
		}
		return root;
	}
}