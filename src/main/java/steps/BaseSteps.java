package steps;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.ArrayList;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public abstract class BaseSteps {
    private static WebDriver driver;
    private static String url;
    private static Properties stepsProperties=StepsProperties.getInstance().getProperties();

    public BaseSteps(){
    }
    @Before
    public void setUp(){
        switch (stepsProperties.getProperty("browser")){
            case "chrome":
                driver = new ChromeDriver();
                System.setProperty("webdriver.chrome.driver", stepsProperties.getProperty("webdriver.chrome.driver"));
            case "firefox":
                driver = new FirefoxDriver();
                System.setProperty("webdriver.gecko.driver", stepsProperties.getProperty("webdriver.gecko.driver"));
                default:
                    driver = new ChromeDriver();
                    System.setProperty("webdriver.chrome.driver", stepsProperties.getProperty("webdriver.chrome.driver"));
        }
        url = stepsProperties.getProperty("url");
        driver.get(url);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver .manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
    }
    @AfterClass
    public static void endTest(){
        driver.close();
    }

    public void fillField(WebElement element, String value){
        element.clear();
        element.sendKeys(value);
    }
    public void selectNextTab(){
        ArrayList<String>tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(tabs.size()-1));
    }
}
