package Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class dummyLoginPage {
	//declaration of web elements
@FindBy(id="login:username")private WebElement username;
@FindBys({@FindBy(id="login:password"),@FindBy(xpath="//input[@placeholder='Password']")})private WebElement password;
@FindAll({@FindBy(id="login:type"),@FindBy(name="login_type")}) private WebElement loginTypeDD;
@FindBy(xpath ="//input[@class='submit_button']") private WebElement submitBtn;



public dummyLoginPage(WebDriver driver) {
	PageFactory.initElements(driver, this);
}

public void loginOperation(String un, String pw, String logintype) {
	username.sendKeys(un);
	password.sendKeys(pw);
	Select s1=new Select(loginTypeDD);
	s1.selectByValue(logintype);
	submitBtn.click();
	
}
}

