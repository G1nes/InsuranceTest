package pages;

import org.openqa.selenium.WebElement;
import steps.BaseSteps;


public abstract class BasePage extends BaseSteps {
    public BasePage(){
    }
    @Override
    public void fillField(WebElement element, String value) {
        super.fillField(element, value);
    }

    @Override
    public void selectNextTab() {
        super.selectNextTab();
    }
}
