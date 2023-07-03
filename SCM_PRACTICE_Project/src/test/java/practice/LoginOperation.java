package practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Practice.dummyLoginPage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginOperation {
public static void main(String[] args) {
	 WebDriverManager.chromedriver().setup();
	 WebDriver driver=new ChromeDriver();
	 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 driver.manage().window().maximize();
driver.get("http://rmgtestingserver/domain/Supply_Chain_Management/");
	dummyLoginPage dlp=new dummyLoginPage(driver);
	dlp.loginOperation("admin", "admin123", "admin");
}
}
