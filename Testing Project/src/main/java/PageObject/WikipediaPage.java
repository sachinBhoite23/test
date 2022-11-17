package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WikipediaPage {
	WebDriver driver;

	public WikipediaPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//*[@id=\\\"mw-content-text\\\"]/div[1]/table[1]/tbody/tr[12]/th/div']")
	WebElement ReleaseDate;

	public WebElement ReleaseDate() {
		return ReleaseDate;
	}

	@FindBy(xpath = "//*[@id=\"mw-content-text\"]/div[1]/table[1]/tbody/tr[12]/td/div/ul/li")
	WebElement releasedate;

	public WebElement releasedate() {
		return releasedate;
	}

	@FindBy(xpath = "//*[@id=\"mw-content-text\"]/div[1]/table[1]/tbody/tr[14]/th")
	WebElement Country;

	public WebElement Country() {
		return Country;}
		
		@FindBy(linkText="India")
		WebElement India;
		public WebElement India() {
		return India ;}

	}

