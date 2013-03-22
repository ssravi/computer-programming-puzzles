package datastructures.linkedlist;
import java.util.*;

/*
 * The purpose of this class is to build a linkedlist with a given size using random numbers 
 * and return headNode
 */
public class BuildNodeFactory{
	private static int MAX_NUM = 500;
	private Random randomGen = new Random();
	private Node headNode;
	public BuildNodeFactory(){
		headNode = new Node(randomGen.nextInt(MAX_NUM), null);
	}

	public Node buildNodes(int size){
	  Node currentNode = headNode;
	  int inc = 0;
	  System.out.print("Built linked list of " + size + " : ");
	  while(inc++ < size){
	  	Node newNode = new Node(randomGen.nextInt(MAX_NUM), null);
	  	currentNode.setNext(newNode);
	  	currentNode = newNode;
	  	System.out.print(currentNode.getData() + " ");
	  } 
	  System.out.println();
	  return headNode;
	}
}