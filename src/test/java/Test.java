import Pages.HomePage;
import Pages.LoginInWithValidAccount;
import Pages.MacBook;
import Pages.SearchFunction;
import org.testng.Assert;


public class Test extends BaseTest {
    @org.testng.annotations.Test
    public void TC1_LoginSteps() throws InterruptedException
    {
        LoginInWithValidAccount loginInWithValidAccount = new LoginInWithValidAccount(driver);
    //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
            Thread.sleep(500);
        loginInWithValidAccount.clickMyAccountLogin();
            Thread.sleep(1000);
        loginInWithValidAccount.hoverClick_Login();
            Thread.sleep(500);
        loginInWithValidAccount.highlightCredFields();
        loginInWithValidAccount.insertEmail("Email@email.email");
            Thread.sleep(500);
        loginInWithValidAccount.insertPassword("meta");
            Thread.sleep(500);
        loginInWithValidAccount.hoverClickLogin();
            Thread.sleep(700);
        loginInWithValidAccount.highlightMyAccount();
            Thread.sleep(2000);
        System.out.println(loginInWithValidAccount.verifyMyAccountPageTitle());
        Assert.assertEquals(loginInWithValidAccount.verifyMyAccountPageTitle(), "My Account");

//        loginInWithValidAccount.clickLogout();
//            Thread.sleep(3000);
    }
    @org.testng.annotations.Test
    public void TC2_addProductToCart() throws InterruptedException
    {
        MacBook macBook = new MacBook(driver);
            Thread.sleep(500);
        macBook.scrollDownToFeatured();
            Thread.sleep(700);
        macBook.hoverClickOnMacBookProductImage();
            Thread.sleep(500);
        System.out.println(macBook.verifyMacBookPageTitle());
        Assert.assertEquals(macBook.verifyMacBookPageTitle(), "MacBook");
        macBook.hoverClickAddToCart();
            Thread.sleep(1000);
        macBook.highlightSuccessMessage();
            Thread.sleep(1000);
        macBook.highlightShppCart();
            Thread.sleep(1000);
        macBook.hoverClickOnShoppingCart();
            Thread.sleep(500);
        macBook.highlightProductInCart();
            Thread.sleep(2000);
        System.out.println(macBook.verifyShoppingCartPageTitle());
        Assert.assertEquals(macBook.verifyShoppingCartPageTitle(), "Shopping Cart");
        System.out.println("Success: You have added MacBook to your shopping cart!");
    }
    @org.testng.annotations.Test
    public void TC3_placeAndConfirmOrder() throws InterruptedException
    {
        MacBook macBook = new MacBook(driver);
            Thread.sleep(500);
        macBook.scrollDownToFeatured();
        macBook.hoverClickOnMacBookProductImage();
        macBook.hoverClickAddToCart();
            Thread.sleep(1000);
        macBook.clickToViewTotalItems();
            Thread.sleep(1200);
        macBook.hoverClickOnViewCart();
        macBook.scrollToUseGift();
            Thread.sleep(500);
        macBook.hoverClickCheckout();
            Thread.sleep(1000);
        macBook.highlightReturningCustomerCredentials();
        macBook.insertReturningCustomerCredentials("Email@email.email", "meta");
        macBook.highlightValidCredentials();
            Thread.sleep(500);
        macBook.hoverClickLoginToCheckout();
        macBook.scrollToStep2();
            Thread.sleep(2000);

        macBook.continueUsingExistingAddress();
            Thread.sleep(200);
        macBook.scrollToStep3();
            Thread.sleep(1000);
        macBook.selectTermsCheckbox();
            Thread.sleep(500);
        macBook.continueToStep4();
            Thread.sleep(1000);
        macBook.hoverClickConfirmOrder();
            Thread.sleep(2500);
        macBook.verifyOrderPlacedSuccess();

// Selecteaza "I want to use new address" si arata doar introducerea  Datelor_de_Facturare  de la  Pasul_2, fara a avansa spre  Pasul_3_Metoda_de_Plata
//        macBook.selectUseNewAddress();
//        macBook.insertBillingDetails("John","User","Internet","La bulevard","Iasi","1234");
//        macBook.selectCountry("Romania");
//            Thread.sleep(1000);
//        macBook.selectRegionState("Iasi");
//            Thread.sleep(2500);
    }
    @org.testng.annotations.Test
    public void TC4_changeCurrency() throws InterruptedException
    {
        HomePage homePage = new HomePage(driver);
        homePage.scrollDownToFeatured();
            Thread.sleep(500);
        homePage.highlightDollarPrices();
            Thread.sleep(1500);
        homePage.clickOnMacBookProductImage();
        homePage.highlightMacBookPriceInDollar();
            Thread.sleep(1000);
        homePage.clickDropDownArrow();
            Thread.sleep(1200);
        homePage.hoverSelectEuroCurrency();
        homePage.highlightMacBookPriceInEuro();
            Thread.sleep(1500);
        driver.navigate().to("https://opencart.abstracta.us/index.php?route=common/home");
        homePage.scrollDownToFeatured();
            Thread.sleep(500);
        homePage.highlightEuroPrice1();
            Thread.sleep(300);
        homePage.highlightEuroPrice2();
            Thread.sleep(300);
        homePage.highlightEuroPrice3();
            Thread.sleep(300);
        homePage.highlightEuroPrice4();
            Thread.sleep(2500);
        System.out.println("Currency has been changed, from $ US Dollar to € Euro");
    }
    @org.testng.annotations.Test
    public void TC5_searchFunction() throws InterruptedException
    {
        SearchFunction searchFunction = new SearchFunction(driver);
            Thread.sleep(500);
        searchFunction.highlightSearchField();
            Thread.sleep(1000);
        searchFunction.enterSearchTextInput("ipod");
            Thread.sleep(500);
        searchFunction.hoverClickSearchButton();
            Thread.sleep(1000);
        searchFunction.highlightSearch_Ipod();
            Thread.sleep(1500);
        searchFunction.scrollDown();
            Thread.sleep(500);
        searchFunction.highlightIpodClassic();
            Thread.sleep(300);
        searchFunction.highlightIPodNano();
        Thread.sleep(300);
        searchFunction.highlightIPodShuffle();
            Thread.sleep(300);
        searchFunction.highlightIPodTouch();
        searchFunction.verifySearchedProductPageTitle();
        searchFunction.countProductResults();
            Thread.sleep(2000);
    }



}
