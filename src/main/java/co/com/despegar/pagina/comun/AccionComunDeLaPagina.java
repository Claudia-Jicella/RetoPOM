package co.com.despegar.pagina.comun;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class AccionComunDeLaPagina {

    protected WebDriver driver;

    public AccionComunDeLaPagina(WebDriver driver) {
        this.driver = driver;
    }

    protected void escribir(By locator, String value) {
        driver.findElement(locator).sendKeys(value);
    }

    public void borrarTexto(By locator) {
        driver.findElement(locator).clear();
    }


    public void scrollTo(By locator) {
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("argument[0].scrollIntoView();", driver.findElement(locator));

    }

    public void click(By locator) {
        driver.findElement(locator).click();
    }

    public void scrollDown(By buscarBoton) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,1000)");
    }

    protected String getText(By locator) {
        return driver.findElement(locator).getText();
    }
}
