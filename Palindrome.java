package week2.day1;

public class Palindrome {
public static void main(String[] args) {
	int i = 121;
	int j = 0;
	int k;
	int l = i;
	while (i > 0 ) {
		k = i%10;
		j = (j*10)+k;
		i = i/10;
		
	}
	
	if (l == j) {
		System.out.println("The Number is a Palindrome");}
	
		else
			System.out.println("The Number is not a Palindrome");	
}

}
