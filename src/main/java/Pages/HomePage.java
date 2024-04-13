package Pages;
import dev.failsafe.internal.util.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class HomePage {
    private WebDriver driver;


    public HomePage(WebDriver driver) {
        this.driver = driver;
    }
    public void highlightPricesYellow() {
        // Evidentiaza preturile
        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement price = driver.findElement(By.className("price"));
        WebElement price2 = driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div[2]/div/div[2]/p[2]"));
        WebElement price3 = driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div[3]/div/div[2]/p[2]"));
        WebElement price4 = driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div[4]/div/div[2]/p[2]"));
        js.executeScript("arguments[0].style.border='5px dotted yellow'", price);
        js.executeScript("arguments[0].style.border='5px dotted yellow'", price2);
        js.executeScript("arguments[0].style.border='5px dotted yellow'", price3);
        js.executeScript("arguments[0].style.border='5px dotted yellow'", price4);
    }
    public void highlightMacBookPriceYellow() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement macbook_price = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/ul[2]/li[1]/h2"));
        js.executeScript("arguments[0].style.border='5px dotted yellow'", macbook_price);
    }
    public void clickDropDownArrow() {
        WebElement dropDownArrow = driver.findElement(By.cssSelector("i.fa.fa-caret-down"));
        dropDownArrow.click();
    }
    public void hoverSelectEuroCurrency() {
        Actions action = new Actions(driver);
        WebElement euroCurrency = driver.findElement(By.name("EUR"));
        // Hover over euroCurrency + click
        action.moveToElement(euroCurrency);
        action.moveToElement(driver.findElement(By.name("EUR"))).click().build().perform();

        // Alternative with longer hover but skips sleep time
//        Actions builder = new Actions(driver);
//        builder.moveToElement(euroCurrency).build().perform();
    }
    public void highlightMacBookPriceGreen() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement macbook_price = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/ul[2]/li[1]/h2"));
        js.executeScript("arguments[0].style.border='5px dotted green'", macbook_price);
    }
    public void scrollDownToFeatured() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement element = driver.findElement(By.xpath("//*[@id=\"content\"]/h3"));
        js.executeScript("arguments[0].scrollIntoView(true);", element);
    }
    public void highlightPrice1Green() {
        JavascriptExecutor js =(JavascriptExecutor)driver;
        WebElement price1 = driver.findElement(By.className("price"));
        js.executeScript("arguments[0].style.border='1.8px dashed green'", price1);
    }
    public void highlightPrice2Green() {
        JavascriptExecutor js =(JavascriptExecutor)driver;
        WebElement price2 = driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div[2]/div/div[2]/p[2]"));
        js.executeScript("arguments[0].style.border='1.8px dashed green'", price2);
    }
    public void highlightPrice3Green() {
        JavascriptExecutor js =(JavascriptExecutor)driver;
        WebElement price3 = driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div[3]/div/div[2]/p[2]"));
        js.executeScript("arguments[0].style.border='1.8px dashed green'", price3);
    }
    public void highlightPrice4Green() {
        JavascriptExecutor js =(JavascriptExecutor)driver;
        WebElement price4 = driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div[4]/div/div[2]/p[2]"));
        js.executeScript("arguments[0].style.border='1.8px dashed green'", price4);
    }
    public void clickOnMacBookProductImage() {
        WebElement macBook_text = driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div[1]/div/div[1]/a/img"));
        macBook_text.click();
    }
}
