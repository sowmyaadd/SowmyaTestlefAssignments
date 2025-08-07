package week3.day1;

public class FindOccurance {
public static void main(String[] args) {
 int a = 0;
	String b = "Testleaf";
	char c[] = b.toCharArray();
	for(int i = 0;i<=c.length;i++) {
		if(c[i] == 'e') {
			a++;
			System.out.println("This is Occurance number:" + a);
			}
		else {
			System.out.println("This is not an occurance");
		}
		
		}
}
}
