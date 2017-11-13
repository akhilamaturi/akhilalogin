import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class Hooks extends BasePage {

     @Before
        public  void open() {
            if (AutomationConstraints.BROWSER.equalsIgnoreCase("chrome")) {
                System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
                driver = new ChromeDriver();
            } else if (AutomationConstraints.BROWSER.equalsIgnoreCase("firefox")) {
                System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
                driver = new FirefoxDriver();
            } else {
                System.out.println("Please give a valid browser");
            }
            driver.get(AutomationConstraints.URL);
            //driver.manage().timeouts().implicitlyWait(AutomationConstraints.MAX_TIMEOUTS, TimeUnit.SECONDS);
        }
        @After
       public  void close()
        {
            driver.quit();
        }
    }


