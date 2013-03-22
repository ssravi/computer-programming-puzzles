package divideAndConquer.permutations;

import java.util.*;


//Given a string, print all permutations.
public class RecPermutate{

	private static final int MAX_CHAR_LENGTH = 5;
	public static void main(String[] args){

		char[] chars = "abcdefghijklmnopqrstuvwxyz".toCharArray();
		StringBuilder builder = new StringBuilder();
		Random random = new Random();
		for (int i = 0; i < MAX_CHAR_LENGTH; i++) {
		    char c = chars[random.nextInt(chars.length)];
		    builder.append(c);
		}

		System.out.println("Finding permutations for string: " + builder.toString());
		generatePermutations(builder.toString());
	}

	private static void generatePermutations(String permuteString){
		recPermute("", permuteString);
	}

	private static void recPermute(String sofar, String rest){

		if(rest == null || rest.length() == 0){
			System.out.println(sofar);
		} 

		for(int i=0; i<rest.length(); i++){
			String next = sofar + rest.charAt(i);
			String remaining = rest.substring(0, i) + rest.substring(i+1);
			recPermute(next, remaining);
		}

	}



}