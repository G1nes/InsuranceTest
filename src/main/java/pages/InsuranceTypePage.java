package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InsuranceTypePage extends BasePage {
    public InsuranceTypePage (WebDriver driver){
        //this.driver=driver;
        PageFactory.initElements(BasePage.getDriver(), this);
        //(new WebDriverWait(driver, 10)).until(ExpectedConditions.visibilityOf(issueOnline));
    }
    @FindBy(xpath="//*[contains(@href, 'vzr')]")
    public WebElement issueOnline;
    @FindBy(xpath="//*[text()='Страхование путешественников']")
    public WebElement travellerInsurance;
}
