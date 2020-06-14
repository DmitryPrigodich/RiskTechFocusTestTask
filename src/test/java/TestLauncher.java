import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.PageAdvert;
import pages.PageCategory;
import pages.PageMain;
import pages.PageTable;

public class TestLauncher {
    private static Logger logger = LogManager.getLogger(TestLauncher.class);

    WebDriver driver;
    WebDriverWait wait;

    @Before
    public void beforeTest(){
        System.setProperty("webdriver.gecko.driver", Constants.FIREFOX_DRIVER_LOCATION);
        driver = new FirefoxDriver();
        wait = new WebDriverWait(driver, 5);
        driver.manage().window().maximize();
    }

    @After
    public void afterTest(){
        driver.close();
        driver.quit();
    }

    @Test
    public void testSimpleTest(){
        logger.info("Hello there, Tester!");
    }

    @Test
    public void testMainPage(){
        driver.get(Constants.TEST_PAGE_URL);
        PageMain mainPage = new PageMain(driver);
        PageCategory categoryPage = mainPage.clickOnRandomCategory();
        PageTable tablePage = categoryPage.clickOnRandomCategory();
        PageAdvert advertPage = tablePage.clickOnRandomAdvertisement();
        advertPage.addToFavourites();
    }
}