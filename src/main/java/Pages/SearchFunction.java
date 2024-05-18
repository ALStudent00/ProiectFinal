package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class SearchFunction {
    private WebDriver driver;
    public SearchFunction(WebDriver driver) {
        this.driver = driver;
    }
    public void enterSearchTextInput(String productName) {
        WebElement searchInput = driver.findElement(By.name("search"));
        searchInput.sendKeys(productName);
    }
    public void hoverClickSearchButton() {
        Actions action = new Actions(driver);
        WebElement search_button = driver.findElement(By.xpath("//*[@id=\"search\"]/span/button"));
        action.moveToElement(search_button);
        action.moveToElement(driver.findElement(By.xpath("//*[@id=\"search\"]/span/button"))).click().build().perform();
    }
    public void highlightSearch_Ipod() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement searchIpod = driver.findElement(By.xpath("//*[@id=\"content\"]/h1"));
        js.executeScript("arguments[0].style.border='3px double green'", searchIpod);
    }
    public void verifySearchedProductPageTitle() {
        WebElement ipodSearch_page = driver.findElement(By.xpath("//*[@id=\"content\"]/h1"));
        String pageTitle = ipodSearch_page.getText();
        System.out.println(pageTitle);
        assert pageTitle.equals("Search - ipod");
    }
    public void scrollDown() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement element = driver.findElement(By.className("checkbox-inline"));
        js.executeScript("arguments[0].scrollIntoView(true);", element);
    }
    public void highlightIpodClassic() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement iPod_Classic = driver.findElement(By.xpath("//*[@id=\"content\"]/div[3]/div[1]"));
        js.executeScript("arguments[0].style.border='3px dotted green'", iPod_Classic);
    }
    public void highlightIPodNano() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement iPod_Nano = driver.findElement(By.xpath("//*[@id=\"content\"]/div[3]/div[2]"));
        js.executeScript("arguments[0].style.border='3px dotted green'", iPod_Nano);
    }
    public void highlightIPodShuffle() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement iPod_Shuffle = driver.findElement(By.xpath("//*[@id=\"content\"]/div[3]/div[3]"));
        js.executeScript("arguments[0].style.border='3px dotted green'", iPod_Shuffle);
    }
    public void highlightIPodTouch() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement iPod_Touch = driver.findElement(By.xpath("//*[@id=\"content\"]/div[3]/div[4]"));
        js.executeScript("arguments[0].style.border='3px dotted green'", iPod_Touch);
    }
    public void countProductResults() {
        List<WebElement> numberOfProductsFound = driver.findElements(By.className("product-thumb"));
        if (numberOfProductsFound.size() > 1) {
            System.out.println(numberOfProductsFound.size() + " rezultate");
        } else assert false;


        //    (browser: press Back button)    driver.navigate().back();
    }
}
