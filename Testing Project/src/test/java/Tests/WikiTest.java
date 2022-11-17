package Tests;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import PageObject.ImdbPage;
import PageObject.WikipediaPage;

import Resources.BaseC;

public class WikiTest extends BaseC {
     WebDriver driver;
	@Test(dataProvider="url1")
	public String WikiPage(String St) throws IOException, InterruptedException {
		 
		WikipediaPage wikiPage = new WikipediaPage(driver);
	//	String expectedTitle="Country";
	//	String actualTitle =wikiPage.Country().getText();
	//	Assert.assertEquals(actualTitle, expectedTitle);
	
		Thread.sleep(2000);
		
		String actualTitle =wikiPage.India().getText();
		String expectedTitle="India";
		Assert.assertEquals(actualTitle, expectedTitle);
		Thread.sleep(3000);
		
		String actualreleasedate=wikiPage.releasedate().getText();
		String expectedreleasedate=	"17 December 2021";
		Assert.assertEquals(actualreleasedate,expectedreleasedate);
		
		WikipediaPage WPage= new WikipediaPage(driver);
		String actualresult;
		try {
			driver = launchdriver();
		driver.get(prop.getProperty("url1"));
		actualresult="successful";
		}catch (Exception e) {
			actualresult="failure";}
		return actualresult;
		}
	@BeforeMethod
	public void OpenApplication() throws IOException {
		driver = launchdriver();
		driver.get(prop.getProperty("url1"));
		
	}
		
		@AfterMethod
		public void Closer() {
			driver.close();}
		
      
    	   
       }



