package com.PageObjectModel.Scripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.PageObjectModel.Base.TestBase;
import com.PageObjectModel.Pages.FlightPage;
import com.PageObjectModel.constants.Constants;

public class FlightsTest extends TestBase {
	
	FlightPage objFlight;
	
	 
  @Test(priority=5,description="Validating round trip selector",retryAnalyzer=com.PageObjectModel.Listners.RetryAnalyzer.class)
  
  public void checkRoundTripRadioSelectionByDefault()
  {
	  objFlight=new FlightPage(driver);
	  objFlight.clickFlights();
	  Assert.assertTrue(objFlight.roundTripSelection(), "Round Trip is not selected by default");
	  
  }
  
  @Test(priority=6)
  public void oneWayTripRadioSelection()
  {
	  objFlight=new FlightPage(driver);
	  Assert.assertFalse(objFlight.oneWaySelection(), "OneWay Trip is selected by default");
	  
  }
  @Test(priority=7)
  public void oneWayTripRadioSelectionAfterClicking()
  {
	  objFlight=new FlightPage(driver);
	  objFlight.clickOneWay();
	  Assert.assertTrue(objFlight.oneWaySelection(), "OneWay Trip is not selected after clicking");
	  
  }
  @Test(priority=8)
  public void checkpassengerDropDown()
  {
	  objFlight=new FlightPage(driver);
	  objFlight.dropDownSelectionPassengerCount(Constants.PASSENGERINDEX);
	  Assert.assertEquals(objFlight.gettingTextofPassengerDropdown(), Constants.PASSENGERTEXT);
  }
  @Test(priority=9)
  public void checkFromPortDropdown()
  {
	  objFlight=new FlightPage(driver);
	  objFlight.dropDownSelectionFromPort(Constants.FROMPORTINDEX);
	  Assert.assertEquals(objFlight.gettingTextofdepartFromDropDown(), Constants.FROMPORTNEWYORK);
  
	  
  }
  
  
  
}
