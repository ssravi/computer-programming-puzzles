package datastructures.trees;
import java.util.*;

/*
 * The purpose of this class is to build a linkedlist with a given size using random numbers 
 * and return headNode
 */
public class TreeFactory{
	private static int MAX_NUM = 500;
	private Random randomGen = new Random();
	private TreeNode root;
	private int size;
	public TreeFactory(int size){
		this.size = size;
	}



	public TreeNode buildNewTree(){
		root = new TreeNode(randomGen.nextInt(MAX_NUM));
		int count = 0;

		while(count ++ < this.size){
			int data =  randomGen.nextInt(MAX_NUM);
			buildTree(root, data);
		}		
		System.out.println("Built tree  for root- > " + root.getData());

		printTree(root);
		System.out.println();
	  	return root;
	}

	private void printTree(TreeNode root){
		if(root == null){
			return;
		}
		System.out.print(root.getData() + ",  ");
		printTree(root.getLeft());
		printTree(root.getRight());
	}

	private TreeNode buildTree(TreeNode root, int data){
		if(root == null){
			return new TreeNode(data);
		}

		if(root.getData() <= data){
			root.setLeft(buildTree(root.getLeft(), data));
		} else {
			root.setRight(buildTree(root.getRight(), data));
		}
		return root;
	}
}