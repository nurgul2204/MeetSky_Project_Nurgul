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

   @FindBy(xpath = "//input[@id='submit-form']")
    public WebElement loginButton;

   @FindBy(className = ("icon-home"))
    public WebElement HomePage;

   @FindBy(xpath = "//p[@class='warning wrongPasswordMsg']")
    public WebElement waningInvalidCredential;

   @FindBy(xpath = "//a[@class='toggle-password']")
    public WebElement tooglePassword;

    @FindBy(xpath = "//a[@id='lost-password']")
    public WebElement forgetPassword;

    @FindBy (id = ("reset-password-submit"))
    public WebElement resetPassword;

    @FindBy (xpath ="//input[@placeholder=('Username or email')]" )
    public WebElement usernamePlaceholder;

    @FindBy(xpath = "//input[@placeholder=('Password')]")
    public WebElement passwordPlaceholder;




   // another way to implement test case

    //public void login(){
      // this.inputUsername.sendKeys("Employee33");
    // this.inputPassword.sendKeys("Employee123");
    // this.loginButton.click();

    }




