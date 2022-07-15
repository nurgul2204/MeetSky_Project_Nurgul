package com.cydeo.step_definitions;

import com.cydeo.pages.WebTableLoginPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;

public class Login_StepDefinitions {

    WebTableLoginPage webTableLoginPage = new WebTableLoginPage();

    @Given("user is on the login page of web table")
    public void user_is_on_the_login_page_of_web_table() {
        String url = ConfigurationReader.getProperty("web.table.url");
        Driver.getDriver().get(url);
    }

    @When("user enters user name {string}")
    public void user_enters_user_name(String string) {
        webTableLoginPage.inputUsername.sendKeys(string);
    }

    @When("user enters password {string}")
    public void user_enters_password(String string) {
        webTableLoginPage.inputPassword.sendKeys(string);
    }

    @When("user clicks to login")
    public void user_clicks_to_login() {
        webTableLoginPage.loginButton.click();
    }

    @Then("verify that user can login")
    public void verify_that_user_can_login() {
    Assert.assertTrue(webTableLoginPage.HomePage.isDisplayed());
    }


    @Then("verify that user can not login and see the notice message")
    public void verifyThatUserCanNotLoginAndSeeTheNoticeMessage() {
        Assert.assertTrue(webTableLoginPage.waningInvalidCredential.isDisplayed());
    }

    @Then("Verify that user can not login with blank username and see the alert message")
    public void verifyThatUserCanNotLoginWithBlankUsernameAndSeeTheAlertMessage() {
        BrowserUtils.sleep(2);
        String message = Driver.getDriver().findElement(By.name("username")).getAttribute("validationMessage");
        Assert.assertTrue(message.equalsIgnoreCase("Please fill in this field"));
    }


    @Then("Verify that user can not login with blank password and see the alert message")
    public void verifyThatUserCanNotLoginWithBlankPasswordAndSeeTheAlertMessage() {
        BrowserUtils.sleep(2);
        String message = Driver.getDriver().findElement(By.name("password")).getAttribute("validationMessage");
        Assert.assertTrue(message.equalsIgnoreCase("Please fill in this field"));
    }


    @Then("Verify that user can see the password in a form of dots by default")
    public void verifyThatUserCanSeeThePasswordInAFormOfDotsByDefault() {
        String inputType = webTableLoginPage.inputPassword.getAttribute("type");
        System.out.println("inputType = " + inputType);
        Assert.assertTrue(inputType.equalsIgnoreCase("password"));
    }

    @And("click on the eye sign after entering the password")
    public void clickOnTheEyeSignAfterEnteringThePassword() {
        webTableLoginPage.tooglePassword.click();
    }

    @Then("verify that user can see the password explicitly")
    public void verifyThatUserCanSeeThePasswordExplicitly() {
        String inputType = webTableLoginPage.inputPassword.getAttribute("type");
        System.out.println("inputType = " + inputType);
        Assert.assertTrue(inputType.equalsIgnoreCase("text"));
    }


    @Then("verify that user can see the Forgot password? link")
    public void verifyThatUserCanSeeTheForgotPasswordLink() {
        Assert.assertTrue(webTableLoginPage.forgetPassword.isDisplayed());
    }

    @And("Click on the Forgot password? link")
    public void clickOnTheForgotPasswordLink() {
        webTableLoginPage.forgetPassword.click();
    }

    @Then("Verify that user can see the Reset Password button")
    public void verifyThatUserCanSeeTheResetPasswordButton() {
        BrowserUtils.sleep(1);
        Assert.assertTrue(webTableLoginPage.resetPassword.isDisplayed());

    }

    @Then("Verify that user can see valid placeholders on Username inputbox")
    public void verifyThatUserCanSeeValidPlaceholdersOnUsernameInputbox() {
        Assert.assertTrue(webTableLoginPage.usernamePlaceholder.isDisplayed());
    }

    @Then("Verify that user can see valid placeholders on Password inputbox")
    public void verifyThatUserCanSeeValidPlaceholdersOnPasswordInputbox() {
        Assert.assertTrue(webTableLoginPage.passwordPlaceholder.isDisplayed());
    }
}
