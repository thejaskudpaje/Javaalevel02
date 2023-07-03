package TYSS;

import java.util.List;
import java.util.concurrent.TimeUnit;

import javax.xml.xpath.XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonEarphones {
static {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	
}
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
	driver.get("https://www.amazon.in");
	driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Earphones");
	Thread.sleep(10000);
	 List<WebElement> sugg = driver.findElements(By.xpath("//div[@class='autocomplete-results-container']/descendant::div[contains(text(),'earphones')]"));
	 for(WebElement i:sugg) {
		 System.out.println(i.getText());
	 }
	 //driver.close();
}
}
