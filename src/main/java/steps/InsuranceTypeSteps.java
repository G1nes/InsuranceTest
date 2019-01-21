package steps;

import io.qameta.allure.Step;
import org.junit.Assert;
import pages.BasePage;
import pages.InsuranceTypePage;

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
