package week3.day1;

public class ReverseString {
public static void main(String[] args) {
	String s = "sowmya";
	char c[] = s.toCharArray();
	int n = c.length;
	//System.out.println(c);
	for(int i = 0;i<=c.length;i++) {
			System.out.println(c[n-1]);
			n--;
	}
}
}
