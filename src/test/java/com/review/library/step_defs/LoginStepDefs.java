package com.review.library.step_defs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class LoginStepDefs {
    @Given("I am on the login page")
    public void i_am_on_the_login_page() {
        System.out.println("Login page.");
    }


    @When("I login as a librarian")
    public void i_login_as_librarian_user() {
        System.out.println("Logging in as a librarian");
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
    }

}
