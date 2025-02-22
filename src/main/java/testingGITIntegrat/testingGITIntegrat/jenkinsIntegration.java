package testingGITIntegrat.testingGITIntegrat;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class jenkinsIntegration {

	@Test
	public void test() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.dezlearn.com/webtable-example/");

		String title = driver.getTitle();
		
		Reporter.log(title);
		
	}
	
	
}
