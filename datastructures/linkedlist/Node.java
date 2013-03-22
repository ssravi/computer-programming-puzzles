package datastructures.linkedlist;
import java.util.*;


public class Node {

	private int data;
	private Node next;

	public Node(int data, Node next){
		this.next = next;
		this.data = data;
	}

	public void setData(int data){
		this.data = data;
	}

	public void setNext(Node next){
		this.next = next;
	}

	public Node getNext(){
		return this.next;
	}

	public int getData(){
		return this.data;
	}

}