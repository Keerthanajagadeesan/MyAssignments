package Week3.day1Activity;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "stops";
		String str2 = "spots";
		
		if(str1.length()!=str2.length())
			System.out.println( "Lengths mismatch, therefore the strings are not an Anagram");
		else
		{
		char[] arr1 = str1.toCharArray();
		char[] arr2 = str2.toCharArray();
		
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
		System.out.println(arr1);
		System.out.println(arr2);
		
		System.out.println(Arrays.equals(arr1, arr2));
		if(Arrays.equals(arr1, arr2))
			System.out.println("The given strings are Anagram.");
		else
			System.out.println( "The given strings are not an Anagram.");
		}
	}

}
