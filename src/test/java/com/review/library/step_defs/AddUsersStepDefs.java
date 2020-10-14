package com.review.library.step_defs;

import com.review.library.pages.UsersPage;
import com.review.library.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Map;

public class AddUsersStepDefs {
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(),5);
    UsersPage usersPage = new UsersPage();
    @When("I click on Add Users")
    public void iClickOnAddUsers() {
        usersPage.addUsers.click();

    }

    @Then("dialog fields must have matching placeholder")
    public void dialogFieldsMustHaveMatchingPlaceholder(Map<String,String> fields) {
        String fullName = fields.get("fullname");
        String email = fields.get("email");
        String password = fields.get("password");
        String address = fields.get("address");

        String expectedFullName = fullName;
        wait.until(ExpectedConditions.visibilityOf(usersPage.fullName));
        String actualFullName = usersPage.fullName.getAttribute("placeholder");
        Assert.assertEquals(expectedFullName,actualFullName);
        String expectedEmail = email;
        String actualEmail = usersPage.email.getAttribute("placeholder");
        Assert.assertEquals(expectedEmail,actualEmail);
        String expectedPassword = password;
        String actualPassword = usersPage.password.getAttribute("placeholder");
        Assert.assertEquals(expectedPassword,actualPassword);
        String expectedAddress = address;
        String actualAddress = usersPage.address.getAttribute("placeholder");
        Assert.assertEquals("",actualAddress);
    }
}
