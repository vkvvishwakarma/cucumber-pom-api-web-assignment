package com.pages;

import com.util.ElementUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ControlgroupPage extends ElementUtils {
    private WebDriver driver;

    //locators
    private By cotrolgroup = By.cssSelector("[href$='/controlgroup/']");
    private By controgroupTitle = By.cssSelector("[class='widget']>h1");
    private By carTypeButton = By.id("car-type-button");
    private By carTypesOptions = By.cssSelector("[id='car-type-menu']>li");
    private By radioButtonAutomatic = By.id("transmission-automatic");
    private By insuranceCheckbox = By.id("insurance");
    private By numberOfCarForHorizontal = By.id("horizontal-spinner");
    private By carTypeVerticalOption = By.id("ui-id-8-button");
    private By carTypeOptionsVertical = By.id("[id='ui-id-8-menu']>li");
    private By radioTransmissionStandardV = By.id("transmission-standard-v");
    private By checkBoxInsuranceVertical= By.id("insurance-v");
    private By numberOfCarsVertical = By.id("vertical-spinner");

    public ControlgroupPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickOnElement(){
        click(driver, cotrolgroup);
    }

    public String getTitlePage(){
        switchFrame(driver);
        return getText(driver, controgroupTitle);
    }

    public void clickOnCarTypeButton(){
        click(driver, carTypeButton);
    }

    public boolean setCarType(String carToSelect){
        return selectExpectedCarType(carToSelect, driver.findElements(carTypesOptions));
    }

    public boolean selectAutomaticRadioButton(){
       return clickOnHiddenElement(driver, driver.findElement(radioButtonAutomatic));
    }

    public boolean checkInsurance(){
        waitVisibility(driver, insuranceCheckbox);
       return clickOnHiddenElement(driver, driver.findElement(insuranceCheckbox));
    }

    public void setNumberOfCarForHorizontal(String noOfCar){
        waitVisibility(driver, numberOfCarForHorizontal);
        typeOnEditBox(driver.findElement(numberOfCarForHorizontal), noOfCar);
    }

    public void clickOnVerticalMenuCarType(){
        click(driver, carTypeVerticalOption);
    }

    public boolean selectCarTypeFromVertical(String carName){
        return selectExpectedCarType(carName, driver.findElements(carTypeOptionsVertical));
    }

    public boolean clickOnVerticalRadioStandardButton(){
        waitVisibility(driver,radioTransmissionStandardV);
        return clickOnHiddenElement(driver, driver.findElement(radioTransmissionStandardV));
    }

    public boolean clickOnVerticalInsurance(){
        waitVisibility(driver, checkBoxInsuranceVertical);
       return clickOnHiddenElement(driver, driver.findElement(checkBoxInsuranceVertical));
    }

    public void typeTheNumberOfCar(String numberOfCar){
        waitVisibility(driver, numberOfCarsVertical);
        typeOnEditBox(driver.findElement(numberOfCarsVertical),numberOfCar);
    }
}
