package com.pages;

import com.util.ElementUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class InteractionPage extends ElementUtils {
    private WebDriver driver;

    //locators
    private By action = By.cssSelector("[href$='/droppable/']");
    private By title = By.className("widget-title");
    private By drag = By.id("draggable");
    private By drop = By.id("droppable");
    private By afterDrop = By.cssSelector("[class$='ui-droppable ui-state-highlight']");
    private  By afterDropText = By.xpath("//p[contains(text(),'Dropped!')]");

    public InteractionPage(WebDriver driver) {
        this.driver = driver;
    }

    public void dragDrop(){
        switchFrame(driver);
        waitVisibility(driver, drag);
        dragAndDrop(driver, driver.findElement(drag), driver.findElement(drop));
    }

   // InteractionPage actions
    public String getTitle(){
        return getText(driver,title);
    }

    public boolean getInteractionPageDrop(){
        return driver.findElement(action).isDisplayed();
    }

    public void clickOnElement(){
        click(driver,action);
    }

    public boolean getHighlightedColourAfterDrop(){
      return   driver.findElement(afterDrop).isDisplayed();
    }

    public String getTextAfterDrop(){
        return getText(driver,afterDropText);
    }

}
