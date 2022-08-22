package com.util;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class ElementUtils {
    public WebDriverWait wait;

    /**
     * use to wait for an element
      * @param driver browser instance
     * @param elementBy element which need to wait
     */
    public void waitVisibility(WebDriver driver, By elementBy) {
        wait = new  WebDriverWait(driver, Duration.ofMillis(100));
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(elementBy));
    }

    /**
     *  click on any element
     * @param driver pass browser instance
     * @param elementBy pass the element
     */
    public void click (WebDriver driver, By elementBy) {
        waitVisibility(driver, elementBy);
        driver.findElement(elementBy).click();
    }

    /**
     * use to drag and drop any webelement
     * @param driver pass the browser instance
     * @param elementFrom drag element
     * @param elementTo where to drop element
     */
    public void dragAndDrop(WebDriver driver, WebElement elementFrom, WebElement elementTo) {
        try {
            Actions action = new Actions(driver);
            action.moveToElement(elementFrom).clickAndHold().moveToElement(elementTo).release().build().perform();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     *  switch for to Ifram
     * @param driver pass the browser instance
     */
    public void switchFrame(WebDriver driver){
        int size = driver.findElements(By.tagName("iframe")).size();
        System.out.println(size);
        driver.switchTo().frame(0);
    }

    /**
     *  use to read the text
     * @param driver pass browser instance
     * @param element pass the web element
     * @return string value as displayed
     */
    // read text
    public String getText(WebDriver driver, By element){
        waitVisibility(driver, element);
        return driver.findElement(element).getText();
    }


    /**
     *  drop down selection
     * @param  carToSelect value to select from drop down
     * @param listElement drop down element list
     * @return if matched then return true
     */

    public boolean selectExpectedCarType( String carToSelect, List<WebElement> listElement){
        boolean bFlag = false;
        for(WebElement car : listElement) {
            if (car.getText().toLowerCase().contains(carToSelect)) {
                car.click();
                bFlag = true;
            }
        }
        return bFlag;
    }

    /**
     * click on the hidden element with javaScript
     * @param driver
     * @param element
     * @return true after click
     */

    public boolean clickOnHiddenElement(WebDriver driver,WebElement element){
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click();", element);
        return true;
    }

    /**
     * type the string in edit boxes
     * @param element
     * @param inputString
     */

    public void typeOnEditBox( WebElement element, String inputString){
        element.sendKeys(inputString);
    }
}
