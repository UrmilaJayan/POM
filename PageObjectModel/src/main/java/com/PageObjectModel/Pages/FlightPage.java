package com.PageObjectModel.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.PageObjectModel.utilities.PageUtilities;

public class FlightPage {
	public WebDriver driver;
	@FindBy(xpath="//a[text()='Flights']")
	WebElement flights;
	@FindBy(xpath="//input[@value='roundtrip']")
	WebElement roundTrip;
	@FindBy(xpath="//div[@class='btn skip']")
			WebElement addClose;
	@FindBy(xpath="//input[@value='oneway']")
	WebElement oneWay;
	
	@FindBy(xpath="//select[@name='passCount']")
	WebElement passengerDropDown;
	@FindBy(xpath="//select[@name='passCount']//child::option[1]")
	WebElement passengerdropdownvalue1;
	@FindBy(xpath="//select[@name='fromPort']")
	WebElement departFromDropDown;
	@FindBy(xpath="//select[@name='fromPort']//child::option[4]")
	WebElement departFromDropDownNewyork;
	@FindBy(xpath="//select[@name='fromMonth']")
	WebElement fromMonthDropDown;
	@FindBy(xpath="//select[@name='fromDay']")
	WebElement fromDayDropDown;
	@FindBy(xpath="//select[@name='toMonth']")
	WebElement toMonthDropDown;
	@FindBy(xpath="//select[@name='toDay']")
	WebElement toDayDropDown;
	//@FindBy(xpath="//select[@name='toPort']")
	/*WebElement toPortDropDown;
	@FindBy(xpath="//select[@name='toPort']")
	WebElement toPortDropDown;
	@FindBy(xpath="//select[@name='toPort']")
	WebElement toPortDropDown;*/
	public FlightPage (WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void clickFlights()
	{
		flights.click();
	}
	
	public boolean roundTripSelection()
	{
		boolean selection= roundTrip.isSelected();
		return selection;
	}
	public boolean oneWaySelection()
	{
		boolean selection= oneWay.isSelected();
		return selection;
	}
	public void clickOneWay()
	{
		oneWay.click();
	}
	
	public void dropDownSelectionPassengerCount(int passCount)
	{
		PageUtilities.selectClassDropdown(driver,  passengerDropDown).selectByIndex(passCount);
		
	}
	public String gettingTextofPassengerDropdown()
	{
		return passengerdropdownvalue1.getText();
	}
	public void dropDownSelectionFromPort(int fromportIndex)
	{
		PageUtilities.selectClassDropdown(driver,  departFromDropDown).selectByIndex(fromportIndex);
		
	}
	public String gettingTextofdepartFromDropDown()
	{
		return departFromDropDownNewyork.getText();
	}
	

}
