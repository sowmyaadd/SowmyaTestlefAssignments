package week3.day1;

public class ChangeNameToUpperCase {
public static void main(String[] args) {
	String str = "changeme";
	char c[] = str.toCharArray();
	for(int i = 0;i<=str.length();i++) {
		if(i%2 != 0) {
			System.out.println(Character.toUpperCase(c[i]));
			
		}
		else
		{
			System.out.println(Character.toLowerCase(c[i]));
		}
	}
}
}
