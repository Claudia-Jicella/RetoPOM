package co.com.despegar.configuracion;

import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static io.cucumber.messages.internal.com.google.common.base.StandardSystemProperty.USER_DIR;

public class WebUI {

    private static final String WEBDRIVER_CHROME_DRIVER = "webdriver.chrome.driver";
    private static final String WEBDRIVER_CHROME_DRIVER_PATH = "src/test/resources/windows/chrome/chromedriver.exe";

    private static final String DEMO_QA_URL= "https://www.despegar.com.co/vuelos/";

    protected WebDriver driver;

    private void setUpWebDriver(){
        System.setProperty(WEBDRIVER_CHROME_DRIVER,WEBDRIVER_CHROME_DRIVER_PATH );
    }

    private void setUpWebDriverUrl(){
        driver = new ChromeDriver();
        driver.get(DEMO_QA_URL);
        driver.manage().window().maximize();
    }
    protected void generalSetup(){
        setUpWebDriver();
        setUpWebDriverUrl();

    }

    protected void quiteDriver(){
        driver.quit();
    }

    protected void maximize(){
        driver.manage().window().maximize();
    }
}
