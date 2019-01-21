package pages;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.ArrayList;
import java.util.Properties;
import java.util.concurrent.TimeUnit;


public abstract class BasePage {
    private static WebDriver driver;
    private static String url;
    private static Properties pageProperties = PageProperties.getInstance().getProperties();

    public BasePage(){
    }
    @BeforeClass
    public static void setUp(){
        switch (pageProperties.getProperty("browser")){
            case "chrome":
                System.setProperty("webdriver.chrome.driver", pageProperties.getProperty("webdriver.chrome.driver"));
                driver = new ChromeDriver();
                break;
            case "firefox":
                System.setProperty("webdriver.gecko.driver", pageProperties.getProperty("webdriver.gecko.driver"));
                driver = new FirefoxDriver();
                break;
            default:
                System.setProperty("webdriver.chrome.driver", pageProperties.getProperty("webdriver.chrome.driver"));
                driver = new ChromeDriver();
                break;
        }
        url = pageProperties.getProperty("url");
        driver.get(url);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
    }
    @AfterClass
    public static void endTest(){
        driver.quit();
    }
    public static WebDriver getDriver(){
        return driver;
    }
    public void fillField(WebElement element, String value){
        element.clear();
        element.sendKeys(value);
    }
    public void selectNextTab(){
        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(tabs.size()-1));
    }
}
