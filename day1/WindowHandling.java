package week4.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import java.time.Duration;

public class WindowHandling {
	public static void main(String[] args) {
		ChromeOptions options = new ChromeOptions();

		options.addArguments("guest");

		// Launch the browser
		ChromeDriver driver = new ChromeDriver(options);
		// EdgeDriver driver=new EdgeDriver();

		// Load the url - get
		driver.get("http://leaftaps.com/opentaps/control/login");

		// Maximize the browser
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.findElement(By.id("username")).sendKeys("DemoCSR");

		// Enter the password
		driver.findElement(By.id("password")).sendKeys("crmsfa");

		// Click the Login button
		driver.findElement(By.className("decorativeSubmit")).click();

		// Clickk on the CRMSFA link
		driver.findElement(By.partialLinkText("CRM")).click();
		// Click on the Contacts link
		driver.findElement(By.linkText("Contacts")).click();
		// Click on the Merge Contact link
		driver.findElement(By.linkText("Merge Contacts")).click();
		//click on the from contact 
		driver.findElement(By.xpath("//img[@alt='Lookup']")).click();
		 // Switch to first popup window and select the first resulting contact
        String mainWindow = driver.getWindowHandle();
        for (String windowHandle : driver.getWindowHandles()) {
            if (!windowHandle.equals(mainWindow)) {
                driver.switchTo().window(windowHandle);
                // Assuming the first result is a link—adjust locator as per actual UI
                driver.findElement(By.xpath("//a")).click();
                driver.close();  // Close the lookup popup
                break;
            }
        }
        driver.switchTo().window(mainWindow);

        // Click To Contact widget
        driver.findElement(By.xpath("(//img[@alt='Lookup'])[2]")).click();

        // Switch to second popup window and select the second resulting contact
        for (String windowHandle : driver.getWindowHandles()) {
            if (!windowHandle.equals(mainWindow)) {
                driver.switchTo().window(windowHandle);
                driver.findElement(By.xpath("(//a)[2]")).click(); // Pick second link
                driver.close();
                break;
            }
        }
        driver.switchTo().window(mainWindow);

        //Click Merge button
        driver.findElement(By.xpath("//a[text()='Merge']")).click();
        
}
	
}