package com.review.library.step_defs;

import io.cucumber.java.en.When;

public class LoginStepDefsWithParams {
    @When("I enter username {string}")
    public void i_enter_username(String username) {
        System.out.println("Enter username -> "+username);
    }

    @When("I enter password {string}")
    public void i_enter_password(String pw) {
        System.out.println("Enter password -> "+pw);
    }

    @When("click the sign in button")
    public void click_the_sign_in_button() {
        System.out.println("Clicking the sign in button");
    }

}
