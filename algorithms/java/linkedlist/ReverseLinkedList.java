package algorithms.java.linkedlist;
import java.util.*;

/*
 * Reversing a linkedlist is an interesting iteration through linkedlist starting from head
 * and reversing each and every Node by reversing the linkage 
 * and should return the new headNode
 */

public class ReverseLinkedList{

	public static void main(String[] args){
		BuildNodeFactory buildFactory = new BuildNodeFactory();
		Node headNode = buildFactory.getNodes(10);
		Node reverseHead = reverse(headNode);
		System.out.print("The reversedLinkedList : ");
		buildFactory.printNodes(reverseHead);
	}

	private static Node reverse(Node headNode){
		if(headNode == null){
			return null;
		}

		Node currentNode = headNode;
		//this is the new head
		Node previousNode = null;
		Node nextNode = null;

		// iterate until currentNode or the current head becomes null and
		// last node (null previous) becomes new head
		while(currentNode != null){
			nextNode = currentNode.getNext();
			currentNode.setNext(previousNode);
			previousNode = currentNode;
			currentNode = nextNode;
		}
		return previousNode;
	}


	
	
}