package week3.day1;

public class WebElement {
public void click(){
	System.out.println("Click");
}
public void setText(String text) {
	System.out.println("String Text");
}
public static void main(String[] args) {
	WebElement we = new WebElement();
	we.click();
	we.setText("String Text");
}
}
