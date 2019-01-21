package steps;

import io.qameta.allure.Step;
import pages.BasePage;
import pages.MainPage;


public class MainSteps extends BasePage {
    @Step
    public void selectMenuItem(String value){
        new MainPage(BasePage.getDriver()).selectMenuItem(value);
    }
    @Step
    public void selectSubMenuItem(String value){
        new MainPage(BasePage.getDriver()).selectSubMenu(value);
    }
}
