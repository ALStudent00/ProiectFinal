package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginInWithValidAccount {
    private WebDriver driver;

    public LoginInWithValidAccount(WebDriver driver) {
        this.driver = driver;
    }
    public void clickMyAccountLogin() {
        WebElement myAccount = driver.findElement(By.cssSelector("i.fa.fa-user"));
        myAccount.click();
        WebElement Login = driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/ul/li[2]/a"));
        Login.click();
    }
    public void insertEmail(String email) {
        WebElement email_locator = driver.findElement(By.name("email"));
        email_locator.sendKeys(email);
    }
    public void insertPassword(String password) {
        WebElement password_locator = driver.findElement(By.name("password"));
        password_locator.sendKeys(password);
    }
    public void clickLogin() {
        WebElement login_button = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input"));
        login_button.click();
    }
    public String verifyMyAccountPageTitle() {
        return driver.getTitle();
    }


    public void clickLogout() {
        WebElement logout_button = driver.findElement(By.xpath("//*[@id=\"column-right\"]/div/a[13]"));
        logout_button.click();
    }
}
