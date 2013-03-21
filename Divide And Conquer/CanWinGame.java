import java.util.*;


//Playing a game on an array of numbers;
//You start the game with a given starting index of an array of numbers.
// Rule 1. You will win the game if element "0" is found in the array
// Rule 2. You can traverse through the array by moving left or right by array[index]
// ex: if starting index is given as x. if arr[x] is 0 you win otherwise you move left 
// or right by arr[x]


public class CanWinGame {

  private static final int MAX_LENGTH = 20;
  private static int[] array = new int[MAX_LENGTH];

  public static void main(String[] args){
     
	 System.out.println("Started game ----> ");
     populateArray();    	

     System.out.println("Array elements = [ " + arrayToString() + " ]");
     System.out.println(canWin()? "You won! " : "You lost!" );
  }   

  private static boolean canWin(){
 	 Random randomGenerator = new Random();
  	 int startIndex = randomGenerator.nextInt(MAX_LENGTH);
 	 return hasZero(array, startIndex);
  }

  private static void populateArray(){

  	Random randomGenerator = new Random();
  	for(int i = 0; i < MAX_LENGTH; i++){
  		array[i] = randomGenerator.nextInt(MAX_LENGTH);
  	}
  }


  private static String arrayToString(){
  	StringBuilder arrayToString = new StringBuilder();
    for(int i = 0; i< array.length; i++){

    	arrayToString.append(array[i]);
    	if(i == array.length - 1){
    		break;
    	} else {
    		arrayToString.append(", ");
    	}
    }
    return arrayToString.toString();
  }

  private static boolean hasZero(int[] array, int startIndex){

  	//check if negative, meaning on a left traversal in recursive call, it might go out of bounds.
    if(startIndex < 0){
    	return false;
    }

  //check for indexOutofBounds exception
    if(startIndex > array.length - 1){
    	return false;
    }
    
    // an element that's already visited
    if(array[startIndex] < 0){
    	return false;
    }

    //Winning moment
    if(array[startIndex] == 0){
    	return true;
    } else {
    	//this is important as you mark each visit as -1 so it wouldn't fall into infinite recursion
    	array[startIndex] = -1;
    }

    //recurse left and right until you win.
    return hasZero(array, startIndex - array[startIndex])? true : hasZero(array, startIndex + array[startIndex]);

  }





}