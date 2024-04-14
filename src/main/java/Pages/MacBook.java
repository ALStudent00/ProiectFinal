package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class MacBook {
    private WebDriver driver;

    public MacBook(WebDriver driver) {
        this.driver = driver;
    }
    public void hoverClickOnMacBookProductImage() {
        Actions action = new Actions(driver);
        WebElement macBook_text = driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div[1]/div/div[1]/a/img"));
        action.moveToElement(macBook_text);
        action.moveToElement(driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div[1]/div/div[1]/a/img"))).click().build().perform();
    }
    public String verifyMacBookPageTitle() {
        return driver.getTitle();
    }
    public void scrollDownToFeatured() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement element = driver.findElement(By.xpath("//*[@id=\"content\"]/h3"));
        js.executeScript("arguments[0].scrollIntoView(true);", element);
    }
    public void hoverClickAddToCart() {
        Actions action = new Actions(driver);
        WebElement addToCart_button = driver.findElement(By.id("button-cart"));
        action.moveToElement(addToCart_button);
        action.moveToElement(driver.findElement(By.id("button-cart"))).click().build().perform();
    }
    public void highlightSuccessMessage() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement success_alert = driver.findElement(By.xpath("//*[@id=\"product-product\"]/div[1]"));
        js.executeScript("arguments[0].style.border='5px dotted green'", success_alert);
    }
    public void clickToViewTotalItems() {
        WebElement viewTotalItems = driver.findElement(By.id("cart-total"));
        viewTotalItems.click();
    }
    public void hoverClickOnViewCart() {
        Actions action = new Actions(driver);
        WebElement viewCart = driver.findElement(By.xpath("//*[@id=\"cart\"]/ul/li[2]/div/p/a[1]/strong"));
        action.moveToElement(viewCart);
        action.moveToElement(driver.findElement(By.xpath("//*[@id=\"cart\"]/ul/li[2]/div/p/a[1]/strong"))).click().build().perform();
    }
    public void highlightProductInCart() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement product = driver.findElement(By.xpath("//*[@id=\"content\"]/form/div/table"));
        js.executeScript("arguments[0].style.border='4px dashed green'", product);
    }
    public String verifyShoppingCartPageTitle() {
        return driver.getTitle();
    }
    public void scrollToUseGift() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement element = driver.findElement(By.xpath("//*[@id=\"content\"]/h1"));
        js.executeScript("arguments[0].scrollIntoView(true);", element);
    }
    public void hoverClickCheckout() {
        Actions action = new Actions(driver);
        WebElement Checkout_button = driver.findElement(By.cssSelector("a.btn.btn-primary"));
        action.moveToElement(Checkout_button);
        action.moveToElement(driver.findElement(By.cssSelector("a.btn.btn-primary"))).click().build().perform();

    }
    public void highlightReturningCustomerCredentials() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement credentials = driver.findElement(By.xpath("//*[@id=\"collapse-checkout-option\"]/div/div/div[2]"));
        js.executeScript("arguments[0].style.border='2px solid yellow'", credentials);
    }
    public void insertReturningCustomerCredentials(String email, String password) {
        WebElement insert_email = driver.findElement(By.name("email"));
        WebElement insert_password = driver.findElement(By.name("password"));
        insert_email.sendKeys(email);
        insert_password.sendKeys(password);
    }
    public void highlightValidCredentials() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement credentials = driver.findElement(By.xpath("//*[@id=\"collapse-checkout-option\"]/div/div/div[2]"));
        js.executeScript("arguments[0].style.border='3px dotted green'", credentials);
    }
    public void hoverClickLoginToCheckout() {
        Actions action = new Actions(driver);
        WebElement login_button = driver.findElement(By.id("button-login"));
        action.moveToElement(login_button);
        action.moveToElement(driver.findElement(By.id("button-login"))).click().build().perform();
    }
    public void scrollToStep2() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement element = driver.findElement(By.className("accordion-toggle"));
        js.executeScript("arguments[0].scrollIntoView(true);", element);
    }
    public void continueUsingExistingAddress() {
        WebElement continue_button = driver.findElement(By.id("button-payment-address"));
        continue_button.click();
    }
    public void insertBillingDetails(String firstName, String lastName, String company, String address1, String city, String postCode) {
        WebElement firstName_locator = driver.findElement(By.name("firstname"));
            firstName_locator.sendKeys(firstName);
        WebElement lastName_locator = driver.findElement(By.name("lastname"));
            lastName_locator.sendKeys(lastName);
        WebElement company_locator = driver.findElement(By.name("company"));
            company_locator.sendKeys(company);
        WebElement address1_locator = driver.findElement(By.name("address_1"));
            address1_locator.sendKeys(address1);
        WebElement city_locator = driver.findElement(By.name("city"));
            city_locator.sendKeys(city);
        WebElement postCode_locator = driver.findElement(By.name("postcode"));
            postCode_locator.sendKeys(postCode);
    }
    public void selectCountry(String countryName) {
        WebElement country_locator = driver.findElement(By.name("country_id"));
        Select country_selector = new Select(country_locator);
        country_selector.selectByVisibleText(countryName);
    }
    public void selectRegionState(String regionState) {
        WebElement regionState_locator = driver.findElement(By.name("zone_id"));
        Select regionState_selector = new Select(regionState_locator);
        regionState_selector.selectByVisibleText(regionState);
    }
    public void pressContinue() {
        WebElement continue_button = driver.findElement(By.id("button-payment-address"));
        continue_button.click();
    }
    public void scrollToStep3() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement element = driver.findElement(By.className("panel-title"));
        js.executeScript("arguments[0].scrollIntoView(true);", element);
    }
    public void selectTermsCheckbox() {
        WebElement TC_checkbox = driver.findElement(By.name("agree"));
        TC_checkbox.click();
    }
    public void continueToStep4() {
        WebElement continueToStep4_button = driver.findElement(By.id("button-payment-method"));
        continueToStep4_button.click();
    }
    public void hoverClickConfirmOrder() {
        Actions action = new Actions(driver);
        WebElement confirmOrder_button = driver.findElement(By.id("button-confirm"));
        action.moveToElement(confirmOrder_button);
        action.moveToElement(driver.findElement(By.id("button-confirm"))).click().build().perform();
    }
    public void verifyOrderPlacedSuccess() {
        WebElement successfulOrder_page = driver.findElement(By.xpath("//*[@id=\"content\"]/h1"));
        String successMessage = successfulOrder_page.getText();
        System.out.println(successMessage);
        assert successMessage.equals("Your order has been placed!");
    }


    public void clickUseNewAddress() {
        WebElement newAddress_button = driver.findElement(By.xpath("//*[@id=\"collapse-payment-address\"]/div/form/div[3]/label/input"));
        newAddress_button.click();
    }


    public void continueBackToHomePage() {
        WebElement continueToHomePage_button = driver.findElement(By.cssSelector("a.btn.btn-primary"));
        continueToHomePage_button.click();
    }
}
