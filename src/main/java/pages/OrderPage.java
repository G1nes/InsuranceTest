package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrderPage extends BasePage {

    public OrderPage (WebDriver driver){
        //this.driver=driver;
        PageFactory.initElements(BasePage.getDriver(),this);
        //(new WebDriverWait(driver, 10)).until(ExpectedConditions.visibilityOf(lNameInsured));
    }

    @Override
    public void fillField(WebElement element, String value) {
        super.fillField(element, value);
    }


    @FindBy(name="insured0_surname")
    public WebElement lNameInsured;

    @FindBy(xpath="//input[@name='insured0_name']")
    public WebElement fNameInsured;

    @FindBy(name="insured0_birthDate")
    public WebElement birthDateInsured;

    @FindBy(name="surname")
    public WebElement sName;

    @FindBy(name="name")
    public WebElement fName;

    @FindBy(name="middlename")
    public WebElement mName;

    @FindBy(name="birthDate")
    public WebElement birthDate;

    @FindBy(name="female")
    public WebElement checkBoxFemale;

    @FindBy(name="passport_series")
    public WebElement idSeries;

    @FindBy(name="passport_number")
    public WebElement idNumber;

    @FindBy(name="issueDate")
    public WebElement issueDate;

    @FindBy(name="issuePlace")
    public WebElement issuePlace;

    @FindBy(xpath="//span[@ng-click='save()']")
    public WebElement sendBtn;

    @FindBy(xpath="//*[text()='Заполнены не все обязательные поля']")
    public WebElement errorMessage;
}
