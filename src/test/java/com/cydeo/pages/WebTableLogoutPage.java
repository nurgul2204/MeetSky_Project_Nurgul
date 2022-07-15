package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WebTableLogoutPage {

public WebTableLogoutPage(){
    PageFactory.initElements(Driver.getDriver(), this);
}

@FindBy(xpath = ("//img[@height='32']"))
    public WebElement profileIcon;

@FindBy(xpath = "//li[@data-id='logout']")
    public WebElement LogoutButton;


}
