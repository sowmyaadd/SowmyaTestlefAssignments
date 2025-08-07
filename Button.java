package week3.day1;

public class Button extends WebElement {
public void submit() {
	System.out.println("Submit");}
public static void main(String[] args) {
	Button bu = new Button();
	bu.click();
	bu.submit();
	bu.setText("Set Text");
}
}
