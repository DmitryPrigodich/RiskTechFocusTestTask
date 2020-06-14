package pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;
import java.util.Random;

public class PageCategory extends PageAbstract{
    private static Logger logger = LogManager.getLogger(PageCategory.class);
    public PageCategory(WebDriver driver) {
        super(driver);
        logger.info("Category page loading...");
        wait.until(ExpectedConditions.elementToBeClickable(By.id("categories")));
    }

    public PageTable clickOnRandomCategory(){
        logger.info("Clicking random record");

        List<WebElement> elements = driver.findElements(By.xpath("//fieldset[@class='cats']//h2/a"));
        Random rand = new Random();
        int randomIndex = rand.nextInt(elements.size());
        elements.get(randomIndex).click();

        return new PageTable(driver);
    }
}
