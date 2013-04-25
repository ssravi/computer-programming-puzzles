package datastructures.trees;
import java.util.*;


public class TreeNode {

	private final int data;
	private TreeNode left;
	private TreeNode right;

	public TreeNode(int data){
		this.data = data;
	}

	public void setLeft(TreeNode left){
		this.left = left;
	}

	public TreeNode getLeft(){
		return this.left;
	}

	public void setRight(TreeNode right){
		this.right = right;
	}

	public TreeNode getRight(){
		return this.right;
	}

	public int getData(){
		return this.data;
	}

}