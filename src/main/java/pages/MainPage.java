package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MainPage extends BasePage {
    private static String tmp;
    public MainPage (WebDriver driver){
    PageFactory.initElements(getDriver(), this);
    (new WebDriverWait(driver, 20)).until(ExpectedConditions.visibilityOf(insuranceBtn));
    }
    @FindBy(xpath = "//ul[@class='lg-menu__list']")
    public WebElement insuranceBtn;

    @FindBy(xpath = "//ul[@class='lg-menu__list']//*/span[contains(text(), 'Страхование')]/../following-sibling::*")
    public WebElement travelAndPurchases;

    public void selectMenuItem (String menuPoint){
        insuranceBtn.findElement(By.xpath(".//li[@class='lg-menu__item']/*/span[contains(text(),'"+menuPoint+"')]")).click();
        tmp = menuPoint;
    }
    public void selectSubMenu (String subMenuPoint){
        WebElement travelAndPurchases = insuranceBtn.findElement(By.xpath(".//*/span[contains(text(),'"+tmp+"')]/../following-sibling::*"));
        travelAndPurchases.findElement(By.xpath(".//*[text()='"+subMenuPoint+"']")).click();
        tmp=null;
    }
}
