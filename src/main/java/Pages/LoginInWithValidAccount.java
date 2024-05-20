package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class LoginInWithValidAccount {
    private WebDriver driver;

    public LoginInWithValidAccount(WebDriver driver) {
        this.driver = driver;
    }
    public void clickMyAccountLogin() {
        WebElement myAccount = driver.findElement(By.cssSelector("i.fa.fa-user"));
        myAccount.click();
    }
    public void hoverClick_Login() {
        Actions action = new Actions(driver);
        WebElement Login = driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/ul/li[2]/a"));
        action.moveToElement(Login);
        action.moveToElement(driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/ul/li[2]/a"))).click().build().perform();
    }
    public void highlightCredFields() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement credFields = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div"));
        js.executeScript("arguments[0].style.border='3px double turquoise'", credFields);
    }
    public void insertEmail(String email) {
        WebElement email_locator = driver.findElement(By.name("email"));
        email_locator.sendKeys(email);
    }
    public void insertPassword(String password) {
        WebElement password_locator = driver.findElement(By.name("password"));
        password_locator.sendKeys(password);
    }
    public void hoverClickLogin() {
        Actions action = new Actions(driver);
        WebElement login_button = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input"));
        action.moveToElement(login_button);
        action.moveToElement(driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input"))).click().build().perform();
    }
    public void highlightMyAccount() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement myAccount_title = driver.findElement(By.xpath("//*[@id=\"content\"]/h2[1]"));
        js.executeScript("arguments[0].style.border='3px double green'", myAccount_title);
    }
    public String verifyMyAccountPageTitle() {
        return driver.getTitle();
    }


    public void clickLogout() {
        WebElement logout_button = driver.findElement(By.xpath("//*[@id=\"column-right\"]/div/a[13]"));
        logout_button.click();
    }
}
