package seleniumSample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class LoginPage {
	public static void main(String[] args) {
		
		ChromeOptions options = new ChromeOptions();
		
		options.addArguments("guest");

		// Launch the browser
		ChromeDriver driver = new ChromeDriver(options);
		// EdgeDriver driver=new EdgeDriver();

		// Load the url - get
		driver.get("http://leaftaps.com/opentaps/control/main");

		// Maximize the browser
		driver.manage().window().maximize();

		driver.findElement(By.id("username")).sendKeys("DemoCSR");

		// Enter the password
		driver.findElement(By.id("password")).sendKeys("crmsfa");

		// Click the Login button
		driver.findElement(By.className("decorativeSubmit")).click();

		// Clcik on the CRMSFA link
		driver.findElement(By.partialLinkText("CRM")).click();
		
		// Click on the Accounts tab
	     driver.findElement(By.linkText("Accounts")).click();
	     
	  // Click on the Create Account link
	   driver.findElement(By.linkText("Create Account")).click();
	   
	   //Enter an Account Name
	   driver.findElement(By.id("accountName")).sendKeys("Sowmya");
	   
	   //Enter description
	   //driver.findElement(By.id("Description")).sendKeys("Selenium Automation Tester");
	   
		 //Find industry element
	   WebElement industryElement = driver.findElement(By.name("industryEnumId"));
	   
	   //Select industry type
	   Select dropdown = new Select(industryElement);
	   dropdown.selectByIndex(2);
	   
	 //Enter description
	   driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
	   
	   //Find ownership element
	   WebElement ownershipType = driver.findElement(By.name("ownershipEnumId"));
	   
	   //Select ownership type
	   Select options1 = new Select(ownershipType);
	   options1.selectByVisibleText("S-Corporation");
	  //Enter description
	   driver.findElement(By.id("Description")).sendKeys("Selenium Automation Tester");
	   
	  //Select and Enter teh source
	  // WebElement provinceElement = driver.findElement(By.name("dataSourceId"));
	   //Select options2 = new Select(sourceElement);
	   
	   
	// Click on the Create Account button
			driver.findElement(By.className("smallSubmit")).click();

	   
		
		}

}
