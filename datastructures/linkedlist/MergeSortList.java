package datastructures.linkedlist;
import java.util.*;

public class MergeSortList{

	public static void main(String[] args){
		Node list = NodeFactory.getNewList(11);

		Node mergedList = mergeSort(list);

		System.out.print("Merged Linkedlist: ");
		NodeUtils.printNodes(mergedList);
	}

	private static Node mergeSort(Node list){
		if(list == null || list.getNext() == null){
			return list;
		}

		Node middle = splitList(list);
		Node list2 = middle.getNext();
		middle.setNext(null);
		return merge(mergeSort(list), mergeSort(list2));
	}

	private static Node splitList(Node list){
		if(list == null){
			return null;
		}

		Node slow = list;
		Node fast = list;
		while(fast.getNext() != null && fast.getNext().getNext() != null){
			fast = fast.getNext().getNext();
			slow = slow.getNext();
		}

		return slow;
	}

	private static Node merge(Node list1, Node list2){
		if(list1 == null && list2 == null){
			return null;
		}

		if(list1 == null){
			return list2;
		}

		if(list2 == null){
			return list1;
		}

		Node headNode = null;
		if(list1.getData() < list2.getData()){
			headNode = new Node(list1.getData(), null);
			list1 = list1.getNext();
		} else {
			headNode = new Node(list2.getData(), null);
			list2 = list2.getNext();
		}

		Node currentNode = headNode;

		while(list1 != null && list2 != null){
			if(list1.getData() < list2.getData()){
				currentNode.setNext(list1);
				list1 = list1.getNext();
			} else {
				currentNode.setNext(list2);
				list2 = list2.getNext();
			}

			currentNode = currentNode.getNext();
		}

		if(list1 == null){
			currentNode.setNext(list2);
		} else {
			currentNode.setNext(list1);	
		} 

		return headNode;
	}


}