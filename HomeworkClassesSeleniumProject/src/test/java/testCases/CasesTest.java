package testCases;

import java.text.ParseException;

import org.testng.annotations.Test;

public class CasesTest {

  @Test
  public void firstCaseTest() {
	  Cases.firstCase();    
  }

  @Test
  public void secondCaseTest() {
	  Cases.secondCase();
  }

  @Test
  public void thirdCaseTest() throws ParseException {
	  Cases.thirdCase();
  }
}
