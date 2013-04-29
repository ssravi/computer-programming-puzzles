package divideAndConquer.dynamicprogramming;

import java.util.*;


//Given a string, print all permutations.
public class LongestCommonSubsequence{

	
	public static void main(String[] args){

		String s1 = "Thisisasimpletest";
		String s2 = "simplesthumanbeing";

		System.out.print("the common subsequence is: " );
		printLCS(s1,s2);

	}


	private static void printLCS(String s1, String s2){
		if(s1 == null || s1.isEmpty()){
			System.out.println("The LongestCommonSubsequence for given strings: " + s2);
			return;
		}

		if(s2 == null || s2.isEmpty()){
			System.out.println("The LongestCommonSubsequence for given strings: " + s1);
			return;
		}

	 	int[][] LCSMatrix = new int[s1.length()+1][s2.length()+1];

	 	for(int i = 1; i < s1.length(); i++){
	 		for(int j = 1; j< s2.length(); j++){
	 			if(s1.charAt(i) == s2.charAt(j)){
	 				LCSMatrix[i][j] = LCSMatrix[i-1][j-1] + 1;
	 			} else {
	 				LCSMatrix[i][j] = Math.max(LCSMatrix[i-1][j], LCSMatrix[i][j-1]);
	 			}
	 		}
	 	}

	 	StringBuilder sb = new StringBuilder();
	 	for(int i = s1.length(),  j = s2.length(); i!=0 && j!=0;){
	 		if(s1.charAt(i-1) == s2.charAt(j-1)){
	 			sb.append(s1.charAt(i-1));
	 			i--;
	 			j--;
	 		} else if(LCSMatrix[i-1][j] > LCSMatrix[i][j-1]){
	 			i--;
	 		} else {
	 			j--;
	 		}

	 	}
	 	System.out.println(sb.reverse().toString());

	}

}