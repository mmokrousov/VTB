import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.PageFactory;
import ru.neoflex.mmokrousov.*;

import java.time.Duration;

public class BaseTest {
    protected WebDriver driver;
    protected AuthorizationPage authorizationPage;
    protected FirstWindowObject firstWindowObject;
    protected SecondWindowObject secondWindowObject;
    protected ThirdWindowObject thirdWindowObject;
    protected OtherDULPage otherDULPage;

    @Before
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "F:\\MSA\\Cбережения\\VTB\\Auto_Web_Savings_metal\\driver\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--ignore-certificate-errors");
        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(5));

        authorizationPage = PageFactory.initElements(driver, AuthorizationPage.class);
        firstWindowObject = PageFactory.initElements(driver, FirstWindowObject.class);
        secondWindowObject = PageFactory.initElements(driver, SecondWindowObject.class);
        thirdWindowObject = PageFactory.initElements(driver, ThirdWindowObject.class);
        otherDULPage = PageFactory.initElements(driver, OtherDULPage.class);

        driver.get("https://savings-metal-ui.ds1-genr01-savc-savings-st.apps.ds1-genr01.corp.dev.vtb/");
    }

    @After
    public void tearDown(){
        driver.quit();
    }
}
