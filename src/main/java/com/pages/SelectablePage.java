package com.pages;

import com.util.ElementUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class SelectablePage extends ElementUtils {
    private WebDriver driver;
    private WebDriverWait wait;
    //locators
    private By title = By.className("entry-title");
    private By selectable =By.cssSelector("[href$='/selectable/']");
    private By itemToSelection = By.cssSelector("[id='selectable']>li");
    private By selectedItem = By.cssSelector("[id='selectable']>[class$='ui-selectee ui-selected']");

    public SelectablePage(WebDriver driver) {
        this.driver = driver;
        wait = new  WebDriverWait(driver, Duration.ofSeconds(15));
    }

    public String getTitle(){
        return driver.findElement(title).getText();
    }

    public void clickOnSelectable(){
        click(driver, selectable);
    }


    public List<WebElement> itemsToSelect(){
        switchFrame(driver);
        return driver.findElements(itemToSelection);
    }


    // select the matching item
    public void selectItemFromList(String item){
       for(WebElement element: itemsToSelect()){
           String itemText = element.getText().toLowerCase();
           if(itemText.contains(item)){
               element.click();
           }
        }
    }

    public boolean getSelectItem(String itemSelected){
        waitVisibility(driver, selectedItem);
        return driver.findElement(selectedItem).getText().toLowerCase().equals(itemSelected.toLowerCase());
    }
}
