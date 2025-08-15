package week4.day1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingUsingCollection {
	public static void main(String[] args) {
		List<String> str = new ArrayList<String>();
		//adding elemets 
		str.add("HCL");
		str.add("Wipro");
		str.add("Aspire Systems");
		str.add("CTS");
		//sorting
		Collections.sort(str);
		//displaying the array
		System.out.println(str);
		//displaying the sorted array in reverse as per the assignment requirement
		for(int i=str.size()-1;i>=0;i--) {
			System.out.print(" " + str.get(i));
		}
	}

}
