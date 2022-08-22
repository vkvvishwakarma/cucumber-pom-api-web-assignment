package com.StepDefinition;

import com.factory.DriverFactory;
import io.cucumber.java.en.Given;
import org.openqa.selenium.WebDriver;

public class CommonStepDefinition extends DriverFactory{
    WebDriver driver = DriverFactory.getDriver();
    @Given("user is on {string} url")
    public void user_is_on_url(String url) {
        driver.get(url);
    }
}
