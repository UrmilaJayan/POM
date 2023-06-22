package com.PageObjectModel.Scripts;


import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.PageObjectModel.Base.TestBase;
import com.PageObjectModel.Pages.LoginPage;
import com.PageObjectModel.constants.Constants;
import com.PageObjectModel.utilities.ExcelRead;

public class LoginTest extends TestBase {
	LoginPage objLogin;
  @Test(dataProvider="invalidUserValidPassword",priority=1,groups= {"smoke"},retryAnalyzer=com.PageObjectModel.Listners.RetryAnalyzer.class)                                         //name od dataprovider
  public void verifySigninInvalidUserValidPassword(String userName,String password1) {
	  
	  
	  objLogin=new LoginPage(driver);
	  objLogin.setUserName(userName);
	  objLogin.setPassword(password1);
	  objLogin.clickSignIn();
	  Assert.assertEquals(driver.getTitle(),Constants.LOGINTITLE);
  }
	  
  @Test(dataProvider="validUserInvalidPassword",priority=2,groups= {"smoke"})                                         //name od dataprovider
  public void verifySigninValidUserInvalidPassword(String userName,String password1) {
	  
	  
	  objLogin=new LoginPage(driver);
	  objLogin.setUserName(userName);
	  objLogin.setPassword(password1);
	  objLogin.clickSignIn();
	  Assert.assertEquals(driver.getTitle(),Constants.LOGINTITLE);
  }
  @Test(dataProvider="invalidUserInvalidPassword",priority=3,groups= {"smoke"})                                         //name od dataprovider
  public void verifySigninInvalidUserInvalidPassword(String userName,String password1) {
	  
	  
	  objLogin=new LoginPage(driver);
	  objLogin.setUserName(userName);
	  objLogin.setPassword(password1);
	  objLogin.clickSignIn();
	  Assert.assertEquals(driver.getTitle(),Constants.LOGINTITLE);
  }
	  @Test(dataProvider="validUserValidPassword",priority=4,groups= {"smoke"})                                         //name od dataprovider
	  public void verifySigninValidUserValidPassword(String userName,String password1) {
		  
		  
		  objLogin=new LoginPage(driver);
		  objLogin.setUserName(userName);
		  objLogin.setPassword(password1);
		  objLogin.clickSignIn();
		  Assert.assertEquals(driver.getTitle(),Constants.HOMETITLE);
		  
	  
  }
  


@DataProvider()
public Object[][] invalidUserValidPassword() {
	  Object[][] data=new Object[1][2];
	  data[0][0]=ExcelRead.getCellStringData(0,0,Constants.Sheet1); //username zeroth row zeroth column1
	  data[0][1]=ExcelRead.getCellStringData(0,1,Constants.Sheet1); //password
	  return data;
	  
}
@DataProvider
public Object[][] validUserInvalidPassword() {
	  Object[][] data=new Object[1][2];
	  data[0][0]=ExcelRead.getCellStringData(1,0,Constants.Sheet1); 
	  data[0][1]=ExcelRead.getCellStringData(1,1,Constants.Sheet1); 
	  return data;
	  }
@DataProvider
public Object[][] invalidUserInvalidPassword() {
	  Object[][] data=new Object[1][2];
	  data[0][0]=ExcelRead.getCellStringData(2,0,Constants.Sheet1); 
	  data[0][1]=ExcelRead.getCellStringData(2,1,Constants.Sheet1); 
	  return data;
	  }
@DataProvider
public Object[][] validUserValidPassword() {
	  Object[][] data=new Object[1][2];
	  data[0][0]=ExcelRead.getCellStringData(3,0,Constants.Sheet1); 
	  data[0][1]=ExcelRead.getCellStringData(3,1,Constants.Sheet1); 
	  return data;
	  }
	  
	  

}
  
  
