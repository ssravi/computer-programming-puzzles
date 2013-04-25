package datastructures.trees;
import java.util.*;

/*
 * The purpose of this class is to build a linkedlist with a given size using random numbers 
 * and return headNode
 */
public class LevelOrderTraversal{

	public static void main(String[] args){
		TreeFactory factory = new TreeFactory(10);
		TreeNode root = factory.buildNewTree();
		System.out.println("The LevelOrderTraversal of the tree : ");
		printTraversalTree(root);
		System.out.println();
	}

	public static void printTraversalTree(TreeNode root){
		if(root == null){
			return;
		}

		Queue<TreeNode> queue = new LinkedList<TreeNode>();
  		queue.add(root);
  		while(!queue.isEmpty()){
  		    TreeNode node = queue.poll();
  			System.out.print(node.getData() + " ");
  			if(node.getRight() != null){
	  			queue.add(node.getRight());
  			}

  			if(node.getLeft() != null){
  				queue.add(node.getLeft());
  			}

	    }		
	}

}