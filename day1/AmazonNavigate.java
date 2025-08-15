package week4.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AmazonNavigate {
	public static void main(String[] args) {
		ChromeOptions options = new ChromeOptions();

		options.addArguments("guest");

		// Launch the browser
		ChromeDriver driver = new ChromeDriver(options);
		// EdgeDriver driver=new EdgeDriver();

		// Load the url - get
		driver.get("https://www.amazon.in/");

		// Maximize the browser
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Mobile Phones");
		driver.findElement(By.id("nav-search-submit-button")).click();
		 List<WebElement> priceElements = driver.findElements(By.cssSelector("div.s-main-slot > div[data-component-type='s-search-result']"));
		 List<String> price = new ArrayList<>();
		 for (WebElement prc : priceElements) {
             price.add(prc.getText());
             System.out.println(price);
             Collections.sort(price);
             System.out.println(price.get(0));
             
         }

		 
		 }
		 }

