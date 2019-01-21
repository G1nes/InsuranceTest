package steps;

import org.junit.Assert;
import pages.BasePage;
import pages.InsuranceTypePage;
import ru.yandex.qatools.allure.annotations.Step;

public class InsuranceTypeSteps extends BasePage {
    @Step
    public void checkTitle(String value){
        Assert.assertEquals(value,new InsuranceTypePage(BasePage.getDriver()).travellerInsurance.getText());
    }
    @Step
    public void selectIssueOnlineBtn (){
        new InsuranceTypePage(BasePage.getDriver()).issueOnline.click();
    }
}
