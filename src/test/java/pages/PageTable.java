package pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;
import java.util.Random;

public class PageTable extends PageAbstract{
    public PageTable(WebDriver driver) {
        super(driver);
        logger.info("Category page loading...");
        wait.until(ExpectedConditions.elementToBeClickable(By.id("posts")));
    }
    private static Logger logger = LogManager.getLogger(PageTable.class);

    public PageAdvert clickOnRandomAdvertisement(){
        logger.info("Clicking random record");
//        List<WebElement> elements = driver.findElements(By.xpath("//table[@id='posts']/tbody/tr//a"));
        List<WebElement> elements = driver.findElements(By.xpath("//table[@id='posts']/tbody/tr[@onclick]"));
        Random rand = new Random();
        int randomIndex = rand.nextInt(elements.size());
        elements.get(randomIndex).click();

        return new PageAdvert(driver);
    }
}