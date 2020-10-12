package com.review.library.step_defs;

import com.review.library.pages.UsersPage;
import com.review.library.utilities.BrowserUtilities;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ShowRecordsStepDefs {
    UsersPage usersPage = new UsersPage();
    @And("show records should have following options:")
    public void showRecordsShouldHaveFollowingOptions(List<String> options) {
        System.out.println("options.size() = " + options.size());
        System.out.println(options);
        List<WebElement> webElements = usersPage.getShowRecords().getOptions();
        List<String> elementsText = BrowserUtilities.getElementsText(webElements);
        Assert.assertEquals(options,elementsText);
    }

    @Then("show records default value should be {int}")
    public void showRecordsDefaultValueShouldBe(Integer integer) {
        System.out.println("Selected -> "+integer);
        String actual = usersPage.getShowRecords().getFirstSelectedOption().getText();
        Assert.assertEquals(integer+"",actual);
    }
}
