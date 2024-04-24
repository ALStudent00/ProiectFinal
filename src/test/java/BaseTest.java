import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTest {
    protected WebDriver driver;

    @BeforeClass
    public void setup() {
        ChromeOptions options = new ChromeOptions();
        // Dezactivează avertismentele SSL și alte certificate
        options.addArguments("--ignore-certificate-errors");
        driver = new ChromeDriver(options);
        driver.get("https://opencart.abstracta.us/");
        driver.manage().window().maximize();
    }

    @AfterClass
    public void tearDown() {
        if (driver!=null)
        {
            driver.quit();
        }
    }
}
