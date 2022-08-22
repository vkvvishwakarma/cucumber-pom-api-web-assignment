package apphooks;

import com.aventstack.extentreports.TestListener;
import com.factory.DriverFactory;
import com.util.ConfigReader;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;

import java.util.Properties;

import static org.testng.TestNGAntTask.Mode.junit;

public class ApplicationHooks {

    private DriverFactory driverFactory;
    private WebDriver driver;
    private ConfigReader configReader;
    Properties properties;
    private TestListener ExtentTestManager;

    @Before(order=0)
    public void getProperty(){
        configReader = new ConfigReader();
        properties = configReader.init_prop();
    }

    @Before(order =1)
    public void launchBrowser(){
        String browserName = properties.getProperty("browser");
        driverFactory = new DriverFactory();
        driver =   driverFactory.init_driver(browserName);
    }

    @After(order = 0)
    public void quitBrowser(){
        driver.quit();

    }

//    @After(order =1)
//    public static void writeExtentReport() {
//        Reporter.loadXMLConfig(new File(FileReaderManager.getInstance().getConfigReader().getReportConfigPath()));
////    }
//    @After(order =1)
//    public void tearDown(Scenario scenario){
//            //take Screen shot
//            String screenshotName = scenario.getGherkinName().replace(" ","_" );
//            byte[] sourcePath = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
//            scenario.attach(sourcePath,"image/png", screenshotName);
//        }
//    }

}
