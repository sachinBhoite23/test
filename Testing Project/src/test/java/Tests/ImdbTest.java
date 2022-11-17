package Tests;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import PageObject.ImdbPage;
import PageObject.WikipediaPage;
import Resources.BaseC;

public class ImdbTest extends BaseC {
	WebDriver driver;
	private Object st;
	@Test
	public String LandRegister(WebDriver driver) throws InterruptedException, IOException {
		
		ImdbPage imdbPage = new ImdbPage(driver);
		String Actualimrelease=imdbPage.imreleasedate().getText();
		String Expectedimrelease="https://www.imdb.com/title/tt9389998/releaseinfo?ref_=tt_dt_rdat";
		Assert.assertEquals(Actualimrelease, Expectedimrelease);
		
	Thread.sleep(2000);
	
	String ActualibIndia=imdbPage.IbIndia().getText();
	String ExpectedibIndia="India";
	Assert.assertEquals(ActualibIndia, ExpectedibIndia);
	Thread.sleep(2000);
 	String WikiTest="";
	WikiTest test= new WikiTest ();
	test.WikiPage(ActualibIndia);
	
	
	if (WikiTest == ActualibIndia ) {
		System.out.println("The test is passed");
	}else {
		System.out.println("The test is failed");
	}
	
	String actualreleasedate = null;
	test.WikiPage(actualreleasedate);
	
	if(actualreleasedate == Actualimrelease ) {
		System.out.println("Actual time is match");
	}else {
		System.out.println("Actual time is not match");
	}
	return WikiTest;
	
	
	
	
	}
	
	@BeforeMethod
	public void OpenApplication() throws IOException {
		driver = launchdriver();
		driver.get(prop.getProperty("url"));

}
	@AfterMethod
	public void Closer() {
		driver.close();}
	


}
