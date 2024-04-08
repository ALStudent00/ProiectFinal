package Pages;
import dev.failsafe.internal.util.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
    private WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }
    public void selectEuroCurrency() {
        WebElement dropDownArrow = driver.findElement(By.cssSelector("i.fa.fa-caret-down"));
        WebElement euroCurrency = driver.findElement(By.name("EUR"));
        dropDownArrow.click();
        euroCurrency.click();
    }
    public void scrollDownToFeatured() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement element = driver.findElement(By.xpath("//*[@id=\"content\"]/h3"));
        js.executeScript("arguments[0].scrollIntoView(true);", element);
    }
}
