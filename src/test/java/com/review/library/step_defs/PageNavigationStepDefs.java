package com.review.library.step_defs;

import com.review.library.pages.DashboardPage;
import com.review.library.utilities.BrowserUtilities;
import com.review.library.utilities.Driver;
import com.review.library.utilities.LibraryConstants;
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


    @When("I go/navigate to {string} page")
    public void iGoToPage(String page) {
        System.out.println("Going to page -> " + page.toLowerCase());
        switch (page.toLowerCase()) {
            case LibraryConstants.DASHBOARD_ALL_LOWER:
                dashboardPage.dashboard.click();
                break;
            case LibraryConstants.BOOKS_ALL_LOWER:
                dashboardPage.books.click();
                break;
            case LibraryConstants.USERS_ALL_LOWER:
                dashboardPage.users.click();
                break;
            default:
                Assert.fail("Failed due to wrong page name..");
        }

    }

}
