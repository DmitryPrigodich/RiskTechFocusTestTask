package pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;
import java.util.Random;

public class PageAdvert extends PageAbstract{
    private static Logger logger = LogManager.getLogger(PageAdvert.class);
    public PageAdvert(WebDriver driver) {
        super(driver);
        logger.info("Advert page loading...");
        wait.until(ExpectedConditions.elementToBeClickable(By.id("photo-block")));
    }

    public void addToFavourites(){
        logger.info("Adding advert to Favourites");
        driver.findElement(By.id("favs-link")).click();
    }
}