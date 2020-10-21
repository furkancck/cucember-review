package com.review.library.step_defs;

import com.review.library.pages.DashboardPage;
import com.review.library.utilities.BrowserUtilities;
import com.review.library.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PageNavigationStepDefs {
    DashboardPage dashboardPage = new DashboardPage();


    @When("I click on {string} link")
    public void iClickOnLink(String link) {
        System.out.println("Clicking on " + link + " link...");
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 5);
        wait.until(ExpectedConditions.visibilityOf(dashboardPage.dashboard));
        switch (link.toLowerCase()) {
            case "dashboard":
                dashboardPage.dashboard.click();
                break;
            case "users":
                dashboardPage.users.click();
                break;
            case "books":
                dashboardPage.books.click();
                break;
        }
    }

    @Then("{string} page should be displayed")
    public void pageShouldBeDisplayed(String page) {
        BrowserUtilities.wait(1);
        switch (page.toLowerCase()) {
            case "users":
                String actual = dashboardPage.pageHeader.getText();
                Assert.assertEquals("User Management", actual);
                System.out.println(actual + " verified");
                break;
            case "books":
                actual = dashboardPage.pageHeader.getText();
                Assert.assertEquals("Book Management", actual);
                System.out.println(actual + " verified");
                break;
        }
    }
}
