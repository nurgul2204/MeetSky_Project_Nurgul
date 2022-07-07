package com.cydeo.step_definitions;

import com.cydeo.pages.WebTableLoginPage;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

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

    }


}
