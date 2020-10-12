package com.review.library.step_defs;

import com.review.library.pages.UsersPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;

import java.util.List;

public class ShowRecordsStepDefs {
    @And("show records should have following options:")
    public void showRecordsShouldHaveFollowingOptions(List<String> options) {
        System.out.println("options.size() = " + options.size());
        System.out.println(options);
    }

    @Then("show records default value should be {int}")
    public void showRecordsDefaultValueShouldBe(Integer integer) {
        System.out.println("Selected -> "+integer);
        UsersPage usersPage = new UsersPage();
        String actual = usersPage.getShowRecords().getFirstSelectedOption().getText();
        Assert.assertEquals(integer+"",actual);
    }
}
