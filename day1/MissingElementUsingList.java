package week4.day1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MissingElementUsingList {
public static void main(String[] args) {
	List<Integer> ar1 = new ArrayList<Integer>();
	//add elements
	ar1.add(1);
	ar1.add(2);
	ar1.add(3);
	ar1.add(4);
	ar1.add(10);
	ar1.add(6);
	ar1.add(8);
	System.out.println(ar1);
	//sorting the array
	Collections.sort(ar1);
	//display the sorted array list
	System.out.println(ar1);
	for(int i =0;i<=ar1.size();i++) {
		if(ar1.get(i+1)-ar1.get(i)!=1) {
			System.out.println(ar1.get(i)+1);
		}
	}
}
}
