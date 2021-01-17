package testCases;

import java.text.ParseException;

import org.testng.annotations.Test;

import Pages.Cases;
import TestBase.TestBase;

public class CasesTest extends TestBase{
  
  @Test
  public void firstCaseTest() {
	  
	  Cases.firstCase(driver);    
  }

  @Test
  public void secondCaseTest() {
	  Cases.secondCase(driver);
  }

  @Test
  public void thirdCaseTest() throws ParseException {
	  Cases.thirdCase(driver);
  }
}
