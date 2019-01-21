/*package steps;

import java.io.*;
import java.util.Properties;

public class StepsProperties {
    private Properties properties = new Properties();
    private static StepsProperties INSTANCE = null;
    private StepsProperties() {
        try {
            properties.load(new FileInputStream(new File("C:\\Program Files\\Repositories\\InsuranceTest\\InsuranceTest.properties")));
        }catch (Exception e){
            e.getStackTrace();
        }

    }
    public static StepsProperties getInstance() {
        if (INSTANCE == null){
            INSTANCE = new StepsProperties();
        }
        return INSTANCE;
    }
    public Properties getProperties (){
        return properties;
    }
}*/
