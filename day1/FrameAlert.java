package week4.day1;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FrameAlert {
	public static void main(String[] args) {
		ChromeOptions options = new ChromeOptions();

		options.addArguments("guest");

		// Launch the browser
		ChromeDriver driver = new ChromeDriver(options);
		// EdgeDriver driver=new EdgeDriver();

		// Load the url - get
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");

		// Maximize the browser
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    driver.switchTo().frame("iframeResult");
	
		
		WebElement button = driver.findElement(By.cssSelector("button[onclick='myFunction()']"));
		button.click();
		Alert promptAlert = driver.switchTo().alert();
		//accepting(ok) the alert text
		//promptAlert.accept();
		//cancelling the alert
		promptAlert.dismiss();;
		
		}}