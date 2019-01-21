package steps;

import pages.BasePage;
import pages.CalculatorPage;
import ru.yandex.qatools.allure.annotations.Step;

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
