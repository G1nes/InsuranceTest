package steps;

import io.qameta.allure.Step;
import pages.BasePage;
import pages.CalculatorPage;

public class CalculatorSteps extends BasePage {
    @Step
    public void selectCheckBox(){
        new CalculatorPage(BasePage.getDriver()).priceBox.click();
    }
    @Step
    public void selectIssueBtn(){
        new CalculatorPage(BasePage.getDriver()).orderBtn.click();
    }
}
