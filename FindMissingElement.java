package week3.day1;

import java.util.Arrays;

public class FindMissingElement {
public static void main(String[] args) {
	int a[] = {1,2,3,5};
	Arrays.sort(a);
	//System.out.println(a);
	for ( int b = a[0];b<=a.length;b++) {
		if(a[b] != b+1) {
			System.out.println(b+1);
			break;
		}
	}
}
	
}
