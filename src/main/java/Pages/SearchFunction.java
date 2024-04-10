package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class SearchFunction {
    private WebDriver driver;
    public SearchFunction(WebDriver driver) {
        this.driver = driver;
    }
    public void clickSearchButton(String productName) {
        WebElement searchInput = driver.findElement(By.name("search"));
        searchInput.sendKeys(productName);
        WebElement search_button = driver.findElement(By.xpath("//*[@id=\"search\"]/span/button"));
        search_button.click();
    }
    public void verifySearchedProductPageTitle() {
        WebElement pageSearchIpod = driver.findElement(By.xpath("//*[@id=\"content\"]/h1"));
        String titlePage = pageSearchIpod.getText();
        System.out.println(titlePage);
        assert titlePage.equals("Search - ipod");
    }
    public void scrollDowm() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement element = driver.findElement(By.className("checkbox-inline"));
        js.executeScript("arguments[0].scrollIntoView(true);", element);
    }
    public void verifyNumberOfResults() {
        List<WebElement> numberOfProducts = driver.findElements(By.className("product-thumb"));
        if (numberOfProducts.size() > 1) {
            System.out.println(numberOfProducts.size() + " rezultate");
        } else assert false;
    }
}