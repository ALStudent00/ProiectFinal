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
        loginInWithValidAccount.clickMyAccountLogin();
        Thread.sleep(1000);
        loginInWithValidAccount.hoverClick_Login();
        Thread.sleep(1000);
        loginInWithValidAccount.insertEmail("Email@email.email");
        Thread.sleep(1000);
        loginInWithValidAccount.insertPassword("meta");
        loginInWithValidAccount.clickLogin();
        Thread.sleep(1000);
        loginInWithValidAccount.highlightMyAccount();
        Thread.sleep(2000);
        System.out.println(loginInWithValidAccount.verifyMyAccountPageTitle());
        Assert.assertEquals(loginInWithValidAccount.verifyMyAccountPageTitle(), "My Account");

//        loginInWithValidAccount.clickLogout();
//        Thread.sleep(3000);
    }
    @org.testng.annotations.Test
    public void TC2_addProductToCart() throws InterruptedException {
        Thread.sleep(500);
        MacBook macBook = new MacBook(driver);
        macBook.scrollDownToFeatured();
        Thread.sleep(1000);
        macBook.clickOnMacBookProductImage();
        Thread.sleep(1000);
        System.out.println(macBook.verifyMacBookPageTitle());
        Assert.assertEquals(macBook.verifyMacBookPageTitle(), "MacBook");
        macBook.scrollDownToEmptySpace();
        macBook.clickAddToCart();
        Thread.sleep(500);
        macBook.highlightSuccessMessage();
        Thread.sleep(2000);
        macBook.clickToViewTotalItems();
        Thread.sleep(1500);
        macBook.hoverClickOnViewCart();
        Thread.sleep(500);
        macBook.highlightProductInCart();
        Thread.sleep(2500);
        System.out.println(macBook.verifyShoppingCartPageTitle());
        Assert.assertEquals(macBook.verifyShoppingCartPageTitle(), "Shopping Cart");
        System.out.println("Success: You have added MacBook to your shopping cart!");
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
        Thread.sleep(1000);
        macBook.clickToViewTotalItems();
        Thread.sleep(1200);
        macBook.hoverClickOnViewCart();
        Thread.sleep(1200);
        macBook.clickCheckout();
        Thread.sleep(1000);
        macBook.highlightReturningCustomerCredentials();
        macBook.insertReturningCustomerCredentials("Email@email.email", "meta");
        macBook.highlightValidCredentials();
        Thread.sleep(1200);
        macBook.hoverClickLoginToCheckout();
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

        Thread.sleep(2500);
        macBook.verifyOrderPlacedSuccess();


//        macBook.continueBackToHomePage();
//        Thread.sleep(2000);
    }
    @org.testng.annotations.Test
    public void TC4_changeCurrency() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        homePage.scrollDownToFeatured();
        Thread.sleep(500);
        homePage.highlightPricesYellow();
        Thread.sleep(1500);
        homePage.clickOnMacBookProductImage();
        homePage.highlightMacBookPriceYellow();
        Thread.sleep(1000);
        homePage.clickDropDownArrow();
        Thread.sleep(1200);
        homePage.hoverSelectEuroCurrency();
        homePage.highlightMacBookPriceGreen();
        Thread.sleep(1500);
        driver.navigate().to("https://opencart.abstracta.us/index.php?route=common/home");
        homePage.scrollDownToFeatured();
        Thread.sleep(200);
        homePage.highlightPrice1Green();
        Thread.sleep(200);
        homePage.highlightPrice2Green();
        Thread.sleep(200);
        homePage.highlightPrice3Green();
        Thread.sleep(200);
        homePage.highlightPrice4Green();
        Thread.sleep(3000);
        System.out.println("Currency has been changed, from $ US Dollar to € Euro");
    }
    @org.testng.annotations.Test
    public void TC5_searchFunction() throws InterruptedException {
        SearchFunction searchFunction = new SearchFunction(driver);
        Thread.sleep(500);
        searchFunction.enterSearchTextInput("ipod");
        Thread.sleep(500);
        searchFunction.hoverClickSearchButton();
        Thread.sleep(500);
        searchFunction.highlightSearch_Ipod();
        Thread.sleep(1000);
        searchFunction.scrollDown();
        Thread.sleep(500);
        searchFunction.highlightIpodClassic();
        Thread.sleep(400);
        searchFunction.highlightIPodNano();
        Thread.sleep(400);
        searchFunction.highlightIPodShuffle();
        Thread.sleep(400);
        searchFunction.highlightIPodTouch();
        searchFunction.verifySearchedProductPageTitle();
        searchFunction.countProductResults();
        Thread.sleep(2000);
    }



    //    (nota personala)    driver.navigate().back();
}
