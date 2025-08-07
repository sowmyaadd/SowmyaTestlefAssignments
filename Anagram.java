package week3.day1;

import java.util.Arrays;

public class Anagram {
public static void main(String[] args) {
	String str1 = "stops";
	String str2 = "potss";
	if(str1.length() != str2.length()) {
		System.out.println("length mismatches hence not a anagram");}
		   char c1[] = str1.toCharArray();
			char c2[] = str2.toCharArray();
		Arrays.sort(c1);
		Arrays.sort(c2);
		
boolean isEqual = Arrays.equals(c1,c2);
	System.out.println("It is Amagram:" +" " + isEqual);
}
}