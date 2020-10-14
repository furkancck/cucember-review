package com.review.library.step_defs;

import com.review.library.pages.LoginPage;
import com.review.library.utilities.ConfigurationReader;
import com.review.library.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Map;


public class LoginStepDefs {
    LoginPage loginPage = new LoginPage();

    @Given("I am on the login page")
    public void i_am_on_the_login_page() {
        System.out.println("Login page.");
        String url = ConfigurationReader.getProperty("url");
        Driver.getDriver().get(url);
    }


    @When("I login as a librarian")
    public void i_login_as_librarian_user() {
        System.out.println("Logging in as a librarian");
        String email = ConfigurationReader.getProperty("librarian_email");
        String password = ConfigurationReader.getProperty("librarian_password");
        loginPage.login(email, password);

    }

    @When("I login as a student")
    public void i_login_as_a_student() {
        System.out.println("Logging in as a student");
    }

    @When("I login as a admin")
    public void i_login_as_a_admin() {
        System.out.println("Logging in as an admin");
    }


    @Then("dashboard page should be displayed")
    public void dashboard_page_should_be_displayed() {
        System.out.println("Verifying dashboard page...");
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 4);
        wait.until(ExpectedConditions.urlContains("dashboard"));
        String actualUrl = Driver.getDriver().getCurrentUrl();
        Assert.assertTrue(actualUrl.endsWith("dashboard"));
    }

    @And("I login using following credentials:")
    public void iLoginUsingFollowingCredentials(Map<String, String> credentials) {
        String email = credentials.get("email");
        String password = credentials.get("password");
        loginPage.login(email,password);
    }
}
