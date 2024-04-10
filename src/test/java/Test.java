import Pages.HomePage;
import Pages.LoginInWithValidAccount;
import Pages.MacBook;
import Pages.SearchFunction;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class Test extends BaseTest {
    @org.testng.annotations.Test
    public void TC1_LoginSteps() throws InterruptedException {
        LoginInWithValidAccount loginInWithValidAccount = new LoginInWithValidAccount(driver);
        LoginInWithValidAccount myAccount_button = new LoginInWithValidAccount(driver);
        myAccount_button.clickMyAccountLogin();
        LoginInWithValidAccount Login_Button = new LoginInWithValidAccount(driver);
        Login_Button.clickMyAccountLogin();
        Thread.sleep(1000);
        loginInWithValidAccount.insertEmail("Email@email.email");
        Thread.sleep(1000);
        loginInWithValidAccount.insertPassword("meta");
        loginInWithValidAccount.clickLogin();
        Thread.sleep(3000);
        System.out.println(loginInWithValidAccount.verifyMyAccountPageTitle());
        Assert.assertEquals(loginInWithValidAccount.verifyMyAccountPageTitle(), "My Account");

//        loginInWithValidAccount.clickLogout();
//        Thread.sleep(3000);
    }
    @org.testng.annotations.Test
    public void TC2_addProductToCart() throws InterruptedException {
        Thread.sleep(800);
        MacBook macBook = new MacBook(driver);
        macBook.scrollDownToFeatured();
        Thread.sleep(1500);
        macBook.clickOnMacBookProductImage();
        Thread.sleep(1000);
        System.out.println(macBook.verifyMacBookPageTitle());
        Assert.assertEquals(macBook.verifyMacBookPageTitle(), "MacBook");
        macBook.scrollDownToEmptySpace();
        Thread.sleep(1000);
        macBook.clickAddToCart();
        Thread.sleep(3000);
        macBook.clickOnShoppingCart();
        Thread.sleep(4000);
    }
    @org.testng.annotations.Test
    public void TC3_placeAndConfirmOrderWithExistingAddress() throws InterruptedException {
        MacBook macBook = new MacBook(driver);
        Thread.sleep(500);
        macBook.scrollDownToFeatured();
        Thread.sleep(500);
        macBook.clickOnMacBookProductImage();
        macBook.scrollDownToEmptySpace();
        Thread.sleep(1000);
        macBook.clickAddToCart();
        macBook.clickOnShoppingCart();
        Thread.sleep(2000);
        macBook.clickCheckout();
        Thread.sleep(1000);
        macBook.insertReturningCustomerCredentials("Email@email.email", "meta");
        Thread.sleep(1500);
        macBook.LoginToCheckout();
        macBook.scrollToStep2();
        Thread.sleep(2000);

        macBook.continueUsingExistingAddress();
        macBook.scrollToStep3();
        Thread.sleep(1500);
        macBook.selectTermsCheckbox();
        Thread.sleep(1000);
        macBook.continueToStep4();
        Thread.sleep(1500);
        macBook.confirmOrder();

//              // Selecteaza "I want to use new address" si arata doar introducerea  Datelor_de_Facturare  de la  Pasul_2, fara a avansa spre  Pasul_3_Metoda_de_Plata
//        macBook.clickUseNewAddress();
//        macBook.insertBillingDetails("John","User","Internet","La bulevard","Iasi","1234");
//        macBook.selectCountry("Romania");
//        Thread.sleep(1000);
//        macBook.selectRegionState("Iasi");

        Thread.sleep(3000);


//        macBook.continueBackToHomePage();
//        Thread.sleep(2000);
    }
    @org.testng.annotations.Test
    public void TC4_changeCurrency() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        Thread.sleep(500);
        homePage.scrollDownToFeatured();
        Thread.sleep(2000);
        homePage.selectEuroCurrency();
        Thread.sleep(1500);
        homePage.scrollDownToFeatured();
        Thread.sleep(4000);
    }
    @org.testng.annotations.Test
    public void TC5_searchFunction() throws InterruptedException {
        SearchFunction searchFunction = new SearchFunction(driver);
        searchFunction.clickSearchButton("ipod");
        Thread.sleep(1000);
        searchFunction.scrollDowm();
        searchFunction.verifySearchedProductPageTitle();
        searchFunction.verifyNumberOfResults();
        Thread.sleep(3000);
    }
}
