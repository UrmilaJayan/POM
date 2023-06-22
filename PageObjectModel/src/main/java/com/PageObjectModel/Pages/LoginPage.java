package com.PageObjectModel.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage 
{
	public WebDriver driver;
	@FindBy(xpath="//input[@name='userName']")
	WebElement user;
	@FindBy(xpath="//input[@name='password']")
	WebElement password;
	@FindBy(xpath="//input[@name='submit']")
	WebElement login;
	
	
	
	public LoginPage (WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void setUserName(String userName)
	{
		user.sendKeys(userName);
	}
	public void setPassword(String password1)
	{
		password.sendKeys(password1);
	}
	public void clickSignIn()
	{
		login.click();
	}
	

}
