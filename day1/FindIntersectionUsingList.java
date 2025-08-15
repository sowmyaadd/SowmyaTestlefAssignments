package week4.day1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindIntersectionUsingList {
	public static void main(String[] args) {
List<Integer> ar1 = new ArrayList<Integer>();
List<Integer> ar2 = new ArrayList<Integer>();

ar1.add(3);
ar1.add(2);
ar1.add(11);
ar1.add(4);
ar1.add(6);
ar1.add(7);
ar2.add(1);
ar2.add(2);
ar2.add(8);
ar2.add(4);
ar2.add(9);
ar2.add(7);
//displaying teh elements of the array
System.out.println(ar1);
System.out.println(ar2);
Set<Integer> set2 = new HashSet<>(ar2);
//Displaying the intersecting elements
System.out.print("Intersecting Elements:");

for (Integer num : ar1) {
    if (set2.contains(num)) {
        System.out.println(num);
    }
}
}		
	}


