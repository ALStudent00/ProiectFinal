package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginInWithAccount {
    private WebDriver driver;

    public LoginInWithAccount(WebDriver driver) {
        this.driver = driver;
    }

    public void clickMyAccountLogin() {
        WebElement myAccount = driver.findElement(By.cssSelector("i.fa.fa-user"));
        myAccount.click();
        WebElement  Login = driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/ul/li[2]/a"));
        Login.click();
    }





}
