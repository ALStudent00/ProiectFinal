package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class MacBook {
    private WebDriver driver;

    public MacBook(WebDriver driver) {
        this.driver = driver;
    }
    public void clickOnMacBookProductImage() {
        WebElement macBook_text = driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div[1]/div/div[1]/a/img"));
        macBook_text.click();
    }
    public String verifyMacBookPageTitle() {
        return driver.getTitle();
    }
    public void scrollDownToFeatured() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement element = driver.findElement(By.xpath("//*[@id=\"content\"]/h3"));
        js.executeScript("arguments[0].scrollIntoView(true);", element);
    }
    public void clickAddToCart() {
        WebElement addToCart_button = driver.findElement(By.id("button-cart"));
        addToCart_button.click();
    }
    public void scrollDownToEmptySpace() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement element = driver.findElement(By.className("container"));
        js.executeScript("arguments[0].scrollIntoView(true);", element);
    }
    public void clickToViewTotalItems() {
        WebElement viewTotalItems = driver.findElement(By.id("cart-total"));
        viewTotalItems.click();
    }
    public void clickOnViewCart() {
        WebElement viewCart = driver.findElement(By.xpath("//*[@id=\"cart\"]/ul/li[2]/div/p/a[1]/strong"));
        viewCart.click();
    }
    public String verifyShoppingCartPageTitle() {
        return driver.getTitle();
    }
    public void clickCheckout() {
        WebElement Checkout_button = driver.findElement(By.cssSelector("a.btn.btn-primary"));
        Checkout_button.click();
    }
    public void insertReturningCustomerCredentials(String email, String password) {
        WebElement insert_email = driver.findElement(By.name("email"));
        WebElement insert_password = driver.findElement(By.name("password"));
        insert_email.sendKeys(email);
        insert_password.sendKeys(password);
    }
    public void LoginToCheckout() {
        WebElement login_button = driver.findElement(By.id("button-login"));
        login_button.click();
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
    public void confirmOrder() {
        WebElement confirmOrder_button = driver.findElement(By.id("button-confirm"));
        confirmOrder_button.click();
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
