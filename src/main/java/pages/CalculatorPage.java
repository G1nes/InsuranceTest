package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import steps.BaseSteps;
import steps.CalculatorSteps;

public class CalculatorPage extends BasePage {
    public CalculatorPage(WebDriver driver){
        PageFactory.initElements(BasePage.getDriver(), this);
        (new WebDriverWait(driver, 20)).until(ExpectedConditions.visibilityOf(orderBtn));
    }
    @FindBy(xpath="//SPAN[@ng-click='save()']")
    public WebElement orderBtn;
    @FindBy(xpath="//div[@ng-click='setProdProg(prodProg)']")
    public WebElement priceBox;
}
