package datastructures.linkedlist;
import java.util.*;

public class NodeUtils{

	public static void printNodes(Node headNode){
		if(headNode == null){
			return;
		}
		Node currentNode = headNode;
		int inc = 0;
		while(currentNode.getNext() != null){
			System.out.print(currentNode.getData() + " ");
			currentNode = currentNode.getNext();
		}
		System.out.println();
	}

}