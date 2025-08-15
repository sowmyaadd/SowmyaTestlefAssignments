package week4.day1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SecondLargest {
public static void main(String[] args) {
	List<Integer> ar1 = new ArrayList<Integer>();
	//adding elements
	ar1.add(3);
	ar1.add(2);
	ar1.add(11);
	ar1.add(4);
	ar1.add(6);
	ar1.add(7);
	//sorting
	Collections.sort(ar1);
	//displaying the array list
	System.out.println(ar1);
	//displaying second largest element in the array
	    int secondLargest = ar1.get(ar1.size() - 2);
        System.out.println("The second largest element is: " + secondLargest);
    
}
}
