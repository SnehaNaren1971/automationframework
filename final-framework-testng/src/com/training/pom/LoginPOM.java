package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPOM {
	private WebDriver driver; 
	
	public LoginPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(className="sign-in")  //formLogin_submitAuth")
	private WebElement loginBtn;
	
	@FindBy(id="user_login")
	private WebElement userName; 
	
	@FindBy(name="pwd")
	private WebElement password;
		 
	
	public void sendUserName(String userName) {
		this.userName.clear();
		this.userName.sendKeys(userName);
	}
	
	public void sendPassword(String password) {
		this.password.clear(); 
		this.password.sendKeys(password); 
	}
	
	public void clickLoginBtn() {
		this.loginBtn.click(); 
	}
	//
	@FindBy (name="login")

	private WebElement loginButton;

	
	public void LoginWithAccount(){

		this.loginButton.click();

	}

	@FindBy (name="submit")

	private WebElement submitButton;

	

	public void clickOnSubmit(){

		this.submitButton.click();

	}

@FindBy(xpath="//*[@id='wpbody-content']/div[3]/form/table/thead/tr/th")

private WebElement col;



	/*@FindBy(class="sign-in")

	private WebElement signin;*/

	

	/*@FindBy(name="log")

	private WebElement usename;*/

	

	/*@FindBy(id="login")

	private WebElement userName; 

	

	@FindBy(id="password")

	private WebElement password;

	

	

	

	@FindBy(id="formLogin_submitAuth")

	private WebElement loginBtn; 

	

	public void sendUserName(String userName) {

		this.userName.clear();

		this.userName.sendKeys(userName);

	}

	

	public void sendPassword(String password) {

		this.password.clear(); 

		this.password.sendKeys(password); 

	}

	

	public void clickLoginBtn() {

		this.loginBtn.click(); 

	}

	*/

	public void clickOnLogin()

	{

		//driver.findElement(By.xpath("//*[class='sign-in']")).click();

		//this.signin.click();

	}

	public void enterUsername()

	{

		//this.usename.sendKeys("gmail.com");
	}
}
