package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WebTableLoginPage {

   public WebTableLoginPage(){

       PageFactory.initElements(Driver.getDriver(), this);
   }

   @FindBy(name = "user")
    public WebElement inputUsername;

   @FindBy(name = "password")
    public WebElement inputPassword;

   @FindBy(id = "submit-form")
    public WebElement loginButton;

   // another way to implement test case

    public void login(){
        this.inputUsername.sendKeys("Employee33");
        this.inputPassword.sendKeys("Employee123");
        this.loginButton.click();

    }



}
