package datastructures.trees;
import java.util.*;

/*
 * The purpose of this class is to build a linkedlist with a given size using random numbers 
 * and return headNode
 */
public class PrintPaths{

	public static void main(String[] args){
		TreeNode root = TreeFactory.getNewTree(20);
		//pass in a new paths array and a counter

		System.out.println("Printing paths for the given tree: ");
		printPaths(root, new int[20], 0);
	}

	private static void printPaths(TreeNode root, int[] paths, int counter){
		if(root == null){
			return;
		}

		paths[counter++] = root.getData();
		if(root.getLeft() == null && root.getRight() == null){
			printThePath(paths,counter);
		}
		else {
			printPaths(root.getLeft(), paths, counter);
			printPaths(root.getRight(), paths, counter);
		}
		System.out.println();
	}

	private static void printThePath(int[] paths, int counter){
		for (int i = 0; i < counter; i++){
			System.out.print(paths[i] + " ");
		}
	}
}