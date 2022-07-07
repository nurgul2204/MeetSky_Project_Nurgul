package com.cydeo.utilities;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Set;

public class BrowserUtils {





 /*
    this method will accept int (in seconds) and execute Thread.sleep for given duration
     */

    public static void sleep (int second){
        second *=1000;
        try {
            Thread.sleep(second);
        }catch (InterruptedException e){

        }
    }
    /*
    This method accepts 3 arguments.
    Arg1: webdriver
    Arg2: expectedInUrl : for verify if the url contains given String.
        - If condition matches, will break loop.
    Arg3: expectedInTitle to be compared against actualTitle
     */

    public static void switchWindowsAndVerify(WebDriver driver, String expectedInURL, String expectedInTitle){

        Set<String> allWindowHandless = Driver.getDriver().getWindowHandles();

        for (String each:allWindowHandless) {
            Driver.getDriver().switchTo().window(each);

            System.out.println("Current URL: "+Driver.getDriver().getCurrentUrl());

            if (Driver.getDriver().getCurrentUrl().contains(expectedInURL)){
                break;
            }

        }

//5. Assert: Title contains expectedInTitle”
        String actualTitle = Driver.getDriver().getTitle();


        Assert.assertTrue(actualTitle.contains(expectedInTitle));

    }

    /*
    This method accepts a String "expected title" and Asserts if it is true
     */

    public static void verifyTitle(WebDriver driver, String expectedTitle){
        Assert.assertEquals(Driver.getDriver().getTitle(), expectedTitle);

    }

    /*
    creating a utility method for ExplicitWait, so we don't have to repeat the lines
     */
    public static void waitForInvisibility(WebElement webElement){
        //Driver.getDriver().manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
        wait.until(ExpectedConditions.invisibilityOf(webElement));
    }

}
