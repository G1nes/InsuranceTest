package pages;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class PageProperties {
    private Properties properties = new Properties();
    private static PageProperties INSTANCE = null;
    private PageProperties(){
        try {
            properties.load(new FileInputStream(new File("C:\\Program Files\\Repositories\\InsuranceTest\\InsuranceTest.properties")));
        }catch (Exception e){
            e.getStackTrace();
        }
    }
    public static PageProperties getInstance(){
        if (INSTANCE == null){
            INSTANCE = new PageProperties();
        }
        return INSTANCE;
    }
    public Properties getProperties() {
        return properties;
    }
}
