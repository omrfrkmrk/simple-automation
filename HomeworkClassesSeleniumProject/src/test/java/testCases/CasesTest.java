package testCases;

import java.text.ParseException;

import org.testng.annotations.Test;

public class CasesTest {

  @Test(priority = 1)
  public void firstCaseTest() {
	  Cases.firstCase();    
  }

  @Test(priority = 2)
  public void secondCaseTest() {
	  Cases.secondCase();
  }

  @Test(priority = 3)
  public void thirdCaseTest() throws ParseException {
	  Cases.thirdCase();
  }
}
