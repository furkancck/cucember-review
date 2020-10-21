package com.review.library.step_defs;

import com.review.library.pages.DashboardPage;
import com.review.library.utilities.Driver;
import io.cucumber.java.en.Then;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.junit.Assert.assertEquals;

public class DashboardStepDefs {
    DashboardPage dashboardPage = new DashboardPage();

    @Then("username should be {string}")
    public void usernameShouldBe(String expected) {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(),5);
        wait.until(ExpectedConditions.visibilityOf(dashboardPage.accountHolderName));
        String actualName = dashboardPage.accountHolderName.getText();
        assertEquals("Account holder name did not match.."
                , expected, actualName);

    }
}
