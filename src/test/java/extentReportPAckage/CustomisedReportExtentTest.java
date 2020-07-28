package extentReportPAckage;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import org.testng.ITestResult;
import org.testng.SkipException;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.ChartLocation;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class CustomisedReportExtentTest {
  @Test
  public void CustomisedReportExtentTestD() {
	  System.setProperty("webdriver.chrome.driver", "D:\\\\Obsqura\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in");
		if(driver.getTitle().equals("Google"))
		{
		test.log(LogStatus.PASS, "Navigated to the specified URL");
		}
		else
		{
		test.log(LogStatus.FAIL, "Test Failed");
		}
  }
  @BeforeClass
  public void startTest() {
		report = new ExtentReports(System.getProperty("user.dir")+"\\ExtentReportResults.html");
		test = report.startTest("ExtentDemo");
		
  }

  @AfterClass
  public void  endTest() {
	  report.endTest(test);
		report.flush();
  }

}
