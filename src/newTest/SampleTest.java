package newTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SampleTest {	

	@Test
	public void gmailLogin() {

		System.setProperty("webdriver.chrome.driver", "C:\\EclipseWorkspace\\TestNGProjects\\Lib\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// launch the firefox browser and open the application url	
		driver.get("https://www.sololearn.com/");
		// maximize the browser window
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());

		//declare and initialize the variable to store the expected title of the webpage.
		String expectedTitle = "SoloLearn: Learn to Code for Free!";

		//fetch the title of the web page and save it into a string variable
		String actualTitle = driver.getTitle();
		Assert.assertEquals(expectedTitle,actualTitle);

		//enter valid credential
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[2]/div[1]/div[5]/a[2]")).click();
		driver.findElement(By.id("Email")).sendKeys("jyothipunna99@gmail.com");  
		driver.findElement(By.xpath("//label[contains(text(),'Password')]")).sendKeys("Jyo@6299");
		//click on sign in button    
		driver.findElement(By.className("materialButton primary elevated")).click();

		//close the web browser
		driver.close();
	}
}
