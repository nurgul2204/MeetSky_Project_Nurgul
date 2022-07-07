package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoogleSearchPage {

    public GoogleSearchPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//div[.='I agree']")
    public WebElement IAggreeButton;

    //We can start locating web elements using @FindBy annotation
    @FindBy(name = "q")
    public WebElement searchBox;

    @FindBy(xpath = "//div[.='Accept all']")
    public WebElement AcceptAllButton;


}
