package week3.day1;

public class TextField extends WebElement{
public void getText() {
	System.out.println("Get Text");
}
public static void main(String[] args) {
	TextField tf = new TextField();
	tf.click();
	tf.setText("String Text");
	tf.getText();
}
}
