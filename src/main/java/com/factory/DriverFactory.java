/**
* Author: Vinod Vishwakarma
* Its initialize the browser driver
 */

package com.factory;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class DriverFactory {

/**
 * this object help when run parallel execution
 */
   public static ThreadLocal<WebDriver> objThreadLocal = new ThreadLocal<>();


    /** initialize the thread local driver on the basis of given browser
     * @param:  browser
     * @return objThreadLocal webdriver
     * it will create copy of web driver initialisation on parallel execution
      */

    public WebDriver init_driver(String browser) {
        System.out.println("browser value is:" + browser);
        if (browser.equals("chrome")) {
            WebDriverManager.chromedriver().setup();
            objThreadLocal.set(new ChromeDriver());
        } else if (browser.equals("firefox")) {
            WebDriverManager.firefoxdriver().setup();
            objThreadLocal.set(new FirefoxDriver());
        } else if(browser.equals("safari")) {
            objThreadLocal.set(new SafariDriver());
        } else{
            System.out.println("Please pass the browser value: "+browser);
        }
        getDriver().manage().deleteAllCookies();
        getDriver().manage().window().maximize();
        return getDriver();
    }


    public static WebDriver getDriver(){
        return objThreadLocal.get();
    }
}
