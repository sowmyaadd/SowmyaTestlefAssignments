package seleniumSample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FacebookLogin {
public static void main(String[] args) {
	ChromeOptions options = new ChromeOptions();

	options.addArguments("guest");

	// Launch the browser
	ChromeDriver driver = new ChromeDriver(options);
	// EdgeDriver driver=new EdgeDriver();

	// Load the url - get
	driver.get("https://en-gb.facebook.com/");
	driver.findElement(By.linkText("Create new account")).click();
	driver.findElement(By.name("firstname")).sendKeys("Sowmya");
	driver.findElement(By.name("lastname")).sendKeys("D");
	driver.findElement(By.name("reg_email__")).sendKeys("1234567890");
	}
}
