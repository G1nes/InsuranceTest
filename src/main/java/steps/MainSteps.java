package steps;

import pages.BasePage;
import pages.MainPage;
import ru.yandex.qatools.allure.annotations.Step;

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
