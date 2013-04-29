package divideAndConquer.dynamicprogramming;

import java.util.*;


//Given a string, print all permutations.
public class LongestIncreasingSubsequence{
	private static int MAX_NUM = 25;
	
	public static void main(String[] args){

		Random randomGen = new Random();
		int size = 10;
		int[] nums = new int[size];

		for(int i = 0 ; i < size; i++){
			nums[i] = randomGen.nextInt(MAX_NUM);
		}
		printLIS(nums);
	}

	private static void printLIS(int[] nums){

		if(nums.length == 0){
			return;
		}

		int[] sizes = new int[nums.length];
		String[] paths = new String[nums.length];

		for(int i = 0 ; i < nums.length ; i++){
			sizes[i] = 1;
			paths[i] = nums[i] + " ";
		}

		for(int i = 1; i < nums.length; i ++){
			for(int j = 0; j < i ; j ++){
				if(nums[i] > nums[j] && sizes[i] < sizes[j] + 1){
					sizes[i] = sizes[j] + 1;
					paths[i] = paths[i] + nums[j] + " ";
				}
			}
		}
		int max = 0;
		int maxIndex = 0;
		for(int i = 0 ; i < sizes.length; i++){
			if (sizes[i] > max){
				max = sizes[i];
				maxIndex = i;
			}
		}

		System.out.println("The LongestIncreasingSubsequence path is : " + paths[maxIndex]);
	}

}