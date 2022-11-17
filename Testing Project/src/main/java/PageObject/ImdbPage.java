package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ImdbPage {
	WebDriver driver;
	public ImdbPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);}
	

	@FindBy(linkText="Release date")
	WebElement ImReleaseDate;
	public	WebElement ImReleaseDate() {
		return ImReleaseDate;}
		
	@FindBy(xpath="//*[@id=\"__next\"]/main/div/section[1]/div/section/div/div[1]/section[10]/div[2]/ul/li[1]/div/ul/li/a")	
	WebElement imreleasedate;	
	public WebElement imreleasedate() {
		return imreleasedate;}
	
	@FindBy(linkText="Country of origin")
	WebElement Countryoforigin;
	public WebElement Countryoforigin() {
		return Countryoforigin;}
	
		@FindBy(xpath="//*[@id=\"__next\"]/main/div/section[1]/div/section/div/div[1]/section[10]/div[2]/ul/li[2]/div/ul/li/a")
       WebElement IbIndia;
		
		public WebElement IbIndia () {
			return IbIndia;
		}
		
	}
	
	
