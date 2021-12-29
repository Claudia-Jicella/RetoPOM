package co.com.despegar.configuracion;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

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

    //falta log4j

}
