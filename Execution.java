package week3.day1;

public class Execution extends Button {
	public void exec() {
	System.out.println("execution");
}
public static void main(String[] args) {
	Execution ec = new Execution();
	ec.click();
	ec.submit();
	ec.setText("");
}
}
